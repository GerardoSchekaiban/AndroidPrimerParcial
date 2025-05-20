package com.example.firstapp.apidog.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firstapp.apidog.domain.API
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DogViewModel: ViewModel() {

    var urlImage by mutableStateOf("")
    var allImages by mutableStateOf<List<String> >(emptyList())

    fun mostrarImagen(){
        viewModelScope.launch{
            withContext(Dispatchers.IO){
                urlImage = API().getImagenAleatoria()
            }

        }
    }

    fun traerImagen(){
        viewModelScope.launch{
            withContext(Dispatchers.IO){
                allImages = API().getImagenesDeRaza()
            }

        }
    }
}