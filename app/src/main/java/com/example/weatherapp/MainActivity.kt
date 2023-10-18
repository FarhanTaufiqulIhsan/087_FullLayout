package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherappTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(message = "Farhan Taufiqul Ihsan", From = "asdas")
                }
            }
        }
    }
}

@Composable
fun HomeScreen(message:String, From:String, modifier: Modifier=Modifier) {
Column(horizontalAlignment = Alignment.CenterHorizontally,
    modifier = modifier
        .fillMaxSize()
        .padding(20.dp)){
    Text(
        color = Color.Black,
        text = message,
        fontSize = 20.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(bottom = 20.dp, top = 20.dp)
    )
    cuaca()
    Spacer(modifier = modifier.padding(13.dp))
    suhutempat()
    Spacer(modifier = modifier.padding(13.dp))
    keterangan()
}
}

@Composable
fun cuaca(){
    Box (modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Cyan)
        .height(height = 300.dp)){
        
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.background1),
                contentDescription =null,
            modifier = Modifier.size(250.dp))
            Text(text = "Rain", fontSize = 30.sp)
        }
    }
}
@Composable
fun suhutempat(){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier) {
        Text(
            color = Color.Black,
            text = "19\u2103",
            fontSize = 64.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Row (verticalAlignment = Alignment.CenterVertically){
            Image(painter = painterResource(id = R.drawable.location_icon1),
                contentDescription = null, modifier = Modifier.size(50.dp))

            Spacer(modifier = Modifier.padding(3.dp))

            Text(text =  "Yogyakarta",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold)
        }
        Spacer(modifier = Modifier.padding(13.dp))
        
        Text(text = "Kasihan, Bantul, Daerah Istimewa Yogyakarta",
            fontSize = 20.sp, color = Color.Gray, textAlign = TextAlign.Center
            )
    }

}

@Composable
fun keterangan(){
    Box(modifier = Modifier
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Cyan)
        .width(width = 350.dp)
        .height(height = 190.dp)) {
        Row(horizontalArrangement = Arrangement.Center,
        modifier = Modifier) {
                Column {
                    Text("coba 1")
                    Text(text = "Coba 2")
                }
                Column {
                    Text(text = "Coba 1")
                    Text(text = "Coba 2")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    WeatherappTheme {
        HomeScreen("Farhan Taufiqul Ihsan","coba")
    }
}