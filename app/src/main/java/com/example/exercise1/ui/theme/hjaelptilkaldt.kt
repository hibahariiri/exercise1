package com.example.exercise1.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.*
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign


@Composable
fun hjaelptilkaldt() {
    Column(
        Modifier
            .fillMaxWidth()
            .absolutePadding(10.dp, 50.dp, 10.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(170.dp))
        Box(Modifier.align(CenterHorizontally) .border(BorderStroke(11.dp, Hvid))) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Graa),
                modifier = Modifier
                    .height(150.dp)
                    .width(300.dp)

            )
            {
                Text(
                    text = "Hjælp er tilkaldt", fontSize = 30.sp, color = darkgrey
                )
                Modifier.padding(12.dp)

            }
        }

        Spacer(modifier = Modifier.height(210.dp))
        Box() {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                modifier = Modifier
                    .height(50.dp)
                    .fillMaxWidth()


            )
            {
                Text(
                    text = "Annuller tilkaldelse", fontSize = 20.sp, color = Hvid )
                Modifier.padding(12.dp)

            }
        }
    }
}



