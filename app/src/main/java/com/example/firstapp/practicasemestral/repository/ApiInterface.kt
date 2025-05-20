package com.example.firstapp.practicasemestral.repository

import com.example.firstapp.practicasemestral.model.UserResponse
import retrofit2.http.GET

interface ApiInterface {
    @GET("api/?results=10")
    suspend fun getUsers(): UserResponse
}