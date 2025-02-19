package Matematicas

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.LinearScale
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstapp.R

@Preview(showBackground = true)
@Composable
fun CalculadoraScreen() {
    var numero1 by remember { mutableStateOf("") }
    var numero2 by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = numero1,
            onValueChange = { numero1 = it },
            label = { Text("Número 1") },
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        )
        TextField(
            value = numero2,
            onValueChange = { numero2 = it },
            label = { Text("Número 2") },
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(onClick = {
                resultado = (numero1.toDoubleOrNull()?.plus(numero2.toDoubleOrNull() ?: 0.0)).toString()
            }) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = "Sumar")
            }

            OutlinedButton(onClick = {
                resultado = (numero1.toDoubleOrNull()?.minus(numero2.toDoubleOrNull() ?: 0.0)).toString()
            }) {
                Icon(imageVector = Icons.Filled.LinearScale, contentDescription = "Restar")
            }

            IconButton(onClick = {
                resultado = (numero1.toDoubleOrNull()?.times(numero2.toDoubleOrNull() ?: 0.0)).toString()
            }) {
                Icon(imageVector = Icons.Filled.Close, contentDescription = "Multiplicar")
            }

            Image(
                painter = painterResource(id = R.drawable.division),
                contentDescription = "Dividir",
                modifier = Modifier.clickable {
                    resultado = (numero1.toDoubleOrNull()?.div(numero2.toDoubleOrNull() ?: 1.0)).toString()
                }.size(30.dp)
            )
        }

        Text("Resultado: $resultado", modifier = Modifier.padding(16.dp))
    }
}