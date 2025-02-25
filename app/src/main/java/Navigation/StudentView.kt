package Navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import java.util.jar.Attributes.Name

@Composable
fun StudentView(id: Int, name: String){
    Column {
        Text(text = "$name -- $id")
    }
}