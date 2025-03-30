package com.example.firstapp.tarea3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ResultScreen(name: String, id: Int) {
    val message = when {
        id in 1..10 -> "Bienvenido al Laboratorio de ISND estimado Coordinador $name"
        id in 11..100 -> "Permiso autorizado para el profesor $name"
        id in 101..19000 -> "Acceso denegado a egresados que no son de sistemas."
        id in 19001..22210 && id != 22180 -> "Bienvenido $name, es un gusto verlo por aquí."
        id == 22180 -> "Alumno en intercambio no es posible esté presente en el I.E.ST."
        id in 22211..30000 -> "Alumno $name autorizado para uso del laboratorio." //ejemplo de id de alumnos
        else -> "Este laboratorio es de uso exclusivo para la carrera ISND"
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = message, fontSize = 20.sp, fontWeight = FontWeight.Bold)
    }
}

@Preview(showBackground = true)
@Composable
fun ResultScreenPreview() {
    ResultScreen(name = "Gerardo", id = 123) // Pasa datos de ejemplo para la vista previa
}
