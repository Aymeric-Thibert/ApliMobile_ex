
package com.example.retrofitlistes.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitlistes.databinding.ListeLongBinding

class ListAdapter(
    private val data: List<Long>
) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ListeLongBinding.inflate(
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

    inner class ViewHolder(
        private val binding: ListeLongBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Long) {
            binding.ListeLong.text = item.toString()
        }
    }
}