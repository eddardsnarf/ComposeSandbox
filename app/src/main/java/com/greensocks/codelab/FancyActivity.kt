package com.greensocks.codelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.greensocks.codelab.ui.FancyActivityContent
import com.greensocks.codelab.ui.MainApp

class FancyActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainApp {
                FancyActivityContent()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultFancyPreview() {
    MainApp {
        FancyActivityContent()
    }
}