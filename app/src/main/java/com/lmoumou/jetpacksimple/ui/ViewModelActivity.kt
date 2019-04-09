package com.lmoumou.jetpacksimple.ui

import android.annotation.SuppressLint
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lmoumou.jetpacksimple.R
import com.lmoumou.jetpacksimple.viewmodel.NameVM
import kotlinx.android.synthetic.main.activity_viewmodel.*

/**
 * @author:Lmoumou
 * @date:2019/4/10
 * 描述:
 **/
class ViewModelActivity : AppCompatActivity() {

    companion object {
        fun startThis(content: Context) {
            val intent = Intent(content.applicationContext, ViewModelActivity::class.java)
            content.startActivity(intent)
        }
    }

    private lateinit var model: NameVM

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewmodel)

        model = ViewModelProviders.of(this).get(NameVM::class.java)

        val nameObserver = Observer<String> { t -> nameTv.text = "当前Name:$t" }

        model.currentName.observe(this, nameObserver)

        mButton.setOnClickListener {
            model.currentName.value = "${nameEdt.text}"
        }
    }
}