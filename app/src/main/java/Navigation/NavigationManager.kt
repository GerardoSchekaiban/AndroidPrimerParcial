package Navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.firstapp.BotonesView
import com.example.firstapp.HomeView

@Preview(showBackground = true)
@Composable

fun NavigationManager(){

    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = "Inicio"){
        /// Aqui los nombres de rutas y su componente/vista
        composable(route = "Inicio"){
            HomeView(navController)
        }
        composable(route = "Botones"){
            BotonesView(navController)
        }

        composable(route = "estudiante/{nombre}/{id}",
            arguments = listOf(
                navArgument(name = "nombre"){
                    type = NavType.StringType
                }, //hasta primer parametro
                navArgument(name = "id"){
                    type = NavType.IntType
                }
            )){ parametros ->
            val studentName = parametros.arguments?.getString("nombre")?: ""
            val studentId = parametros.arguments?.getInt("id")?: 0
            StudentView(studentId, studentName)
        }
    }
}