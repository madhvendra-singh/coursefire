package com.xbrandapps.coursefire

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_cselection.*
import kotlinx.android.synthetic.main.activity_java_selection.*

class JavaSelectionActivity : AppCompatActivity() {

    override fun onBackPressed() {
        finish()
        overridePendingTransition(R.anim.slide_from_left,R.anim.no_animation)
        val intent = Intent(this,Choose_Activity::class.java)
        startActivity(intent)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java_selection)

        // BACK BUTTON LOGIC
        backbtn3.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.slide_from_left,R.anim.no_animation)
            val intent = Intent(this,Choose_Activity::class.java)
            startActivity(intent)
        }
        //END

        java_text.visibility = View.VISIBLE
        val animation = AnimationUtils.loadAnimation(this,R.anim.fade_animation)
        java_text.startAnimation(animation)

        begin_button_java.visibility = View.VISIBLE
        val animation2 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
        begin_button_java.startAnimation(animation2)

        inter_button_java.visibility = View.VISIBLE
        val animation3 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
        inter_button_java.startAnimation(animation3)

        advance_button_java.visibility = View.VISIBLE
        val animation4 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
        advance_button_java.startAnimation(animation4)

        //Clickable Links

        begin_button_java.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=az6SehZyY7U&list=PL59LTecnGM1NRUyune3SxzZlYpZezK-oQ")
            )
            startActivity(intent)
        }

        inter_button_java.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=sk9xYje9XAQ&list=PL59LTecnGM1Mg6I4i_KbS0w5bPcDjl7oz")
            )
            startActivity(intent)
        }

        advance_button_java.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=sE0sH8vSmE4&list=PL59LTecnGM1Pr-IoQS2JlTnEXOV28-KNg")
            )
            startActivity(intent)
        }



    }
}