package com.example.myapplication

import android.R
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivitySplashScreenBinding

//procurar sobre esse warning
@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {

    private val splashScreenBinding by lazy { ActivitySplashScreenBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(splashScreenBinding.root)
        goToNextScreen()
    }

    private fun goToNextScreen() {
        with(splashScreenBinding) {

            logoAppImageView.alpha = 0f
            firstTextSplashScreen.alpha = 0f
            secondTextSplashScreen.alpha = 0f

            firstTextSplashScreen.animate().setDuration(1500).alpha(1f)
            secondTextSplashScreen.animate().setDuration(1500).alpha(1f)
            logoAppImageView.animate().setDuration(1500).alpha(1f).withEndAction {
                setNextScreen()
            }
        }
    }

    private fun setNextScreen() {
        val intent = Intent(this@SplashScreenActivity, QuickMovieActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        finish()
    }


}