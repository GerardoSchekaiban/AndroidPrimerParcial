package com.example.firstapp.practicasemestral.model

data class UserResponse(
    val results: List<User>
)

data class User(
    val login: Login,
    val name: Name,
    val email: String,
    val picture: Picture
)

data class Login(val uuid: String)
data class Name(val first: String, val last: String)
data class Picture(val large: String)
