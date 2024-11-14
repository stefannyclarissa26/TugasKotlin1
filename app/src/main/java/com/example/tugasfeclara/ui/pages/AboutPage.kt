package com.example.tugasfeclara.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugasfeclara.ui.components.BoxImage
import com.example.tugasfeclara.ui.components.CustomText
import com.example.tugasfeclara.R
import com.example.tugasfeclara.ui.components.HeadingText

@Composable
fun AboutPage(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            BoxImage(R.drawable.profile, "Foto Profil", size = 200.dp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier.padding(start = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            CustomText(
                text = "Stefanny Clarissa Natalia",
                fontSize = 18.sp
            )
            CustomText(
                text = "stefannyclarissanatalia@gmail.com",
                color = Color.Gray,
                fontWeight = FontWeight.Normal
            )
            Spacer(modifier = Modifier.height(16.dp))
            CustomText(
                text = "Universitas Negeri Surabaya",
                color = Color.Black
            )
            CustomText(
                text = "Jurusan Desain Komunikasi Visual",
                color = Color(0xFFFF6D8D),
                fontWeight = FontWeight.Light
            )
            CustomText(
                text = "Fakultas Bahasa dan Seni",
                color = Color(0xFFFF6D8D),
                fontWeight = FontWeight.Light
            )
        }
    }
}