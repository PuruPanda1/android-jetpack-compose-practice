package com.example.dailydo.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun StateHoisting(modifier: Modifier = Modifier) {
    ConversationScreen()
}


@Composable
private fun ConversationScreen(/*...*/) {
    val scope = rememberCoroutineScope()

    val lazyListState = rememberLazyListState() // State hoisted to the ConversationScreen

    val messages = mutableListOf<String>()

    for (i in 1..100) {
        messages.add("Message #$i")
    }


    MessagesList(messages, lazyListState) // Reuse same state in MessageList

    Button(
        onClick = { // Apply UI logic to lazyListState
            scope.launch {
                lazyListState.scrollToItem(messages.size-1)
            }
        },
        content = {Text("Send msg")},
    )
}

@Composable
private fun MessagesList(
    messages: List<String>,
    lazyListState: LazyListState = rememberLazyListState() // LazyListState has a default value
) {

    Box(modifier = Modifier.fillMaxSize()){
        LazyColumn(
            state = lazyListState, // Pass hoisted state to LazyColumn
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(messages, key = { m -> m }) { item ->
                Text(text = item)
                Spacer(Modifier.height(100.dp))
            }
        }

        val scope = rememberCoroutineScope()


        ElevatedButton(
            onClick = {
                scope.launch {
                    lazyListState.scrollToItem(messages.size - 1)
                }
            },
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp)
        ) {
            Text("Go down")
        }

    }
}