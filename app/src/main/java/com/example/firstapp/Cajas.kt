package com.example.firstapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun CajaView(){
    Box(
        modifier = Modifier.background(Color.Yellow)
            .size(250.dp)
            //.fillMaxSize()
    ){

        Image(painter = painterResource(id = R.drawable.cerveza_corona),
            contentDescription = "fondo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            alpha = 0.5f)

        Text(text = "a",
        modifier = Modifier.align(Alignment.TopStart))
        Text(text = "b",
            modifier = Modifier.align(Alignment.TopCenter))
        Text(text = "c",
            modifier = Modifier.align(Alignment.TopEnd))
        Text(text = "d",
            modifier = Modifier.align(Alignment.CenterStart))
        Text(text = "e",
            modifier = Modifier.align(Alignment.Center))
        Text(text = "f",
            modifier = Modifier.align(Alignment.CenterEnd))
        Text(text = "g",
            modifier = Modifier.align(Alignment.BottomStart))
        Text(text = "h",
            modifier = Modifier.align(Alignment.BottomCenter))
        Text(text = "i",
            modifier = Modifier.align(Alignment.BottomEnd))

        Icon(imageVector = Icons.Default.Image,
            contentDescription = "icono",
            tint = Color.Green
        )

    }
}