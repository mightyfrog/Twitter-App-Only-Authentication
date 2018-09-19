package org.mightyfrog.android.twitterapponlyauthsample.data.search

import com.google.gson.annotations.SerializedName

data class Entities(@SerializedName("hashtags")
                    var hashtags: List<Hashtag>?,
                    @SerializedName("symbols")
                    var symbols: List<Any>?,
                    @SerializedName("user_mentions")
                    var userMentions: List<Any>?,
                    @SerializedName("urls")
                    var urls: List<Url>?)
