package com.xbrandapps.coursefire

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_choose.*
import kotlinx.android.synthetic.main.activity_java_selection.*

class Choose_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)

        c_image.setOnClickListener {
            val intent = Intent(this,CSelectionActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_from_right, R.anim.no_animation)
            finish()
        }

        java_image.setOnClickListener {
            val intent = Intent(this,JavaSelectionActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_from_right,R.anim.no_animation)
            finish()
        }

        python_image.setOnClickListener {
            val intent = Intent(this,PythonSelectionActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_from_right,R.anim.no_animation)
            finish()
        }

        app_image.setOnClickListener {
            val intent = Intent(this, AppSelectionActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_from_right,R.anim.no_animation)
            finish()
        }

        dsa_image.setOnClickListener {
            val intent = Intent(this,DSAActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_from_right,R.anim.no_animation)
            finish()
        }

// BACK BUTTON LOGIC
        backbtn.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.slide_from_left,R.anim.no_animation)
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }



//END

//CHOOSE TEXT TRANSITION

            choose_text.visibility = View.VISIBLE
            val animation001 = AnimationUtils.loadAnimation(this, R.anim.fade_animation)
            choose_text.startAnimation(animation001)



//CODE FOR SLIDING FROM LEFT TRANSITION OF LEFT WALL OF SELECTIONS OR IMAGES

            c_image.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_from_left)
            c_image.startAnimation(animation)

            python_image.visibility = View.VISIBLE
            val animation2 = AnimationUtils.loadAnimation(this, R.anim.slide_from_left)
            python_image.startAnimation(animation2)

            dsa_image.visibility = View.VISIBLE
            val animation3 = AnimationUtils.loadAnimation(this, R.anim.slide_from_left)
            dsa_image.startAnimation(animation3)


//END

//CODE FOR SLIDING FROM RIGHT TRANSITION OF RIGHT WALL OF SELECTION OR IMAGES

            java_image.visibility = View.VISIBLE
            val animation5 = AnimationUtils.loadAnimation(this, R.anim.slide_from_right)
            java_image.startAnimation(animation5)

            app_image.visibility = View.VISIBLE
            val animation6 = AnimationUtils.loadAnimation(this, R.anim.slide_from_right)
            app_image.startAnimation(animation6)

            web_image.visibility = View.VISIBLE
            val animation7 = AnimationUtils.loadAnimation(this, R.anim.slide_from_right)
            web_image.startAnimation(animation7)



//END

        web_image.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=6mbwJ2xhgzM&list=PLu0W_9lII9agiCUZYRsvtGTXdxkzPyItg")
            )
            startActivity(intent)
        }


    }

    override fun onBackPressed() {
        finish()
        overridePendingTransition(R.anim.slide_from_left,R.anim.no_animation)
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}