package com.example.lectureattendance.views.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.lectureattendance.R
import com.example.lectureattendance.hawkstorage.HawkStorage
import com.example.lectureattendance.views.login.LoginActivity
import com.example.lectureattendance.views.main.MainActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val splashTime: Long = 3000

        Handler().postDelayed({

            checkIsLogin()

        }, splashTime)

    }

    private fun checkIsLogin() {
        val isLogin = HawkStorage.instance(this).isLogin()
        if (isLogin){
            startActivity(Intent(this, MainActivity::class.java))
            finishAffinity()
        }else{
            startActivity(Intent(this, LoginActivity::class.java))
            finishAffinity()
        }
    }

}