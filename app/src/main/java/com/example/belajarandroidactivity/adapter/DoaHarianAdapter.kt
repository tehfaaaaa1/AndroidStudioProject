package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianAdapter (val data:ArrayList<DoaHarian>)
    : RecyclerView.Adapter<DoaHarianAdapter.DoaHarianViewHolder>() {
    class DoaHarianViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvJudulDoa : TextView = view.findViewById(R.id.tvJudulDoa)
        val tvDoaArab : TextView = view.findViewById(R.id.tvDoaArab)
        val tvDoaLatin : TextView = view.findViewById(R.id.tvDoaLatin)
        val ibCollapse : ImageButton = view.findViewById(R.id.ibCollapse)
        val rlIsiDoa : RelativeLayout = view.findViewById(R.id.rlIsiDoa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaHarianViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doa_harian,parent,false)
        return DoaHarianViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: DoaHarianViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvJudulDoa.text = item.judul
        holder.tvDoaArab.text = item.textArab
        holder.tvDoaLatin.text = item.textLatin
//        waktunya dibikin collapse
        holder.ibCollapse.setOnClickListener {
            if (holder.rlIsiDoa.visibility == View.GONE) {
                holder.rlIsiDoa.visibility = View.VISIBLE
                holder.ibCollapse.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_down_24)
            } else {
                holder.rlIsiDoa.visibility = View.GONE
                holder.ibCollapse.setBackgroundResource(R.drawable.ic_baseline_keyboard_arrow_right_24)
            }
        }
    }
}