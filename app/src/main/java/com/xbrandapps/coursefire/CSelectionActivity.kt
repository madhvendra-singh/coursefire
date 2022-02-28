package com.xbrandapps.coursefire

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_choose.*
import kotlinx.android.synthetic.main.activity_cselection.*

class CSelectionActivity : AppCompatActivity() {

    override fun onBackPressed() {
        finish()
        overridePendingTransition(R.anim.slide_from_left,R.anim.no_animation)
        val intent = Intent(this,Choose_Activity::class.java)
        startActivity(intent)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cselection)

        // BACK BUTTON LOGIC
        backbtn2.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.slide_from_left,R.anim.no_animation)
            val intent = Intent(this,Choose_Activity::class.java)
            startActivity(intent)
        }
        //END

        c_text.visibility = View.VISIBLE
        val animation = AnimationUtils.loadAnimation(this,R.anim.fade_animation)
        c_text.startAnimation(animation)

        begin_button.visibility = View.VISIBLE
        val animation2 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
        begin_button.startAnimation(animation2)

        inter_button.visibility = View.VISIBLE
        val animation3 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
        inter_button.startAnimation(animation3)

        advance_button.visibility = View.VISIBLE
        val animation4 = AnimationUtils.loadAnimation(this,R.anim.slide_from_right)
        advance_button.startAnimation(animation4)

        //URL BUTTON CLICK CODE

        begin_button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7Dh73z3icd8&list=PLu0W_9lII9aiXlHcLx-mDH1Qul38wD3aR"))
            startActivity(intent)
        }

        inter_button.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/playlist?list=PLu0W_9lII9agpFUAlPFe_VNSlXW5uE0YL")
            )
            startActivity(intent)
        }

        advance_button.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=7arYbAhu0aw&list=PLE28375D4AC946CC3")
            )
            startActivity(intent)
        }

    }
}