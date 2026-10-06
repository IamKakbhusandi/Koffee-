package com.akshay.koffee.Presentation.Screens.DetailedScreen

import android.app.ProgressDialog.show
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akshay.koffee.Presentation.Screens.UIcomponents.AppMessageDilaog

@Preview
@Composable
fun DetailedScreenBottomBar(){
    var showCartDialog by remember { mutableStateOf(false) }
    BottomAppBar(
        containerColor = androidx.compose.ui.graphics.Color.Transparent,
    ){
        Row(
            modifier=Modifier.padding(16.dp)
                .fillMaxWidth()
        ){
            Column(){
                Text(
                    text="Price",
                    fontSize=12.sp
                )
                Spacer(modifier=Modifier.width(8.dp))

                Text(
                    text="$4.52",
                    fontSize=20.sp,
                    fontWeight=FontWeight.SemiBold


                )
                Spacer(modifier=Modifier.width(100.dp))
            }
            Button(
                {showCartDialog=true },
                modifier=Modifier.weight(1f)
                    .height(56.dp),
                    shape=(RoundedCornerShape(16.dp)),
                colors= ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFC4A484),
                    contentColor = Color.White
                )

            ){
                Text(
                    text="Add to cart",
                    fontSize= 20.sp
                )

            }
            AppMessageDilaog(
                show = showCartDialog,
                title="Added to Cart",
                message = "Yuhoo",
                onDismiss = { showCartDialog =false}
            )


        }
    }
}