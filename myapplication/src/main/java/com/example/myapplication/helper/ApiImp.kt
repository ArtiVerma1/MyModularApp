package com.example.myapplication.helper

import com.example.myapplication.model.UserModel
import retrofit2.Response
import javax.inject.Inject

class ApiImp @Inject constructor(private val apiService: ApiService) : ApiInterface {

    override suspend fun getUsers(): Response<UserModel> = apiService.getUsers()

}