package com.first.app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carCountEditText = findViewById<EditText>(R.id.car_count)
        val startRaceButton = findViewById<Button>(R.id.start_race_button)

        startRaceButton.setOnClickListener {
            val carCountText = carCountEditText.text.toString()
            if (carCountText.isNotEmpty()) {
                val carCount = carCountText.toInt()
                val cars = randomCars(carCount)
                startRace(cars)
            }
        }
    }

    private fun randomCars(count: Int): List<Auto> {
        val models = listOf("abc", "oir", "ght", "nuo", "ooj", "kmk", "kjo")
        val brands = listOf("Mercedes-Benz", "Bentley", "Chevrolet", "Infinity", "Tesla")
        val colors = listOf("yellow", "blue", "red", "pink", "black", "white", "purple")

        return List(count) {
            Auto(
                model = models.random(),
                brand = brands.random(),
                year = (1990..2024).random(),
                color = colors.random(),
                maxSpeed = (100..500).random()
            )
        }
    }

    private fun startRace(cars: List<Auto>) {
        var round = 1
        var competitors = cars.toMutableList()

        while (competitors.size > 1) {
            println("--- Раунд $round ---")
            val winners = mutableListOf<Auto>()

            while (competitors.size > 1) {
                val car1 = competitors.removeAt(Random.nextInt(competitors.size))
                val car2 = competitors.removeAt(Random.nextInt(competitors.size))

                val winner = if (car1.maxSpeed > car2.maxSpeed) car1 else car2
                println("Гонка между ${car1.model} и ${car2.model}, Победитель: ${winner.model}")
                winners.add(winner)
            }

            if (competitors.size == 1) {
                winners.add(competitors.removeAt(0))
            }

            competitors = winners
            round++
        }

        println("Победитель: ${competitors[0].model}")
    }
}