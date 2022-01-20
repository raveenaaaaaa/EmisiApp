package com.staysafe.emisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.*
import android.widget.Toast
import android.widget.ArrayAdapter
import android.widget.AdapterView
import androidx.core.view.get

class hitung_transportasi_mobil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_transportasi_mobil)

        val mtr = findViewById<Button>(R.id.motor)
        mtr.setOnClickListener{
            val Intent = Intent(this, hitung_transportasi_motor::class.java)
            startActivity(Intent)
        }

        val mbl = findViewById<Button>(R.id.mobil)
        mbl.setOnClickListener{
            val Intent = Intent(this, hitung_transportasi_mobil::class.java)
            startActivity(Intent)
        }

        val inputtext = findViewById<EditText>(R.id.jarak)
        val faktoremisi = findViewById<TextView>(R.id.textView20)
        val hasil = findViewById<TextView>(R.id.hasilmobil)
        val bHitung = findViewById<Button>(R.id.hitungmobil)
        val reset = findViewById<Button>(R.id.resetmobil)
        val next = findViewById<Button>(R.id.lanjutmobil)

        //data string spinner
        val datapin = resources.getStringArray(R.array.jumlahkendaraan)
        val jk = findViewById<Spinner>(R.id.spinner)

        val datapin2 = resources.getStringArray(R.array.bahanbakar)
        val bahan = findViewById<Spinner>(R.id.spinner2)



        if (jk != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, datapin
            )
            jk.adapter = adapter

            jk.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    Toast.makeText(
                        this@hitung_transportasi_mobil,
                        getString(R.string.selected_item) + " " +
                                "" + datapin[position], Toast.LENGTH_SHORT
                    ).show()

                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }

        }

        if (bahan != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, datapin2
            )
            bahan.adapter = adapter

            bahan.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    Toast.makeText(
                        this@hitung_transportasi_mobil,
                        getString(R.string.selected_item2) + " " +
                                "" + datapin[position], Toast.LENGTH_SHORT
                    ).show()

                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }

        }

        if(bahan.selectedItem.toString() == "Solar"){
            faktoremisi.text = "0.0028"
        }
        else{
            faktoremisi.text ="0.04"
        }

        bHitung.setOnClickListener {
            //validasi nilai dari edittext
            if (inputtext.text.toString() == "") {
                inputtext.error = "Berat sampah harus diisi"
                return@setOnClickListener
            }

            //mengambil nilai dari edittext
            val nilai = inputtext.text.toString().toDouble()
            var f = faktoremisi.text.toString().toDouble()
            var j = jk.selectedItem.toString().toDouble()

            val result = nilai * f * j
            hasil.text = result.toString()
        }

        reset.setOnClickListener{
            inputtext.getText().clear()
            faktoremisi.text = " "
            hasil.text = " "
            jk.setSelection(0)
            bahan.setSelection(0)
        }


    }
}
