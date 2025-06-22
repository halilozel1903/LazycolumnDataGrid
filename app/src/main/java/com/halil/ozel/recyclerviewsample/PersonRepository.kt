package com.halil.ozel.recyclerviewsample

import android.app.Application
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import javax.inject.Inject
import javax.inject.Singleton
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

@Singleton
class PersonRepository @Inject constructor(
    private val application: Application
) {
    fun getAllData(): Flow<List<Person>> = flow {
        val json = application.assets
            .open("people.json")
            .bufferedReader()
            .use { it.readText() }
        val type = object : TypeToken<List<Person>>() {}.type
        emit(Gson().fromJson<List<Person>>(json, type))
    }
}
