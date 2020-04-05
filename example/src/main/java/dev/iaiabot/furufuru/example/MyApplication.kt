package dev.iaiabot.furufuru.example

import android.app.Application
import dev.iaiabot.furufuru.feature.Furufuru

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Furufuru.builder(
            this,
            BuildConfig.GITHUB_API_TOKEN,
            "iaia",
            "Furufuru"
        ).build()
    }
}
