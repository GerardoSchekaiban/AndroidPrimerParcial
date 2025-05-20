package com.example.firstapp.apiusernames.repository

import com.example.firstapp.apiusernames.data.User
import retrofit2.http.GET

interface ApiInterface {
    @GET("users")
    suspend fun getUsers(): List<User>
}