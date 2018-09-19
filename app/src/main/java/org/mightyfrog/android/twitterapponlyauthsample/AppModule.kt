package org.mightyfrog.android.twitterapponlyauthsample

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import org.mightyfrog.android.twitterapponlyauthsample.util.TwitterService
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * @author Shigehiro Soejima
 */
@Module
class AppModule(val application: Application) {

    private val baseUrl = "https://api.twitter.com/"

    @Singleton
    @Provides
    fun getApplicationContext(): Context = application.applicationContext

    @Singleton
    @Provides
    fun getSharedPreferences(): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(application.applicationContext)

    @Singleton
    @Provides
    fun getTwitterService(): TwitterService = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TwitterService::class.java)
}