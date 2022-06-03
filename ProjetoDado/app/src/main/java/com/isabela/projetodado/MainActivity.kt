package com.isabela.projetodado

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonS6 = findViewById<Button>(R.id.buttonS6)
        val buttonS12 = findViewById<Button>(R.id.buttonS12)
        val buttonS20 = findViewById<Button>(R.id.buttonS20)

        buttonS6.setOnClickListener {
            S6(6)
        }

        buttonS12.setOnClickListener {
            S12(12)
        }

        buttonS20.setOnClickListener {
            S20(20)
        }
    }

    private fun S6(lados: Int){
        val rolagem = (1..lados).random()

        val textS6 = findViewById<TextView>(R.id.textS6)
        textS6.text = rolagem.toString()

    }
    private fun S12(lados: Int){
        val rolagem = (1..lados).random()

        val textS12 = findViewById<TextView>(R.id.textS12)
        textS12.text = rolagem.toString()
    }
    private fun S20(lados: Int){
        val rolagem = (1..lados).random()

        val textS20 = findViewById<TextView>(R.id.textS20)
        textS20.text = rolagem.toString()
    }
}