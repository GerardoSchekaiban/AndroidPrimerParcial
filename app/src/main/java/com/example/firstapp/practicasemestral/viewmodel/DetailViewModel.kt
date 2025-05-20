package com.example.firstapp.practicasemestral.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firstapp.practicasemestral.model.User
import com.example.firstapp.practicasemestral.repository.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel : ViewModel() {
    private val _user = MutableStateFlow<User?>(null)
    val user: StateFlow<User?> = _user

    fun loadUser(uuid: String) {
        viewModelScope.launch {
            val response = RetrofitInstance.api.getUsers()
            val user = response.results.find { it.login.uuid == uuid }
            _user.value = user
        }
    }
}