package com.akshay.koffee.Presentation.Screens.DetailedScreen

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SelectSizeChip(
    sizeText: String,selected:Boolean,onClick:()->Unit,modifier: Modifier=Modifier
) {
    Box(
        modifier =modifier
            .background(
                color = if (selected)Color(0xFFC4A484) else Color.White,
                shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp)
            )
            .border(
                1.dp,color=if(selected)Color.Black else  Color.LightGray, shape = RoundedCornerShape(16.dp)
            )
            .height(46.dp)
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(text = sizeText,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            color=if(selected)Color.White else Color.DarkGray
        )
    }

}