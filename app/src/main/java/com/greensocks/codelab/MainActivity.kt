package com.greensocks.codelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.greensocks.codelab.ui.theme.CodeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MainActivityContent()
            }
        }
    }
}

@Composable
fun MainActivityContent() {
    Column {
        Greeting("ANA ARE MERE")
        Divider(color = Color.Blue)
        Greeting("BIANCA ARE BANCA")
    }
}

@Composable
fun MyApp(contentView: @Composable () -> Unit) {
    CodeLabTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = Color.Yellow) {
            contentView()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", modifier = Modifier.padding(24.dp))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp { Greeting("YOLLOLOLOLOL") }
}