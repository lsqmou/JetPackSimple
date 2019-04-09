package com.lmoumou.jetpacksimple

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import android.util.Log

/**
 * @author:Lmoumou
 * @date:2019/4/7
 * 描述:
 **/
class MyObserver : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun connectStart() {
        mLog("Start")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun connectCreate() {
        mLog("Create")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun connectResume() {
        mLog("Resume")
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun connectPause() {
        mLog("Pause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun connectStop() {
        mLog("Stop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun connectDestroy() {
        mLog("Destroy")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun connectAny() {
//        mLog("Any")
    }

    private fun mLog(msg: String) {
        Log.e("LifecycyleObserver", msg)
    }

}