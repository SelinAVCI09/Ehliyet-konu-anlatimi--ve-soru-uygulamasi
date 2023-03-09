package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular3Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular4Binding

class sorular4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular4)
                lateinit var binding: ActivitySorular4Binding
                binding= ActivitySorular4Binding.inflate(layoutInflater  )
                setContentView(binding.root)
                 val view =binding.root
                binding.button14.setOnClickListener{

                    binding.button14.setBackgroundColor(Color.GREEN)
                    intent= Intent(applicationContext,sorular5::class.java)
                    startActivity(intent)
                }
        binding.button13.setOnClickListener{
            binding.button13.setBackgroundColor(Color.RED)
        }
        binding.button12.setOnClickListener{
            binding.button12.setBackgroundColor(Color.RED)
        }
        binding.button15.setOnClickListener{
            binding.button15.setBackgroundColor(Color.RED)
        }
    }
}