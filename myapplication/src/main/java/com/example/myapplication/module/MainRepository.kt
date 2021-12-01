package com.example.myapplication.module

import com.example.myapplication.helper.ApiService
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiService) {

    suspend fun getUsers() =  apiHelper.getUsers()
}