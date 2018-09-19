package org.mightyfrog.android.twitterapponlyauthsample.data.search

import com.google.gson.annotations.SerializedName

data class Status(@SerializedName("created_at")
                  var createdAt: String?,
                  @SerializedName("id")
                  var id: Long,
                  @SerializedName("id_str")
                  var idStr: String?,
                  @SerializedName("text")
                  var text: String?,
                  @SerializedName("truncated")
                  var truncated: Boolean?,
                  @SerializedName("entities")
                  var entities: Entities?,
                  @SerializedName("metadata")
                  var metadata: Metadata?,
                  @SerializedName("source")
                  var source: String?,
                  @SerializedName("in_reply_to_status_id")
                  var inReplyToStatusId: Any?, // just a sample, nbd
                  @SerializedName("in_reply_to_status_id_str")
                  var inReplyToStatusIdStr: Any?,
                  @SerializedName("in_reply_to_user_id")
                  var inReplyToUserId: Any?,
                  @SerializedName("in_reply_to_user_id_str")
                  var inReplyToUserIdStr: Any?,
                  @SerializedName("in_reply_to_screen_name")
                  var inReplyToScreenName: Any?,
                  @SerializedName("user")
                  var user: User?,
                  @SerializedName("geo")
                  var geo: Any?,
                  @SerializedName("coordinates")
                  var coordinates: Any?,
                  @SerializedName("place")
                  var place: Any?,
                  @SerializedName("contributors")
                  var contributors: Any?,
                  @SerializedName("is_quote_status")
                  var isQuoteStatus: Boolean?,
                  @SerializedName("retweet_count")
                  var retweetCount: Int?,
                  @SerializedName("favorite_count")
                  var favoriteCount: Int?,
                  @SerializedName("favorited")
                  var favorited: Boolean?,
                  @SerializedName("retweeted")
                  var retweeted: Boolean?,
                  @SerializedName("possibly_sensitive")
                  var possiblySensitive: Boolean?,
                  @SerializedName("lang")
                  var lang: String?)