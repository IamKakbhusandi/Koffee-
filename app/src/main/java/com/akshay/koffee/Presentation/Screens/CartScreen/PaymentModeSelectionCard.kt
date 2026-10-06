package com.akshay.koffee.Presentation.Screens.CartScreen

import android.R.attr.onClick
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.akshay.koffee.R

@Composable
fun PaymentModeSelectionCard(totalAmount:Double){
    var expanded by remember { mutableStateOf(false) }
    var selectedMode by remember { mutableStateOf("Online") }
    val paymentModes=listOf("cash","Online")
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = androidx.compose.ui.Alignment.CenterVertically,
                ) {
                    Icon(
                        painter = painterResource(R.drawable.mobile_banking),
                        contentDescription = "payment app ",
                        modifier = Modifier.size(30.dp),
                        tint = Color(0xFFD2B48C)

                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Column() {
                        Text(
                            text = selectedMode,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "$ $totalAmount",
                            fontWeight = FontWeight.SemiBold,
                            color=Color(0xFFD2B48C)
                        )
                    }


                }
                Box {
                    Icon(
                        painter = painterResource(R.drawable.regular_outline_arrow_down),
                        contentDescription = "arrow down",
                        modifier=Modifier.clickable{expanded=true}
                    )

                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false }
                    ) {
                        paymentModes.forEach { mode ->
                            DropdownMenuItem(
                                text = { Text(text = mode) },
                                onClick = {selectedMode=mode
                                    expanded=false},
                                leadingIcon = {
                                    Icon(
                                        painter=painterResource(if(mode=="Online")R.drawable.mobile_banking
                                        else R.drawable.wallet),
                                        contentDescription = "payment app",
                                        tint=Color(0xFFD2B48C),
                                        modifier=Modifier.size(25.dp)
                                    )
                                },
                                modifier = Modifier.background(
                                    color=if(selectedMode==mode)Color(0xFFD2B48C).copy(alpha=0.3f)
                                else Color.Transparent)
                                )

                        }
                    }
                }
            }
            Spacer(modifier = Modifier.padding(16.dp))

            //button
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFD2B48C),
                    contentColor = Color.Black,
                )
            ) {
                Text(
                    text = "Place Order",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}