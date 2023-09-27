package com.gamecodeschool.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.gamecodeschool.calculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding//put as a property so i can use in the whole class

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonAdiO.setOnClickListener { calculateAdd() }
        binding.buttonSubtraO.setOnClickListener { calculateSub() }
        binding.buttonMulti.setOnClickListener { calculateMulti() }
        binding.buttonDiv.setOnClickListener { calculateDiv() }
    }

    private fun calculateDiv() {
        val getValueNumber01 = binding.number01.text.toString()
        val number01 = getValueNumber01.toDouble()
        println("Number01 : $number01\n")

        //get number 02 value
        val getNumber02 =binding.number02.text.toString()
        val number02 = getNumber02.toDouble()
        println("Number02: $number02")
        println("Resposta: ${number01 / number02}")
    }

    private fun calculateMulti() {
        val getValueNumber01 = binding.number01.text.toString()
        val number01 = getValueNumber01.toDouble()
        println("Number01 : $number01\n")

        //get number 02 value
        val getNumber02 =binding.number02.text.toString()
        val number02 = getNumber02.toDouble()
        println("Number02: $number02")
        println("Resposta: ${number01 * number02}")
    }

    private fun calculateSub() {
        val getValueNumber01 = binding.number01.text.toString()
        val number01 = getValueNumber01.toDouble()
        println("Number01 : $number01\n")

        //get number 02 value
        val getNumber02 =binding.number02.text.toString()
        val number02 = getNumber02.toDouble()
        println("Number02: $number02")
        println("Resposta: ${number01 - number02}")
    }

    private fun calculateAdd() {
        //Get number01 value
        val getValueNumber01 = binding.number01.text.toString()
        val number01 = getValueNumber01.toDouble()
        println("Number01 : $number01\n")

        //get number 02 value
        val getNumber02 =binding.number02.text.toString()
        val number02 = getNumber02.toDouble()
        println("Number02: $number02")
        println("Resposta: ${number01 + number02}")

    }


}