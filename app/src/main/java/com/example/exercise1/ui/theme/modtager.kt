package com.example.exercise1.ui.theme

import android.graphics.drawable.shapes.OvalShape
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
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
fun modtager() {
    Column(
        Modifier
            .fillMaxWidth()
            .absolutePadding(10.dp, 50.dp, 10.dp, 0.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(60.dp))
        Box(Modifier.align(Alignment.CenterHorizontally)) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red),
                modifier = Modifier
                    .height(150.dp)
                    .width(300.dp)
                    .border(BorderStroke(5.dp, Color.Black))

            )
            {
                Text(
                    text = "Afvis anmodning",
                    fontSize = 28.sp,
                    color = Hvid,
                    textAlign = TextAlign.Center
                )
                Modifier.padding(12.dp)

            }
        }

        Spacer(modifier = Modifier.height(35.dp))
        Box() {
            /*Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Graa),
                modifier = Modifier
                    .height(90.dp)
                    .width(300.dp)


            )
            {

             */
            Text(
                text = "Katrine T. - Stue 36", fontSize = 25.sp, color = Hvid
            )
            Modifier
                .padding(12.dp)
                .height(90.dp)
                .width(300.dp)
                .border(BorderStroke(5.dp, Color.Black))


        }


        Spacer(modifier = Modifier.height(35.dp))
        Box() {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green),
                modifier = Modifier
                    .height(150.dp)
                    .width(300.dp)
                    .border(BorderStroke(5.dp, Color.Black))

            )
            {
                Text(
                    text = "Accepter anmodning",
                    fontSize = 28.sp,
                    color = Hvid,
                    textAlign = TextAlign.Center
                )
                Modifier.padding(12.dp)

            }
        }
    }

}