package com.example.retrofitlistes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitlistes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerViewTop.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewBottom.layoutManager = LinearLayoutManager(this)

        // Set adapters here
        // binding.recyclerViewTop.adapter = ...
        // binding.recyclerViewBottom.adapter = ...


    }
}