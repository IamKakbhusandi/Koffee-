package com.akshay.koffee.Presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.akshay.koffee.Presentation.Screens.CartScreen.CartScreen
import com.akshay.koffee.Presentation.Screens.DetailedScreen.DetailedScreen
import com.akshay.koffee.Presentation.Screens.FavouriteScreen.FavouriteScreen
import com.akshay.koffee.Presentation.Screens.ProfileScreen.ProfileScreen
import com.akshay.koffee.Presentation.Screens.homescreen.HomeScreen
import com.akshay.koffee.Presentation.Screens.welcomescreen.WelcomeScreen

@Composable
fun navGraph(){
    val navController= rememberNavController()
    NavHost(navController=navController,
        startDestination = route.welcomeScreen
    ){
        composable<route.welcomeScreen>{
            WelcomeScreen  (navController)

        }

        composable<route.homeScreen>{
            HomeScreen(navController)

        }
        composable<route.detailedScreen>{backStackEntry->
            val args=backStackEntry.toRoute<route.detailedScreen>()
            DetailedScreen(productId = args.productId,navController)

        }
        composable <route.CartScreen>{
            CartScreen(navController)
        }
        composable<route.FavouritesScreen> {
            FavouriteScreen(navController)
        }
        composable<route.ProfileScreen>{
            ProfileScreen(navController)
        }
        }

    }

