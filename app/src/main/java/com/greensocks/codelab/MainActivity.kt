package com.greensocks.codelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
        val list = (1..1000).toList()
        setContent {
            MyApp {
                MainActivityContent(list)
            }
        }
    }
}

@Composable
fun MainActivityContent(list: List<Int>) {
    Column {
        Greeting("ANA ARE MERE")
        Divider(color = Color.Blue)
        Greeting("BIANCA ARE BANCA")
        Divider(color = Color.Blue)
        LazyColumn() {
            items(list) {
                Text(text = it.toString())
            }
        }
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
    MyApp {
        val list = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17)
        MainActivityContent(list)
    }
}