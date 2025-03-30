package com.example.firstapp.TareaDatastore

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

object dataStoreManager {
    private val Context.dataStore by preferencesDataStore("user_prefs")

    val PREF_NAME = stringPreferencesKey("name")
    val PREF_AGE = intPreferencesKey("age")
    val PREF_HEIGHT = floatPreferencesKey("height")
    val PREF_WALLET = floatPreferencesKey("wallet")

    suspend fun savePreferences(context: Context, name: String, age: Int, height: Float, wallet: Float) {
        context.dataStore.edit { prefs ->
            prefs[PREF_NAME] = name
            prefs[PREF_AGE] = age
            prefs[PREF_HEIGHT] = height
            prefs[PREF_WALLET] = wallet
        }
    }

    suspend fun getPreferences(context: Context): Map<String, Any?> {
        val prefs = context.dataStore.data.first()
        return mapOf(
            "name" to prefs[PREF_NAME],
            "age" to prefs[PREF_AGE],
            "height" to prefs[PREF_HEIGHT],
            "wallet" to prefs[PREF_WALLET]
        )
    }
}
