package com.example.passwordchecker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<TextView>(R.id.info).text = intent?.extras?.getString("firstname", "")
        findViewById<TextView>(R.id.info2).text = intent?.extras?.getString("lastname", "")

        val info = intent?.extras?.getString("password", "")
        findViewById<Button>(R.id.button2).setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("password", info)
            startActivity(intent)
        }


    }
}