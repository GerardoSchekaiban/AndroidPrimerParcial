package com.example.firstapp.tarea3

import WelcomeScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "welcome") {
        composable("welcome") {
            WelcomeScreen {
                navController.navigate("form")
            }
        }
        composable("form") {
            FormScreen { name, id ->
                navController.navigate("result/$name/$id")
            }
        }
        composable("result/{name}/{id}") { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name") ?: ""
            val id = backStackEntry.arguments?.getString("id")?.toIntOrNull() ?: 0
            ResultScreen(name = name, id = id)
        }
    }
}