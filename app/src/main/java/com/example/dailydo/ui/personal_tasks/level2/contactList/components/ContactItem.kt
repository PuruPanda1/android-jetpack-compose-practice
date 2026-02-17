package com.example.dailydo.ui.personal_tasks.level2.contactList.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.dailydo.R
import com.example.dailydo.ui.Constants

@Composable
fun ContactItem(modifier: Modifier = Modifier, contact: Map<String, String>) {
    ElevatedCard(
        modifier = modifier
            .fillMaxWidth()
            .padding(
                horizontal = Constants.PADDING_LARGE,
                vertical = Constants.PADDING_MEDIUM
            )
    )
    {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    Constants.PADDING_MEDIUM
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(Constants.PADDING_MEDIUM)
        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_background),
                contentDescription = stringResource(
                    R.string.profile_picture_desc,
                    contact["name"] ?: stringResource(R.string.unknown_caller)
                ),
                Modifier
                    .size(
                        Constants.IMAGE_SIZE_SMALL
                    )
                    .clip(
                        CircleShape
                    )
                    .border(
                        width = Constants.BORDER_SMALL,
                        color = Color.Gray,
                        shape = CircleShape
                    ),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier
                    .weight(
                        1f
                    ),
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = contact["name"] ?: stringResource(R.string.unknown_caller),
                )
                Spacer(Modifier.height(Constants.VERTICAL_SPACING_XSMALL))
                Text(
                    text = contact["phone"] ?: "None"
                )
            }
            Row {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.Call,
                        contentDescription = stringResource(
                            R.string.call_icon,
                            contact["name"] ?: stringResource(R.string.unknown_caller)
                        )
                    )
                }
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = stringResource(
                            R.string.message_icon,
                            contact["name"] ?: stringResource(R.string.unknown_caller)
                        )
                    )
                }
            }
        }
    }

}