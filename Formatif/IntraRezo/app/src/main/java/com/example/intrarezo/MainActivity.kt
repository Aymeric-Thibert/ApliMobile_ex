package com.example.intrarezo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.intrarezo.Service.DataItem
import com.example.intrarezo.Service.RetroUtil
import com.example.intrarezo.Service.Service
import com.example.intrarezo.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sendRequestButton.setOnClickListener {
            val service: Service = RetroUtil.get()
            val nb: Int = binding.numberInput.text.toString().toInt()
            val call: Call<List<DataItem>> = service.GetNumber(nb)
            call.enqueue(object : Callback<List<DataItem>> {
                override fun onResponse(call: Call<List<DataItem>>, response: Response<List<DataItem>>) {
                    if (response.isSuccessful) {
                        Log.d("MainActivity", "onResponse: ${response.body()}")
                        val data = response.body()
                        data?.let { items ->
                            val displayText = items.joinToString("\n\n") { item ->
                                "Nombre: ${item.nombre}\n" +
                                        "Description: ${item.description}\n" +
                                        "Représentation: ${item.representation}"
                            }
                            binding.resultTextView.text = displayText
                        }
                    } else {
                        binding.resultTextView.text = "Erreur: ${response.code()}"
                    }
                }

                override fun onFailure(call: Call<List<DataItem>>, t: Throwable) {
                    Log.i("", "erreur")
                    binding.resultTextView.text = "Erreur: ${t.message}"
                }
            })
        }
    }
}