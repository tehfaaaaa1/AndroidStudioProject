package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenDoaAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_doa)

//        Panggil Handler() dari package OS
//        postDelayed => Run action after delay
        Handler().postDelayed({
            val intent = Intent(this, BelajarNgajiActivity::class.java)
            startActivity(intent)

            finish()
        }, 3000)
    }
}