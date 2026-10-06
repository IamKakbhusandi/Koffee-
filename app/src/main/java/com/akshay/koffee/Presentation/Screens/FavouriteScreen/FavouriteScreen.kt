package com.akshay.koffee.Presentation.Screens.FavouriteScreen

import android.R.attr.padding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.akshay.koffee.Domain.model.product
import com.akshay.koffee.Presentation.Screens.UIcomponents.MyBottomNavBar
import com.akshay.koffee.R

@Composable
fun FavouriteScreen(navController: NavController){

    var FavItems by remember { mutableStateOf(listOf(
        product(1, "latte", "Creamy", 15.00, R.drawable.coffee_1),
        product(2, "cappuccino", "Smooth And Rich", 18.00, R.drawable.coffee_2),
        product(3, "frappe", "Refreshing", 25.00, R.drawable.coffee_3),

        )) }

    Scaffold(
        topBar = {FavScreenTopBar()},
        bottomBar={MyBottomNavBar(navController=navController,"Favourites")}
    )
    { innerPadding ->innerPadding
        LazyColumn(modifier= Modifier.fillMaxSize()
            .padding(16.dp)
            .padding(innerPadding)
        ) {
            item {
                FavItems.forEach { product ->
                    FavouriteItemCart(product,
                        onRemove={FavItems=FavItems - product})
                }
            }


        }


    }}


