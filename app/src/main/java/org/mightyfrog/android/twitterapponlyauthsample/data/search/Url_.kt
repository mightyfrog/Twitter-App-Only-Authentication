package org.mightyfrog.android.twitterapponlyauthsample.data.search

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Url_ {

    @SerializedName("urls")
    @Expose
    var urls: List<Url__>? = null

    override fun toString(): String {
        return "Url_{" +
                "urls=" + urls +
                '}'
    }
}
