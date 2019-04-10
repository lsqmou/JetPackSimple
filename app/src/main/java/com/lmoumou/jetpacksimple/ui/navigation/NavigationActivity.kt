package com.lmoumou.jetpacksimple.ui.navigation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.lmoumou.jetpacksimple.R
import kotlinx.android.synthetic.main.activity_navigation.*

/**
 * @author:Lmoumou
 * @date:2019/4/10
 * 描述:
 **/
class NavigationActivity : AppCompatActivity() {

    companion object {
        fun startThis(context: Context) {
            val intent = Intent(context.applicationContext, NavigationActivity::class.java)
            context.startActivity(intent)
        }
    }

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)
        navController=Navigation.findNavController(this,R.id.navFragment)
        mRadioGroup.setOnCheckedChangeListener { _, checkedId ->
            when(checkedId){
                R.id.oneRb->{
                    navController.navigate(R.id.nav_simple_first_frag)
                }
                R.id.twoRb->{
                    navController.navigate(R.id.nav_simple_two_frag)
                }
                R.id.threeRb->{
                    navController.navigate(R.id.nav_simple_first_frag)
                }
            }
        }
    }
}