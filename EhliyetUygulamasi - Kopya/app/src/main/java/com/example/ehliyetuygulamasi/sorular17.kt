package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular16Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular17Binding

class sorular17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular17)
        lateinit var binding: ActivitySorular17Binding
        binding= ActivitySorular17Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button66.setOnClickListener{

            binding.button66.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular18::class.java)
            startActivity(intent)
        }
        binding.button64.setOnClickListener{
            binding.button64.setBackgroundColor(Color.RED)
        }
        binding.button65.setOnClickListener{
            binding.button65.setBackgroundColor(Color.RED)
        }
        binding.button67.setOnClickListener{
            binding.button67.setBackgroundColor(Color.RED)
        }
    }
}