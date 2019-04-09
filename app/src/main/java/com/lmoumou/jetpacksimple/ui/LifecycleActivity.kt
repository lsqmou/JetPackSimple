package com.lmoumou.jetpacksimple.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lmoumou.jetpacksimple.MyObserver
import com.lmoumou.jetpacksimple.R

/**
 * @author:Lmoumou
 * @date:2019/4/7
 * 描述:Lifecycle简单使用
 **/
class LifecycleActivity : AppCompatActivity() {

    companion object {
        fun startThis(context: Context) {
            val intent = Intent(context.applicationContext, LifecycleActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        //添加观察者
        lifecycle.addObserver(MyObserver())
    }

}