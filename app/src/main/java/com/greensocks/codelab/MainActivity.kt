package com.greensocks.codelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import com.greensocks.codelab.ui.MainActivityContent
import com.greensocks.codelab.ui.MainApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainApp {
                MainActivityContent()
            }
        }
    }
}

@Preview(showBackground = true, device = Devices.NEXUS_5X)
@Composable
fun DefaultPreview() {
    MainApp {
        MainActivityContent()
    }
}