package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2E8D4)
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image, contentDescription = "Android logo",
            Modifier.height(120.dp)
                .width(150.dp)
                .background(Color(0xFF073042))

        )
        Text(
            text = "Yernar Kulmanov",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
        )
        Text(
            text = "Junior Android Developer",
            color = Color(0xFF278254),
            fontSize = 18.sp,
            modifier = modifier
        )
    }


    Column(modifier = Modifier.fillMaxSize()
        .padding(bottom = 20.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom) {
        Contact(icon = Icons.Default.Phone, iconInfo = "Phone Icon", contact = "+7 (777) 670 97 77")
        Contact(icon = Icons.Default.Share, iconInfo = "Share Icon", contact = "@yerakulmanov")
        Contact(
            icon = Icons.Default.Email,
            iconInfo = "Email Icon",
            contact = "yernar0709@gmail.com"
        )
    }
}


@Composable
fun Contact(icon: ImageVector, iconInfo: String, contact: String, modifier: Modifier = Modifier) {
    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Start){
        Icon(
            imageVector = icon,
            contentDescription = iconInfo,
            tint = Color(0xFF278254),
            modifier = Modifier.padding(4.dp)
        )

        Text(
            text = contact,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(8.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCard()
    }
}