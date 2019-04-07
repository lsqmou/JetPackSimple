package com.lmoumou.jetpacksimple.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lmoumou.jetpacksimple.R
import kotlinx.android.synthetic.main.item_main.view.*

/**
 * @author:Lmoumou
 * @date:2019/4/7
 * 描述:
 **/
class MainAdapter(
    private val context: Context,
    private val dataList: MutableList<String>,
    private val onItemClick: (position: Int, view: View) -> Unit
) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    private val mInflater: LayoutInflater by lazy { LayoutInflater.from(context) }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(mInflater.inflate(R.layout.item_main, parent, false))
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.itemView.mTextView.text = dataList[position]

        holder.itemView.setOnClickListener {
            onItemClick(position, it)
        }
    }


    inner class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}