package com.example.dailydo.ui.personal_tasks.level1

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dailydo.R
import com.example.dailydo.ui.Constants

@Composable
fun UserProfileCard(modifier: Modifier = Modifier) {
    val username = stringResource(R.string.default_username)
    val status = stringResource(R.string.default_user_status)
    val context = LocalContext.current
    Row(
        modifier = modifier.fillMaxWidth().padding(Constants.PADDING_LARGE),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = stringResource(R.string.user_profile_picture_desc)
        )
        Column(
            modifier = modifier.padding(Constants.PADDING_SMALL),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = username,
                fontSize = Constants.FONT_XLARGE
                )
            Spacer(Modifier.height(Constants.VERTICAL_SPACING_SMALL))
            Text(
                text = status,
                fontSize = Constants.FONT_SMALL
            )
        }
        Button(
            modifier = modifier.padding(Constants.PADDING_SMALL),
            onClick = {
                Toast.makeText(context, "Hey there", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(
                text = "Show"
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun UserProfileCardPreview(modifier: Modifier = Modifier) {
    UserProfileCard()
}