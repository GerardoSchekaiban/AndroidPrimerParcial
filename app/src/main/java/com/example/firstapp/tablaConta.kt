package com.example.firstapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable

fun tablaConta(){

    var n1Ingresos: Int = 2000
    var n1Egresos: Int = 500

    Column (modifier = Modifier.fillMaxSize()) {
        Column (modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End) {
            Image(painter = painterResource(id = R.drawable.bandera),
                contentDescription = "bandera",
                modifier = Modifier.size(70.dp))
        }
        Column (modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Contabilidad de Alfonso",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
        }

        Column () {
            Row (Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                Text(text = "Blanco", modifier = Modifier.width(100.dp))
                Text(text = "Ingresos", color = Color.White, modifier = Modifier.background(color = Color(0xFF17911f)).width(100.dp))
                Text(text = "Egresos", color = Color.White, modifier = Modifier.background(color = Color(0xFF17911f)).width(100.dp))
                Text(text = "Neto", color = Color.White, modifier = Modifier.background(color = Color(0xFF17911f)).width(100.dp))
            }
        }



    }
}