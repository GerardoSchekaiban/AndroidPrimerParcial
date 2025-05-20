package com.example.firstapp.apidog.ui.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil3.compose.AsyncImage
import com.example.firstapp.apidog.ui.viewmodel.DogViewModel

@Composable
fun DogView( viewModel: DogViewModel) {
    Column(modifier = Modifier.fillMaxSize()){
        Text(text = "Bienvenido, conoce al mejor cachorro del año")

        AsyncImage(
            model = viewModel.urlImage,
            contentDescription = null
        )

        Button(onClick = { viewModel.mostrarImagen() })
        {
            Text(text = "Cargar imagen")
        }
    }
}

@Composable
fun breedsView( viewModel: DogViewModel) {
    LazyColumn() {
        item{
            Button(onClick = {
                viewModel.traerImagen()
            }) {
                Text(text = "Cargar Imagen")
            }
        }

        items(viewModel.allImages){ url->
            AsyncImage(
                model = url,
                contentDescription = null
            )

        }
    }
}