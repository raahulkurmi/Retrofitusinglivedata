package com.example.retrofitusingkotlin

import com.google.gson.annotations.SerializedName

data class pojoclassItem(


    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("userid")
    val userId: Int
)