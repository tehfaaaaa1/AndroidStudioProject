package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DataNgajiAdapter
import com.example.belajarandroidactivity.model.DataNgaji

class BelajarNgajiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_ngaji)

        val rvListDoa : RecyclerView = findViewById(R.id.rvListDoa)
        val listDoa = arrayListOf<DataNgaji>(
            DataNgaji("Dzikir &amp; Doa Sunnah Setelah Shalat", R.drawable.doa_harian2),
            DataNgaji("Dzikir Harian", R.drawable.doa_harian2),
            DataNgaji("Al Ma'tsurat", R.drawable.doa_harian2),
            DataNgaji("Dzikir Para Nabi", R.drawable.doa_harian2),
            DataNgaji("Dzikir Pagi & Petang", R.drawable.doa_harian2)
        )
        val adapter = DataNgajiAdapter(listDoa)
        val linearVertical = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        rvListDoa.adapter = adapter
        rvListDoa.layoutManager = linearVertical
    }
}