package com.akshay.koffee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavGraph
import com.akshay.koffee.Presentation.Screens.CartScreen.CartScreen
import com.akshay.koffee.Presentation.Screens.DetailedScreen.DetailedScreen
import com.akshay.koffee.Presentation.Screens.FavouriteScreen.FavouriteScreen
import com.akshay.koffee.Presentation.Screens.homescreen.HomeScreen
import com.akshay.koffee.Presentation.Screens.theme.KoffeeTheme
import com.akshay.koffee.Presentation.navigation.navGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KoffeeTheme {
navGraph()
            }
        }
    }
}