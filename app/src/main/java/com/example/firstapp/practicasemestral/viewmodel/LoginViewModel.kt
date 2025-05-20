package com.example.firstapp.practicasemestral.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firstapp.practicasemestral.datastore.SessionManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class LoginViewModel(private val sessionManager: SessionManager): ViewModel() {
    private val _username = MutableStateFlow("")
    val username:StateFlow<String> = _username

    private val _password = MutableStateFlow("")
    val password:StateFlow<String> = _password

    private val _error = MutableStateFlow("")
    val error:StateFlow<String> = _error

    fun onUsernameChanged(newUsername: String) {
        _username.value = newUsername
    }

    fun onPasswordChanged(newPassword: String) {
        _password.value = newPassword
    }

    fun login(onSuccess: () -> Unit) {
        if (_username.value.isBlank() || _password.value.isBlank()) {
            _error.value = "Por favor llena todos los campos"
        } else {
            viewModelScope.launch {
                sessionManager.saveLoginState(true)
                onSuccess()
            }
        }
    }
}