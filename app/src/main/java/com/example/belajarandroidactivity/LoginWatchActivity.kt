package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class LoginWatchActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_watch)

        val cinUsername : EditText = findViewById(R.id.cinUsername)
        val cinPass : EditText = findViewById(R.id.cinPass)
        val btnSignIn : Button = findViewById(R.id.btnSignIn)
        val incorrectPass : TextView = findViewById(R.id.incorrectPass)
        val username = "inkAja"
        val pass = "daud"

        btnSignIn.setOnClickListener {
            if (cinUsername.text.toString() == username && cinPass.text.toString() == pass) {
                Toast.makeText(
                    this, "LOGIN SUCCESS", Toast.LENGTH_SHORT
                ).show()
                incorrectPass.visibility = View.INVISIBLE
            } else {
                incorrectPass.visibility = View.VISIBLE
            }
        }
    }
}