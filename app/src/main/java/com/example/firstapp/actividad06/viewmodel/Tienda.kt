package com.example.firstapp.actividad06.viewmodel

import androidx.lifecycle.ViewModel
import com.example.firstapp.R
import com.example.firstapp.actividad06.model.Categoria
import com.example.firstapp.actividad06.model.Producto

class tienda: ViewModel() {
    val categorias = listOf(
        Categoria(1, "Electrónica", R.drawable.electronica),
        Categoria(2, "Caballeros", R.drawable.caballeros),
        Categoria(3, "Hogar", R.drawable.hogar),
        Categoria(4, "Damas", R.drawable.damas)
    )

    val productosPorCategoria = mapOf(
        1 to listOf(
            Producto(1, "Auriculares", 299.99f, true, false, R.drawable.auriculares),
            Producto(2, "Smartwatch", 999.99f, true, true, R.drawable.smartwatch),
            Producto(3, "Monitor", 1899.50f, false, false, R.drawable.monitor),
            Producto(4, "Funda", 199.00f, true, false, R.drawable.funda),
            Producto(5, "Tablet", 2399.90f, true, true, R.drawable.tablet)
        ),
        2 to listOf(
            Producto(6, "Cinturon", 499.90f, false, true, R.drawable.cinturon),
            Producto(7, "Jeans", 799.00f, true, false, R.drawable.jeans),
            Producto(8, "Camisa", 349.00f, true, false, R.drawable.camisa),
            Producto(9, "Zapatos", 1200.00f, false, false, R.drawable.zapatos),
            Producto(10, "Gorra", 199.00f, true, false, R.drawable.gorra)
        ),
        3 to listOf(
            Producto(11, "Sillon", 499.90f, false, true, R.drawable.sillon),
            Producto(12, "Lampara", 799.00f, true, false, R.drawable.lampara),
            Producto(13, "escritorio", 349.00f, true, false, R.drawable.escritorio),
            Producto(14, "cama", 1200.00f, false, false, R.drawable.cama),
            Producto(15, "lavadora", 199.00f, true, false, R.drawable.lavadora)
        ),
        4 to listOf(
            Producto(16, "reloj", 499.90f, false, true, R.drawable.reloj),
            Producto(17, "blusa", 799.00f, true, false, R.drawable.blusa),
            Producto(18, "lentes", 349.00f, true, false, R.drawable.lentes),
            Producto(19, "vestido", 1200.00f, false, false, R.drawable.vestido),
            Producto(20, "falda", 199.00f, true, false, R.drawable.falda)
        )
    )


}