
package com.example.retrofitlistes.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitlistes.databinding.ItemSimpleBinding
import com.example.retrofitlistes.databinding.ListeLongBinding
import com.example.retrofitlistes.models.ItemSimples

class ItemAdapter(
    private val data: List<ItemSimples>
) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    inner class ViewHolder(
        private val binding: ItemSimpleBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ItemSimples) {
            binding.nombre.text = item.a.toString()
            binding.mot.text = item.b
            binding.Liste.text = item.c.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemSimpleBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    companion object {
        val diffCallback = object : DiffUtil.ItemCallback<ItemSimples>() {
            override fun areItemsTheSame(oldItem: ItemSimples, newItem: ItemSimples): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ItemSimples, newItem: ItemSimples): Boolean {
                return oldItem == newItem
            }
        }
    }
}




