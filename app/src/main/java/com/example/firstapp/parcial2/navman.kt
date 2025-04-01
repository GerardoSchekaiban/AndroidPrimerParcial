package com.example.firstapp.parcial2

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firstapp.parcial2.viewmodel.VueloVm

@Composable
fun AppNav(viewModel: VueloVm) {
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "vuelos") {
        composable("vuelos") {
            PantallaVuelos(navController, viewModel)
        }
        composable("reserva") {
            PantallaReserva(navController, viewModel)
        }
    }
}