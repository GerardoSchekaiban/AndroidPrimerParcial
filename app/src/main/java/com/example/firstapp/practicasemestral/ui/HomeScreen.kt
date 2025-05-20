package com.example.firstapp.practicasemestral.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.firstapp.practicasemestral.datastore.SessionManager
import com.example.firstapp.practicasemestral.model.User
import com.example.firstapp.practicasemestral.viewmodel.HomeViewModel
import kotlinx.coroutines.launch


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController, sessionManager: SessionManager) {
    val viewModel = remember { HomeViewModel() }
    val users by viewModel.users.collectAsState()

    val coroutineScope = rememberCoroutineScope() // ✅

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Lista de alumnos") },
                actions = {
                    Button(onClick = {
                        coroutineScope.launch {
                            sessionManager.saveLoginState(false)
                            navController.navigate("login") {
                                popUpTo("home") { inclusive = true }
                            }
                        }
                    }) {
                        Text("Cerrar sesión")
                    }
                }
            )
        }
    ) {
        LazyColumn(contentPadding = PaddingValues(16.dp)) {
            items(users) { user ->
                StudentCard(user = user, onClick = {
                    navController.navigate("detail/${user.login.uuid}")
                })
            }
        }
    }
}

@Composable
fun StudentCard(user: User, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable { onClick() }
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = rememberImagePainter(user.picture.large),
                contentDescription = null,
                modifier = Modifier
                    .size(64.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = "${user.name.first} ${user.name.last}", style = MaterialTheme.typography.titleLarge)
                Text(text = "ID: ${user.login.uuid.take(6)}")
                Text(text = "Email: ${user.email}")
                Text(text = "Carrera: Sistemas") // Puedes cambiar esto si quieres
            }
        }
    }
}
