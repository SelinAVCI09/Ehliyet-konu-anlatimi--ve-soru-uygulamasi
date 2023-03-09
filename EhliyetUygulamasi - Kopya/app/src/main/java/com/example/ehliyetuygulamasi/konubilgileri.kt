package com.example.ehliyetuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ehliyetuygulamasi.databinding.ActivityKonubilgileriBinding
import com.example.ehliyetuygulamasi.databinding.ActivityMainBinding

class konubilgileri : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_konubilgileri)
        lateinit var binding: ActivityKonubilgileriBinding
        binding= ActivityKonubilgileriBinding.inflate(layoutInflater  )
        setContentView(binding.root)
        val view =binding.root
        binding.buttonkonu2.setOnClickListener{
            intent= Intent(applicationContext,motor::class.java)
            startActivity(intent)
        }
        binding.buttonkonu3.setOnClickListener{
            intent= Intent(applicationContext,trafik::class.java)
            startActivity(intent)
        }
        binding.buttonkonu4.setOnClickListener{
            intent= Intent(applicationContext,ilkyardim::class.java)
            startActivity(intent)
        }
    }
}