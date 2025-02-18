package com.example.retrofitsimple.http

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Service {
    @GET("exos/long/double/{number}")
    fun doubleNumber(@Path("number") number: Long): Call<Long>
}