package com.example.dailydo.ui.personal_tasks.level2.material3App

import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailydo.ui.Constants
import com.example.dailydo.ui.personal_tasks.level2.contactList.components.ContactItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MaterialApp(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "AppBar"
                    )
                })
        }, floatingActionButton = {
            FloatingActionButton(
                shape = RoundedCornerShape(25.dp),
                onClick = {
                    Toast.makeText(context, "Floating Action Button is clicked", Toast.LENGTH_SHORT)
                        .show()
                }) {
                Row(
                    modifier = Modifier.padding(
                        Constants.PADDING_LARGE
                    )
                ) {
                    Icon(
                        imageVector = Icons.Default.Add, contentDescription = "Add icon"
                    )
                    Spacer(Modifier.width(Constants.PADDING_SMALL))
                    Text(
                        text = "Add"
                    )
                }
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        content = { innerPadding ->
            LazyColumn(
                modifier = Modifier.padding(innerPadding),
                contentPadding = PaddingValues(bottom = 96.dp)
            ) {
                items(Constants.contactList) { contact ->
                    ContactItem(
                        modifier = modifier,
                        contact = contact
                    )
                }
            }
        })
}

@Preview(showSystemUi = true)
@Composable
fun MaterialAppPreview(modifier: Modifier = Modifier) {
    MaterialApp(
        modifier = modifier
    )
}