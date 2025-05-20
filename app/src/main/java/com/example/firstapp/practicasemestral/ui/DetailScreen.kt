package com.example.firstapp.practicasemestral.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.firstapp.practicasemestral.viewmodel.DetailViewModel

@Composable
fun DetailScreen(uuid: String, navController: NavController) {
    val viewModel = remember { DetailViewModel() }
    val user by viewModel.user.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadUser(uuid)
    }

    user?.let { student ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            AsyncImage(
                model = student.picture.large,
                contentDescription = "Profile Picture",
                modifier = Modifier
                    .size(150.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "${student.name.first} ${student.name.last}",
                style = MaterialTheme.typography.headlineSmall
            )
            Text("ID: ${student.login.uuid}")
            Text("Email: ${student.email}")
            Text("Carrera: Ingeniería en Sistemas") // Simulada
            Spacer(modifier = Modifier.height(12.dp))
            Text("Biografía:", style = MaterialTheme.typography.titleMedium)
            Text(
                text = "Soy un estudiante apasionado por la tecnología y el desarrollo móvil. Me interesa aprender Kotlin y crear apps con Jetpack Compose.",
                style = MaterialTheme.typography.bodyMedium
            )
        }
    } ?: run {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            CircularProgressIndicator()
        }
    }
}
