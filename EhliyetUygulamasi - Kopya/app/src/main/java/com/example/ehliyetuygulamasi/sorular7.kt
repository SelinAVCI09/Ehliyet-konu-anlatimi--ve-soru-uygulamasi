package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular6Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular7Binding

class sorular7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular7)
        lateinit var binding: ActivitySorular7Binding
        binding= ActivitySorular7Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button26.setOnClickListener{

            binding.button26.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular8::class.java)
            startActivity(intent)
        }
        binding.button27.setOnClickListener{
            binding.button27.setBackgroundColor(Color.RED)
        }
        binding.button24.setOnClickListener{
            binding.button24.setBackgroundColor(Color.RED)
        }
        binding.button25.setOnClickListener{
            binding.button25.setBackgroundColor(Color.RED)
        }
    }
}