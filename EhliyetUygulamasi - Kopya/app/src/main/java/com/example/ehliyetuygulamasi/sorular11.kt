package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular10Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular11Binding

class sorular11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular11)
        lateinit var binding: ActivitySorular11Binding
        binding= ActivitySorular11Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button40.setOnClickListener{

            binding.button40.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular12::class.java)
            startActivity(intent)
        }
        binding.button41.setOnClickListener{
            binding.button41.setBackgroundColor(Color.RED)
        }
        binding.button42.setOnClickListener{
            binding.button42.setBackgroundColor(Color.RED)
        }
        binding.button43.setOnClickListener{
            binding.button43.setBackgroundColor(Color.RED)
        }
    }
}