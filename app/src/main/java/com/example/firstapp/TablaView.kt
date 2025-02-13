package com.example.firstapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun TableView(){
    Column(modifier = Modifier.fillMaxSize()){
        Text(text = "Hola amigo",
            modifier = Modifier.fillMaxHeight().background(Color.Yellow).weight(7f))
        Text(text = "Hola bobo",
            modifier = Modifier.fillMaxHeight()
                .background(Color.Green)
                .weight(3f))
    }
}