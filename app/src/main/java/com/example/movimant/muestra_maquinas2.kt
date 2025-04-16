package com.example.movimant

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movimant.databinding.ActivityMuestraMaquinas2Binding

class muestra_maquinas2 : AppCompatActivity() {

    private lateinit var binding: ActivityMuestraMaquinas2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMuestraMaquinas2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackHome.setOnClickListener {
            // TODO: Add login validation logic here (if needed)
            // After successful login (or if no login is required):
            startActivity(Intent(this, MainActivity::class.java))  // Use the correct Activity name
        }
        binding.agregarMaquina.setOnClickListener {
            // TODO: Add login validation logic here (if needed)
            // After successful login (or if no login is required):
            startActivity(Intent(this, registroMaquina2::class.java))  // Use the correct Activity name
        }
        binding.btnVerPerfil.setOnClickListener {
            // TODO: Add login validation logic here (if needed)
            // After successful login (or if no login is required):
            startActivity(Intent(this, Configuracion2::class.java))  // Use the correct Activity name
        }
    }
}