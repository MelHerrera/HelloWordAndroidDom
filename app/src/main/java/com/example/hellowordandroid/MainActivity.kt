package com.example.hellowordandroid

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


      /*  val txtHola = findViewById<TextView>(R.id.txtHola)
        val userNameLog = "mherrera"

        txtHola.text = "Hola ${userNameLog}"

       */

        val txtUser = findViewById<EditText>(R.id.edtName)
        val btnSaludar = findViewById<Button>(R.id.btnSaludar)

        btnSaludar.setOnClickListener {
            val myMessageToas = Toast.makeText(this, txtUser.text, Toast.LENGTH_LONG)

            myMessageToas.show()
        }

    }
}