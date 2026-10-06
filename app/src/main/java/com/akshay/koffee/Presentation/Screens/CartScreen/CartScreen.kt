package com.akshay.koffee.Presentation.Screens.CartScreen

import android.R.attr.fontWeight
import android.R.attr.text
import android.content.ClipData
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.akshay.koffee.Domain.model.product
import com.akshay.koffee.Presentation.Screens.ProductCard
import com.akshay.koffee.Presentation.Screens.UIcomponents.MyBottomNavBar
import com.akshay.koffee.Presentation.navigation.route
import com.akshay.koffee.R


@Composable
fun CartScreen(navController: NavController) {
    val Cartproducts = listOf(
        product(1, "latte", "Creamy", 15.00, R.drawable.coffee_1),
        product(2, "cappuccino", "Smooth And Rich", 18.00, R.drawable.coffee_2),
        product(3, "frappe", "Refreshing", 25.00, R.drawable.coffee_3),

        )
    var amount by remember { mutableStateOf(58.0) }
    var Fee by remember { mutableStateOf(1.0) }
    var totalAmount by remember { mutableStateOf(amount + Fee) }


    Scaffold(
        topBar = {
            CartScreenTopBar()
        },
        bottomBar = {
            MyBottomNavBar(navController=navController,"Cart")
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(16.dp)
                .padding(innerPadding)
        ) {
            item {
                Row() {
                    Text(
                        text = "Delivery",
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp,
                        color = Color(0xFFD2B48C)
                    )

                }
                Spacer(modifier = Modifier.padding(16.dp))
                Cartproducts.forEach { Product ->
                    ProductCard(Product)
                }
                Spacer(modifier = Modifier.padding(16.dp))


                Text(
                    text = "Payment Summary",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold,
                )

                Spacer(modifier = Modifier.padding(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Price",
                        fontSize = 16.sp,
                    )
                    Text(
                        text = "$ $amount",
                        fontSize = 16.sp,
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Delivery Fee",
                        fontSize = 16.sp,
                    )
                    Text(
                        text = "$ $Fee",
                        fontSize = 16.sp
                    )
                }
                Spacer(modifier = Modifier.padding(16.dp))
               PaymentModeSelectionCard(totalAmount)
                //finish
            }

        }

    }
}