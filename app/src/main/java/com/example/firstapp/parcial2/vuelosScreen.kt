package com.example.firstapp.parcial2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.firstapp.parcial2.viewmodel.VueloVm

@Composable
fun PantallaVuelos(navController: NavController, viewModel: VueloVm) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {

        Text("Vuelos Nacionales")
        Spacer(modifier = Modifier.height(8.dp))

        LazyRow(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            items(viewModel.vuelosNacionales) { vuelo ->
                Card(
                    modifier = Modifier
                        .width(260.dp)
                        .height(120.dp),
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.cardElevation(6.dp),
                    onClick = {
                        viewModel.seleccionarVuelo(vuelo)
                        navController.navigate("reserva")
                    }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp)
                    ) {
                        Image(
                            painter = painterResource(id = vuelo.imagen),
                            contentDescription = vuelo.ciudad,
                            modifier = Modifier
                                .size(80.dp)
                                .clip(RoundedCornerShape(12.dp))
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(vuelo.ciudad)
                            Text(vuelo.tipo)
                            Text(vuelo.extras)
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(24.dp))
        Text("Vuelos Internacionales")
        Spacer(modifier = Modifier.height(8.dp))

        LazyRow(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
            items(viewModel.vuelosInternacionales) { vuelo ->
                Card(
                    modifier = Modifier
                        .width(260.dp)
                        .height(120.dp),
                    shape = RoundedCornerShape(16.dp),
                    elevation = CardDefaults.cardElevation(6.dp),
                    onClick = {
                        viewModel.seleccionarVuelo(vuelo)
                        navController.navigate("reserva")
                    }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp)
                    ) {
                        Image(
                            painter = painterResource(id = vuelo.imagen),
                            contentDescription = vuelo.ciudad,
                            modifier = Modifier
                                .size(80.dp)
                                .clip(RoundedCornerShape(12.dp))
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(vuelo.ciudad)
                            Text(vuelo.tipo)
                            Text(vuelo.extras)
                        }
                    }
                }
            }
        }
    }
}

