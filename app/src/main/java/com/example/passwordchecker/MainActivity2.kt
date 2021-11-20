package com.example.passwordchecker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity2 : AppCompatActivity() {

    private lateinit var editText: TextView
    private lateinit var editText2: TextView
    private lateinit var password: TextView
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        editText = findViewById(R.id.et1)
        editText2 = findViewById(R.id.et2)
        password = findViewById(R.id.pass1)
        button = findViewById(R.id.button1)


        button.setOnClickListener {
            val ragaca = editText.text.toString()
            val ragaca2 = editText2.text.toString()
            val ragaca3 = password.text.toString()
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("firstname", ragaca)
            intent.putExtra("lastname", ragaca2)
            intent.putExtra("password", ragaca3)
            startActivity(intent)
        }

    }





}