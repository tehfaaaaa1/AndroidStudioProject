package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import org.w3c.dom.Text

class LatihanLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_login)

        var inputUsername: EditText = findViewById(R.id.inputUsernameTxt)
        var inputPassword: EditText = findViewById(R.id.inputTextPassword)
        var btnSubmit : Button = findViewById(R.id.button2)
        var salah : TextView = findViewById(R.id.tvWrong)

        val username = "daud"
        val password = "inkAja"

        btnSubmit.setOnClickListener {
            if (inputUsername.text.toString() == username &&
                    inputPassword.text.toString() == password) {
                val intent = Intent(this, DashboardStore::class.java)
                startActivity(intent)
                salah.visibility = View.GONE

                finish()
            }
            else if (inputUsername.text.toString().isEmpty()
                || inputPassword.text.toString().isEmpty()) {
                salah.text = "Username or password required."
                salah.visibility = View.VISIBLE
            }
            else {
                salah.text = "Wrong Username or Password.\nPlease try again."
                salah.visibility = View.VISIBLE
                var builder = AlertDialog.Builder(this)
                builder.setTitle("Alert!")
                builder.setMessage("Wrong Username or Password!")
                builder.setPositiveButton("Ampun Bang \uD83D\uDE4F") {
                    dialog,which->
                }
                var alertDialog = builder.create()
                alertDialog.show()
            }
        }
    }
}