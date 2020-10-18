package com.chetan.hilttutorial.di

import com.chetan.hilttutorial.MushroomPizza
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
class PizzaModule {
    @Provides
    fun provideMushroomPizza(): MushroomPizza {
        val ingredients = listOf("Dough", "Mushroom", "Tomato", "Salt")
        val toppings = listOf("Capsicum", "Onion")
        val timeToBake = "10"
        val price = 200
        return MushroomPizza(ingredients, toppings, timeToBake, price)
    }
}
