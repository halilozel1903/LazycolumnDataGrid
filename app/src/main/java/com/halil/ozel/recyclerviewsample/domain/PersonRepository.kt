package com.halil.ozel.recyclerviewsample.domain

import com.halil.ozel.recyclerviewsample.Person
import kotlinx.coroutines.flow.Flow

interface PersonRepository {
    fun getAllData(): Flow<List<Person>>
}
