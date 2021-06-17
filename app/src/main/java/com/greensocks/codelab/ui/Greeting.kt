package com.greensocks.codelab.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(name: String, color: Color = Color.Transparent) {
    Text(
        text = "Hello $name!",
        modifier = Modifier
            .background(color, shape = CutCornerShape(4.dp))
            .padding(24.dp)
    )
}