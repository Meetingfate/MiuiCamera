package com.yuk.miuicamera.module

import com.github.kyuubiran.ezxhelper.utils.Log
import com.yuk.miuicamera.utils.ktx.*

class InitFilm {

    fun init() {
        try {
            "com.dragon.read.user.e".hookBeforeMethod("b") {
                it.result = true
            }
            "com.dragon.read.ad.f.f".hookBeforeMethod("a") {
                it.result = true
            }
        } catch (e: Throwable) {
            Log.ex(e)
        }
    }

}
