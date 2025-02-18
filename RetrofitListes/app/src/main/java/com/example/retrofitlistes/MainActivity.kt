package com.example.retrofitlistes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitlistes.adapter.ListAdapter
import com.example.retrofitlistes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
 private lateinit var adapter: ListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        // Set adapters here
        // binding.recyclerViewTop.adapter = ...
        // binding.recyclerViewBottom.adapter = ...
        setupRecycler()
        setupRecyclerViews()
    }

    private fun setupRecyclerViews() {
        binding.recyclerViewgauche.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }
    private fun setupRecycler() {
        binding.recyclerViewgauche.adapter = adapter
        binding.recyclerViewgauche.setHasFixedSize(true)
        binding.recyclerViewgauche.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.recyclerViewgauche.context, DividerItemDecoration.VERTICAL
            )
        )
    }
    

}
