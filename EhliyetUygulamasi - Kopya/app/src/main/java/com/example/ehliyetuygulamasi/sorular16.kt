package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular15Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular16Binding

class sorular16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular16)
        lateinit var binding: ActivitySorular16Binding
        binding= ActivitySorular16Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button62.setOnClickListener{

            binding.button62.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular17::class.java)
            startActivity(intent)
        }
        binding.button61.setOnClickListener{
            binding.button61.setBackgroundColor(Color.RED)
        }
        binding.button60.setOnClickListener{
            binding.button60.setBackgroundColor(Color.RED)
        }
        binding.button63.setOnClickListener{
            binding.button63.setBackgroundColor(Color.RED)
        }
    }
}