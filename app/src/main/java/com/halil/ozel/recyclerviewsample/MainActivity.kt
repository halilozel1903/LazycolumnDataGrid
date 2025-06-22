package com.halil.ozel.recyclerviewsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import coil.compose.AsyncImage
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.layout.ContentScale
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
            var selectedPerson by remember { mutableStateOf<Person?>(null) }
            RecyclerViewSampleTheme {
                if (selectedPerson == null) {
                    PersonList(people) { selectedPerson = it }
                } else {
                    PersonDetail(person = selectedPerson!!) { selectedPerson = null }
                }
            }
        }
    }

    @Composable
    fun PersonList(
        people: List<Person>,
        onItemClick: (Person) -> Unit
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            items(people) { person ->
                CustomItem(person = person, onClick = { onItemClick(person) })
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
                ),
                onItemClick = {}
            )
        }
    }

    @Composable
    fun PersonDetail(person: Person, onBack: () -> Unit) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            AsyncImage(
                model = person.imageUrl,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )
            Text(text = "Name: ${person.firstName} ${person.lastName}")
            Text(text = "Age: ${person.age}")
            Text(text = "Nation: ${person.nation}")
            Text(text = "Music Type: ${person.musicType}")
            Button(
                onClick = onBack,
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text(text = "Back")
            }
        }
    }
}
