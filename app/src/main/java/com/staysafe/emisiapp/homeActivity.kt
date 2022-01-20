package com.staysafe.emisiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class homeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnimage : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnimage = findViewById(R.id.btnprofil)
        btnimage.setOnClickListener(this)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomnav)
        val navController = findNavController(R.id.fragment)

        bottomNavigationView.setupWithNavController(navController)



    }


    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnprofil -> {
                val intentBiasa = Intent(this@homeActivity, profilActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }

    private fun setOnClickListener(mainActivity: homeActivity): Button {
        TODO("Not yet implemented")
    }
}




