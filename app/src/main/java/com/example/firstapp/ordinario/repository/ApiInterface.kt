package com.example.firstapp.ordinario.repository

import com.example.firstapp.ordinario.data.PokemonResponse
import retrofit2.http.GET

interface ApiInterface {
    @GET("pokemon?limit=151")
    suspend fun getPokemonList(): PokemonResponse
}