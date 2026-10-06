package com.akshay.koffee.Presentation.Screens.homescreen

import android.R.attr.text
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CategoryChip(
    text: String,
    isSelected: Boolean,
    onSelected:()-> Unit
){
    Box(
        modifier=Modifier.width(110.dp)
            .height(30.dp)
            .clip(RoundedCornerShape(36.dp))
                .clickable{ onSelected()}
            .background(color=if (isSelected) Color(0xFFC4A484) else Gray),
        Alignment.Center
    ){
        Text(text = text,
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp)
    }


}