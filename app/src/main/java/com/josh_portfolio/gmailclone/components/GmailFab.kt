package com.josh_portfolio.gmailclone.components

import androidx.compose.foundation.ScrollState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun GmailFab(scrollState: ScrollState) {
    if (scrollState.value < 50) {
        ExtendedFloatingActionButton(
            text = { Text(text = "Compose", fontSize = 16.sp) },
            onClick = {},
            icon = { Icon(imageVector = Icons.Default.Edit, contentDescription = "Edit") },
            backgroundColor = MaterialTheme.colors.surface
        )
    }else{
        FloatingActionButton(onClick = {}, backgroundColor = MaterialTheme.colors.surface) {
            Icon(imageVector = Icons.Default.Edit, contentDescription = "Edit")
        }
    }

}