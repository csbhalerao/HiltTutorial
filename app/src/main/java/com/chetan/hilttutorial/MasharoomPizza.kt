package com.chetan.hilttutorial


data class MushroomPizza(
    val ingredients: List<String>,
    val toppings: List<String>,
    val timeToBake: String,
    val price: Int
) {
    fun totalPriceWithTax() = price + 10
}
