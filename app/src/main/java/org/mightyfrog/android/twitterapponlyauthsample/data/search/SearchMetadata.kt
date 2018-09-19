package org.mightyfrog.android.twitterapponlyauthsample.data.search

class SearchMetadata {

    @com.google.gson.annotations.SerializedName("completed_in")
    @com.google.gson.annotations.Expose
    var completedIn: Double? = null
    @com.google.gson.annotations.SerializedName("max_id")
    @com.google.gson.annotations.Expose
    var maxId: Long? = null
    @com.google.gson.annotations.SerializedName("max_id_str")
    @com.google.gson.annotations.Expose
    var maxIdStr: String? = null
    @com.google.gson.annotations.SerializedName("next_results")
    @com.google.gson.annotations.Expose
    var nextResults: String? = null
    @com.google.gson.annotations.SerializedName("query")
    @com.google.gson.annotations.Expose
    var query: String? = null
    @com.google.gson.annotations.SerializedName("refresh_url")
    @com.google.gson.annotations.Expose
    var refreshUrl: String? = null
    @com.google.gson.annotations.SerializedName("count")
    @com.google.gson.annotations.Expose
    var count: Int? = null
    @com.google.gson.annotations.SerializedName("since_id")
    @com.google.gson.annotations.Expose
    var sinceId: Int? = null
    @com.google.gson.annotations.SerializedName("since_id_str")
    @com.google.gson.annotations.Expose
    var sinceIdStr: String? = null

    override fun toString(): String {
        return "SearchMetadata{" +
                "completedIn=" + completedIn +
                ", maxId=" + maxId +
                ", maxIdStr='" + maxIdStr + '\'' +
                ", nextResults='" + nextResults + '\'' +
                ", query='" + query + '\'' +
                ", refreshUrl='" + refreshUrl + '\'' +
                ", count=" + count +
                ", sinceId=" + sinceId +
                ", sinceIdStr='" + sinceIdStr + '\'' +
                '}'
    }
}
