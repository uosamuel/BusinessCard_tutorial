package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color(0xFF003a4a)),
        verticalArrangement = Arrangement.spacedBy(50.dp, Alignment.Bottom),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 0.dp, top = 0.dp, end = 0.dp, bottom = 100.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Icon(
                painter = painterResource(id = R.drawable.ic_baseline_android_24),
                contentDescription = null,
                modifier = Modifier.size(100.dp),
                tint = Color(0xFF48dc9a)
            )
            Text(
                text = "Uyobong FrontEnd",
                fontWeight = FontWeight.Normal,
                fontSize = 40.sp,
                color = Color(0xFFd7dfe2)
            )
            Text(
                text = "Front End, Back End, Middle End",
                color = Color(0xFF48dc9a),
                fontWeight = FontWeight.SemiBold
            )
        }


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 0.dp, top = 20.dp, end = 0.dp, bottom = 60.dp)
        ) {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFd7dfe2))
                    .height(1.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .padding(start = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(40.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_local_phone_24),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    tint = Color(0xFF48dc9a)
                )
                Text(
                    text = "+000 00000",
                    color = Color(0xFFd7dfe2)
                )
            }
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFd7dfe2))
                    .height(1.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .padding(start = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(40.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_share_24),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    tint = Color(0xFF48dc9a)
                )
                Text(
                    text = "@uyobong",
                    color = Color(0xFFd7dfe2)
                )
            }


            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFd7dfe2))
                    .height(1.dp)
            )


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp)
                    .padding(start = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(40.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_mail_24),
                    contentDescription = null,
                    modifier = Modifier.size(30.dp),
                    tint = Color(0xFF48dc9a)
                )
                Text(
                    text = "contact@uyobong",
                    color = Color(0xFFd7dfe2)
                )
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}