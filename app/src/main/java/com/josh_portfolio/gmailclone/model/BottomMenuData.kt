package com.josh_portfolio.gmailclone.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomMenuData(
    val icon: ImageVector,
    val title: String,
    val selected: Boolean
) {
    object Mail : BottomMenuData(icon = Icons.Outlined.Mail, "Mail", selected = true)
    object Meet : BottomMenuData(icon = Icons.Outlined.VideoCall, "Meet", selected = false)
    object Add : BottomMenuData(icon = Icons.Outlined.Add, "Add", selected = false)
}