package com.yuk.miuicamera.utils

import android.os.Build
import com.yuk.miuicamera.BuildConfig

object Config {
    val AndroidSDK: Int = Build.VERSION.SDK_INT
    const val modulePackage = BuildConfig.APPLICATION_ID
    const val hostPackage = "com.dragon.read"
    const val SP_NAME = "番茄vip"
    const val TAG = "番茄vip"
}
