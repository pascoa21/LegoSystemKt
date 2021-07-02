package com.example.legosystemxp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.HtmlCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(HtmlCompat.fromHtml("<font color= '#FF89BB'> Lego System </font>",HtmlCompat.FROM_HTML_MODE_LEGACY))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        buttonPrimary.setOnClickListener{
            this.eventActivity()
        }

        buttonSecondary.setOnClickListener{
            this.messageActivity()
        }

    }

    fun eventActivity() {
        val intent =  Intent(this, EventActivity::class .java)
        startActivity(intent)
    }

    fun messageActivity(){
        val intent= Intent(this, Message::class.java)
        startActivity(intent)
    }


}