package com.akshay.koffee.Presentation.Screens.DetailedScreen

import android.R.attr.text
import android.graphics.Color
import android.util.Log.i
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.akshay.koffee.Domain.model.product
import com.akshay.koffee.R

@Composable
fun DetailedScreen(productId: Int, navController: NavController) {
    val products = listOf(
        product(1, "latte", "Creamy", 15.00, R.drawable.coffee_1),
        product(2, "cappuccino", "Smooth And Rich", 18.00, R.drawable.coffee_2),
        product(3, "frappe", "Refreshing", 25.00, R.drawable.coffee_3),
        product(4, "tea", "Ginger Blast ", 5.00, R.drawable.coffee_4),
        product(5, "caffè Mocha", "Sweet", 12.00, R.drawable.coffee_5),
        product(6, "black coffee", "Strong And Awakening", 8.00, R.drawable.coffee_6)
    )
    var selectedProduct=products.find{it.id==productId}
    if(selectedProduct==null){
        Text(text="Product not found",color= androidx.compose.ui.graphics.Color.Red)
        return
    }

    Scaffold(
        topBar = {
            DetailedScreenTopBar(navController)
        },
        bottomBar = {DetailedScreenBottomBar()}

    )
    { innerPadding ->
        LazyColumn() {
            item{
                ProductDetailsContent(
                   selectedProduct,
                    innerPadding
               )
                innerPadding
            }
        }
    }

}
