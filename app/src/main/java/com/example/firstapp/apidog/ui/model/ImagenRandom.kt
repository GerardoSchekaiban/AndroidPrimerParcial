package com.example.firstapp.apidog.ui.model

import com.google.gson.annotations.SerializedName

/* La data class tendrá el esqueleto de l respuesta json */

data class imagenRandom(
    /* Cuando necesitamos renombrar el nombre de las claves del json, usamos @SerializedName */
    @SerializedName("message") val mensaje: String?,
    @SerializedName("status")  val estado: String?
)
