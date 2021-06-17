package com.greensocks.codelab.ui

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.greensocks.codelab.ui.theme.CodeLabTheme

@Composable
fun MainApp(contentView: @Composable () -> Unit) {
    CodeLabTheme {
        // A surface container using the 'background' color from the theme
        contentView()
    }
}