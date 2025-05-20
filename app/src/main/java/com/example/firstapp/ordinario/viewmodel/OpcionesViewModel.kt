package com.example.firstapp.ordinario.viewmodel

import androidx.compose.runtime.mutableStateOf

class OpcionesViewModel {
    var inputValue = mutableStateOf("")
    var errorMessage = mutableStateOf("")

    fun validateInput(): Boolean {
        return when (inputValue.value.trim()) {
            "1", "2" -> {
                errorMessage.value = ""
                true
            }
            else -> {
                errorMessage.value = "Por favor ingrese alguno de estos números: 1 o 2"
                false
            }
        }
    }
}