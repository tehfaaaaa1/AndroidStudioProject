package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val num:TextView = findViewById(R.id.count)
        val up:Button = findViewById(R.id.up)
        val reset:Button = findViewById(R.id.reset)
        val minus:Button = findViewById(R.id.down)
        var countUp:Int = 0

        // NEW : setText = merubah/mengisi text
        // NEW : getText = daud motor listrik

//        num.text = "100"
        reset.setOnClickListener {
            countUp = 0
            num.text = countUp.toString()
        }
        up.setOnClickListener{
            countUp += 1
            num.text = countUp.toString()
        }
        minus.setOnClickListener {
            countUp -= 1
            num.text = countUp.toString()
        }
    }
}