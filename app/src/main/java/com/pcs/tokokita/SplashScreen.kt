package com.pcs.tokokita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        var handler = Handler ()
        handler.postDelayed({
            var intent = Intent(this@SplashScreen, LoginActivity::class.java)
            startActivity(intent)
        }, 5000)
    }
}