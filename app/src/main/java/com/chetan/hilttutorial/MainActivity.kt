package com.chetan.hilttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mushroomPizza: MushroomPizza

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Pizza ingredients", mushroomPizza.ingredients.toString())
        Log.i("Pizza toppings", mushroomPizza.toppings.toString())
        Log.i("Pizza price", mushroomPizza.totalPriceWithTax().toString())
        Log.i("Pizza bake time", mushroomPizza.timeToBake)
    }
}
