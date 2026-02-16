package com.example.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
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
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(count = 50) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 10.dp)
                    .clickable (
                        enabled = true,
                        onClickLabel = "Hello"
                    ) {
                        val logMsg: String = "Hello"
                        Log.d("Tag 1", logMsg)
                    }
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "hello",
//                    modifier = Modifier.size(20.dp)
                )
                Text(
                    text = "Hello my icon",
//                    Modifier.size(size = 40.dp)
                )
            }
        }
    }

//    this is for columns ordinarily
//    Column(
//        modifier = Modifier.fillMaxSize()
////            .background(color = Color.Green)
//            .padding(10.dp)
//    ) {
//        //    using for loop and understanding how it works
//        for (i in 1..10) {
//            Row(
//                horizontalArrangement = Arrangement.SpaceBetween,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(vertical = 10.dp)
//                    .clickable (
//                        enabled = true,
//                        onClickLabel = "Hello"
//                    ) {
//                        val logMsg: String = "Hello"
////                        print("Hello, this is me ooo")
//                        Log.d("Tag 1", logMsg)
//                    }
//            ) {
//                Icon(
//                    imageVector = Icons.Default.Add,
//                    contentDescription = "hello"
//                )
//                Text(
//                    text = "Hello my icon"
//                )
//            }
//       }
//    }

    //using conditional statement
// if (name.length > 5){
//         Icon(
//        imageVector = Icons.Default.Add,
//        contentDescription = null,
//        tint = Color.Green
//    )
// }

    //to add icon to an android app
//    Icon(
//        imageVector = Icons.Default.Add,
//        contentDescription = null,
//        tint = Color.Green
//    )

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