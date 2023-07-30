package com.recon.meditationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    lateinit var card_meditation : CardView
    lateinit var card_statistics : CardView
    lateinit var card_articles : CardView
    lateinit var card_about : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        card_meditation = findViewById(R.id.meditate_card)
        card_meditation.setOnClickListener{RunMedi()}

        card_about = findViewById(R.id.credits_card)
        card_about.setOnClickListener{RunAbout()}

    }

    fun RunMedi(){
        val intent = Intent(this@MainActivity,MeditationActivity::class.java)
        startActivity(intent)
    }
    fun RunAbout(){
        val intent = Intent(this@MainActivity,AboutActivity::class.java)
        startActivity(intent)
    }
}