package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular12Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular13Binding

class sorular13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular13)
        lateinit var binding: ActivitySorular13Binding
        binding= ActivitySorular13Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button50.setOnClickListener{

            binding.button50.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular14::class.java)
            startActivity(intent)
        }
        binding.button51.setOnClickListener{
            binding.button51.setBackgroundColor(Color.RED)
        }
        binding.button48.setOnClickListener{
            binding.button48.setBackgroundColor(Color.RED)
        }
        binding.button49.setOnClickListener{
            binding.button49.setBackgroundColor(Color.RED)
        }
    }
}