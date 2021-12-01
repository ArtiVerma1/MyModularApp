package com.example.myapplication.helper

import com.example.myapplication.model.UserModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("api/users?page=1")
    suspend fun getUsers(): Response<UserModel>
}