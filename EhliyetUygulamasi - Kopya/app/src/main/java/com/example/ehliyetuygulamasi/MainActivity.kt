package com.example.ehliyetuygulamasi

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.buttonsoru.setOnClickListener{
            intent= Intent(applicationContext,soru1::class.java)
            startActivity(intent)
        }
        binding.buttonkonu.setOnClickListener{
            intent= Intent(applicationContext,konubilgileri::class.java)
            startActivity(intent)
        }

    }
}