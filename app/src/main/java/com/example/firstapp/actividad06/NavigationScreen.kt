package com.example.firstapp.actividad06

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.firstapp.actividad06.viewmodel.tienda

@Composable
fun NavigationScreen(viewModel: tienda = viewModel()) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "categorias") {
        composable("categorias") {
            CategoriasScreen(viewModel) { categoriaId ->
                navController.navigate("productos/$categoriaId")
            }
        }

        composable(
            route = "productos/{categoriaId}",
            arguments = listOf(navArgument("categoriaId") { type = NavType.IntType })
        ) { backStackEntry ->
            val categoriaId = backStackEntry.arguments?.getInt("categoriaId") ?: 1
            ProductosScreen(viewModel, categoriaId)
        }
    }
}
