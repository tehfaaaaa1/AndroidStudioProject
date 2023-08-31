package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val judulForm:TextView = findViewById(R.id.judulForm)
        val labelNama:TextView = findViewById(R.id.labelNama)
        val labelKelas:TextView = findViewById(R.id.labelKelas)
        val labelKode:TextView = findViewById(R.id.labelKode)

        val inputNama:EditText = findViewById(R.id.inputNama)
        val inputKelas:EditText = findViewById(R.id.inputKelas)
        val inputKode:EditText = findViewById(R.id.inputKode)
        val btnSubmit:Button = findViewById(R.id.submit)

        val showNama:TextView = findViewById(R.id.showNama)
        val showKelas:TextView = findViewById(R.id.showKelas)
        val showBuku:TextView = findViewById(R.id.showBuku)


        btnSubmit.setOnClickListener{

            showNama.text = inputNama.text
            showKelas.text = inputKelas.text
            val kodeBuku:Int = inputKode.text.toString().toInt()

            showBuku.text = when(kodeBuku) {
                123 -> "No Longer Human"
                456 -> "1984"
                789 -> "Fahrenheit 451"
                else -> "ERROR : BUKU NOT FOUND"
            }

            Toast.makeText(
                this,
                "BUKU YANG DIPINJAM : ${showBuku.text}" ,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}