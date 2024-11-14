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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tugasfeclara.ui.components.BoxImage
import com.example.tugasfeclara.model.Character
import com.example.tugasfeclara.ui.components.SearchTextField

@Composable
fun CharacterPage(modifier: Modifier = Modifier, navController: NavController) {
    var query by remember { mutableStateOf("") }
    var charList by remember { mutableStateOf(Character.getAllCharacter()) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        SearchTextField(
            query = query,
            onQueryChange = { query = it },
            onSearchClick = {
                charList = Character.searchCharacter(query)
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxSize()
            ) {
                items(charList.size) {index ->
                    val char = charList[index]
                    BoxImage(char.imageUrl, char.characterName, function = {
                        navController.navigate("detail_character/${char.id}")
                    })
                }
            }
        }
    }
}