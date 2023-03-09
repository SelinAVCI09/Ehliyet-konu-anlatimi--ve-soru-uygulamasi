package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular5Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular6Binding

class sorular6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular6)
        lateinit var binding: ActivitySorular6Binding
        binding= ActivitySorular6Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button20.setOnClickListener{

            binding.button20.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular7::class.java)
            startActivity(intent)
        }
        binding.button21.setOnClickListener{
            binding.button21.setBackgroundColor(Color.RED)
        }
        binding.button22.setOnClickListener{
            binding.button22.setBackgroundColor(Color.RED)
        }
        binding.button23.setOnClickListener{
            binding.button23.setBackgroundColor(Color.RED)
        }
    }
}