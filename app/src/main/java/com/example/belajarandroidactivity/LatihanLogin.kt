package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class LatihanLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_login)

        var inputUsername: EditText = findViewById(R.id.inputUsernameTxt)
        var inputPassword: EditText = findViewById(R.id.inputTextPassword)
        var btnSubmit : Button = findViewById(R.id.button2)
        var salah : TextView = findViewById(R.id.tvWrong)

        var username = inputUsername.text.toString()
        var password = inputPassword.text.toString()

        btnSubmit.setOnClickListener {
            if (username == "daud" && password == "inkAja") {
                val intent = Intent(this, DashboardStore::class.java)
                startActivity(intent)
                salah.visibility = View.GONE
            }
            else {
                salah.visibility = View.VISIBLE
            }
        }
    }
}