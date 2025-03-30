package com.example.firstapp.lazylist.viewmodels

import androidx.lifecycle.ViewModel
import com.example.firstapp.R
import com.example.firstapp.lazylist.models.ProductModel

class ProductViewModel : ViewModel() {

    init {
        //obtenerProductos()
    }
    fun obtenerProductos():List<ProductModel>{
        val producto1 = ProductModel(id= 1, name = "panini italiano", description = "Rico panini con pepperoni, salami y queso", price = 5.0f, image = R.drawable.panini)
        val producto2 = ProductModel(id= 2, name = "sopa de tortilla", description = "Deliciosa sopa de tortilla con cebolla", price = 5.0f, image = R.drawable.caldo)
        val producto3 = ProductModel(id= 3, name = "ensalada fit", description = "ensalada nutritiva", price = 5.0f, image = R.drawable.ensalada)
        val producto4 = ProductModel(id= 4, name = "bowl a base de arroz", description = "bowl con arroz", price = 5.0f, image = R.drawable.bowl)
        val producto5 = ProductModel(id= 5, name = "panini de jamon serrano", description = "Rico panini con jamon serrano", price = 5.0f, image = R.drawable.panini)
        val producto6 = ProductModel(id= 6, name = "ensalada de pollo", description = "ensalada con pollo", price = 5.0f, image = R.drawable.ensalada)
        val producto7 = ProductModel(id= 7, name = "caldo tlalpeño", description = "Rico panini", price = 5.0f, image = R.drawable.caldo)
        val producto8 = ProductModel(id= 8, name = "panini", description = "Rico panini", price = 5.0f, image = R.drawable.panini)
        val producto9 = ProductModel(id= 9, name = "bowl a base de quinoa", description = "Rico bowl con quinoa y elote", price = 5.0f, image = R.drawable.bowl)
        val producto10 = ProductModel(id= 10, name = "panini de salmon", description = "Rico panini con salmon", price = 5.0f, image = R.drawable.panini)


        var productsList = listOf<ProductModel>(
            producto1,producto2,producto3,producto4,producto5,producto6,producto7,producto8,producto9,producto10
        )

        return productsList
    }
}

