package com.example.firstapp.TareaDatastore

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
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
import kotlinx.coroutines.withContext

data class Producto(val nombre: String, val precio: Float)

val listaProductos = listOf(
    Producto("iPhone 16", 22000f),
    Producto("Macbook Air", 31000f),
    Producto("Apple Watch", 11000f),
    Producto("Airpods", 3500f),
    Producto("Ipdad",  16000f)
)

@Composable
fun ProductosScreen(navController: NavHostController, dineroInicial: Float, context: Context) {
    var dinero by remember { mutableStateOf(dineroInicial) }
    val compras = remember { mutableStateListOf<Producto>() }
    val productos = remember { listaProductos }
    var mostrarDialogo by remember { mutableStateOf(false) }
    var preferenciasTexto by remember { mutableStateOf("") }


    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {
                CoroutineScope(Dispatchers.IO).launch {
                    val prefs = dataStoreManager.getPreferences(context)
                    val texto = """
            Nombre: ${prefs["name"]}
            Edad: ${prefs["age"]}
            Altura: ${prefs["height"]}
            Monedero: ${prefs["wallet"]}
        """.trimIndent()
                    withContext(Dispatchers.Main) {
                        preferenciasTexto = texto
                        mostrarDialogo = true
                    }
                }
            }) {
                Icon(Icons.Default.Settings, contentDescription = "Mostrar preferencias")
            }
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            Text(
                "Dinero disponible: $${"%.2f".format(dinero)}",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(16.dp)
            )

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                items(productos) { producto ->
                    Card(Modifier.fillMaxWidth()) {
                        Row(
                            Modifier
                                .padding(16.dp)
                                .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column {
                                Text(producto.nombre, style = MaterialTheme.typography.bodyLarge)
                                Text("Precio: $${producto.precio}", style = MaterialTheme.typography.bodySmall)
                            }
                            Button(
                                onClick = {
                                    if (dinero >= producto.precio) {
                                        dinero -= producto.precio
                                        compras.add(producto)
                                    }
                                },
                                enabled = dinero >= producto.precio
                            ) {
                                Text("Comprar")
                            }
                        }
                    }
                }
            }
            if (compras.isNotEmpty()) {
                Divider(Modifier.padding(vertical = 8.dp))
                Text(
                    "Resumen de compras:",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
                compras
                    .groupingBy { it.nombre }
                    .eachCount()
                    .forEach { (nombre, cantidad) ->
                        Text(
                            "- $nombre x$cantidad",
                            modifier = Modifier.padding(horizontal = 24.dp)
                        )
                    }
            }

            if (mostrarDialogo) {
                AlertDialog(
                    onDismissRequest = { mostrarDialogo = false },
                    confirmButton = {
                        TextButton(onClick = { mostrarDialogo = false }) {
                            Text("Cerrar")
                        }
                    },
                    title = { Text("Preferencias Guardadas") },
                    text = { Text(preferenciasTexto) }
                )
            }
        }

    }
}