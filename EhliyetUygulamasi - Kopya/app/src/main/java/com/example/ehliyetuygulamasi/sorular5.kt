package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular4Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorular5Binding

class sorular5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular5)
                lateinit var binding: ActivitySorular5Binding
                binding= ActivitySorular5Binding.inflate(layoutInflater  )
                setContentView(binding.root)
                val view =binding.root
                binding.button16.setOnClickListener{

                    binding.button16.setBackgroundColor(Color.GREEN)
                    intent= Intent(applicationContext,sorular6::class.java)
                    startActivity(intent)
                }
        binding.button17.setOnClickListener{
            binding.button17.setBackgroundColor(Color.RED)
        }
        binding.button18.setOnClickListener{
            binding.button18.setBackgroundColor(Color.RED)
        }
        binding.button19.setOnClickListener{
            binding.button19.setBackgroundColor(Color.RED)
        }
    }
}