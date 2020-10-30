package com.example.cas2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.cas2020.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            Toast.makeText(this, "OK HAT GEKLAPPT!", Toast.LENGTH_LONG).show()
            binding.textView.text = "WURDE GEÄNDERT"
        }

        binding.switch1.setOnCheckedChangeListener { _, isChecked ->
            binding.textView.visibility = if(isChecked) View.INVISIBLE else View.VISIBLE
        }
    }
}