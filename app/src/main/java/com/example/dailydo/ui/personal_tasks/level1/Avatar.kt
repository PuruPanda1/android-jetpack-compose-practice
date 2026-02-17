package com.example.dailydo.ui.personal_tasks.level1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dailydo.R
import com.example.dailydo.ui.Constants

@Composable
fun Avatar(modifier: Modifier = Modifier) {
    Scaffold() { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(Constants.PADDING_LARGE),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.End
        ) {
            Box(
                modifier = modifier
                    .size(Constants.IMAGE_SIZE_SMALL)
                    .clip(RoundedCornerShape(50.dp)),
                contentAlignment = Alignment.BottomEnd
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = "User Avator"
                )
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Verified",
                    modifier = modifier
                        .padding(
                            bottom = Constants.PADDING_XSMALL,
                            end = Constants.PADDING_XSMALL
                        ),
                )
            }
        }
    }
}

@Preview
@Composable
fun AvatarPreview(modifier: Modifier = Modifier) {
    Avatar(modifier)
}