package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan4.R
import com.example.pertemuan4.ui.theme.Pertemuan4Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pertemuan4Theme{
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Rafi Filzah Aliansyah",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.padding(10.dp))

        StatusScreen()

        Spacer(modifier = Modifier.padding(10.dp))

        Location()

        Spacer(modifier = Modifier.padding(10.dp))

        DetailScreen()



    }


}

@Composable
fun StatusScreen(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.background1)

    Box(
        Modifier
            .clip(
                RoundedCornerShape(25.dp)
            )
            .background(color = Color.Cyan)
            .fillMaxWidth(),


        ) {
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .size(150.dp)
            )
            Text(
                text = "RAIN",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(13.dp)


            )
        }
    }

}

@Composable
fun Location() {
    Text(text = "33 C", fontSize = 64.sp, fontWeight = FontWeight.Bold)
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription = null,
            modifier = Modifier.size(35.dp)
        )
        Spacer(modifier = Modifier.padding(3.dp))

        Text(text = "Yogyakarta", fontSize = 40.sp, fontWeight = FontWeight.Bold)
    }

    Spacer(modifier = Modifier.padding(3.dp))

    Text(text = "Kasihan, Kabupaten Bantul, Daerah Istimewa Yogyakarta", textAlign = TextAlign.Center,
        fontSize = 20.sp, color = Color.Gray)

}
@Composable
fun DetailScreen() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Cyan)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Humidity",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(10.dp)
                )
                Text(
                    text = "UV Index",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(10.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "60%",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(10.dp)
                )
                Text(
                    text = "5 / 10",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(10.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Sunrise",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = "Sunset",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(5.dp)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "9 / 10",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(5.dp)
                )
                Text(
                    text = "06.00 PM",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(5.dp)
                )
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pertemuan4Theme {
        HomeScreen()
    }
}
