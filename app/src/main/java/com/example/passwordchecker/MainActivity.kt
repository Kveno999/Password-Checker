package com.example.passwordchecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    private lateinit var password : TextView
    private lateinit var checkedTimes : TextView
    private lateinit var clear: TextView
    val rightPassword = "1234"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        password = findViewById(R.id.textView)
        clear = findViewById(R.id.clear_text)
        checkedTimes = findViewById(R.id.checkedtimes)



    }

    fun clickedView(view:View){
        if (view is TextView){
            var number = view.text.toString()
            var pass = password.text.toString()
            if (pass.length == 4){
                password.text = pass + ""
            }else {
                password.text = pass + number
            }
        }
    }
    fun clear(clear:View){


        password.text = ""
    }
    fun check(view:View){
        if (checkedTimes.text == "3"){
            Toast.makeText(this, "Your mobile is Blocked for 30min", Toast.LENGTH_SHORT).show()
            clear.isClickable = false
            clear(password)

        }else {
            if (password.text == rightPassword){
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
                checkedTimes.text = (checkedTimes.text.toString().toInt() + 1).toString()
            }else {
                Toast.makeText(this, "No!", Toast.LENGTH_SHORT).show()
                checkedTimes.text = (checkedTimes.text.toString().toInt() + 1).toString()

            }
        }

    }

}