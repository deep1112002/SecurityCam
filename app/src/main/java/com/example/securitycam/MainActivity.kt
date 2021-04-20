package com.example.securitycam

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val submit=findViewById<Button>(R.id.submitButton)
        val text=findViewById<EditText>(R.id.editTextTextIP)
        submit.setOnClickListener(){
            val url = "http://"+text.text.toString()
            val builder=CustomTabsIntent.Builder()
            val customTabsIntent=builder.build()
            customTabsIntent.launchUrl(this,Uri.parse(url))

        }

    }


}