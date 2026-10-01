package com.example.praktikum2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Latar Belakang Gambar
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background Login",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

    }
}