package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular8Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular9Binding

class sorular9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular9)
        lateinit var binding: ActivitySorular9Binding
        binding= ActivitySorular9Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button32.setOnClickListener{

            binding.button32.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular10::class.java)
            startActivity(intent)
        }
        binding.button33.setOnClickListener{
            binding.button33.setBackgroundColor(Color.RED)
        }
        binding.button34.setOnClickListener{
            binding.button34.setBackgroundColor(Color.RED)
        }
        binding.button35.setOnClickListener{
            binding.button35.setBackgroundColor(Color.RED)
        }
    }
}