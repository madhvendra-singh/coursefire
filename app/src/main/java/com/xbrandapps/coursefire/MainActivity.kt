package com.xbrandapps.coursefire

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        coursefire_text.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_animation)
            coursefire_text.startAnimation(animation)

        Here_to_help_text.visibility = View.VISIBLE
        val animation2 = AnimationUtils.loadAnimation(this, R.anim.slide_from_left)
        Here_to_help_text.startAnimation(animation2)

        imageView.visibility = View.VISIBLE
        val animation3 = AnimationUtils.loadAnimation(this, R.anim.slide_from_right)
        imageView.startAnimation(animation3)

        get_started.visibility = View.VISIBLE
        val animation4 = AnimationUtils.loadAnimation(this, R.anim.fade_animation)
        get_started.startAnimation(animation4)

        get_started.setOnClickListener {
            val intent = Intent(this,Choose_Activity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_from_right, R.anim.no_animation)
            finish()
        }
    }


}

