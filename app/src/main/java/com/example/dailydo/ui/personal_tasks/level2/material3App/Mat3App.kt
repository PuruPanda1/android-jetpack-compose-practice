package com.example.dailydo.ui.personal_tasks.level2.material3App

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.example.dailydo.R
import com.example.dailydo.ui.Constants

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Mat3App(modifier: Modifier = Modifier) {
    val sampleItems = (1..30).map { i -> "Item no $i" }
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "AppName"
                    )
                },
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    Toast.makeText(context, "Clicky clickkkkkkkkk !! Don't click me again!", Toast.LENGTH_SHORT).show()
                },
                shape = RoundedCornerShape(Constants.PADDING_LARGE)
            ){
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = stringResource(R.string.add_floating_button_desc),
                )
            }
        }
    ) { contentPadding ->
        LazyColumn(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(Constants.PADDING_SMALL),
        ) {
            items(sampleItems){ item ->
                ElevatedCard(
                    modifier = modifier.fillMaxSize()
                ) {
                    Text(
                        text = item,
                        style = MaterialTheme.typography.titleMedium,
                        modifier = modifier.padding(Constants.PADDING_MEDIUM)
                    )
                }
            }
        }
    }
}