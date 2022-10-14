package net.denis.numbers.data.remote

import kotlinx.coroutines.flow.Flow
import net.denis.numbers.domain.model.ResponseData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface NumbersApi {

//    @GET("/715")
//    @Headers("Content-type: application/text")
//    suspend fun getFactOf715(): Flow<ResponseData>

    //@GET("/posts/1")
    @GET("/{number}")
    @Headers("Content-type: application/json")
    suspend fun getFactByNumber(@Path("number")number: Int): NumberFactDTO

//    @GET("/{number}/")
//    @Headers("Content-type: application/json")
//    suspend fun getFact(@Path("number") number: Int): ResponseData

}