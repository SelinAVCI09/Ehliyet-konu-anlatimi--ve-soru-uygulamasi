package com.example.ehliyetuygulamasi

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivitySorular3Binding
import com.example.ehliyetuygulamasi.databinding.ActivitySorularBinding

class sorular3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sorular3)
        lateinit var binding: ActivitySorular3Binding
        binding= ActivitySorular3Binding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.button5.setOnClickListener{

            binding.button5.setBackgroundColor(Color.GREEN)
            intent= Intent(applicationContext,sorular4::class.java)
            startActivity(intent)
        }
        binding.button6.setOnClickListener{
            binding.button6.setBackgroundColor(Color.RED)
        }
        binding.button7.setOnClickListener{
            binding.button7.setBackgroundColor(Color.RED)
        }
        binding.button8.setOnClickListener{
            binding.button8.setBackgroundColor(Color.RED)
        }
    }
}