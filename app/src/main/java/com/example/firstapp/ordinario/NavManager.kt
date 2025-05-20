package com.example.firstapp.ordinario

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.firstapp.ordinario.ui.PantallaFinal
import com.example.firstapp.ordinario.ui.PantallaInicial
import com.example.firstapp.ordinario.ui.Pantallalista

@Composable
fun AppNavigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "Inicio") {
        composable("Inicio") {
            PantallaInicial(navController = navController)
        }

        composable("Over") {
            PantallaFinal(navController = navController)
        }

        composable("Lista") {
            Pantallalista(navController = navController)
        }

    }
}