package com.example.firstapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Preview(showBackground = true)
@Composable
    fun HomeView(navegar: NavController){
        var nombre by remember{ mutableStateOf(value = "")}
        var id by remember{ mutableStateOf(value = "")}
        Column (modifier = Modifier.fillMaxSize()) {
            Text(text = "Bienvenido pantalla de inicio")
            Button(onClick = {
                navegar.navigate("Botones")
            }) {
                Text("A botones")
            }
            TextField(value = nombre, onValueChange = {nombre = it})
            TextField(value = id, onValueChange = {id = it})

            Button(onClick = {navegar.navigate("estudiante/$nombre/$id")}) {
                Text(text = "A estudiante")
            }
        }
    }