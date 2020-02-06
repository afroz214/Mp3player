package com.smartherd.mp3player

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun playMusic(button:View){

        val btn = button as Button
        val mediaPlayer = MediaPlayer.create(this, resources.getIdentifier(btn.tag as String, "raw", packageName))
        mediaPlayer.start()
    }
}
