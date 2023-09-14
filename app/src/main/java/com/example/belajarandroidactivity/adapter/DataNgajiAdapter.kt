package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.Language

class DataNgajiAdapter (val data:ArrayList<Language>) : RecyclerView.Adapter<DataNgajiAdapter.DataNgajiViewHolder>() {
    class DataNgajiViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvJudul : TextView = view.findViewById(R.id.jDoa1)
        val ivLogo: ImageView = view.findViewById(R.id.logoDoa1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataNgajiViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bahasa_pemrograman,parent,false)
        return DataNgajiViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DataNgajiViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvJudul.text = item.name
        holder.ivLogo.setImageResource(item.image)
    }
}