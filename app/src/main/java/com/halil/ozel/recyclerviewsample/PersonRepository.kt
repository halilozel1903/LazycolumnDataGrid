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
        Person(
            firstName = "Taylor",
            lastName = "Swift",
            age = 35,
            nation = "USA",
            musicType = "Pop / Country",
            imageUrl = "https://picsum.photos/seed/taylor/200"
        ),
        Person(
            firstName = "Nicki",
            lastName = "Minaj",
            age = 42,
            nation = "Trinidad and Tobago",
            musicType = "Hip Hop / Rap",
            imageUrl = "https://picsum.photos/seed/nicki/200"
        ),
        Person(
            firstName = "Tate",
            lastName = "McRae",
            age = 21,
            nation = "Canada",
            musicType = "Pop",
            imageUrl = "https://picsum.photos/seed/tate/200"
        ),
        Person(
            firstName = "Gracie",
            lastName = "Abrams",
            age = 25,
            nation = "USA",
            musicType = "Indie Pop",
            imageUrl = "https://picsum.photos/seed/gracie/200"
        ),
        Person(
            firstName = "Becky",
            lastName = "G",
            age = 28,
            nation = "USA",
            musicType = "Pop / Latin",
            imageUrl = "https://picsum.photos/seed/becky/200"
        ),
        Person(
            firstName = "Karol",
            lastName = "G",
            age = 34,
            nation = "Colombia",
            musicType = "Reggaeton / Latin Trap",
            imageUrl = "https://picsum.photos/seed/karol/200"
        ),
        Person(
            firstName = "Selena",
            lastName = "Gomez",
            age = 32,
            nation = "USA",
            musicType = "Pop",
            imageUrl = "https://picsum.photos/seed/selena/200"
        ),
        Person(
            firstName = "Natti",
            lastName = "Natasha",
            age = 38,
            nation = "Dominican Republic",
            musicType = "Reggaeton / Latin Pop",
            imageUrl = "https://picsum.photos/seed/natti/200"
        ),
        Person(
            firstName = "Megan",
            lastName = "Thee Stallion",
            age = 30,
            nation = "USA",
            musicType = "Hip Hop / Rap",
            imageUrl = "https://picsum.photos/seed/megan/200"
        ),
        Person(
            firstName = "Marina",
            lastName = "Satti",
            age = 38,
            nation = "Greece",
            musicType = "World / Pop",
            imageUrl = "https://picsum.photos/seed/marina/200"
        ),
        Person(
            firstName = "Elettra",
            lastName = "Lamborghini",
            age = 30,
            nation = "Italy",
            musicType = "Pop / Dance",
            imageUrl = "https://picsum.photos/seed/elettra/200"
        ),
        Person(
            firstName = "Ice",
            lastName = "Spice",
            age = 25,
            nation = "USA",
            musicType = "Hip Hop / Rap",
            imageUrl = "https://picsum.photos/seed/ice/200"
        ),
        Person(
            firstName = "Anne",
            lastName = "Marie",
            age = 34,
            nation = "UK",
            musicType = "Pop",
            imageUrl = "https://picsum.photos/seed/anne/200"
        )
    )
}