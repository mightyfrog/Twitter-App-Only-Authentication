package org.mightyfrog.android.twitterapponlyauthsample.main

import android.content.SharedPreferences
import com.google.gson.JsonObject
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.annotations.NonNull
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import org.mightyfrog.android.twitterapponlyauthsample.data.search.Statuses
import org.mightyfrog.android.twitterapponlyauthsample.util.TwitterService
import javax.inject.Inject

/**
 * @author Shigehiro Soejima
 */
class MainPresenter @Inject constructor(private val view: MainContract.View, private val twitterService: TwitterService, private val prefs: SharedPreferences) : MainContract.Presenter {

    init {
        oauth2()
    }

    override fun oauth2() {
        val accessToken = prefs.getString("access_token", null)
        if (accessToken != null) {
            search("Android")
        } else {
            twitterService.oauth2()
                    .subscribeOn(Schedulers.io())
                    .subscribe(object : DisposableSingleObserver<JsonObject>() {
                        override fun onSuccess(@NonNull jsonObject: JsonObject) {
                            prefs.edit().putString("access_token", jsonObject.get("access_token").asString).apply()
                            search("Android")
                        }

                        override fun onError(@NonNull t: Throwable) {
                            view.error(t)
                        }
                    })
        }
    }

    override fun search(query: String) {
        val accessToken = prefs.getString("access_token", null)
        if (accessToken == null) {
            oauth2()
        } else {
            twitterService.search("Bearer $accessToken", query)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(object : DisposableSingleObserver<Statuses>() {
                        override fun onSuccess(@NonNull statuses: Statuses) {
                            view.updateStatuses(statuses.statuses)
                        }

                        override fun onError(@NonNull t: Throwable) {
                            view.error(t)
                        }
                    })
        }
    }
}
