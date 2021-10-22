package com.bornikkk.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        R.color.purple_200

        val helloTextYiew: TextView = findViewById(R.id.hello_text_view)
        val randomButton: Button = findViewById(R.id.button)

        helloTextYiew.text = "Hello World123"

        randomButton.setOnClickListener {
            val randVal = Random.nextInt(100)

            helloTextYiew.text = randVal.toString()
        }




        //ctrl + alt + shift + L
    }
}