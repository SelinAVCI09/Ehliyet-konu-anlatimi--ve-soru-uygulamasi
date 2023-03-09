package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular20Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular21Binding

class sorular21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular21)
        lateinit var binding: ActivitySorular21Binding
        binding= ActivitySorular21Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button82.setOnClickListener{

            binding.button82.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular22::class.java)
            startActivity(intent)
        }
        binding.button80.setOnClickListener{
            binding.button80.setBackgroundColor(Color.RED)
        }
        binding.button81.setOnClickListener{
            binding.button81.setBackgroundColor(Color.RED)
        }
        binding.button83.setOnClickListener{
            binding.button83.setBackgroundColor(Color.RED)
        }
    }
}