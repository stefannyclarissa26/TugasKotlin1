package com.example.tugasfeclara.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tugasfeclara.ui.components.TextLabel
import com.example.tugasfeclara.model.Character

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailCharacterScreen(modifier: Modifier = Modifier, navController: NavController, id: Int) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = { Text("Detail Character") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color(0xFFFF6D8D),
                    titleContentColor = Color.White
                ),
                navigationIcon = {
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Kembali")
                    }
                }
            )
        }
    ) { innerPadding ->
        ContentScreen(modifier = Modifier.padding(innerPadding), id = id)
    }
}

@Composable
fun ContentScreen(modifier: Modifier = Modifier, id: Int){
    val getDataById = Character.getCharacterById(id)

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(Color.LightGray),

            contentAlignment = Alignment.Center
        ) {
            val painter = painterResource(id = getDataById[0].imageUrl)
            Image(
                painter = painter,
                contentDescription = "Image detail hero ${getDataById[0].characterName}",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            items(getDataById.size) {index ->
                val character = getDataById[index]
                val status = if (character.isPopular) "Popular Character" else "Not Popular Character"

                TextLabel("ID", character.id.toString())
                TextLabel("Hero Name", character.characterName)
                TextLabel("Path", character.path)
                TextLabel("Combat Type", character.combatType.toString())
                TextLabel("Faction", character.faction)
                TextLabel("Rarity", "★".repeat(character.rarity), Color(0xFFFFC107))
                TextLabel("Status", status)
            }
        }
    }
}