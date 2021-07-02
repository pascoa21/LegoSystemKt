package com.example.legosystemxp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.HtmlCompat

class EventActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)
        setTitle(HtmlCompat.fromHtml("<font color= '#FF89BB'> Card Message </font>", HtmlCompat.FROM_HTML_MODE_LEGACY))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



    }
}