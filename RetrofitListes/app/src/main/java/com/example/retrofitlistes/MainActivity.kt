package com.example.retrofitlistes

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.retrofitlistes.adapter.ItemAdapter
import com.example.retrofitlistes.adapter.ListAdapter
import com.example.retrofitlistes.databinding.ActivityMainBinding
import com.example.retrofitlistes.models.ItemSimples
import com.example.retrofitsimple.http.RetrofitUtil
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ListAdapter
    private lateinit var adapterDroit: ItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        // Set adapters here
        // binding.recyclerViewTop.adapter = ...
        // binding.recyclerViewBottom.adapter = ...
        setupRecyclerGauche()
        setupRecyclerViewsGauche()
        fillRecyclerViewGauche()
        setupRecyclerDroit()
        setupRecyclerViewDroit()
        fillRecyclerViewDroit()
    }

    private fun setupRecyclerViewsGauche() {
        binding.recyclerViewgauche.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }
    }
    private fun setupRecyclerDroit(){
        binding.recyclerViewdroite.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        }

    }



    private fun setupRecyclerViewDroit() {
        adapterDroit = ItemAdapter(emptyList())
        binding.recyclerViewdroite.adapter = adapterDroit
        binding.recyclerViewdroite.setHasFixedSize(true)
        binding.recyclerViewdroite.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.recyclerViewdroite.context, DividerItemDecoration.VERTICAL
            )
        )

    }




    private fun setupRecyclerGauche() {
        adapter = ListAdapter(emptyList())
        binding.recyclerViewgauche.adapter = adapter
        binding.recyclerViewgauche.setHasFixedSize(true)
        binding.recyclerViewgauche.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.recyclerViewgauche.context, DividerItemDecoration.VERTICAL
            )
        )
    }

    private fun fillRecyclerViewDroit(){
    RetrofitUtil.get().AfficherItems().enqueue(object : Callback<List<ItemSimples>>{
        override fun onResponse(call : Call<List<ItemSimples>>,response: Response<List<ItemSimples>>){


            if (response.isSuccessful){
                adapterDroit = ItemAdapter(response.body() ?: emptyList())
                binding.recyclerViewdroite.adapter=adapterDroit


            }

        }
        override fun onFailure(call: Call<List<ItemSimples>>, t: Throwable){
            Toast.makeText(this@MainActivity, "Error: ${t.message}", Toast.LENGTH_SHORT).show()
        }

    })



    }



        private fun fillRecyclerViewGauche() {
            RetrofitUtil.get().AfficherListLong().enqueue(object : Callback<List<Long>> {
                override fun onResponse(call: Call<List<Long>>, response: Response<List<Long>>) {
                    if (response.isSuccessful) {
                        adapter = ListAdapter(response.body() ?: emptyList())
                        binding.recyclerViewgauche.adapter = adapter
                    }
                }

                override fun onFailure(call: Call<List<Long>>, t: Throwable) {
                    Toast.makeText(this@MainActivity, "Error: ${t.message}", Toast.LENGTH_SHORT).show()
                }
            })
        }






}
