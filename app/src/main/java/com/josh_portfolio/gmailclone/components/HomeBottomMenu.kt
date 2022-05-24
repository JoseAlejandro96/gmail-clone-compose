package com.josh_portfolio.gmailclone.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.josh_portfolio.gmailclone.model.BottomMenuData

@Composable
fun HomeBottomMenu() {
    val items = listOf(
        BottomMenuData.Mail,
        BottomMenuData.Meet,
        BottomMenuData.Add
    )
    BottomNavigation(backgroundColor = Color.White, contentColor = Color.Black) {
        items.forEach {
            BottomNavigationItem(
                selected = it.selected,
                onClick = {},
                icon = {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = it.title
                    )
                },
                label = { Text(text = it.title)},
                alwaysShowLabel = true
            )
        }
    }
}