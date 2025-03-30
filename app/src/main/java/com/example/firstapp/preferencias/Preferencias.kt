package com.example.firstapp.preferencias

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class Preferencias (private val context: Context) {

    companion object {
        val Context.dataStore: DataStore<Preferences>
        by preferencesDataStore(name = "settings")

        val AGE = intPreferencesKey(name = "edad")
        val NAME = stringPreferencesKey(name = "nombre")
        val SIGN_UP = intPreferencesKey(name = "registrado")

    }

    //Flow parte de las corrutinas para transmiti(recibir) el flujo de datos tipo Entero de forma asincrona
    val age: Flow<Int> = context.dataStore.data.map { misDatos ->
        // No type safety.
        misDatos[AGE] ?: 0
    }

    //Flow parte de las corrutinas para transmiti(recibir) el flujo de datos tipo String de forma asincrona
    val name: Flow<String> = context.dataStore.data.map{misDatos ->
        misDatos[NAME] ?: ""
    }

    suspend fun savePersonData(personName: String, personAge: Int) {
        context.dataStore.edit { settings ->
            settings[AGE] = personAge
            settings[NAME] = personName
        }
    }




}