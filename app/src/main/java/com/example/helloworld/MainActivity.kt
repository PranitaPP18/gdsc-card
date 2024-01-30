package com.example.helloworld

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.icons.Icons
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloworld.ui.theme.HelloworldTheme
import com.example.helloworld.ui.theme.Yellow

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloworldTheme {
                MyScreen()



            }
        }
    }
}

@Composable
fun MyScreen(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Card(
            Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .height(250.dp),
                backgroundColor = Yellow,
            elevation = 10.dp,
            shape = RoundedCornerShape(30.dp)
        ){
           Column {
               Myrow1()

            }

        }
    }
}

@Composable
fun Myrow1() {
//    TODO("Not yet implemented")
    Row(modifier = Modifier.fillMaxWidth()
        .padding(16.dp)
    ) {
        Text(
            text= "H1 \nRevant katuri",
            fontSize = 25.sp,
            color = androidx.compose.ui.graphics.Color.Yellow,
           // fontWeight = FontWeight.Bold
        )
    }


@Preview(showBackground = true)
@Composable

fun GreetingPreview() {
    HelloworldTheme {
    }
}}