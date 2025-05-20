package com.example.firstapp.practicasemestral

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firstapp.practicasemestral.datastore.SessionManager
import com.example.firstapp.practicasemestral.ui.DetailScreen
import com.example.firstapp.practicasemestral.ui.HomeScreen
import com.example.firstapp.practicasemestral.ui.LoginScreen

@Composable
fun AppNavigator(sessionManager: SessionManager){
    val navController = rememberNavController()
    val isLoggedIn by sessionManager.isLoggedInFlow.collectAsState(initial = false)

    NavHost(
        navController = navController,
        startDestination = if (isLoggedIn) "home" else "login"
    ){
        composable("login") {LoginScreen(navController, sessionManager)}
        composable("home") {HomeScreen(navController, sessionManager)}
        composable("detail/{uuid}") { backStackEntry ->
            val uuid = backStackEntry.arguments?.getString("uuid")
            DetailScreen(uuid = uuid ?: "", navController = navController)
        }
    }
}