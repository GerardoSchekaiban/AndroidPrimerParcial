package com.example.firstapp.parcial2.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.firstapp.R
import com.example.firstapp.parcial2.model.Vuelo
import com.example.firstapp.parcial2.model.aerolinea


class VueloVm : ViewModel() {
    val vuelosNacionales = listOf(
        Vuelo(1, "Cancun", "Ida y Vuelta", "no tiene extras", R.drawable.cancun),
        Vuelo(2, "Ciudad de Mexico", "Sencillo", "Incluye Alojamiento", R.drawable.mexico),
        Vuelo(3, "Monterrey", "Ida y Vuelta", "Alojamiento y desayunos", R.drawable.mty)
    )

    val vuelosInternacionales = listOf(
        Vuelo(4, "Seul", "Ida y Vuelta", "Incluye Alojamiento", R.drawable.seul),
        Vuelo(5, "New York", "Sencillo", "Alojamiento y desayunos", R.drawable.usa),
        Vuelo(6, "Paris", "Sencillo", "no tiene extras", R.drawable.paris)
    )

    val aerolineas = listOf(
        aerolinea(1,"AeroMéxico", R.drawable.aeromexico),
        aerolinea(2, "Viva Aerobus", R.drawable.volaris),
        aerolinea(3, "Volaris", R.drawable.viva)
    )

    val _vueloSeleccionado = mutableStateOf<Vuelo?>(null)

    fun seleccionarVuelo(vuelo: Vuelo) {
        _vueloSeleccionado.value = vuelo
    }
    var aerolineaSeleccionada by mutableStateOf<aerolinea?>(null)
    var pasajero by mutableStateOf("")
}
