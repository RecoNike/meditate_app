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
        var playerBeach: MediaPlayer = MediaPlayer.create(this, R.raw.beach_sounds)

        var isPaused: Boolean = false
        val forestButton : LinearLayout = findViewById(R.id.forestSoundsBt)
        val oceanButton : LinearLayout = findViewById(R.id.oceanSoundsBt)
        val stopButon : Button = findViewById(R.id.stopBt)
        //val startButton : Button = findViewById(R.id.startBt)
        val pauseButon : Button = findViewById(R.id.pauseBt)


        fun PauseFun(){
            if(playerForest.isPlaying && !isPaused){
                playerForest.pause()
                isPaused = true
                pauseButon.setBackgroundResource(R.drawable.play_icon)
                return
            }
            if(playerBeach.isPlaying && !isPaused){
                playerBeach.pause()
                isPaused = true
                pauseButon.setBackgroundResource(R.drawable.play_icon)
                return
            }

            if(!playerForest.isPlaying && playerForest.getCurrentPosition() > 0){
                playerForest.start()
                isPaused = false
                return
                pauseButon.setBackgroundResource(R.drawable.pause_icon)
            }
            if(!playerBeach.isPlaying && playerBeach.getCurrentPosition() > 0){
                playerBeach.start()
                isPaused = false
                pauseButon.setBackgroundResource(R.drawable.pause_icon)
                return
            }
        }

        stopButon.setOnClickListener{
            if(playerForest.isPlaying){
                playerForest.pause()
                playerForest.seekTo(0)
                pauseButon.setBackgroundResource(R.drawable.pause_icon)
            }
            if(playerBeach.isPlaying){
                playerBeach.pause()
                playerBeach.seekTo(0)
                pauseButon.setBackgroundResource(R.drawable.pause_icon)
            }
        }
        forestButton.setOnClickListener{
            if(playerForest == null){
                playerForest = MediaPlayer.create(this, R.raw.forest_sounds)
            }
            if(!playerForest.isPlaying && !playerBeach.isPlaying) {
                playerForest.start()
                pauseButon.setBackgroundResource(R.drawable.pause_icon)
            }
        }

        oceanButton.setOnClickListener{
            if(playerBeach == null){
                playerBeach = MediaPlayer.create(this, R.raw.forest_sounds)
            }
            if(!playerBeach.isPlaying && !playerForest.isPlaying) {
                playerBeach.start()
                pauseButon.setBackgroundResource(R.drawable.pause_icon)
            }
        }

        pauseButon.setOnClickListener(){PauseFun()}
        }
    }
