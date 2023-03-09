package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular19Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular20Binding

class sorular20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular20)
        lateinit var binding: ActivitySorular20Binding
        binding= ActivitySorular20Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button79.setOnClickListener{

            binding.button79.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular21::class.java)
            startActivity(intent)
        }
        binding.button78.setOnClickListener{
            binding.button78.setBackgroundColor(Color.RED)
        }
        binding.button77.setOnClickListener{
            binding.button77.setBackgroundColor(Color.RED)
        }
        binding.button76.setOnClickListener{
            binding.button76.setBackgroundColor(Color.RED)
        }
    }
}