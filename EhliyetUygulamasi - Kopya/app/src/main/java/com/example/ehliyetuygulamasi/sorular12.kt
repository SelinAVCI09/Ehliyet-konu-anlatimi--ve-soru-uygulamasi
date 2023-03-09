package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular11Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular12Binding

class sorular12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular12)
        lateinit var binding: ActivitySorular12Binding
        binding= ActivitySorular12Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button46.setOnClickListener{

            binding.button46.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular13::class.java)
            startActivity(intent)
        }
        binding.button44.setOnClickListener{
            binding.button44.setBackgroundColor(Color.RED)
        }
        binding.button47.setOnClickListener{
            binding.button47.setBackgroundColor(Color.RED)
        }
        binding.button45.setOnClickListener{
            binding.button45.setBackgroundColor(Color.RED)
        }
    }
}