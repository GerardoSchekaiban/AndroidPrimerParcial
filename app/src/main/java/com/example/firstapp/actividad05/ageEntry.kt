package com.example.firstapp.actividad05

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EntryScreen(onNavigateToResult: (Int) -> Unit) {
    var birthYear by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = birthYear,
            onValueChange = { birthYear = it },
            label = { Text("Año de nacimiento") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        FloatingActionButton(onClick = {
            val year = birthYear.toIntOrNull() ?: 0
            onNavigateToResult(year)
        }) {
            Icon(Icons.Default.ArrowForward, contentDescription = "Siguiente")
        }
    }
}