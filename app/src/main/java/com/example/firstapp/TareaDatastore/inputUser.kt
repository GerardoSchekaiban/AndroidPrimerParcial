package com.example.firstapp.TareaDatastore

import android.content.Context
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun RegistroUsuarioScreen(navController: NavHostController, context: Context) {
    var nombre by remember { mutableStateOf("") }
    var edad by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var monedero by remember { mutableStateOf("") }
    var guardarPrefs by remember { mutableStateOf(false) }

    Column(Modifier.padding(16.dp)) {
        OutlinedTextField(value = nombre, onValueChange = { nombre = it }, label = { Text("Nombre") })
        OutlinedTextField(value = edad, onValueChange = { edad = it }, label = { Text("Edad") })
        OutlinedTextField(value = altura, onValueChange = { altura = it }, label = { Text("Altura") })
        OutlinedTextField(value = monedero, onValueChange = { monedero = it }, label = { Text("Monedero") })

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text("Guardar preferencias")
            Switch(checked = guardarPrefs, onCheckedChange = { guardarPrefs = it })
        }

        Button(onClick = {
            if (guardarPrefs) {
                CoroutineScope(Dispatchers.IO).launch {
                    dataStoreManager.savePreferences(
                        context,
                        nombre,
                        edad.toInt(),
                        altura.toFloat(),
                        monedero.toFloat()
                    )
                }
            }
            navController.navigate("productos/${monedero}")
        }) {
            Text("Continuar")
        }
    }
}
