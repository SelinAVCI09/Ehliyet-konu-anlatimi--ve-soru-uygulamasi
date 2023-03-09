package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular13Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular14Binding

class sorular14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular14)
        lateinit var binding: ActivitySorular14Binding
        binding= ActivitySorular14Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button54.setOnClickListener{

            binding.button54.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular15::class.java)
            startActivity(intent)
        }
        binding.button52.setOnClickListener{
            binding.button52.setBackgroundColor(Color.RED)
        }
        binding.button53.setOnClickListener{
            binding.button53.setBackgroundColor(Color.RED)
        }
        binding.button55.setOnClickListener{
            binding.button55.setBackgroundColor(Color.RED)
        }
    }
}