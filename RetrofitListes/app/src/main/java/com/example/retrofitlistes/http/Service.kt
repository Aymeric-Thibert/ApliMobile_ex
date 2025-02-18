package com.example.retrofitsimple.http


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Service {
    @GET("exos/long/list")
    fun doubleNumber(): Call<List<Long>>


//    @GET("exos/truc/list")
//    fun pipo(): Call<List<Truc>>}


}