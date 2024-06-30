package com.first.app

class AutoBuilder(private val model: String) {
    private var brand: String = ""
    private var year: Int = 0
    private var color: String = ""
    private var maxSpeed: Int = 0

    fun setBrand(brand: String) = apply { this.brand = brand }
    fun setYear (year: Int) = apply { this.year = year }
    fun setColor (color: String) = apply { this.color = color }
    fun setMaxSpeed (maxSpeed: Int) = apply { this.maxSpeed = maxSpeed }

    fun build(): Auto {
        return Auto(model, brand, year, color, maxSpeed)
    }
}