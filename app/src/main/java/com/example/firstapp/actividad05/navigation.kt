package com.example.firstapp.actividad05

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationMan() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "entry") {
        composable("entry") {
            EntryScreen { year ->
                navController.navigate("result/$year")
            }
        }
        composable("result/{birthYear}") { backStackEntry ->
            val birthYear = backStackEntry.arguments?.getString("birthYear")?.toIntOrNull() ?: 0
            ResultScreen(birthYear = birthYear)
        }
    }
}