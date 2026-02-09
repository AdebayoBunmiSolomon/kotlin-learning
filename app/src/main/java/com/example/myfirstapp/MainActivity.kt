package com.example.myfirstapp

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import androidx.compose.ui.tooling.preview.Preview
import com.example.myfirstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()
                    .padding(horizontal = 10.dp)
                    .systemBarsPadding()) { innerPadding ->
                    Greeting(
                        name = "Bunmi"
                    )

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    //to add icon to an android app
    Icon(
        imageVector = Icons.Default.Add,
        contentDescription = null,
        tint = Color.Blue
    )

    //to add image to an android app
//    Image(
//        painter = painterResource(id = R.drawable.ic_launcher_foreground),
//        contentDescription = null,
//        modifier = Modifier
//            .background(color = Color.Red)
//    )
    //to understand ui
//    Row(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White)
//            .padding(vertical = 10.dp, horizontal = 8.dp),
//        horizontalArrangement = Arrangement.Center,
//    ) {
//      Text(
//            text = "Hello $name!",
//            color = Color.Blue,
//            fontSize = 20.sp,
//        )
//        Text(
//            text = "Hello some other text",
//            color = Color.Blue,
//            fontSize = 20.sp,
//        )
//    }
}

//@Preview(showBackground = false)
//@Composable
//fun GreetingPreview() {
//    MyFirstAppTheme {
//        Greeting("Android")
//    }
//}