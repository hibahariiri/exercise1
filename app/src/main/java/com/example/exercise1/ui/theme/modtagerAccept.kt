package com.example.exercise1.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun modtagerAccept() {

    Column(
        Modifier
            .background(Color.Green)
            .fillMaxSize()
            .padding(8.dp)
    ) {

    }

    Column(
        Modifier
            .fillMaxWidth()
            .absolutePadding(10.dp, 50.dp, 10.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(170.dp))
        Box(Modifier.align(Alignment.CenterHorizontally) .border(BorderStroke(11.dp, Hvid))) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Graa),
                modifier = Modifier
                    .height(150.dp)
                    .width(300.dp)

            )
            {
                Text(
                    text = "Anmodning accepteret", fontSize = 30.sp, color = darkgrey, textAlign = TextAlign.Center
                )
                Modifier
                    .padding(12.dp)


            }
        }

    }
}