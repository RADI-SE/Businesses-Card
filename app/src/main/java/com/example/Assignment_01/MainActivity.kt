package com.example.Assignment_01

 import android.os.Bundle
 import androidx.activity.ComponentActivity
 import androidx.activity.compose.setContent
 import androidx.compose.foundation.Image
 import androidx.compose.foundation.background
 import androidx.compose.foundation.layout.Arrangement
 import androidx.compose.foundation.layout.Column
 import androidx.compose.foundation.layout.Row
 import androidx.compose.foundation.layout.fillMaxSize
 import androidx.compose.foundation.layout.padding
 import androidx.compose.foundation.layout.size
 import androidx.compose.foundation.shape.CircleShape
 import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.Assignment_01.ui.theme.Assignment_01Theme
import androidx.compose.runtime.Composable
 import androidx.compose.ui.Alignment
 import androidx.compose.ui.Modifier
 import androidx.compose.ui.draw.clip
 import androidx.compose.ui.graphics.Color
 import androidx.compose.ui.res.painterResource
 import androidx.compose.ui.unit.dp
 import com.example.task_01.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment_01Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0XFFe6dddc))
    ){
        Image(
            painter = painterResource(id = R.drawable.image),
            contentDescription = "image",
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape)
        )
        val name ="I'm Razi"
        Text(

            text = "\n$name",
            color = Color.Black,
            fontSize = 30.sp ,
        )
        val goal="Android Developer Extraordinaire"
        Text(
            text = "\n$goal\n\n",
            fontSize = 20.sp,
            color = Color.Black
        )
    }
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
         verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxSize()
            .padding(60.dp)
    ) {
        Row {
            Image(painter = painterResource(id = R.drawable.phonee),
                contentDescription ="phone",
                Modifier.size(20.dp))
            val phone="0536372804"
            Text(text = "\t\t$phone",
                fontSize = 20.sp,
                color = Color.Black
            )
        }
        Row {
            Image(painter = painterResource(id = R.drawable.share),
                contentDescription = "share",
                Modifier.size(20.dp))
            val user="@AndroidDev"
            Text(text = "\t\t$user\n",
                fontSize = 15.sp,
                color = Color.Black
            )
        }
        Row{
            Image(painter = painterResource(id = R.drawable.message),
                contentDescription ="message",
                modifier = Modifier.size(20.dp))
            val email="radidrd@gmail.com"
            Text(text = "\t\t$email",
                fontSize = 15.sp,
                color = Color.Black
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment_01Theme {
        Greeting()
    }
}