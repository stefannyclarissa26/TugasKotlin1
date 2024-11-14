package com.example.tugasfeclara.ui.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tugasfeclara.ui.components.BoxImage
import com.example.tugasfeclara.ui.components.CustomText
import com.example.tugasfeclara.model.Character
import com.example.tugasfeclara.ui.components.HeadingText

@Composable
fun HomePage(modifier: Modifier = Modifier, navController: NavController) {
    val filterMeta = Character.getMetaCharacter()
    val filterNonMeta = Character.getNonMetaCharacter()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        HeadingText("Popular Character")
        LazyRow(
            modifier = Modifier.fillMaxWidth().padding(top = 8.dp, bottom = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(filterMeta.size) {index ->
                val character = filterMeta[index]
                BoxImage(character.imageUrl, character.characterName, function = {
                    navController.navigate("detail_character/${character.id}")
                })
            }
        }

        HeadingText("Non-Meta Heroes")
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
        ) {
            items(filterNonMeta.size) {index ->
                val character = filterNonMeta[index]
                Row(
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    BoxImage(character.imageUrl, character.characterName, function = {
                        navController.navigate("detail_character/${character.id}")
                    })
                    Spacer(modifier = Modifier.width(8.dp))
                    Column(
                        modifier = Modifier.padding(start = 8.dp)
                    ) {
                        CustomText(character.characterName)
                        CustomText(
                            text = "★".repeat(character.rarity),
                            color = Color(0xFFFFC107)
                        )
                        CustomText(
                            text = character.combatType.toString() + " | " + character.path,
                            color = Color.Gray,
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
    }
}