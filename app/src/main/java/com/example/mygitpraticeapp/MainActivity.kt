package com.example.mygitpraticeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Toast.makeText(this,"MADE BY MANDEEPGMAIL_GITHUB",Toast.LENGTH_SHORT).show()
    }
}