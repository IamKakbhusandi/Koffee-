package com.akshay.koffee.Presentation.Screens.homescreen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.akshay.koffee.Presentation.Screens.ProductCard
import com.akshay.koffee.Domain.model.product

@Composable
fun ProductGrid(
    products: List<product>,
    navController: NavController,
    topContent: @Composable () -> Unit



    ) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    )

    {
        item {
            topContent()

        }
        items(products.chunked(2)) { rowItems ->
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                ProductCard(
                    product = rowItems[0],
                    modifier = Modifier.weight(1f),
                    navController = navController
                )
                if (rowItems.size == 2) {
                    ProductCard(
                        product = rowItems[1],
                        modifier = Modifier.weight(1f),
                        navController = navController

                    )
                } else {
                    Spacer(modifier = Modifier.weight(1f))
                }
            }

        }


    }
}