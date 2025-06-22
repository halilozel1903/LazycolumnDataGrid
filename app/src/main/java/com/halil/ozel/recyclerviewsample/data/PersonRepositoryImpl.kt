package com.halil.ozel.recyclerviewsample.data

import android.app.Application
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.halil.ozel.recyclerviewsample.Person
import com.halil.ozel.recyclerviewsample.domain.PersonRepository
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

@Singleton
class PersonRepositoryImpl @Inject constructor(
    private val application: Application
) : PersonRepository {
    override fun getAllData(): Flow<List<Person>> = flow {
        val json = application.assets
            .open("people.json")
            .bufferedReader()
            .use { it.readText() }
        val type = object : TypeToken<List<Person>>() {}.type
        emit(Gson().fromJson(json, type))
    }
}
