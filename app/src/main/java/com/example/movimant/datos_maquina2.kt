package com.example.movimant

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movimant.databinding.ActivityDatosMaquina2Binding  // Importa la clase de binding

class datos_maquina2 : AppCompatActivity() {

    private lateinit var binding: ActivityDatosMaquina2Binding  // Declara la instancia del binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDatosMaquina2Binding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}