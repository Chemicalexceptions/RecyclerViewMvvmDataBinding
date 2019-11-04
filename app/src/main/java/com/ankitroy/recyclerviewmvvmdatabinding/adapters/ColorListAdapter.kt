package com.ankitroy.recyclerviewmvvmdatabinding.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitroy.recyclerviewmvvmdatabinding.R
import com.ankitroy.recyclerviewmvvmdatabinding.model.MyColors
import kotlinx.android.synthetic.main.item_layout.view.*

class ColorListAdapter(private val colorList: List<MyColors>) :
    RecyclerView.Adapter<ColorListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = colorList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(colorList.get(position))
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(color: MyColors) {

            with(itemView) {

                tv_color_name.text = color.cName

            }

        }

    }
}