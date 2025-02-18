package com.example.primerparcial_19327.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.createFontFamilyResolver
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primerparcial_19327.R

@Preview(showBackground = true)
@Composable

fun tennis(){
    var puntaje1 by remember { mutableStateOf(0) }
    var puntaje2 by remember { mutableStateOf(0) }
    var ganadorSet by remember { mutableStateOf("") }

    Column (modifier = Modifier.fillMaxSize()
        .background(Color.White).padding(20.dp)){

        Column (modifier = Modifier.fillMaxSize()
            .background(Color.White).weight(1f)){
            Column (modifier = Modifier.fillMaxSize()
                .background(Color.White).weight(1f)){
                Row {
                    Column (modifier = Modifier.fillMaxSize()
                        .background(Color.Green).weight(2f).padding(0.dp,)){

                    }
                    Column (modifier = Modifier.fillMaxSize()
                        .weight(6f)){

                        Column (modifier = Modifier.fillMaxSize()
                            .padding(3.dp, 1.5.dp, 3.dp, 1.5.dp).background(Color.Green).weight(1f)){

                        }
                        Column (modifier = Modifier.fillMaxSize()
                            .padding(3.dp, 1.5.dp, 3.dp, 1.5.dp).background(Color.Green).weight(1f)){

                        }
                    }
                    Column (modifier = Modifier.fillMaxSize()
                        .background(Color.Green).weight(2f)){
                    }
                }

            }

            Column (modifier = Modifier.background(Color.Gray).height(3.dp).weight(.05f).fillMaxWidth()) {  }

            Column (modifier = Modifier.fillMaxSize()
                .weight(1f)){

                Row {
                    Column (modifier = Modifier.fillMaxSize()
                        .background(Color.Green).weight(2f).padding(0.dp,)){

                    }
                    Column (modifier = Modifier.fillMaxSize()
                        .weight(6f)){

                        Column (modifier = Modifier.fillMaxSize()
                            .padding(3.dp, 1.5.dp, 3.dp, 1.5.dp).background(Color.Green).weight(1f)){

                        }
                        Column (modifier = Modifier.fillMaxSize()
                            .padding(3.dp, 1.5.dp, 3.dp, 1.5.dp).background(Color.Green).weight(1f)){

                        }
                    }
                    Column (modifier = Modifier.fillMaxSize()
                        .background(Color.Green).weight(2f)){
                    }
                }

            }
        }


        Column (modifier = Modifier.fillMaxSize()
            .background(Color.White).weight(1f)){

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center) {
                Column(){
                    Image(painter = painterResource(id = R.drawable.player_one),
                        contentDescription = ("Player1"),
                        modifier = Modifier.size(100.dp))
                    Text(text = "Jannik Sinner", fontSize = 18.sp)
                    puntaje(puntaje1, {puntaje1 = it })
                }

                Column(verticalArrangement = Arrangement.Center){
                    Text(text = "Vs", fontWeight = FontWeight.Bold)
                }

                Column(){
                    Image(painter = painterResource(id = R.drawable.player_two),
                        contentDescription = ("Player1"),
                        modifier = Modifier.size(100.dp))
                    Text(text = "Minion", fontSize = 18.sp)
                    puntaje(puntaje2, {puntaje2 = it })
                }
            }

            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly) {
               Text(text = "Jannik Defiende su Título", fontSize = 30.sp, color = Color.Blue, fontWeight = FontWeight.Bold)
            }

        }
    }
}

@Composable
fun puntaje(numero: Int, cambio: (Int) -> Unit){

    Row(verticalAlignment = Alignment.CenterVertically) {
        IconButton(onClick = {cambio(numeroAnterior(numero))}) {
            Image(painter = painterResource(id = R.drawable.menos),
                contentDescription = ("Player1"))
        }
        Text(text = "$numero", fontSize = 24.sp)
        IconButton(onClick = {cambio(siguienteNumero(numero))}) {
            Image(painter = painterResource(id = R.drawable.mas),
                contentDescription = ("Player1"))
        }
    }
}

fun siguienteNumero(numero: Int): Int {
    if (numero == 0) {
        return 15
    }
    if (numero == 15) {
        return 30
    }
    if (numero == 30) {
        return 40
    }
    return 0

}

fun numeroAnterior(numero: Int): Int {
    if (numero == 40) {
        return 30
    }
    if (numero == 30) {
        return 15
    }
    if (numero == 15) {
        return 0
    }
    return 0
}
