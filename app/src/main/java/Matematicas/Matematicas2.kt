package Matematicas
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MayorMenor() {
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var num3 by remember { mutableStateOf("") }
    var mayor by remember { mutableStateOf("") }
    var menor by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(value = num1, onValueChange = { num1 = it }, label = { Text("Número 1") }, modifier = Modifier.padding(8.dp))
        TextField(value = num2, onValueChange = { num2 = it }, label = { Text("Número 2") }, modifier = Modifier.padding(8.dp))
        TextField(value = num3, onValueChange = { num3 = it }, label = { Text("Número 3") }, modifier = Modifier.padding(8.dp))

        Button(onClick = {
            val numeros = listOf(num1.toIntOrNull(), num2.toIntOrNull(), num3.toIntOrNull()).filterNotNull()
            if (numeros.isNotEmpty()) {
                mayor = numeros.maxOrNull().toString()
                menor = numeros.minOrNull().toString()
            }
        }) {
            Text("Encontrar Mayor y Menor")
        }

        Text("Mayor: $mayor", modifier = Modifier.padding(8.dp))
        Text("Menor: $menor", modifier = Modifier.padding(8.dp))
    }
}