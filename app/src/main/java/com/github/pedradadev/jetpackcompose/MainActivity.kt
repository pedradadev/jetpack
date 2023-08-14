package com.github.pedradadev.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.pedradadev.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                MyApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
private fun Greeting(name: String) {
    Surface(color = MaterialTheme.colors.primary) {
        Text (text = "Welcome $name!", modifier = Modifier.padding(24.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        MyApp()
    }
}

@Composable
fun MyApp(modifier: Modifier = Modifier){
    Surface(modifier = modifier, color = MaterialTheme.colors.background){
        Greeting(name = "Pedrada")
    }
}