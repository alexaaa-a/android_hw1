package com.first.app

open class Auto (
    val model: String,
    val brand: String,
    val year: Int,
    val color: String,
    val maxSpeed: Int
){
    fun printInfo() {
        println("Model: $model, brand: $brand, year: $year, color: $color, " +
                "maximum speed: $maxSpeed")
    }
}

class Crossover (
    model: String,
    brand: String,
    year: Int,
    color: String,
    maxSpeed: Int,
    val typeOfDrive: String
) : Auto(model, brand, year, color, maxSpeed)

class Sedan (
    model: String,
    brand: String,
    year: Int,
    color: String,
    maxSpeed: Int,
    val sizeOfTrunk: Int
) : Auto(model, brand, year, color, maxSpeed)

class MPV (
    model: String,
    brand: String,
    year: Int,
    color: String,
    maxSpeed: Int,
    val numberOfSeats: Int
) : Auto(model, brand, year, color, maxSpeed)

class SportsCar (
    model: String,
    brand: String,
    year: Int,
    color: String,
    maxSpeed: Int,
    val enginePower: Int
) : Auto(model, brand, year, color, maxSpeed)

class Limousine (
    model: String,
    brand: String,
    year: Int,
    color: String,
    maxSpeed: Int,
    val length: Int
) : Auto(model, brand, year, color, maxSpeed)

