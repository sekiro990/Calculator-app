package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun calcbutton(
    symbol:String,
    modifier: Modifier,
    color: Color= Color.White,
    textStyle: TextStyle=TextStyle(),
    onClick:()->Unit
){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .background(color)
            .clickable { onClick() }
            .then(modifier)
    ){
        Text(
            text =symbol,
            fontSize = 36.sp,
            color = Color.White,
            style = textStyle

        )
    }
}