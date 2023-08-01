package com.recon.meditationapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout


class MeditationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditation)

        var playerForest: MediaPlayer = MediaPlayer.create(this, R.raw.forest_sounds)

        val forestButton : LinearLayout = findViewById(R.id.forestSoundsBt)
        val stopButon : Button = findViewById(R.id.stopBt)



        stopButon.setOnClickListener{
            if(playerForest.isPlaying){
                playerForest.pause()
                playerForest.seekTo(0)
            }
            }
        forestButton.setOnClickListener{
            if(playerForest == null){
                playerForest = MediaPlayer.create(this, R.raw.forest_sounds)
            }
            if(!playerForest.isPlaying) {
                playerForest.start()
            }
        }
        }
    }
