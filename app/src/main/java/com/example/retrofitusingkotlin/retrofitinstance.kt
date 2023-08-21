package com.example.retrofitusingkotlin

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class retrofitinstance {

    companion object{
        val base_url="https://jsonplaceholder.typicode.com"

        fun retrofit():Retrofit{
            return Retrofit.Builder().baseUrl(base_url).addConverterFactory(GsonConverterFactory.create(GsonBuilder().create())).build()
        }
    }


}