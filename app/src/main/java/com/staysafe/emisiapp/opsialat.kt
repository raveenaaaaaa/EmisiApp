package com.staysafe.emisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class opsialat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opsialat)

        val lanjutopsi = findViewById<Button>(R.id.lanjutopsi)
        lanjutopsi.setOnClickListener{
            val Intent = Intent(this, hitung_alatelektronik::class.java)
            startActivity(Intent)
        }
    }


}