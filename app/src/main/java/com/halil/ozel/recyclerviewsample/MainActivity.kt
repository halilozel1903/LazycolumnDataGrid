package com.halil.ozel.recyclerviewsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.halil.ozel.recyclerviewsample.ui.theme.RecyclerViewSampleTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel: PersonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val people = viewModel.people.collectAsState().value
            RecyclerViewSampleTheme  {
                PersonList(people)
            }
        }
    }

    @Composable
    fun PersonList(people: List<Person>) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            items(people) { person ->
                CustomItem(person)
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PersonListPreview() {
        RecyclerViewSampleTheme {
            PersonList(
                listOf(
                    Person(
                        firstName = "Preview",
                        lastName = "User",
                        age = 25,
                        nation = "USA",
                        musicType = "Pop",
                        imageUrl = ""
                    )
                )
            )
        }
    }
}
