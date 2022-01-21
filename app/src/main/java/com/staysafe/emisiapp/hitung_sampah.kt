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

        val inputtext2 = findViewById<EditText>(R.id.quantity_textview)
        val faktoremisi2 = findViewById<TextView>(R.id.emisifaktorsampah)
        val hasil2 = findViewById<TextView>(R.id.hasilsampah)
        val bHitung2 = findViewById<Button>(R.id.hitungsampah)
        val reset2 = findViewById<Button>(R.id.resetsampah)
        val next2 = findViewById<Button>(R.id.lanjutsampah)

        faktoremisi2.text = "0.427"

        bHitung2.setOnClickListener {
            //validasi nilai dari edittext
            if (inputtext2.text.toString() == "") {
                inputtext2.error = "Berat sampah harus diisi"
                return@setOnClickListener
            }

            //mengambil nilai dari edittext
            val nilai2 = inputtext2.text.toString().toDouble()
            var f = faktoremisi2.text.toString().toDouble()

            val result = nilai2 * f
            hasil2.text = result.toString()
        }

        reset2.setOnClickListener{
            inputtext2.getText().clear()
            faktoremisi2.text = " "
            hasil2.text = " "
        }

    }
}
