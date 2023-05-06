package com.example.conversoreurodollar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversoreurodollar.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val euros = binding.editEuro.text.toString().toDouble()
            //val dollars = String.format("%.2f", euros * 0.8)
            val dollars = (euros * 0.8 * 100).roundToInt().toDouble() / 100

            binding.textDollares.text = "${ dollars } $"
        }
    }
}