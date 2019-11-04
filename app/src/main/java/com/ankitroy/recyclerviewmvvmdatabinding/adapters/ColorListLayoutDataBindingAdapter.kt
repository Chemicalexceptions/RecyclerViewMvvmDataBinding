package com.ankitroy.recyclerviewmvvmdatabinding.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitroy.recyclerviewmvvmdatabinding.databinding.ItemLayoutBinding
import com.ankitroy.recyclerviewmvvmdatabinding.model.MyColors

class ColorListLayoutDataBindingAdapter (private val colorList: List<MyColors>) :
    RecyclerView.Adapter<ColorListLayoutDataBindingAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        val inflater = LayoutInflater.from(parent.context)
        var binding = ItemLayoutBinding.inflate(inflater)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = colorList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(colorList.get(position))
    }

    class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(color: MyColors) {

            binding.rvViewModel = color
            binding.executePendingBindings()

        }

    }
}