package com.invalid.basicapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.invalid.basicapp.R
import com.invalid.basicapp.ui.AccountFragment
import com.invalid.basicapp.ui.DashboardFragment
import com.invalid.basicapp.ui.HomeFragment

class MainActivity : AppCompatActivity() {

	private val fm: FragmentManager = supportFragmentManager

	private val fragmentHome: Fragment = HomeFragment()
	private val fragmentDashboard: Fragment = DashboardFragment()
	private var fragmentAccount: Fragment = AccountFragment()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		setFragment(fragmentHome)
		setBottomNav()
	}

	private fun setFragment(fragment: Fragment) {
		fm.beginTransaction().apply {
			replace(R.id.nav_host, fragment)
			commit()
		}
	}

	private fun setBottomNav() {

		val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
		bottomNavigationView.setOnItemSelectedListener { item ->

			when (item.itemId) {
				R.id.navigation_home -> setFragment(fragmentHome)
				R.id.navigation_dashboard -> setFragment(fragmentDashboard)
				R.id.navigation_account -> setFragment(fragmentAccount)
			}
			true
		}
	}

}