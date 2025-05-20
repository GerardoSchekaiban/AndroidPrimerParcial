package com.example.firstapp.apiusernames.repository

import com.example.firstapp.apiusernames.data.User
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {
    private val api: ApiInterface = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiInterface::class.java)

    suspend fun getUsers(): List<User> = api.getUsers()
}