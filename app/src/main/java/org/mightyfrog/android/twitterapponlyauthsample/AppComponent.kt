package org.mightyfrog.android.twitterapponlyauthsample

import android.content.Context
import android.content.SharedPreferences
import dagger.Component
import org.mightyfrog.android.twitterapponlyauthsample.util.TwitterService
import javax.inject.Singleton

/**
 * @author Shigehiro Soejima
 */
@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun exposeApplicationContext(): Context

    fun exposeTwitterService(): TwitterService

    fun exposeSharedPreferences(): SharedPreferences
}