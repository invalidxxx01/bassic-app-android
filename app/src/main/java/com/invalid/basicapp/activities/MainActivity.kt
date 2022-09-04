package com.invalid.basicapp.activities

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.invalid.basicapp.R

class MainActivity : AppCompatActivity() {

//	private lateinit var binding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

//		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(R.layout.activity_main)

//		val navView: BottomNavigationView = binding.navView
		val navView: BottomNavigationView = findViewById(R.id.nav_view)

		val navController = findNavController(R.id.nav_host_fragment_activity_main)

		navView.setupWithNavController(navController)
	}
}