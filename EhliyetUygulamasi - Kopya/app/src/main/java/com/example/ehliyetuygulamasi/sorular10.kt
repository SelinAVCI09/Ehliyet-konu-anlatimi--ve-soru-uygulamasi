package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular10Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular9Binding

class sorular10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular10)
        lateinit var binding: ActivitySorular10Binding
        binding= ActivitySorular10Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button37.setOnClickListener{

            binding.button37.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular11::class.java)
            startActivity(intent)
        }
        binding.button36.setOnClickListener{
            binding.button36.setBackgroundColor(Color.RED)
        }
        binding.button38.setOnClickListener{
            binding.button38.setBackgroundColor(Color.RED)
        }
        binding.button39.setOnClickListener{
            binding.button39.setBackgroundColor(Color.RED)
        }
    }
}