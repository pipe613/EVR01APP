package com.example.movimant

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movimant.databinding.ActivityMainMobimant2Binding  // Importa la clase de binding

class main_mobimant2 : AppCompatActivity() {

    private lateinit var binding: ActivityMainMobimant2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMobimant2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegistro.setOnClickListener {
            // TODO: Add login validation logic here (if needed)
            // After successful login (or if no login is required):
            startActivity(Intent(this, MainActivity::class.java))  // Use the correct Activity name
        }
    }
}