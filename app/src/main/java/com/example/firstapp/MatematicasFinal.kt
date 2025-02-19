package com.example.firstapp
import Matematicas.CalculadoraScreen
import Matematicas.MayorMenor
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun Matematicasview(){

    Column {
        Column (modifier = Modifier.fillMaxSize().weight(1f)) {
            CalculadoraScreen()
        }

        Column (modifier = Modifier.fillMaxSize().weight(1f)){
            MayorMenor()
        }
    }

}