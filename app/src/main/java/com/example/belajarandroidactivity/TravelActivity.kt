package com.example.belajarandroidactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {
    // ? => boleh null
    var ibCall: ImageButton? = null
    var ibNav:ImageButton? = null
    var ibShare:ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)

        ibCall = findViewById(R.id.ibCall)
        ibNav = findViewById(R.id.ibNav)
        ibShare = findViewById(R.id.ibShare)

        ibCall!!.setOnClickListener {
            val phoneNumber = "087891711085"
            val phoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $phoneNumber"))
            startActivity(phoneIntent)
        }

        ibNav!!.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo: -6.452578, 106.693298"))
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
    }
}