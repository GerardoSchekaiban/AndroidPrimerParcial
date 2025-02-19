package com.example.firstapp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable

fun numero15(){

    Column (
        modifier = Modifier.background(Color(0xFF8B4513)).fillMaxSize().padding(16.dp)
    ) {
        Row {
            Tile(1)
            Tile(2)
            Tile(3)
            Tile(4)

        }

        Row {
            Tile(5)
            Tile(6)
            Tile(7)
            Tile(8)

        }
        Row {
            Tile(9)
            Tile(10)
            Tile(11)
            Tile(12)

        }

        Row {
            Tile(13)
            Tile(14)
            Tile(null)
            Tile(15)

        }
    }
}

@Composable
fun Tile(number: Int?){
    val bg = when{
        number == null -> Color(0xFF5D341A)
        number % 2 == 0 -> Color(0xFFDEC19B)
        else -> Color(0xFFC09260)
    }

    val fontcolor = when{
        number == null -> Color.Transparent
        number % 2 == 0 -> Color.DarkGray
        else -> Color.LightGray
    }

    Box( modifier = Modifier.size(90.dp).padding(1.dp).background(bg).border(2.dp, Color.Black, ), contentAlignment = Alignment.Center
    ){
        number?.let {
            Text(
                text = it.toString(),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = fontcolor
            )
        }
    }
}
