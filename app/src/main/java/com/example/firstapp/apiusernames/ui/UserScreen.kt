package com.example.firstapp.apiusernames.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun UserScreen(viewModel: UserViewModel) {
    val users by viewModel.users.collectAsState()

    Column(modifier = Modifier.padding(16.dp)) {
        Text("Lista de usuarios", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn {
            items(users) { user ->
                Text(text = user.name)
                Text(text = user.email, style = MaterialTheme.typography.bodySmall)
                Divider()
            }
        }
    }
}