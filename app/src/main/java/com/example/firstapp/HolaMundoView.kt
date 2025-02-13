package com.example.firstapp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class MiObjeto(
    val esGrande: Boolean,
    val saludo: String,
    val colorText: Color,
    val fontSize: TextUnit,
    val limite: Int
)

@Preview(showBackground = true)
@Composable
fun HolaMundoView(){

    val miObjeto: MiObjeto = MiObjeto(
        esGrande=false, saludo = "Adiós mundo", Color.Red, 32.sp, limite = 2)
    /*
    val saludo: String = "Hola Mundo desde el IEST Soy Gerardo y me gusta el tenis. Siempre tengo hambre y estoy inquieto."
    val redColorText: Color = Color.Red
    val fontSize: TextUnit = 25.sp
    val limite: Int = 2
    var esGrande: Boolean = false
    */

    Text(text = miObjeto.saludo,
         color = miObjeto.colorText,
         fontSize = miObjeto.fontSize,
         fontStyle = FontStyle.Italic,
         fontWeight = FontWeight.Bold,
         fontFamily = FontFamily.SansSerif,
         maxLines = if(miObjeto.esGrande) miObjeto.limite else 1,
         overflow = TextOverflow.Ellipsis,
         textAlign = TextAlign.Center,
         modifier = Modifier
             .background(color = Color.Blue)
             .padding(16.dp)
             .background(color = Color.Black)
             .padding(horizontal = 8.dp)
             .background(color = Color.Gray)
             .padding(top = 6.dp)
             .background(color = Color(0xA6AD6E6E))
             .border(width = 3.dp, color = Color.Magenta)
             .fillMaxSize()
    )
}