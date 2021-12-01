package com.example.myapplication.helper

import com.example.myapplication.model.UserModel
import retrofit2.Response

interface ApiInterface {
    // @GET("api/users?page=1")
//    fun getall(): Call<UserModel>
    suspend fun getUsers(): Response<UserModel>

}