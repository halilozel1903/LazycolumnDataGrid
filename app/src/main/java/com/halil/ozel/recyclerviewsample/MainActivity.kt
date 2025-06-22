package com.halil.ozel.recyclerviewsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
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
import com.halil.ozel.recyclerviewsample.nationToFlag
import com.halil.ozel.recyclerviewsample.genreToEmoji
import dagger.hilt.android.AndroidEntryPoint

enum class SortOption { NONE, AGE_ASC, AGE_DESC, NAME_ASC, NAME_DESC }

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
        var sortOption by remember { mutableStateOf(SortOption.NONE) }
        val sortedPeople = remember(people, sortOption) {
            when (sortOption) {
                SortOption.NONE -> people
                SortOption.AGE_ASC -> people.sortedBy { it.age }
                SortOption.AGE_DESC -> people.sortedByDescending { it.age }
                SortOption.NAME_ASC -> people.sortedBy { it.firstName }
                SortOption.NAME_DESC -> people.sortedByDescending { it.firstName }
            }
        }

        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(onClick = { sortOption = SortOption.AGE_ASC }) { Text("Age \u2191") }
                Button(onClick = { sortOption = SortOption.AGE_DESC }) { Text("Age \u2193") }
                Button(onClick = { sortOption = SortOption.NAME_ASC }) { Text("A-Z") }
                Button(onClick = { sortOption = SortOption.NAME_DESC }) { Text("Z-A") }
            }

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {
                items(sortedPeople) { person ->
                    CustomItem(person = person, onClick = { onItemClick(person) })
                }
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

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun PersonDetail(person: Person, onBack: () -> Unit) {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "${person.firstName} ${person.lastName}") },
                    navigationIcon = {
                        IconButton(onClick = onBack) {
                            Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                        }
                    }
                )
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
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
                Text(text = "\uD83D\uDC64 Name: ${person.firstName} ${person.lastName}")
                Text(text = "\uD83C\uDF82 Age: ${person.age}")
                Text(text = "\uD83C\uDF0D ${nationToFlag(person.nation)} ${person.nation}")
                Text(text = "${genreToEmoji(person.musicType)} ${person.musicType}")
            }
        }
    }
}
