package com.example.applicationtabs

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import android.widget.Toolbar
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var  toolbar: androidx.appcompat.widget.Toolbar
    private lateinit var tabHost: TabLayout

    @SuppressLint("UseCompatLoadingForDrawables", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        tabHost = findViewById(R.id.tab_host)

       tabHost.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
           override fun onTabSelected(tab: TabLayout.Tab?) {
               Toast.makeText(this@MainActivity,tab?.text.toString(), Toast.LENGTH_SHORT).show()
           }

           override fun onTabUnselected(tab: TabLayout.Tab?) {
               Toast.makeText(this@MainActivity,"onTabUnselected ${tab?.text}", Toast.LENGTH_SHORT).show()
           }

           override fun onTabReselected(tab: TabLayout.Tab?) {
               Toast.makeText(this@MainActivity,"onTabReselected", Toast.LENGTH_SHORT).show()
           }

       })




    }


}