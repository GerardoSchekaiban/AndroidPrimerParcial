package com.example.firstapp.TareaDatastore

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun appNavigator(context: Context) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "registro") {
        composable("registro") {
            RegistroUsuarioScreen(navController, context)
        }
        composable("productos/{dinero}",
            arguments = listOf(navArgument("dinero") { type = NavType.FloatType })
        ) { backStackEntry ->
            val dinero = backStackEntry.arguments?.getFloat("dinero") ?: 0f
            ProductosScreen(navController, dinero, context)
        }
    }
}