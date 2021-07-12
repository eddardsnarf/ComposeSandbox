package com.greensocks.codelab.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.core.graphics.toColorInt

@Composable
fun MainActivityContent(
    names: List<String> = listOf(
        "Gicu",
        "Dorel",
        "Fanfernikel",
        "Herpaderp",
        "Earp"
    )
) {
    val countState = remember { mutableStateOf(0) }

    Surface(color = Color.Yellow) {
        Column {
            for (name in names) {
                Greeting(name, Color(name.toHexRgb()))
                Divider(color = Color.Transparent, thickness = 8.dp)
            }
            Counter(
                count = countState.value,
                updateCount = { newCount -> countState.value = newCount }
            )
        }
    }
}

fun String.toRGB(): String {
    val i = this.hashCode()
    return "#" +
        (Integer.toHexString(i shr 16 and 0xFF) +
            Integer.toHexString(i shr 8 and 0xFF) +
            Integer.toHexString(i and 0xFF)).padStart(6, '0')
}

fun String.toHexRgb(): Int {
    return this.toRGB().toColorInt()
}