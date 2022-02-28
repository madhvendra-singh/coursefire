package com.xbrandapps.coursefire

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        coursefire_text_splash.visibility = View.VISIBLE
        val animation = AnimationUtils.loadAnimation(this,R.anim.slide_from_left)
        coursefire_text_splash.startAnimation(animation)

        here_to_help_text_splash.visibility = View.VISIBLE
        val animation2 = AnimationUtils.loadAnimation(this,R.anim.fade_animation)
        here_to_help_text_splash.startAnimation(animation2)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // we used the postDelayed(Runnable, time) method
        // to send a message with a delayed time.
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.


    }
}