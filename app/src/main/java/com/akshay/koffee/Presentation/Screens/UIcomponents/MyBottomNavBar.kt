package com.akshay.koffee.Presentation.Screens.UIcomponents

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.akshay.koffee.Presentation.navigation.route
import com.akshay.koffee.R

@Composable
fun MyBottomNavBar(navController: NavController,currentRoute:String){

val navItems=listOf(
    NavItem("Home", R.drawable.regular_outline_home, route.homeScreen),
    NavItem("cart", R.drawable.regular_outline_bag, route.CartScreen),
    NavItem("Favourites", R.drawable.regular_outline_heart,route.FavouritesScreen),
    NavItem("Profile",R.drawable.outline_account_circle_24,route.ProfileScreen),


    )
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        windowInsets= WindowInsets.navigationBars,
    ){
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                icon={
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title
                    )
                },
                label={Text(text=item.title)},
                alwaysShowLabel = true,
                modifier=Modifier.size(80.dp),
                onClick = {navController.navigate(item.routes) {
                    popUpTo(navController.graph.startDestinationId) {
                        saveState = true
                    }
                    launchSingleTop = true
                    restoreState = true
                } },
                selected = item.title==currentRoute,
                colors= NavigationBarItemDefaults.colors(
                    selectedIconColor=MaterialTheme.colorScheme.primary
                )
            )
        }

    }
}
data class NavItem(
    val title: String,
    val icon:Int,
    val routes: route
)