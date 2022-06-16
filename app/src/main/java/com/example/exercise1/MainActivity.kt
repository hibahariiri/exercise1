package com.example.exercise1

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.material.Button
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercise1.ui.theme.InstantSOStheme
import com.example.exercise1.ui.theme.Orange500
import com.example.exercise1.ui.theme.Purple200
import com.example.exercise1.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            eksempel1()
        }

            /*InstantSOStheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Button(onClick = { /*TODO*/ }){
                        
                    }
                }
               // MessageCard("Android")
            }
        }
        
             */

}

    @Composable
    fun GetButton(

        text:String,
        onClick: ()-> Unit,
    ){
        Button(
            onClick = onClick,
            shape = RoundedCornerShape(4.dp)
            
        ){
            Text(
                text = text,
                Modifier.padding(horizontal = 16.dp, vertical = 8.dp)

            )
        }
    }

@Composable
fun eksempel1() {

    Column(
        Modifier
            .fillMaxWidth()
            .absolutePadding(10.dp, 50.dp, 10.dp, 0.dp), horizontalAlignment = Alignment.CenterHorizontally){

         Text(text = "Tryk på knap ud fra niveau af akutsituation", fontSize = 17.sp, fontWeight = FontWeight.Bold)



        Spacer(modifier = Modifier.height(60.dp))
        Box() {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = androidx.compose.ui.graphics.Color.Red),
                modifier = Modifier
                    .height(120.dp)
                    .width(240.dp)
                )
             {
                Text(
                    text = "Nødknap 1", fontSize = 20.sp)
                Modifier.padding(12.dp)

            }
        }
        Spacer(modifier = Modifier.height(40.dp))
        Box() {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Orange500),
                modifier = Modifier
                    .height(120.dp)
                    .width(240.dp)
                )
                {
                Text(
                    text = "Nødknap 2", fontSize = 20.sp)
                Modifier.padding(12.dp)

            }
        }
        Spacer(modifier = Modifier.height(40.dp))
        Box() {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(backgroundColor = androidx.compose.ui.graphics.Color.Yellow),
                modifier = Modifier
                    .height(120.dp)
                    .width(240.dp)
            ) {
                Text(
                    text = "Nødknap 3", fontSize = 20.sp)
                Modifier.padding(40.dp)                 

            }
        }

    }

    
}

    @Composable
    fun MessageCard(name: String) {
        Text(text = "Hello $name!")
    }
@Preview(showBackground = true)

@Composable
fun PreviewMessageCard() {
    InstantSOStheme() {
        MessageCard("Android")
    }
}}