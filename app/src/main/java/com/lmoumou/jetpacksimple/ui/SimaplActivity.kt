package com.lmoumou.jetpacksimple.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.lmoumou.jetpacksimple.R
import kotlinx.android.synthetic.main.activity_simaple.*

/**
 * @author:Lmoumou
 * @date:2019/4/10
 * 描述:
 **/
class SimaplActivity : AppCompatActivity() {

    companion object {
        fun startThis(context: Context) {
            val intent = Intent(context.applicationContext, SimaplActivity::class.java)
            context.startActivity(intent)
        }
    }

    private lateinit var navController:NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simaple)

        navController=Navigation.findNavController(this,R.id.garden_nav_fragment)
        appBarConfiguration = AppBarConfiguration(navController.graph, mDrawerLayout)

        // Set up ActionBar
        setSupportActionBar(toolbar)
        setupActionBarWithNavController(navController, appBarConfiguration)

        // Set up navigation menu
        navigationView.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}