package net.denis.numbers.di.data.repository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import net.denis.numbers.data.repository.FactRepositoryImpl
import net.denis.numbers.domain.repository.FactRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

//    @Binds
//    @Singleton
//    abstract fun bindsFactRepository(
//        factRepositoryImpl: FactRepositoryImpl
//    ): FactRepository

}