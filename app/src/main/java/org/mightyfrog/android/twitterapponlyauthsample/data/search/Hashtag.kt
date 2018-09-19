package org.mightyfrog.android.twitterapponlyauthsample.data.search

import com.google.gson.annotations.SerializedName

data class Hashtag(@SerializedName("text")
                   var text: String?,
                   @SerializedName("indices")
                   var indices: List<Int>?)
