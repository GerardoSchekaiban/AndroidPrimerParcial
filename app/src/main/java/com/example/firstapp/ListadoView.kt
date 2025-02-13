package com.example.firstapp

import Compartido.TarjetaView
import Compartido.TerminalView
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun ListadoView(){

    Column (modifier = Modifier.fillMaxSize()) {
        TerminalView()
        TerminalView()
        TerminalView()
        TarjetaView(colorText = Color.Green, background = Color.Blue)
        TarjetaView(Color.Yellow, Color.Magenta)

    }
}