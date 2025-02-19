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
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable

fun Tarea2(){
    val n1Ingresos: Int = 2000
    val n2Ingresos: Int = 2000
    val n3Ingresos: Int = 2000
    val n4Ingresos: Int = 4000
    val n5Ingresos: Int = 4000
    val n6Ingresos: Int = 4000
    val n7Ingresos: Int = 8000
    val n8Ingresos: Int = 8000
    val n9Ingresos: Int = 8000
    val n10Ingresos: Int = 12000
    val n11Ingresos: Int = 12000
    val n12Ingresos: Int = 25000

    val n1Egresos: Int = 500
    val n2Egresos: Int = 500
    val n3Egresos: Int = 500
    val n4Egresos: Int = 4500
    val n5Egresos: Int = 1200
    val n6Egresos: Int = 3000
    val n7Egresos: Int = 4500
    val n8Egresos: Int = 4500
    val n9Egresos: Int = 4650
    val n10Egresos: Int = 6000
    val n11Egresos: Int = 6000
    val n12Egresos: Int = 75000

    var letra by remember {
        mutableStateOf(Color.Black)
    }

    var letra2 by remember {
        mutableStateOf(Color.Black)
    }

    var bandera by remember {
        mutableStateOf(R.drawable.bandera)
    }


    var resultado1 by remember {
        mutableStateOf("")
    }
    var resultado2 by remember {
        mutableStateOf("")
    }
    var resultado3 by remember {
        mutableStateOf("")
    }
    var resultado4 by remember {
        mutableStateOf("")
    }
    var resultado5 by remember {
        mutableStateOf("")
    }
    var resultado6 by remember {
        mutableStateOf("")
    }
    var resultado7 by remember {
        mutableStateOf("")
    }
    var resultado8 by remember {
        mutableStateOf("")
    }
    var resultado9 by remember {
        mutableStateOf("")
    }
    var resultado10 by remember {
        mutableStateOf("")
    }
    var resultado11 by remember {
        mutableStateOf("")
    }
    var resultado12 by remember {
        mutableStateOf("")
    }


    Column(modifier = Modifier.fillMaxSize()) {
        Column (modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End) {
            Image(painter = painterResource(id = bandera),
                contentDescription = "bandera",
                modifier = Modifier.size(70.dp))

        }
        Column (modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Contabilidad de Alfonso Estudiante",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)

        }
        Column (){
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "",
                    color = Color.Blue,
                    modifier = Modifier
                        .width(100.dp)
                )
                Text(text = "Ingresos",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "Egresos",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "Neto",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
            }
        }
        Column {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Enero",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "$n1Ingresos",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$n1Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$resultado1",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )


            }
        }

        Column {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Febrero",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "$n2Ingresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$n2Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$resultado2",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )


            }
        }

        Column {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Marzo",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "$n3Ingresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$n3Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$resultado3",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )


            }
        }

        Column {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Abril",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "$n4Ingresos",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$n4Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$resultado4",
                    color = letra, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )


            }
        }

        Column {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Mayo",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "$n5Ingresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$n5Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$resultado5",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )


            }
        }

        Column {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Junio",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "$n6Ingresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$n6Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$resultado6",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )


            }
        }

        Column {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Julio",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "$n7Ingresos",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$n7Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$resultado7",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }
        }

        Column {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Agosto",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "$n8Ingresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$n8Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$resultado8",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }

        }

        Column {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Septiembre",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "$n9Ingresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$n9Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$resultado9",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }

        }

        Column {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Octubre",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "$n10Ingresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$n10Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$resultado10",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }

        }

        Column {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Noviembre",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "$n11Ingresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$n11Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$resultado11",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }

        }

        Column {
            Row (modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Diciembre",
                    color = Color.White, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color(0xFF17911F))
                )
                Text(text = "$n12Ingresos",
                    fontWeight = FontWeight.Bold,
                    color = Color.Blue, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$n12Egresos",
                    color = Color.Black, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
                Text(text = "$resultado12",
                    color = letra2, modifier = Modifier
                        .width(100.dp)
                        .background(color = Color.White)
                )
            }

        }

        Button(onClick = {
            resultado1 = (n1Ingresos.toInt() - n1Egresos.toInt()).toString()
            resultado2 = (n2Ingresos.toInt() - n2Egresos.toInt()).toString()
            resultado3 = (n3Ingresos.toInt() - n3Egresos.toInt()).toString()
            resultado4 = (n4Ingresos.toInt() - n4Egresos.toInt()).toString()
            resultado5 = (n5Ingresos.toInt() - n5Egresos.toInt()).toString()
            resultado6 = (n6Ingresos.toInt() - n6Egresos.toInt()).toString()
            resultado7 = (n7Ingresos.toInt() - n7Egresos.toInt()).toString()
            resultado8 = (n8Ingresos.toInt() - n8Egresos.toInt()).toString()
            resultado9 = (n9Ingresos.toInt() - n9Egresos.toInt()).toString()
            resultado10 = (n10Ingresos.toInt() - n10Egresos.toInt()).toString()
            resultado11 = (n11Ingresos.toInt() - n11Egresos.toInt()).toString()
            resultado12 = (n12Ingresos.toInt() - n12Egresos.toInt()).toString()

            bandera = R.drawable.banderamexico

            if (resultado4.toInt() < 0){
                letra = Color.Red
            }

            if (resultado12.toInt() < 0){
                letra2 = Color.Red
            }

        },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Resultados")

        }
    }

}