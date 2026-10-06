package com.akshay.koffee.Presentation.Screens.homescreen

import android.R.attr.onClick
import android.R.attr.singleLine
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.akshay.koffee.R

@Preview()
@Composable

fun SearchBar() {
    var searchText by remember { mutableStateOf(value = "") }
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            value = searchText,
            onValueChange = { searchText = it },
            placeholder = { Text(text = "Search for coffee...",color=Color.White) },
            leadingIcon = {
                Icon(
                    painter = painterResource(R.drawable.regular_outline_search),
                    "searching",
                    Modifier.size(24.dp),
                    tint = Color.White
                )
            },
            modifier = Modifier
                .weight(1f)
                .height(50.dp),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                focusedContainerColor = Color(0xFF2A2A2A),
                cursorColor = Color.LightGray,
                focusedTextColor = Color.White,
                unfocusedContainerColor = Color.Gray,
            ),

            shape = RoundedCornerShape(
                topStart = 20.dp,
                bottomStart = 20.dp,
                topEnd = 0.dp,
                bottomEnd = 0.dp

            ),
            singleLine = true,

            )
        Spacer(
            modifier = Modifier.width(8.dp)
        )
        IconButton(
            onClick = { },
            modifier = Modifier
                .size(50.dp)
                .background(
                    color = Color.Gray,
                    shape = RoundedCornerShape(
                        topStart = 0.dp,
                        bottomStart = 0.dp,
                        topEnd = 16.dp,
                        bottomEnd = 16.dp
                    )
                )
        )

        {
            Icon(
                painter = painterResource(R.drawable.regular_outline_filter),
                "filter",
                tint = Color.White
            )

        }
    }
}

