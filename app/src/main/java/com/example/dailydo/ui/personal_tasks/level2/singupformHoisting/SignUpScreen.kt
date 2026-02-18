package com.example.dailydo.ui.personal_tasks.level2.singupformHoisting

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.dailydo.ui.Constants

// Implementation of State Hoisting
// SignUpScreen stores all the state variables and passes it to the child SignUpForm
@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {
    var emailId by rememberSaveable() { mutableStateOf("") }
    SignUpForm(
        modifier = modifier,
        value = emailId,
        onValueChange = { newValue ->
            emailId = newValue
        }
    )
}

// Stateless SignUpForm Composable
@Composable
fun SignUpForm(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit
) {
    TextField(
        modifier = modifier
            .fillMaxWidth()
            .padding(Constants.PADDING_LARGE),
        label = {
            Text(
                text = "Email Id"
            )
        },
        value = value,
        onValueChange = onValueChange
    )
}