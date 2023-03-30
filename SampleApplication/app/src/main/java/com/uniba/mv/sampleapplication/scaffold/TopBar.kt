package com.uniba.mv.sampleapplication.scaffold

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun TopBar(title: String) {
    TopAppBar {

        Text(text = title)
    }
}