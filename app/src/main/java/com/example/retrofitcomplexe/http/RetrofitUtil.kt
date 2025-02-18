package com.example.retrofitcomplexe.http

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

object RetrofitUtil {
    fun get(): Service {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://fourn6-mobile-prof.onrender.com/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()
        return retrofit.create(Service::class.java)
    }
}