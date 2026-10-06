package com.akshay.koffee.Presentation.Screens.welcomescreen

import android.R.attr.text
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.akshay.koffee.Presentation.navigation.route
import com.akshay.koffee.R

@Composable
fun WelcomeScreen(navController: NavController){
    Box(
        modifier= Modifier.fillMaxSize().background(color=Color.Black)
    ){
        Image(
            modifier= Modifier.fillMaxSize(),
            painter=painterResource(R.drawable.unknown),
            contentDescription = "Koffee Photo"
        )

        Column(modifier=Modifier.fillMaxSize()
            .padding(vertical = 100.dp,horizontal = 25.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom){
            Text(text="Bringing the warmth of a local coffee shop to your screen.",
                color=Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                textAlign = TextAlign.Center)

Spacer(modifier = Modifier.height(35.dp))

            Text(text="Skip the line and elevate your daily ritual with our premium, freshly brewed specialty blends.",
                color=Color.LightGray,
                fontSize = 15.sp,
                textAlign = TextAlign.Center)

            Spacer(modifier = Modifier.height(35.dp))

            Button(onClick = { navController.navigate(route.homeScreen)},
                modifier = Modifier.fillMaxWidth(),
                colors= ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black,
                )){
                Text(text="Get Started",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold)

            }
        }

    }

}