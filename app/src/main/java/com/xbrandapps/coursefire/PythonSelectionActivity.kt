package com.xbrandapps.coursefire

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_java_selection.*
import kotlinx.android.synthetic.main.activity_python_selection.*

class PythonSelectionActivity : AppCompatActivity() {

    override fun onBackPressed() {
        finish()
        overridePendingTransition(R.anim.slide_from_left,R.anim.no_animation)
        val intent = Intent(this,Choose_Activity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_python_selection)

        // BACK BUTTON LOGIC
        backbtn4.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.slide_from_left,R.anim.no_animation)
            val intent = Intent(this,Choose_Activity::class.java)
            startActivity(intent)
        }
        //END

        python_text.visibility = View.VISIBLE
        val animation = AnimationUtils.loadAnimation(this,R.anim.fade_animation)
        python_text.startAnimation(animation)

        begin_button_python.visibility = View.VISIBLE
        val animation2 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
        begin_button_python.startAnimation(animation2)

        inter_button_python.visibility = View.VISIBLE
        val animation3 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
        inter_button_python.startAnimation(animation3)

        advance_button_python.visibility = View.VISIBLE
        val animation4 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
        advance_button_python.startAnimation(animation4)

        //clickable links

        begin_button_python.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=gfDE2a7MKjA")
            )
            startActivity(intent)
        }

        inter_button_python.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=HGOBQPFzWKo")
            )
            startActivity(intent)
        }

        advance_button_python.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=61a7UkDO50s")
            )
            startActivity(intent)
        }
    }
}