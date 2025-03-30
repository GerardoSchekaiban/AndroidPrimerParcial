package com.example.firstapp.lazylist.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.firstapp.lazylist.StudentViewModel
import com.example.firstapp.lazylist.viewmodels.ProductViewModel

@Preview(showBackground = true)
@Composable

fun ListProductsView(){
    val productViewModel: ProductViewModel = ProductViewModel()
    val studentViewModel: StudentViewModel = StudentViewModel()
    Column (modifier = Modifier.fillMaxSize()) {

        LazyColumn() {
            item {
                Text(text = studentViewModel.selectedStudent,
                    fontSize = 24.sp)
            }

            items(productViewModel.obtenerProductos()){product ->
                ProductView(producto = product)
            }

            item {
                Button(onClick = {}) {
                    Text(text = "Terminar compra")
                }
            }
        }
    }
}