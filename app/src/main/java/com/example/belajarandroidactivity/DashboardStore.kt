package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class DashboardStore : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_store)
        var ibKurang:ImageButton = findViewById(R.id.ibKurang)
        var ibTambah:ImageButton = findViewById(R.id.ibTambah)
        var tvCount:TextView = findViewById(R.id.tvCount)
        var tvTotal:TextView = findViewById(R.id.tvTotal)
        var btnCheckout: Button = findViewById(R.id.btnCheckout)
        var harga:Int = 999999999
        var angka = tvCount.text.toString().toInt()
        ibKurang.setOnClickListener {
            angka-=1
            tvCount.text = angka.toString()
            tvTotal.text = (harga*angka).toString()
        }
        ibTambah.setOnClickListener {
            angka += 1
            tvCount.text = angka.toString()
            tvTotal.text = (harga*angka).toString()
        }
    }
}