package com.example.exercise1

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
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
import com.example.exercise1.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            baggrund()
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
fun baggrund(){
   Column(
       Modifier
           .background(darkgrey)
           .fillMaxSize()
           .padding(8.dp)
   ) {

   } 

}


@Composable
fun eksempel1() {

    Column(
        Modifier
            .fillMaxWidth()
            .absolutePadding(10.dp, 50.dp, 10.dp, 0.dp), horizontalAlignment = Alignment.CenterHorizontally){

         Text(text = "Tryk på knap ud fra niveau af akutsituation", fontSize = 17.sp, fontWeight = FontWeight.Bold, color = Hvid)



        Spacer(modifier = Modifier.height(40.dp))
        Box() {
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(backgroundColor = androidx.compose.ui.graphics.Color.Red),
                modifier = Modifier
                    .size(150.dp)

                )
             {
                Text(
                    text = "Nødknap 1", fontSize = 20.sp, color = Hvid)
                Modifier.padding(12.dp)

            }
        }
        Spacer(modifier = Modifier.height(25.dp))
        Box() {
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(backgroundColor = Orange500),
                modifier = Modifier
                    .size(150.dp)


                )
                {
                Text(
                    text = "Nødknap 2", fontSize = 20.sp, color = Hvid )
                Modifier.padding(12.dp)

            }
        }
        Spacer(modifier = Modifier.height(25.dp))
        Box() {
            Button(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                colors = ButtonDefaults.buttonColors(backgroundColor = Gul),
                modifier = Modifier
                    .size(150.dp)
            ) {
                Text(
                    text = "Nødknap 3", fontSize = 20.sp, color = Hvid)
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




