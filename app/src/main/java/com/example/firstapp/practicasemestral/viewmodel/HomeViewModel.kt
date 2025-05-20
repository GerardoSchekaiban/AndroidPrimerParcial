package com.example.firstapp.practicasemestral.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firstapp.practicasemestral.model.User
import com.example.firstapp.practicasemestral.repository.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class HomeViewModel: ViewModel() {
    private val _users = MutableStateFlow<List<User>>(emptyList())
    val users: StateFlow<List<User>> = _users

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getUsers()
                _users.value = response.results
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}