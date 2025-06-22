package com.halil.ozel.recyclerviewsample

/**
 * Created by halilozel1903 on 11.05.2025.
 */
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

@Singleton
class PersonRepository @Inject constructor() {
    fun getAllData(): Flow<List<Person>> = flowOf(
        listOf(
        Person(
            firstName = "Taylor",
            lastName = "Swift",
            age = 35,
            nation = "USA",
            musicType = "Pop / Country",
            // Use a real photo instead of a placeholder
            imageUrl = "https://source.unsplash.com/200x200/?taylor%20swift"
        ),
        Person(
            firstName = "Nicki",
            lastName = "Minaj",
            age = 42,
            nation = "Trinidad and Tobago",
            musicType = "Hip Hop / Rap",
            imageUrl = "https://source.unsplash.com/200x200/?nicki%20minaj"
        ),
        Person(
            firstName = "Tate",
            lastName = "McRae",
            age = 21,
            nation = "Canada",
            musicType = "Pop",
            imageUrl = "https://source.unsplash.com/200x200/?tate%20mcrae"
        ),
        Person(
            firstName = "Gracie",
            lastName = "Abrams",
            age = 25,
            nation = "USA",
            musicType = "Indie Pop",
            imageUrl = "https://source.unsplash.com/200x200/?gracie%20abrams"
        ),
        Person(
            firstName = "Becky",
            lastName = "G",
            age = 28,
            nation = "USA",
            musicType = "Pop / Latin",
            imageUrl = "https://source.unsplash.com/200x200/?becky%20g"
        ),
        Person(
            firstName = "Karol",
            lastName = "G",
            age = 34,
            nation = "Colombia",
            musicType = "Reggaeton / Latin Trap",
            imageUrl = "https://source.unsplash.com/200x200/?karol%20g"
        ),
        Person(
            firstName = "Selena",
            lastName = "Gomez",
            age = 32,
            nation = "USA",
            musicType = "Pop",
            imageUrl = "https://source.unsplash.com/200x200/?selena%20gomez"
        ),
        Person(
            firstName = "Natti",
            lastName = "Natasha",
            age = 38,
            nation = "Dominican Republic",
            musicType = "Reggaeton / Latin Pop",
            imageUrl = "https://source.unsplash.com/200x200/?natti%20natasha"
        ),
        Person(
            firstName = "Megan",
            lastName = "Thee Stallion",
            age = 30,
            nation = "USA",
            musicType = "Hip Hop / Rap",
            imageUrl = "https://source.unsplash.com/200x200/?megan%20thee%20stallion"
        ),
        Person(
            firstName = "Marina",
            lastName = "Satti",
            age = 38,
            nation = "Greece",
            musicType = "World / Pop",
            imageUrl = "https://source.unsplash.com/200x200/?marina%20satti"
        ),
        Person(
            firstName = "Elettra",
            lastName = "Lamborghini",
            age = 30,
            nation = "Italy",
            musicType = "Pop / Dance",
            imageUrl = "https://source.unsplash.com/200x200/?elettra%20lamborghini"
        ),
        Person(
            firstName = "Ice",
            lastName = "Spice",
            age = 25,
            nation = "USA",
            musicType = "Hip Hop / Rap",
            imageUrl = "https://source.unsplash.com/200x200/?ice%20spice"
        ),
        Person(
            firstName = "Anne",
            lastName = "Marie",
            age = 34,
            nation = "UK",
            musicType = "Pop",
            imageUrl = "https://source.unsplash.com/200x200/?anne%20marie"
        )
        )
    )
}