package com.lmoumou.jetpacksimple.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lmoumou.jetpacksimple.R

/**
 * @author:Lmoumou
 * @date:2019/4/10
 * 描述:
 **/
class PlantDetailFragment:Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_plant_detail,null)
    }
}