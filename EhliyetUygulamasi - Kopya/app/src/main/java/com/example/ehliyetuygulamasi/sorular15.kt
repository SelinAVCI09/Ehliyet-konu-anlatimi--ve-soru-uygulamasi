package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular14Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular15Binding

class sorular15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular15)
        lateinit var binding: ActivitySorular15Binding
        binding= ActivitySorular15Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button56.setOnClickListener{

            binding.button56.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular16::class.java)
            startActivity(intent)
        }
        binding.button57.setOnClickListener{
            binding.button57.setBackgroundColor(Color.RED)
        }
        binding.button58.setOnClickListener{
            binding.button58.setBackgroundColor(Color.RED)
        }
        binding.button59.setOnClickListener{
            binding.button59.setBackgroundColor(Color.RED)
        }
    }
}