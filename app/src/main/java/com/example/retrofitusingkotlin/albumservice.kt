package com.example.retrofitusingkotlin

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface albumservice {
    @GET("/posts")
    suspend fun getalbum():Response<pojoclass>
    @GET("/posts")
    suspend fun getsortalbum(@Query("userId") userid:Int):Response<pojoclass>
}