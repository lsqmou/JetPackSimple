package com.lmoumou.jetpacksimple.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author:Lmoumou
 * @date:2019/4/10
 * 描述:
 **/
class NameVM : ViewModel() {
    val currentName: MutableLiveData<String> by lazy { MutableLiveData<String>() }

}