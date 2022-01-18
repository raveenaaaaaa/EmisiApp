package com.staysafe.emisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlin.math.sign

class signUp : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnSignup: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btnSignup = findViewById(R.id.btn_signup)
        btnSignup.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_signup -> {
                val intentBiasa = Intent(this@signUp, signIn::class.java)
                startActivity(intentBiasa)
            }
        }
    }

}