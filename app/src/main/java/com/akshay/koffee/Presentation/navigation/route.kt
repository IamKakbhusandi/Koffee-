package com.akshay.koffee.Presentation.navigation

import kotlinx.serialization.Serializable

sealed class route {
    @Serializable
    object welcomeScreen : route()

    @Serializable
    object homeScreen : route()

    @Serializable
    data class detailedScreen(val productId: Int) : route()

    @Serializable
    object CartScreen: route()

    @Serializable
    object FavouritesScreen: route()

    @Serializable
    object ProfileScreen: route()



}
