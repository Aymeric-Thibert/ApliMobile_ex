package com.example.retrofitsimple

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.retrofitsimple.databinding.ActivityMainBinding
import com.example.retrofitsimple.http.RetrofitUtil
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Double.setOnClickListener {
            val number = binding.Nombre.text.toString().toLongOrNull()
            if (number != null) {
                RetrofitUtil.get().doubleNumber(number).enqueue(object : Callback<Long> {
                    override fun onResponse(call: Call<Long>, response: Response<Long>) {
                        if (response.isSuccessful) {
                            Toast.makeText(this@MainActivity,
                                "Résultat: ${response.body()}",
                                Toast.LENGTH_SHORT).show()
                        }
                    }

                    override fun onFailure(call: Call<Long>, t: Throwable) {
                        Toast.makeText(this@MainActivity,
                            "Erreur: ${t.message}",
                            Toast.LENGTH_SHORT).show()
                    }
                })
            }
        }
    }
}