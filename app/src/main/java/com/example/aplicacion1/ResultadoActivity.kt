package com.example.aplicacion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val tvSaludo = findViewById<TextView>(R.id.tvSaludo)
        val name: String = intent.extras?.getString("Extra_name").orEmpty()
        tvSaludo.text = "Hola $name"
    }
}