package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivityKonubilgileriBinding
import com.example.ehliyetuygulamasi.databinding.ActivitySoru1Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorularBinding

class sorular : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular)
        lateinit var binding: ActivitySorularBinding
        binding= ActivitySorularBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button2.setOnClickListener{

            binding.button2.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular3::class.java)
            startActivity(intent)
        }
        binding.button10.setOnClickListener{
            binding.button10.setBackgroundColor(Color.RED)
        }
        binding.button11.setOnClickListener{
            binding.button11.setBackgroundColor(Color.RED)
        }
        binding.button9.setOnClickListener{
            binding.button9.setBackgroundColor(Color.RED)
        }
    }
}