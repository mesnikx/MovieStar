package com.example.moviestar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView: TextView = findViewById(R.id.first_main_activity_text_view)

        textView.setOnClickListener { moveToNextScreen() }
    }
    private fun moveToNextScreen(){
        val intent = Intent(this, MovieDetails::class.java)
        startActivity(intent)
    }
}