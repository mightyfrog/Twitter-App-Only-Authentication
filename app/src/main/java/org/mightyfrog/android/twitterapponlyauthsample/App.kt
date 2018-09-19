package org.mightyfrog.android.twitterapponlyauthsample

import android.app.Application

/**
 * @author Shigehiro Soejima
 */
class App : Application() {

    private lateinit var mAppComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        mAppComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
    }

    fun getAppComponent(): AppComponent = mAppComponent
}