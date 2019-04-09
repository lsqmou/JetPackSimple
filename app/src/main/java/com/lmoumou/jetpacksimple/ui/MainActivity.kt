package com.lmoumou.jetpacksimple.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.lmoumou.jetpacksimple.R
import com.lmoumou.jetpacksimple.adapter.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val dataList: MutableList<String> by lazy { mutableListOf<String>() }
    private val adapter: MainAdapter by lazy {
        MainAdapter(
            this,
            dataList
        ) { position, _ -> onItemClick(position) }
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
        dataList.add("ViewModel")
        dataList.add("Navigation")
        dataList.add("Simple")
    }


    private fun onItemClick(position: Int) {
        when (position) {
            0 -> {
                LifecycleActivity.startThis(this@MainActivity)
            }
            1 -> {
                ViewModelActivity.startThis(this@MainActivity)
            }
            2 -> {

            }
            3 -> {
                SimaplActivity.startThis(this@MainActivity)
            }
        }
    }
}
