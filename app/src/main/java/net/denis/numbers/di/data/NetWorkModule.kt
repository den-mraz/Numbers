package net.denis.numbers.di.data

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.denis.numbers.data.remote.NumbersApi
import net.denis.numbers.data.repository.FactRepositoryImpl
import net.denis.numbers.domain.repository.FactRepository
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetWorkModule {

    @Provides
    @Singleton
    fun provideGson(): Gson {
        return GsonBuilder()
            .setLenient()
            .create()
    }

    @Provides
    @Singleton
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        HttpLoggingInterceptor.Level.BODY
        return HttpLoggingInterceptor()
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient()
            .newBuilder()
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

    @Provides
    @Singleton
    fun provideNumbersApi(gson: Gson): NumbersApi {
        return Retrofit.Builder()
            .baseUrl("http://numbersapi.com")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(NumbersApi::class.java)
    }

    @Provides
    @Singleton
    fun provideFactRepository(api: NumbersApi): FactRepository {
        return FactRepositoryImpl(api)
    }


}

/*
    fun createApi(endPointURL: String): NumbersApi {
        val retrofit = getRetrofit(endPointURL)
        return retrofit.create(NumbersApi::class.java)
    }


 */