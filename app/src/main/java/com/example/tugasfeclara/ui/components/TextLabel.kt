package com.example.tugasfeclara.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextLabel(
    label: String,
    text: String,
    color: Color = Color.Black
) {
    Text(
        text = label,
        fontSize = 15.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.Black
    )

    Text(
        text = text,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
        color = color
    )

    Spacer(modifier = Modifier.height(8.dp))
}