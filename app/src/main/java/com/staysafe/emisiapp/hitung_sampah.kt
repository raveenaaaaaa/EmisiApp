package com.staysafe.emisiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class hitung_sampah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_sampah)

        val inputtext = findViewById<EditText>(R.id.quantity_textview)
        val faktoremisi = findViewById<TextView>(R.id.emisifaktorsampah)
        val hasil = findViewById<TextView>(R.id.hasilsampah)
        val bHitung = findViewById<Button>(R.id.hitungsampah)
        val reset= findViewById<Button>(R.id.resetsampah)
        val next = findViewById<Button>(R.id.lanjutsampah)

        faktoremisi.text = "0.427"

        bHitung.setOnClickListener {
            //validasi nilai dari edittext
            if (inputtext.text.toString() == "") {
                inputtext.error = "Berat sampah harus diisi"
                return@setOnClickListener
            }

            //mengambil nilai dari edittext
            val nilai = inputtext.text.toString().toDouble()
            var f = faktoremisi.text.toString().toDouble()

            val result = nilai * f
            hasil.text = result.toString()
        }

        reset.setOnClickListener{
            inputtext.getText().clear()
            faktoremisi.text = " "
            hasil.text = " "
        }

    }
}
