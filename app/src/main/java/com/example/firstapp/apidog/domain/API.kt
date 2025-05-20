package com.example.firstapp.apidog.domain

import android.util.Log
import com.example.firstapp.apidog.repository.RetrofitHelper

class API {
    private val service = RetrofitHelper.getRetrofitService()
    suspend fun getImagenAleatoria():String {
        val msg:String
        val response = service.getRandomImage()
        /*obtenemos la respuesta y aplicamos la logica de que deseamos hacer con los campos*/
        if(response.body()?.estado.equals("success")){
            msg = response.body()?.mensaje ?: ""
        }else{
            msg = "NO fue exitoso"
        }
        Log.d("API_PRUEBA", "status es " + response.body()?.estado)
        Log.d("API_PRUEBA ", "message es " + response.body()?.mensaje)
        return msg
    }

    suspend fun getImagenesDeRaza() : List<String>{
        val response = service.imagenesPorRaza("akita")
        return if(response.body()?.status == "success"){
            Log.d("API_PRUEBA", "exito")
            response.body()?.message ?: emptyList()
        }else{
            emptyList()
        }
    }


}