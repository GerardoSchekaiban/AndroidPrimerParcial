package com.example.firstapp.practicasemestral.datastore

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.example.firstapp.preferencias.Preferencias.Companion.dataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class SessionManager(context: Context) {
    private val Context.dataStore by preferencesDataStore("user_prefs")
    private val dataStore = context.dataStore

    companion object{
        val IS_LOGGED_IN = booleanPreferencesKey("is_logged_in")
    }

    suspend fun saveLoginState(isLoggedIn: Boolean){
        dataStore.edit { it[IS_LOGGED_IN] = isLoggedIn }
    }

    val isLoggedInFlow: Flow<Boolean> = dataStore.data.map { it[IS_LOGGED_IN] ?: false }
}