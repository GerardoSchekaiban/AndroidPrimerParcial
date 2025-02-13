package com.example.firstapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue



@Preview(showBackground = true)
@Composable

fun BotonesView(){

    var texto by remember {
        mutableStateOf("Que hay")
    }

    var cambio by remember {
        mutableStateOf(false)
    }


    Box(
        modifier = Modifier.background(Color.White)
            .fillMaxSize()
    ){
        Image(painter = painterResource(id = R.drawable.cerveza_corona),
            contentDescription = "fondo",
            modifier = Modifier.align(Alignment.TopEnd),
            contentScale = ContentScale.Crop,
            alpha = 0.5f)

        Column(modifier = Modifier
            .fillMaxHeight(), verticalArrangement = Arrangement.Center)
        {
            HorizontalDivider(
                color = Color.Red,
                modifier = Modifier.fillMaxWidth()
            )
            Row (modifier = Modifier
                .fillMaxWidth(), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically)
            {
                Text(
                text = "Hola Soy Pro Master en Android Studio"
            )
                Icon(imageVector = Icons.Default.Image,
                    contentDescription = "icono",
                    tint = Color.Green
                )  }
            HorizontalDivider(
                color = Color.Red,
                modifier = Modifier.fillMaxWidth())

            Button(onClick = {
                if(!cambio)
                    texto = "Odio Kotlin"
                else
                    texto= "Odio Kotlin mas fuerte"

                cambio = !cambio

            },modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.Green
                ))
            {
                Text(text = "Cambiar texto")}
        }

        Text(
            text = texto,
            color = Color.White,
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.BottomCenter)
                .background(color = Color.Black)
                .fillMaxWidth()
        )


    }

}