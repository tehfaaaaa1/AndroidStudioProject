package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)
//        define array adapter
        val arrayAdapter:ArrayAdapter<*> // <*> -> SEMUA data bisa dimasukkan
        val users = arrayOf(
            "Daud Ghifari", "Raffa Galih", "Nadeva Razan"
        )
//        Deklarasi variabel ListView
        var mListView: ListView = findViewById(R.id.lvNama)
//        Panggil object ArrayAdapter(this, layout_sample, data)
        arrayAdapter = ArrayAdapter (this,
                                    android.R.layout.simple_list_item_1,
                                    users)

//        Isi adapter
        mListView.adapter = arrayAdapter
    }
}