package com.recon.meditationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.ImageView

class ArticlesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_articles)

        val exit:ImageView = findViewById(R.id.exitIcn)

        val webView : WebView = findViewById(R.id.webViewView);
        // включаем поддержку JavaScript
        webView.getSettings().setJavaScriptEnabled(true);
        // указываем страницу загрузки
        webView.loadUrl("https://www.yogabasics.com/practice/yoga-for-beginners/");

        exit.setOnClickListener{
            val intent = Intent(this@ArticlesActivity,MainActivity::class.java)
            startActivity(intent)
        }

    }
}