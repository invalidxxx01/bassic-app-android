package com.invalid.basicapp.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ProgressBar
import com.invalid.basicapp.R

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

	lateinit var load : ProgressBar
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_splash)


		Handler(Looper.myLooper()!!).postDelayed(
			{
				val intent = Intent(this, MainActivity::class.java)
				startActivity(intent)
				finish()
			},3500
		)
	}
}