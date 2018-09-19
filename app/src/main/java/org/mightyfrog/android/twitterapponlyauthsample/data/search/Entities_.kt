package org.mightyfrog.android.twitterapponlyauthsample.data.search

class Entities_ {

    @com.google.gson.annotations.SerializedName("url")
    @com.google.gson.annotations.Expose
    var url: Url_? = null
    @com.google.gson.annotations.SerializedName("description")
    @com.google.gson.annotations.Expose
    var description: Description? = null

    override fun toString(): String {
        return "Entities_{" +
                "url=" + url +
                ", description=" + description +
                '}'
    }
}
