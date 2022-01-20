package com.staysafe.emisiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class hitung_alatelektronik : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_alatelektronik)

        val inputtext = findViewById<EditText>(R.id.inputenergi)
        val faktoremisi = findViewById<TextView>(R.id.textView9)
        val GWP = findViewById<TextView>(R.id.textView13)
        val hasil = findViewById<TextView>(R.id.outputalat)
        val bHitung = findViewById<Button>(R.id.hasilalat)
        val reset= findViewById<Button>(R.id.reset)
        val next = findViewById<Button>(R.id.lanjutalat)

        faktoremisi.text = "0.77388897"
        GWP.text = "1"

        bHitung.setOnClickListener {
            //validasi nilai dari edittext
            if (inputtext.text.toString() == "") {
                inputtext.error = "Jumlah energi harus diisi"
                return@setOnClickListener
            }

            //mengambil nilai dari edittext
            val nilai = inputtext.text.toString().toDouble()
            var f = faktoremisi.text.toString().toDouble()
            var g = GWP.text.toString().toDouble()

            val result = nilai * f * g
            hasil.text = result.toString()
        }

        reset.setOnClickListener{
            inputtext.getText().clear()
            GWP.text = " "
            faktoremisi.text = " "
            hasil.text = " "
        }

    }
}