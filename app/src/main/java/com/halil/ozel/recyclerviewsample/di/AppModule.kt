package com.halil.ozel.recyclerviewsample.di

import com.halil.ozel.recyclerviewsample.data.PersonRepositoryImpl
import com.halil.ozel.recyclerviewsample.domain.PersonRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindPersonRepository(
        impl: PersonRepositoryImpl
    ): PersonRepository
}
