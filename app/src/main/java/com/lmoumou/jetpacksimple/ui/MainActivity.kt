package com.lmoumou.jetpacksimple.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.lmoumou.jetpacksimple.R
import com.lmoumou.jetpacksimple.adapter.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val dataList: MutableList<String> by lazy { mutableListOf<String>() }
    private val adapter: MainAdapter by lazy {
        MainAdapter(
            this,
            dataList
        ) { position, view -> onItemClick(position, view) }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniData()

        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = adapter
    }

    private fun iniData() {
        dataList.add("Lifecycle")
    }


    private fun onItemClick(position: Int, view: View) {
        when (position) {
            0 -> {
                LifecycleActivity.startThis(this@MainActivity)
            }
            1 -> {

            }
        }
    }
}
