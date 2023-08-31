
package com.example.belajarandroidactivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class CalculatorAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val num1:EditText = findViewById(R.id.num1)
        val num2:EditText = findViewById(R.id.num2)

        val plus:Button = findViewById(R.id.plus)
        val minus:Button = findViewById(R.id.min)
        val percent:Button = findViewById(R.id.percent)
        val multiply:Button = findViewById(R.id.multiply)
        val divide:Button = findViewById(R.id.divide)
        val clear:Button = findViewById(R.id.clear)

        val result:TextView = findViewById(R.id.result)
        var count: Int

        val builder : AlertDialog.Builder =
            AlertDialog.Builder(this@CalculatorAct)

        plus.setOnClickListener {
            count = num1.text.toString().toInt() + num2.text.toString().toInt()
            result.text = count.toString()
        }
        minus.setOnClickListener {
            count = num1.text.toString().toInt() - num2.text.toString().toInt()
            result.text = count.toString()
        }
        percent.setOnClickListener {
            count = num1.text.toString().toInt() % num2.text.toString().toInt()
            result.text = count.toString()
        }
        multiply.setOnClickListener {
            count = num1.text.toString().toInt() * num2.text.toString().toInt()
            result.text = count.toString()
        }
        divide.setOnClickListener {
            count = num1.text.toString().toInt() / num2.text.toString().toInt()
            result.text = count.toString()
        }
        clear.setOnClickListener {
            // Buat Popup / Alert dengan menentukan
            // Title, Message, dan cancel
            builder.setTitle("Perhatian !!!")
            builder.setMessage("Apakah kamu yakin ingin menghapus angkanya?")
            builder.setCancelable(false)
            builder.setPositiveButton(
                "YES",
                DialogInterface.OnClickListener { dialog, which ->
                    count = 0
                    num1.setText("")
                    num2.setText("")
                    result.text = count.toString()
                }
            )
            builder.setNegativeButton(
                "CANCEL",
                DialogInterface.OnClickListener { dialog, which ->  }
            )
            builder.setIcon(R.drawable.info32)
            // MEMBUAT POP UP
            val alertDialog:AlertDialog = builder.create()
            // MENUNJUKKAN POP UP
            alertDialog.show()
        }
    }
}