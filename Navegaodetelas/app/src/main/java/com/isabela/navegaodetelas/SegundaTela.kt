package com.isabela.navegaodetelas

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        val buttonBack = findViewById<Button>(R.id.buttonBack)

        buttonBack.setOnClickListener{
            finish()
        }
    }
}