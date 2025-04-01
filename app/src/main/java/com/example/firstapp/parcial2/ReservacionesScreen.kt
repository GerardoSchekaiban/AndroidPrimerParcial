package com.example.firstapp.parcial2

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.firstapp.parcial2.viewmodel.VueloVm

@Composable
fun PantallaReserva(navController: NavHostController, viewModel: VueloVm) {

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        OutlinedTextField(
            value = viewModel.pasajero,
            onValueChange = { viewModel.pasajero = it },
            label = { Text("Nombre del pasajero") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(24.dp))

        Text("Selecciona aerolínea:", fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(8.dp))
        LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            items(viewModel.aerolineas) { aerolinea ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { viewModel.aerolineaSeleccionada = aerolinea }
                        .padding(12.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = aerolinea.imagen),
                        contentDescription = null,
                        modifier = Modifier.size(40.dp)
                    )
                    Spacer(Modifier.width(16.dp))
                    Text(text = aerolinea.nombre)
                }
            }
        }

        Spacer(Modifier.height(24.dp))

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)) {

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(onClick = { navController.popBackStack() }) {
                    Text("Regresar")
                }
                Button(onClick = {  }) {
                    Text("Reservar")
                }
            }
        }
    }
}
