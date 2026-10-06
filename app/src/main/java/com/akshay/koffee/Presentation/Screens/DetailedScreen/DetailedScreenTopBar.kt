package com.akshay.koffee.Presentation.Screens.DetailedScreen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailedScreenTopBar(navController: NavController){

            TopAppBar(
                title = {Text(text="Details",
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold


                )},
                actions={
                    Icon(modifier = Modifier.padding(end=10.dp),
                        painter=painterResource(com.akshay.koffee.R.drawable.regular_outline_heart),
                        contentDescription = "Add to Cart"
                    )

                },
                navigationIcon={
                    Icon(
                        painter=painterResource(com.akshay.koffee.R.drawable.regular_outline_arrow_left),
                        "navigation arrow",
                        modifier=Modifier.padding(start=10.dp)
                            .clickable (onClick={ navController.navigateUp() }),

                        )
                }
            )



    }
