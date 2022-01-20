package com.staysafe.emisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class hitung_transportasi_motor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_transportasi_motor)

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

        val inputtext = findViewById<EditText>(R.id.jarak2)
        val faktoremisi = findViewById<TextView>(R.id.textView19)
        val hasil = findViewById<TextView>(R.id.hasilmotor)
        val bHitung = findViewById<Button>(R.id.hitungmotor)
        val reset = findViewById<Button>(R.id.resetmotor)
        val next = findViewById<Button>(R.id.lanjutmotor)

        val datapin = resources.getStringArray(R.array.jumlahkendaraan)
        val jk = findViewById<Spinner>(R.id.spinner)


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
                        this@hitung_transportasi_motor,
                        getString(R.string.selected_item) + " " +
                                "" + datapin[position], Toast.LENGTH_SHORT
                    ).show()

                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }

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

        }



    }
}