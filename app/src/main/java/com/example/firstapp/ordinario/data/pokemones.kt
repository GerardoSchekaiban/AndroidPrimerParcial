package com.example.firstapp.ordinario.data

data class PokemonResponse(
    val results: List<Pokemon>
)

data class Pokemon(
    val name: String
)
