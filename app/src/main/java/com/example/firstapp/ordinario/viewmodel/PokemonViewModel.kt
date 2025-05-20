package com.example.firstapp.ordinario.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firstapp.ordinario.data.Pokemon
import com.example.firstapp.ordinario.repository.RetrofitClient
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PokemonViewModel : ViewModel() {
    private val _pokemonList = MutableStateFlow<List<Pokemon>>(emptyList())
    val pokemonList: StateFlow<List<Pokemon>> = _pokemonList

    init {
        fetchPokemon()
    }

    private fun fetchPokemon() {
        viewModelScope.launch {
            try {
                val response = RetrofitClient.api.getPokemonList()
                _pokemonList.value = response.results
            } catch (e: Exception) {
                _pokemonList.value = listOf(Pokemon("Error al cargar"))
            }
        }
    }
}