package com.example.dailydo.ui.personal_tasks.level2.contactList

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dailydo.ui.Constants
import com.example.dailydo.ui.personal_tasks.level2.contactList.components.ContactItem

@Preview
@Composable
fun ContactListPreview(modifier: Modifier = Modifier) {
    ContactList(modifier)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactList(modifier: Modifier = Modifier) {
    val contactList = listOf(
        mapOf("name" to "Purab", "phone" to "9823456712"),
        mapOf("name" to "Raj", "phone" to "9098876543"),
        mapOf("name" to "Shyam", "phone" to "7765123490"),
        mapOf("name" to "Naveen", "phone" to "8879012365"),
        mapOf("name" to "Dev", "phone" to "9123456780"),
        mapOf("name" to "Avan", "phone" to "7986541230"),
        mapOf("name" to "Tanu", "phone" to "9367012488"),
        mapOf("name" to "Manisha", "phone" to "8245631098"),
        mapOf("name" to "Shriya", "phone" to "8890124576")
    )
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(Constants.PADDING_SMALL),
        contentPadding = PaddingValues(vertical = Constants.VERTICAL_SPACING_SMALL),
        verticalArrangement = Arrangement.spacedBy(Constants.VERTICAL_SPACING_SMALL)
    ) {
        items(contactList) { contact ->
            ContactItem(
                modifier = modifier,
                contact = contact
            )
        }
    }
}
