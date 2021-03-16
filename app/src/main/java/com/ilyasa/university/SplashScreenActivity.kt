package com.ilyasa.university

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splash: ImageView = findViewById(R.id.splash)

        splash.alpha = 0f

        splash.animate().setDuration(1500).alpha(1f).withEndAction {
            val a = Intent(this, MainActivity::class.java)
            startActivity(a)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}