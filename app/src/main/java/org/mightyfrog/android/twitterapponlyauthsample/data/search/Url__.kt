package org.mightyfrog.android.twitterapponlyauthsample.data.search

import com.google.gson.annotations.SerializedName

data class Url__(@SerializedName("url")
                 var url: String?,
                 @SerializedName("expanded_url")
                 var expandedUrl: String?,
                 @SerializedName("display_url")
                 var displayUrl: String?,
                 @SerializedName("indices")
                 var indices: List<Int>?)