package com.example.legosystemxp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.HtmlCompat

class Message : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        setTitle(HtmlCompat.fromHtml("<font color= '#FF89BB'> Card Events </font>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}