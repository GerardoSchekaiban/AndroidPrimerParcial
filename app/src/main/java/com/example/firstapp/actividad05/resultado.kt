package com.example.firstapp.actividad05

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.firstapp.R

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ResultScreen(birthYear: Int) {
    val currentYear = java.time.Year.now().value
    val age = currentYear - birthYear
    val (message, imageRes) = when (age) {
        in 0..14 -> "Menor de edad" to R.drawable.nino // Reemplaza con tu imagen
        15 -> "Mayor de edad en Indonesia, pero no en México" to R.drawable.joven // Reemplaza con tu imagen
        16 -> "Mayor de edad en Cuba, pero no en México" to R.drawable.joven
        17 -> "Mayor de edad en Corea del Norte, pero no en México" to R.drawable.joven
        18 -> "Mayor de edad en México y gran parte de Latinoamérica" to R.drawable.joven
        19 -> "Mayor de edad en Corea del Sur" to R.drawable.joven
        20 -> "Mayor de edad en Japón" to R.drawable.joven
        21 -> "Mayor de edad en USA y posiblemente en todo el mundo" to R.drawable.joven
        in 60..64 -> "Eres de la tercera edad" to R.drawable.tercera_edad // Reemplaza con tu imagen
        in 65..150 -> "Ya te puedes jubilar" to R.drawable.tercera_edad
        else -> "Edad no válida" to R.drawable.joven
    }

    Card(modifier = Modifier.padding(16.dp)) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Tu edad es: $age")
            Text(message)
            Image(painter = painterResource(id = imageRes), contentDescription = message)
        }
    }
}