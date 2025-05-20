package com.example.firstapp.apidog.repository

import com.example.firstapp.apidog.ui.model.ImagenesRaza
import com.example.firstapp.apidog.ui.model.imagenRandom
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {
    /* Aqui solo se definen las urls relativas, parametros y tipo de respuesta */

    @GET("breeds/image/random")
    /* Suspend se utiliza para utilizar corrutinas para mandar el proceso a otro hilo */
    suspend fun getRandomImage(): Response<imagenRandom> /* Dentro de los signos se llama a la data class */

    @GET("breeds/{raza}/images")
    suspend fun imagenesPorRaza(@Path("raza") raza: String): Response<ImagenesRaza>


}