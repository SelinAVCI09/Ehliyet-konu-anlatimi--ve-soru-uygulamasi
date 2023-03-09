package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular18Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular19Binding

class sorular19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular19)
        lateinit var binding: ActivitySorular19Binding
        binding= ActivitySorular19Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button74.setOnClickListener{

            binding.button74.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular20::class.java)
            startActivity(intent)
        }
        binding.button72.setOnClickListener{
            binding.button72.setBackgroundColor(Color.RED)
        }
        binding.button73.setOnClickListener{
            binding.button73.setBackgroundColor(Color.RED)
        }
        binding.button75.setOnClickListener{
            binding.button75.setBackgroundColor(Color.RED)
        }
    }
}