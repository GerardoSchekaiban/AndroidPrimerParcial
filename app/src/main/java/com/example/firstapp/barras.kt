package com.example.firstapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable

fun barras(){
    Column(modifier = Modifier.fillMaxSize().background(Color.White)) {
        Column(modifier = Modifier.fillMaxSize().weight(1f).padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
            Column(modifier = Modifier.fillMaxSize().background(Color.Black).weight(1f)){}
            Spacer(modifier=Modifier.height(10.dp))
            Column(modifier = Modifier.fillMaxSize().background(Color.Green).weight(1f)){}
            Spacer(modifier=Modifier.height(10.dp))
            Column(modifier = Modifier.fillMaxSize().background(Color.Gray).weight(1f)){}
        }

        Column(modifier = Modifier.fillMaxHeight().weight(1f).padding(bottom = 10.dp, start = 15.dp, end = 15.dp, top = 10.dp)) {
            Row(modifier = Modifier.fillMaxWidth().weight(1f)) {
                Column(modifier = Modifier.fillMaxHeight().padding(5.dp).background(Color.Black).weight(1f)){}
                Column(modifier = Modifier.fillMaxHeight().padding(5.dp).background(Color.Green).weight(1f)){}
                Column(modifier = Modifier.fillMaxHeight().padding(5.dp).background(Color.Gray).weight(1f)){}
            }
        }
    }
}