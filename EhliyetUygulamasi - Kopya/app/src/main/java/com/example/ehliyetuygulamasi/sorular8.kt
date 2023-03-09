package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular7Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular8Binding

class sorular8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular8)
        lateinit var binding: ActivitySorular8Binding
        binding= ActivitySorular8Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button30.setOnClickListener{

            binding.button30.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular9::class.java)
            startActivity(intent)
        }
        binding.button31.setOnClickListener{
            binding.button31.setBackgroundColor(Color.RED)
        }
        binding.button28.setOnClickListener{
            binding.button28.setBackgroundColor(Color.RED)
        }
        binding.button29.setOnClickListener{
            binding.button29.setBackgroundColor(Color.RED)
        }
    }
}