package com.greensocks.codelab.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.TabRowDefaults.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

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