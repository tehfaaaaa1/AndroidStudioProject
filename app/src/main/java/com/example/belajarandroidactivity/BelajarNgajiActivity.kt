package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DataNgajiAdapter
import com.example.belajarandroidactivity.model.DataNgaji

class BelajarNgajiActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_ngaji)

        val rvListDoa : RecyclerView = findViewById(R.id.rvListDoa)
        val listDoa = arrayListOf<DataNgaji>(
            DataNgaji("Dzikir & Doa Sunnah Setelah Shalat", R.drawable.doa_harian2),
            DataNgaji("Dzikir Harian", R.drawable.doa_harian2),
            DataNgaji("Al Ma'tsurat", R.drawable.doa_harian2),
            DataNgaji("Dzikir Para Nabi", R.drawable.doa_harian2),
            DataNgaji("Dzikir Pagi & Petang", R.drawable.doa_harian2)
        )
        val adapter = DataNgajiAdapter(listDoa)
        val linearVertical = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        rvListDoa.adapter = adapter
        rvListDoa.layoutManager = linearVertical

        val btnKeDoa : Button = findViewById(R.id.btnKeDoa)

        btnKeDoa.setOnClickListener {
            val intent = Intent(this, DoaHarianAct::class.java)
            startActivity(intent)
        }
    }
}