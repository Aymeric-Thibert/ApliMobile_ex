package com.example.intrarezo.Service

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Service{
    @GET("/exam/representations/{nombre}")
    fun GetNumber(@Path("nombre") nombre:Int): Call<List<DataItem>>
}

data class DataItem(
    val nombre: Int,
    val description: String,
    val representation: String
)