package net.denis.numbers.data.remote

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface NumbersApi {

    @GET("/{number}/{type}")
    @Headers("Content-type: application/json")
    suspend fun getFactByNumber(
        @Path("number") number: Int,
        @Path("type") type: String
    ): NumberFactDTO

}