package com.recon.meditationapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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

        card_articles = findViewById(R.id.articles_card)
        card_articles.setOnClickListener{RunArticles()}
    }

    fun RunMedi(){
        val intent = Intent(this@MainActivity,MeditationActivity::class.java)
//        try {
//            Thread.sleep(1000) //Приостанавливает поток на 1 секунду
//            }
//        catch (e: Exception) { }
        startActivity(intent)
    }
    fun RunAbout(){
        val intent = Intent(this@MainActivity,AboutActivity::class.java)
        startActivity(intent)
    }
    fun RunArticles(){
        val intent = Intent(this@MainActivity,ArticlesActivity::class.java)
        startActivity(intent)
    }
}