package com.akshay.koffee.Presentation.Screens.ProfileScreen

import android.R.attr.fontWeight
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.akshay.koffee.Presentation.Screens.ProfileScreen.ProfileTopBar
import com.akshay.koffee.Presentation.Screens.UIcomponents.MyBottomNavBar
import com.akshay.koffee.Presentation.navigation.route

@Composable
fun ProfileScreen(navController: NavController) {
    Scaffold(
        topBar = {ProfileTopBar()},
        bottomBar = {MyBottomNavBar(navController = navController,"Profile")}
    ) {
        innerpadding-> innerpadding

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(innerpadding),
        ){

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(color = Color(0xFFD2B48C).copy(alpha = 0.15f)
                    ),
                    contentAlignment = Alignment.Center) {

                    Icon(
                        imageVector = Icons.Default.Person,
                        "person",
                        modifier = Modifier.size(80.dp),
                        tint = Color(0xFFD2B48C)
                    )
                }
                Spacer(modifier=Modifier.padding(16.dp))

                Text(text="Akshay Panwar",
                    style= MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold)

                Text(text="akshaypanwar676@gmail.com",
                    style= MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.SemiBold)

            }
            Spacer(modifier=Modifier.padding(30.dp))

            Text(text="Address",
                style= MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold)

            Text(text="Kyarkuli jheel \nMussoorie- 248179",
                style= MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier=Modifier.padding(30.dp))

            Card(modifier=Modifier.fillMaxWidth(),
                colors= CardDefaults.cardColors(
                    containerColor = Color.LightGray.copy(alpha=0.5f)
                )){
                Column(modifier=Modifier.padding(30.dp)){

                    Row(modifier =Modifier.fillMaxWidth()
                        .clickable(onClick = {navController.navigate(route.CartScreen) }),
                        verticalAlignment = Alignment.CenterVertically){
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            "shopping cart",
                            tint=Color(0xFFD2B48C),
                            modifier=Modifier.size(28.dp)
                        )
                        Spacer(modifier=Modifier.padding(16.dp))

                        Text(text="Cart",
                            fontSize=20.sp)
                    }
                    Spacer(modifier=Modifier.height(16.dp))

                    Row(modifier =Modifier.fillMaxWidth()
                        .clickable(onClick = {navController.navigate(route.FavouritesScreen) }),

                        verticalAlignment = Alignment.CenterVertically){
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            "Favourites",
                            tint=Color(0xFFD2B48C),
                            modifier=Modifier.size(28.dp)
                        )
                        Spacer(modifier=Modifier.padding(16.dp))

                        Text(text="Fav",
                            fontSize=20.sp)
                    }
                    Spacer(modifier=Modifier.height(16.dp))


                    Row(modifier =Modifier.fillMaxWidth()
                        .clickable(onClick = { }),

                        verticalAlignment = Alignment.CenterVertically){
                        Icon(
                            imageVector = Icons.Default.Settings,
                            "Settings",
                            tint=Color(0xFFD2B48C),
                            modifier=Modifier.size(28.dp)
                        )
                        Spacer(modifier=Modifier.padding(16.dp))

                        Text(text="Settings",
                            fontSize=20.sp)
                    }
                }
            }


        }
    }

}