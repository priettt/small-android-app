package io.embrace.minimaldependenciesapp

import android.app.Application
import io.embrace.android.embracesdk.Embrace

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Embrace.start(this)
    }
}