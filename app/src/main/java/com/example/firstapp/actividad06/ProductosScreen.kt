package com.example.firstapp.actividad06

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.firstapp.actividad06.model.Producto
import com.example.firstapp.actividad06.viewmodel.tienda

@Composable
fun ProductosScreen(viewModel: tienda, categoriaId: Int) {
    val productos = viewModel.productosPorCategoria[categoriaId] ?: emptyList()

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("Productos", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(8.dp))

        if (categoriaId == 1) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(productos) { producto ->
                    ProductoItemGrid(producto)
                }
            }
        } else {
            LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                items(productos) { producto ->
                    ProductoItemList(producto)
                }
            }
        }
    }
}

@Composable
fun ProductoItemGrid(producto: Producto) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(6.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = producto.imagenResId),
                contentDescription = producto.nombre,
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(8.dp))
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(producto.nombre, style = MaterialTheme.typography.bodyMedium, textAlign = TextAlign.Center)
            Text("$${producto.precio}", style = MaterialTheme.typography.bodySmall)
            if (producto.envioGratis) {
                Text("Envío gratis", color = Color.Green, style = MaterialTheme.typography.labelSmall)
            }
            if (producto.promocion) {
                Text("🔥 Promoción", color = Color.Red, style = MaterialTheme.typography.labelSmall)
            }
        }
    }
}

@Composable
fun ProductoItemList(producto: Producto) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(6.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = producto.imagenResId),
                contentDescription = producto.nombre,
                modifier = Modifier
                    .size(80.dp)
                    .clip(RoundedCornerShape(8.dp))
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(producto.nombre, style = MaterialTheme.typography.bodyMedium)
                Text("$${producto.precio}", style = MaterialTheme.typography.bodySmall)
                if (producto.envioGratis) {
                    Text("Envío gratis", color = Color.Green, style = MaterialTheme.typography.labelSmall)
                }
                if (producto.promocion) {
                    Text("🔥 Promoción", color = Color.Red, style = MaterialTheme.typography.labelSmall)
                }
            }
        }
    }
}


