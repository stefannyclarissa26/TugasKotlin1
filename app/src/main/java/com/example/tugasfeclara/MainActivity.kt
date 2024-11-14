package com.example.tugasfeclara

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tugasfeclara.ui.screens.DetailCharacterScreen
import com.example.tugasfeclara.ui.screens.MainScreen
import com.example.tugasfeclara.ui.theme.TugasFEClaraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TugasFEClaraTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "main_screen") {
                    composable("main_screen") { MainScreen(navController = navController) }

                    composable(
                        route = "detail_character/{id}",
                        arguments = listOf(navArgument("id") { type = NavType.IntType })
                    ) { backStackEntry ->
                        val id = backStackEntry.arguments?.getInt("id")
                        id?.let { DetailCharacterScreen(navController = navController, id = it) }
                    }
                }
            }
        }
    }
}
