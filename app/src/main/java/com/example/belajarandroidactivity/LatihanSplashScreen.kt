package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LatihanSplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_splash_screen)

//        Panggil Handler() dari package OS
//        postDelayed => Run action after delay
        Handler().postDelayed({
            val intent = Intent(this, LatihanLogin::class.java)
            startActivity(intent)

            finish()
        }, 3000)
    }
}