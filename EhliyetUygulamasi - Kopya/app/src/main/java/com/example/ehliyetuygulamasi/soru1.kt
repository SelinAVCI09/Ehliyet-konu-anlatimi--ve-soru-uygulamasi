package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivityKonubilgileriBinding
import com.example.ehliyetuygulamasi.databinding.ActivitySoru1Binding

class soru1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soru1)
        lateinit var binding: ActivitySoru1Binding
        binding= ActivitySoru1Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button2.setOnClickListener{

            binding.button2.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener{
            binding.button.setBackgroundColor(Color.RED)
        }
        binding.button3.setOnClickListener{
            binding.button3.setBackgroundColor(Color.RED)
        }
        binding.button4.setOnClickListener{
            binding.button4.setBackgroundColor(Color.RED)
        }
    }
}