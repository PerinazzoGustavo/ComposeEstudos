package com.gustavoperinazzo.jetpackcomposeestudos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.background(Color.Blue),
                horizontalAlignment = Alignment.Start
            ) {
                Text(text = "Gustavo")
                Text(text = "Perinazzo")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Gustavo")
        Text(text = "Perinazzo")
    }
}
