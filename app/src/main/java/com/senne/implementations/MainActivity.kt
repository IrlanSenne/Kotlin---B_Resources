package com.senne.implementations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val teste : TextView = findViewById(R.id.teste)
        teste.hint = "Testandoooo"
        val teste2 : TextView = findViewById(R.id.teste)
        teste2.text = "Novo Text"
    }
}