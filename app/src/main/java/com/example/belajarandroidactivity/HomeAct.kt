package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class HomeAct : AppCompatActivity() {
    var btnShare: MaterialButton? = null
    var btnPindah: MaterialButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnShare = findViewById(R.id.btnShare)
        btnPindah = findViewById(R.id.btnPindah)

        btnPindah!!.setOnClickListener{
            val intent = Intent(this,DetailActivity::class.java)
            startActivity(intent)
        }

        btnShare!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"Saya mau latte")
            intent.setType("text/plain")
            startActivity(Intent.createChooser(intent, "SHARE TO : "))
        }
    }
}