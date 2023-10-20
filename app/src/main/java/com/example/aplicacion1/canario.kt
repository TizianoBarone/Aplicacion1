package com.example.aplicacion1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class canario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_canario)

        val btnDomun = findViewById<AppCompatButton>(R.id.btnDomun)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        etName.text.toString()

        btnDomun.setOnClickListener {
            val name = etName.text.toString()

            if (name.isNotEmpty()) {
                val intent = Intent(this,ResultadoActivity::class.java)
                intent.putExtra("Extra_name", name)
                startActivity(intent)
            }
        }
    }
}