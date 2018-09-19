package org.mightyfrog.android.twitterapponlyauthsample.data.search

import com.google.gson.annotations.SerializedName

data class Metadata(@SerializedName("iso_language_code")
                    var isoLanguageCode: String?,
                    @SerializedName("result_type")
                    var resultType: String?)