package org.mightyfrog.android.twitterapponlyauthsample.main

import org.mightyfrog.android.twitterapponlyauthsample.data.search.Status

/**
 * @author Shigehiro Soejima
 */
interface MainContract {

    interface View {

        fun error(t: Throwable)

        fun updateStatuses(statuses: List<Status>?)
    }

    interface Presenter {

        fun oauth2()

        fun search(query: String)
    }
}