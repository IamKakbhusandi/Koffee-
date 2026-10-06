package com.akshay.koffee.Presentation.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.akshay.koffee.R
import com.akshay.koffee.Domain.model.product
import com.akshay.koffee.Presentation.navigation.route

@Composable
fun ProductCard(
    product: product,
    modifier:Modifier=Modifier,
    navController: NavController
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp)
            .clickable {navController.navigate(route.detailedScreen(product.id))},
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .height(160.dp)
            )

            {
                Image(
                    painter = painterResource(id = product.image),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(16.dp))
                )
                Box(
                    modifier= Modifier.align(Alignment.TopEnd)
                        .padding(8.dp)
                        .background(
                            color=Color.LightGray,
                            shape=RoundedCornerShape(16.dp)
                        )
                ){
                    Icon(
                        painter=painterResource(R.drawable.regular_outline_heart),
                        contentDescription = "add to fav",
                        tint=Color.Black,
                    )
                }


            }
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = product.name,
                style = MaterialTheme.typography.titleMedium.copy(
                    color = Color.DarkGray,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = product.description,
                style = MaterialTheme.typography.bodySmall.copy(color = Color.DarkGray),
                maxLines = 1
            )
            Spacer(modifier = Modifier.height(24.dp))

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Text(
                    text = "$${product.price}",
                    style = MaterialTheme.typography.titleMedium.copy(
                        color = Color(0xFFC4A484),
                        fontWeight = FontWeight.Bold
                    )
                )
                IconButton(onClick = {},
                    modifier = Modifier
                        .background(color=Color(0xFFC4A484),
                            shape = RoundedCornerShape(16.dp))) {

                    Icon(imageVector = Icons.Default.Add,
                        contentDescription ="Add to cart",
                        tint = Color.White)

                }

            }


        }
    }
}