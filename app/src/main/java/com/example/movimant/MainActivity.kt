package com.example.movimant

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movimant.databinding.ActivityMainBinding  // Importa la clase de binding generada

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding  // Declara una instancia del binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)  // Infla el binding
        setContentView(binding.root)  // Establece la vista raíz del binding como contenido

        binding.btnRegistro.setOnClickListener {
            // TODO: Add login validation logic here (if needed)
            // After successful login (or if no login is required):
            startActivity(Intent(this, muestra_maquinas2::class.java))  // Use the correct Activity name
        }
        binding.btnCrearUser.setOnClickListener {
            // TODO: Add login validation logic here (if needed)
            // After successful login (or if no login is required):
            startActivity(Intent(this, main_mobimant2::class.java))  // Use the correct Activity name
        }
    }
}