package org.mightyfrog.android.twitterapponlyauthsample.data.search

import com.google.gson.annotations.SerializedName

data class Statuses(@SerializedName("statuses")
                    var statuses: List<Status>?,
                    @SerializedName("search_metadata")
                    var searchMetadata: SearchMetadata?)