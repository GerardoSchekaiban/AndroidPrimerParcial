package com.example.firstapp.actividad06.model

data class Producto(
    val id: Int,
    val nombre: String,
    val precio: Float,
    val envioGratis: Boolean,
    val promocion: Boolean,
    val imagenResId: Int
)
