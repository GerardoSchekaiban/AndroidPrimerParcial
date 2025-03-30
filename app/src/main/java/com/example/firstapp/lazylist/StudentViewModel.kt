package com.example.firstapp.lazylist
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class StudentViewModel: ViewModel() {

    var selectedStudent by mutableStateOf("")
        private set

    init {
        viewModelScope.launch {
            selectedStudent = getStudentAsync()

        }
    }


    suspend fun getStudentAsync() : String {
        return withContext(Dispatchers.IO) {
            delay(5000)
            val students = listOf<String>(
                "Fabiola", "Yahir", "Marcelo", "Ivan", "Yuanel", "Eunice", "Julia",
                "Maximiliano", "Juan Pablo", "Zuri", "Roberto", "Gerardo", "Luis",
                "David", "Alain", "Valeria", "Edna", "Guillermo"
            )
            delay(3000)
            students.random()
        }
    }
}
