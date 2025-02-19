package com.example.firstapp

import android.graphics.Paint.Align
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun posiciones(){

    Column (modifier = Modifier.fillMaxSize()
                               .background(Color.LightGray)) {

        Row (modifier = Modifier.fillMaxWidth()
                                .background(Color.White).weight(1f)) {

            BoxItem("TopStart", Color.Red, Modifier.height(20.dp).weight(3f), fontcolor = Color.White, alignment = Alignment.TopStart)
            BoxItem("Top", Color.Blue, Modifier.fillMaxHeight().weight(4f), fontcolor = Color.White, alignment = Alignment.TopCenter)
            BoxItem("TopEnd", Color.Magenta, Modifier.height(40.dp).weight(3f), fontcolor = Color.White, alignment = Alignment.TopEnd)
        }

        Row (modifier = Modifier.fillMaxWidth()
            .background(Color.White).weight(2f)) {

            BoxItem("Center Start", Color.Green, Modifier.height(150.dp).weight(5f), fontcolor = Color.Black, alignment = Alignment.CenterStart)
            BoxItem("Center", Color.LightGray, Modifier.fillMaxHeight().weight(3f), fontcolor = Color.Black, alignment = Alignment.Center)
            BoxItem("Center End", Color.Black, Modifier.height(20.dp).weight(5f), fontcolor = Color.White, alignment = Alignment.CenterEnd)
        }

        Row (modifier = Modifier.fillMaxWidth()
            .background(Color.White).weight(1f)) {

            BoxItem("BottomStart", Color(0xFF00FFFF), Modifier.fillMaxHeight().weight(2f), fontcolor = Color.Black, alignment = Alignment.BottomStart)
            BoxItem(" BottomCenter", Color.Gray, Modifier.fillMaxHeight().weight(6f), fontcolor = Color.White, alignment = Alignment.BottomCenter)
            BoxItem("BottomEnd", Color.Yellow, Modifier.fillMaxHeight().weight(2f), fontcolor = Color.Black, alignment = Alignment.BottomEnd)
        }
    }
}

@Composable
fun BoxItem(text: String, bg: Color, modifier: Modifier, alignment: Alignment, fontcolor: Color){
    Box(
        modifier = modifier.background(bg).fillMaxHeight(), contentAlignment = alignment
    ){
        Text(text, color = fontcolor)
    }
}