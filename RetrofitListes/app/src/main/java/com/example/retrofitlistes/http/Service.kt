package com.example.retrofitsimple.http


import com.example.retrofitlistes.models.ItemSimples
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface Service {
    @GET("exos/long/list")
    fun AfficherListLong(): Call<List<Long>>


    @GET("exos/truc/list")
    fun AfficherItems(): Call<List<ItemSimples>>



}


