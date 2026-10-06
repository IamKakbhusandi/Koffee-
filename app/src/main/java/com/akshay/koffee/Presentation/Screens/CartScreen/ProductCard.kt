package com.akshay.koffee.Presentation.Screens.CartScreen

import android.R.attr.contentDescription
import android.R.attr.fontWeight
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.akshay.koffee.Domain.model.product

@Composable
fun ProductCard(product: product) {
    var Quantity by remember { mutableStateOf(1) }
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
            contentColor = Color.Black
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(product.image),
                contentDescription = "photo of a coffee",
                modifier = Modifier
                    .size(70.dp)
                    .clip(RoundedCornerShape(10.dp))
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 10.dp)
            ) {
                Text(
                    text = product.name,
                    style = typography.bodyLarge.copy(
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Text(
                    text = product.description,
                    style = typography.bodySmall.copy(
                        color = Color.DarkGray
                    )
                )
            }
            Row(
                modifier = Modifier,
                verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            )
            {
                IconButton(onClick = { Quantity--},
                    enabled = Quantity>=1,
                    modifier=Modifier.background(color=Color(0xFFD2B48C).copy(alpha=0.3f),
                        shape = RoundedCornerShape(22.dp))
                        .size(25.dp)) {
                    Icon(
                        imageVector = Icons.Default.Remove,
                        contentDescription = "Remove",
                    )
                }
                Text(text = Quantity.toString(),
                    style=typography.bodyLarge,
                    fontWeight = FontWeight.Bold)

                IconButton(onClick = { Quantity++},
                    modifier=Modifier.background(color=Color(0xFFD2B48C).copy(alpha=0.3f),
                        shape=RoundedCornerShape(22.dp))
                        .size(25.dp)) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add",
                    )

                }


            }
        }
    }
}