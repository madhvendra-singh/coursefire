package com.xbrandapps.coursefire

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_app_selection.*
import kotlinx.android.synthetic.main.activity_python_selection.*

class AppSelectionActivity : AppCompatActivity() {

    override fun onBackPressed() {
        finish()
        overridePendingTransition(R.anim.slide_from_left,R.anim.no_animation)
        val intent = Intent(this,Choose_Activity::class.java)
        startActivity(intent)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_selection)

        // BACK BUTTON LOGIC
        backbtn5.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.slide_from_left,R.anim.no_animation)
            val intent = Intent(this,Choose_Activity::class.java)
            startActivity(intent)
        }
        //END

        app_text.visibility = View.VISIBLE
        val animation = AnimationUtils.loadAnimation(this,R.anim.fade_animation)
        app_text.startAnimation(animation)

        android_button.visibility = View.VISIBLE
        val animation2 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
        android_button.startAnimation(animation2)

        ios_button.visibility = View.VISIBLE
        val animation3 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
        ios_button.startAnimation(animation3)

        //CLICKABLE

        android_button.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=EplH-amHTtE&list=PLUhfM8afLE_Ok-0Lx2v9hfrmbxi3GgsX1")
            )
            startActivity(intent)
        }

        ios_button.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=xVPGQEHok74&list=PLpZBns8dFbgx0gr68lf-un9EjdmywTu4_")
            )
            startActivity(intent)
        }


    }
}