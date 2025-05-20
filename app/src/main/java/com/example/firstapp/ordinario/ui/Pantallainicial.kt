package com.example.firstapp.ordinario.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.*
import androidx.navigation.NavController
import com.example.firstapp.ordinario.viewmodel.OpcionesViewModel


@Composable
fun PantallaInicial(navController: NavController) {
    val viewModel = remember { OpcionesViewModel() }
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Opción a probar (1 o 2)", fontSize = 20.sp)
            Spacer(modifier = Modifier.height(12.dp))
            TextField(
                value = viewModel.inputValue.value,
                onValueChange = { viewModel.inputValue.value = it },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Button(
                onClick = {
                    if (viewModel.validateInput()) {
                        when (viewModel.inputValue.value.trim()) {
                            "1" -> navController.navigate("Lista")
                        "2" -> navController.navigate("Over")
                        }
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {
                Text("Aceptar", color = Color.White)
            }
            if (viewModel.errorMessage.value.isNotEmpty()) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(viewModel.errorMessage.value, color = Color.Red)
            }
        }

        Text(
            text = "Gerardo Gómez Schekaibán - ID IEST: 19327",
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp),
            fontSize = 14.sp
        )
    }
}