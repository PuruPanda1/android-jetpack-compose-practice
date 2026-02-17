package com.example.dailydo.ui.personal_tasks.level1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.dailydo.ui.Constants

@Composable
fun LikeCounter(modifier: Modifier = Modifier) {
    Scaffold() {
        var count by rememberSaveable { mutableStateOf(0) }

        Column(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Current Count = $count",
                fontSize = Constants.FONT_XLARGE,
            )
            Spacer(modifier.height(Constants.VERTICAL_SPACING_SMALL))
            Button(
                onClick = {
                    count++
                }
            ) {
                Text(
                    text = "Increase!",
                    fontSize = Constants.FONT_MEDIUM
                )
            }
        }
    }
}