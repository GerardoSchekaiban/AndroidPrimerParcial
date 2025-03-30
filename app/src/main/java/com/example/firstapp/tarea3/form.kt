package com.example.firstapp.tarea3
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun FormScreen(onNavigateToResult: (String, Int) -> Unit) {
    var name by remember { mutableStateOf("") }
    var id by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nombre") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = id,
            onValueChange = { id = it },
            label = { Text("ID del Instituto") }
        )
        Spacer(modifier = Modifier.height(32.dp))
        ExtendedFloatingActionButton(
            onClick = {
                val idInt = id.toIntOrNull() ?: 0
                onNavigateToResult(name, idInt)
            }
        ){}
    }
}

@Preview(showBackground = true)
@Composable
fun FormScreenPreview() {
    FormScreen(onNavigateToResult = { _, _ -> }) // Pasa una función lambda vacía para la vista previa
}