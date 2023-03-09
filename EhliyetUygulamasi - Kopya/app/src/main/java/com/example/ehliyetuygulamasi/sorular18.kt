package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular17Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular18Binding

class sorular18 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular18)
        lateinit var binding: ActivitySorular18Binding
        binding= ActivitySorular18Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button70.setOnClickListener{

            binding.button70.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular19::class.java)
            startActivity(intent)
        }
        binding.button71.setOnClickListener{
            binding.button71.setBackgroundColor(Color.RED)
        }
        binding.button68.setOnClickListener{
            binding.button68.setBackgroundColor(Color.RED)
        }
        binding.button69.setOnClickListener{
            binding.button69.setBackgroundColor(Color.RED)
        }
    }
}