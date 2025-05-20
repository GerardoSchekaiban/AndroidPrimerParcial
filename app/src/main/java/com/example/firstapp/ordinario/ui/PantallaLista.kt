package com.example.firstapp.ordinario.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.firstapp.ordinario.viewmodel.PokemonViewModel

@Composable
fun Pantallalista(navController: NavController) {
    val viewModel: PokemonViewModel = viewModel()
    val pokemonList by viewModel.pokemonList.collectAsState()

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(
            text = "Lista de Pokémon (151)",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate("Inicio") },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
        ) {
            Text("Regresar", color = Color.White)
        }

        LazyColumn {
            items(pokemonList) { pokemon ->
                Text(text = pokemon.name.replaceFirstChar { it.uppercase() }, modifier = Modifier.padding(8.dp))
                Divider()
            }
        }


    }
}
