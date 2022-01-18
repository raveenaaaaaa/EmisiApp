package com.staysafe.emisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class signIn : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnlogin: Button
    private lateinit var txtview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        txtview = findViewById(R.id.txtsignup)
        txtview.setOnClickListener(this)

        btnlogin = findViewById(R.id.btn_login)
        btnlogin.setOnClickListener(this)
    }


    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_login ->{
                val intentBiasa = Intent(this@signIn,homeActivity::class.java)
                startActivity(intentBiasa)
            }
            R.id.txtsignup ->{
                val intentBiasa = Intent(this@signIn,signUp::class.java)
                startActivity(intentBiasa)
            }
        }
    }


}