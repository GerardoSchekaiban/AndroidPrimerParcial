package com.example.firstapp.lazylist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstapp.R

@Preview(showBackground = true)
@Composable

fun ProductView(){
    Card (modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(painter = painterResource(id = R.drawable.bowl),
                contentDescription = "",
                modifier = Modifier.size(120.dp),
                contentScale = ContentScale.FillHeight)

            Column(modifier = Modifier.padding(horizontal = 10.dp).height(150.dp), verticalArrangement = Arrangement.SpaceAround) {
                Text(text = "Bowl saludable", fontSize = 18.sp)
                Text(text = "Nutritivo bowl hecho a base de quinoa, acompañado de aguacate, elote, tomate y pepino",
                    fontSize = 10.sp, color = Color.LightGray)
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(text = "145.00", fontSize = 18.sp)
                    Button(onClick = {}) {
                        Text(text = "Comprar")
                    }
                }
            }
        }
    }
}