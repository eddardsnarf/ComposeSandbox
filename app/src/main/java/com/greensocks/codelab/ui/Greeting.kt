package com.greensocks.codelab.ui

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.greensocks.codelab.FancyActivity

@Composable
fun Greeting(name: String, color: Color = Color.Transparent) {
    val context = LocalContext.current
    ClickableText(
        text = AnnotatedString("Hello $name!"),
        modifier = Modifier
            .background(color, shape = CutCornerShape(4.dp))
            .padding(24.dp),
        onClick = {
            context.startActivity(Intent(context, FancyActivity::class.java))
        }

    )
}