package com.ankitroy.recyclerviewmvvmdatabinding.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ankitroy.recyclerviewmvvmdatabinding.R
import com.ankitroy.recyclerviewmvvmdatabinding.databinding.ItemLayoutBinding
import com.ankitroy.recyclerviewmvvmdatabinding.model.MyColors
import kotlinx.android.synthetic.main.item_layout.view.*

/**
 * Using Data binding Normal coding side
 */

class ColorListDataBindingSimpleAdapter(private val colorList: List<MyColors>) :
    RecyclerView.Adapter<ColorListDataBindingSimpleAdapter.ViewHolder>() {
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

            binding.tvColorName.text = color.cName

        }

    }
}