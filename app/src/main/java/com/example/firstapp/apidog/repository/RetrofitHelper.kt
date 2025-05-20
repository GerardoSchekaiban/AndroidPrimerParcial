package com.example.firstapp.apidog.repository

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    //Configurar retrofit , creamos el objeto retrofi
    private val URL_BASE = "https://dog.ceo/api/"

    fun getRetrofitService(): ApiInterface {
        val retrofit =  Retrofit.Builder()
            .baseUrl(URL_BASE)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service: ApiInterface = retrofit.create(ApiInterface::class.java)
        return service
    }
}
