package com.xbrandapps.coursefire

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_dsaactivity.*
import kotlinx.android.synthetic.main.activity_java_selection.*

class DSAActivity : AppCompatActivity() {

    override fun onBackPressed() {
        finish()
        overridePendingTransition(R.anim.slide_from_left,R.anim.no_animation)
        val intent = Intent(this,Choose_Activity::class.java)
        startActivity(intent)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dsaactivity)

        // BACK BUTTON LOGIC
        backbtn7.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.slide_from_left, R.anim.no_animation)
            val intent = Intent(this, Choose_Activity::class.java)
            startActivity(intent)
        }

            //END

            dsa_text.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(this,R.anim.fade_animation)
            dsa_text.startAnimation(animation)

            dsa_btn_c.visibility = View.VISIBLE
            val animation2 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
            dsa_btn_c.startAnimation(animation2)

            dsa_btn_java.visibility = View.VISIBLE
            val animation3 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
            dsa_btn_java.startAnimation(animation3)

            dsa_btn_py.visibility = View.VISIBLE
            val animation4 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
            dsa_btn_py.startAnimation(animation4)

        //Clickable Links

        dsa_btn_c.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=B31LgI4Y4DQ")
            )
            startActivity(intent)
        }

        dsa_btn_java.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=_HRA37X8N_Q&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ")
            )
            startActivity(intent)
        }

        dsa_btn_py.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=pkYVOmU3MgA")
            )
            startActivity(intent)
        }

    }
}