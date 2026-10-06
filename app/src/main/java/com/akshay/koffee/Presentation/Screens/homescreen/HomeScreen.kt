package com.akshay.koffee.Presentation.Screens.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.akshay.koffee.R
import com.akshay.koffee.Presentation.Screens.UIcomponents.MyBottomNavBar
import com.akshay.koffee.Domain.model.product

@Composable
fun HomeScreen(navController: NavController) {
    val location = "Kyarkuli, jheel"
    Scaffold(
        bottomBar = {
            MyBottomNavBar(navController,"Home")
        }
    )
    { innerPadding ->
        innerPadding

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f / 3f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(color = 0xFF303030),
                            Color(color = 0xFF1F1F1F),
                            Color(color = 0xFF121212),
                        )
                    )
                )
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(innerPadding)
        ) {
            //displaying dummy products
            val products = listOf(
                product(1, "latte", "Creamy", 15.00, R.drawable.coffee_1),
                product(2, "cappuccino", "Smooth And Rich", 18.00, R.drawable.coffee_2),
                product(3, "frappe", "Refreshing", 25.00, R.drawable.coffee_3),
                product(4, "tea", "Ginger Blast ", 5.00, R.drawable.coffee_4),
                product(5, "caffè Mocha", "Sweet", 12.00, R.drawable.coffee_5),
                product(6, "black coffee", "Strong And Awakening", 8.00, R.drawable.coffee_6)
            )
            ProductGrid(products = products, navController = navController) {
            Text(
                text = "Location",
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                color = Color.LightGray
            )

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = location,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Arrow",
                    tint = Color.LightGray
                )

            }
            Spacer(modifier = Modifier.height(35.dp))
            SearchBar()

            Spacer(modifier = Modifier.height(45.dp))
            Image(
                painter = painterResource(R.drawable.banner_1),
                "image"
            )
            Spacer(modifier = Modifier.height(10.dp))

            HomeScreenCategeries()

        }

        }

    }

}
