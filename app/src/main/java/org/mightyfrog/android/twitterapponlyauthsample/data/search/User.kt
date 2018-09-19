package org.mightyfrog.android.twitterapponlyauthsample.data.search

class User {

    @com.google.gson.annotations.SerializedName("id")
    @com.google.gson.annotations.Expose
    var id: Long? = null
    @com.google.gson.annotations.SerializedName("id_str")
    @com.google.gson.annotations.Expose
    var idStr: String? = null
    @com.google.gson.annotations.SerializedName("name")
    @com.google.gson.annotations.Expose
    var name: String? = null
    @com.google.gson.annotations.SerializedName("screen_name")
    @com.google.gson.annotations.Expose
    var screenName: String? = null
    @com.google.gson.annotations.SerializedName("location")
    @com.google.gson.annotations.Expose
    var location: String? = null
    @com.google.gson.annotations.SerializedName("description")
    @com.google.gson.annotations.Expose
    var description: String? = null
    @com.google.gson.annotations.SerializedName("url")
    @com.google.gson.annotations.Expose
    var url: String? = null
    @com.google.gson.annotations.SerializedName("entities")
    @com.google.gson.annotations.Expose
    var entities: Entities_? = null
    @com.google.gson.annotations.SerializedName("protected")
    @com.google.gson.annotations.Expose
    var protected: Boolean? = null
    @com.google.gson.annotations.SerializedName("followers_count")
    @com.google.gson.annotations.Expose
    var followersCount: Int? = null
    @com.google.gson.annotations.SerializedName("friends_count")
    @com.google.gson.annotations.Expose
    var friendsCount: Int? = null
    @com.google.gson.annotations.SerializedName("listed_count")
    @com.google.gson.annotations.Expose
    var listedCount: Int? = null
    @com.google.gson.annotations.SerializedName("created_at")
    @com.google.gson.annotations.Expose
    var createdAt: String? = null
    @com.google.gson.annotations.SerializedName("favourites_count")
    @com.google.gson.annotations.Expose
    var favouritesCount: Int? = null
    @com.google.gson.annotations.SerializedName("utc_offset")
    @com.google.gson.annotations.Expose
    var utcOffset: Any? = null
    @com.google.gson.annotations.SerializedName("time_zone")
    @com.google.gson.annotations.Expose
    var timeZone: Any? = null
    @com.google.gson.annotations.SerializedName("geo_enabled")
    @com.google.gson.annotations.Expose
    var geoEnabled: Boolean? = null
    @com.google.gson.annotations.SerializedName("verified")
    @com.google.gson.annotations.Expose
    var verified: Boolean? = null
    @com.google.gson.annotations.SerializedName("statuses_count")
    @com.google.gson.annotations.Expose
    var statusesCount: Int? = null
    @com.google.gson.annotations.SerializedName("lang")
    @com.google.gson.annotations.Expose
    var lang: String? = null
    @com.google.gson.annotations.SerializedName("contributors_enabled")
    @com.google.gson.annotations.Expose
    var contributorsEnabled: Boolean? = null
    @com.google.gson.annotations.SerializedName("is_translator")
    @com.google.gson.annotations.Expose
    var isTranslator: Boolean? = null
    @com.google.gson.annotations.SerializedName("is_translation_enabled")
    @com.google.gson.annotations.Expose
    var isTranslationEnabled: Boolean? = null
    @com.google.gson.annotations.SerializedName("profile_background_color")
    @com.google.gson.annotations.Expose
    var profileBackgroundColor: String? = null
    @com.google.gson.annotations.SerializedName("profile_background_image_url")
    @com.google.gson.annotations.Expose
    var profileBackgroundImageUrl: String? = null
    @com.google.gson.annotations.SerializedName("profile_background_image_url_https")
    @com.google.gson.annotations.Expose
    var profileBackgroundImageUrlHttps: String? = null
    @com.google.gson.annotations.SerializedName("profile_background_tile")
    @com.google.gson.annotations.Expose
    var profileBackgroundTile: Boolean? = null
    @com.google.gson.annotations.SerializedName("profile_image_url")
    @com.google.gson.annotations.Expose
    var profileImageUrl: String? = null
    @com.google.gson.annotations.SerializedName("profile_image_url_https")
    @com.google.gson.annotations.Expose
    var profileImageUrlHttps: String? = null
    @com.google.gson.annotations.SerializedName("profile_banner_url")
    @com.google.gson.annotations.Expose
    var profileBannerUrl: String? = null
    @com.google.gson.annotations.SerializedName("profile_link_color")
    @com.google.gson.annotations.Expose
    var profileLinkColor: String? = null
    @com.google.gson.annotations.SerializedName("profile_sidebar_border_color")
    @com.google.gson.annotations.Expose
    var profileSidebarBorderColor: String? = null
    @com.google.gson.annotations.SerializedName("profile_sidebar_fill_color")
    @com.google.gson.annotations.Expose
    var profileSidebarFillColor: String? = null
    @com.google.gson.annotations.SerializedName("profile_text_color")
    @com.google.gson.annotations.Expose
    var profileTextColor: String? = null
    @com.google.gson.annotations.SerializedName("profile_use_background_image")
    @com.google.gson.annotations.Expose
    var profileUseBackgroundImage: Boolean? = null
    @com.google.gson.annotations.SerializedName("has_extended_profile")
    @com.google.gson.annotations.Expose
    var hasExtendedProfile: Boolean? = null
    @com.google.gson.annotations.SerializedName("default_profile")
    @com.google.gson.annotations.Expose
    var defaultProfile: Boolean? = null
    @com.google.gson.annotations.SerializedName("default_profile_image")
    @com.google.gson.annotations.Expose
    var defaultProfileImage: Boolean? = null
    @com.google.gson.annotations.SerializedName("following")
    @com.google.gson.annotations.Expose
    var following: Any? = null
    @com.google.gson.annotations.SerializedName("follow_request_sent")
    @com.google.gson.annotations.Expose
    var followRequestSent: Any? = null
    @com.google.gson.annotations.SerializedName("notifications")
    @com.google.gson.annotations.Expose
    var notifications: Any? = null
    @com.google.gson.annotations.SerializedName("translator_type")
    @com.google.gson.annotations.Expose
    var translatorType: String? = null

    override fun toString(): String {
        return "User{" +
                "id=" + id +
                ", idStr='" + idStr + '\'' +
                ", name='" + name + '\'' +
                ", screenName='" + screenName + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", entities=" + entities +
                ", _protected=" + protected +
                ", followersCount=" + followersCount +
                ", friendsCount=" + friendsCount +
                ", listedCount=" + listedCount +
                ", createdAt='" + createdAt + '\'' +
                ", favouritesCount=" + favouritesCount +
                ", utcOffset=" + utcOffset +
                ", timeZone=" + timeZone +
                ", geoEnabled=" + geoEnabled +
                ", verified=" + verified +
                ", statusesCount=" + statusesCount +
                ", lang='" + lang + '\'' +
                ", contributorsEnabled=" + contributorsEnabled +
                ", isTranslator=" + isTranslator +
                ", isTranslationEnabled=" + isTranslationEnabled +
                ", profileBackgroundColor='" + profileBackgroundColor + '\'' +
                ", profileBackgroundImageUrl='" + profileBackgroundImageUrl + '\'' +
                ", profileBackgroundImageUrlHttps='" + profileBackgroundImageUrlHttps + '\'' +
                ", profileBackgroundTile=" + profileBackgroundTile +
                ", profileImageUrl='" + profileImageUrl + '\'' +
                ", profileImageUrlHttps='" + profileImageUrlHttps + '\'' +
                ", profileBannerUrl='" + profileBannerUrl + '\'' +
                ", profileLinkColor='" + profileLinkColor + '\'' +
                ", profileSidebarBorderColor='" + profileSidebarBorderColor + '\'' +
                ", profileSidebarFillColor='" + profileSidebarFillColor + '\'' +
                ", profileTextColor='" + profileTextColor + '\'' +
                ", profileUseBackgroundImage=" + profileUseBackgroundImage +
                ", hasExtendedProfile=" + hasExtendedProfile +
                ", defaultProfile=" + defaultProfile +
                ", defaultProfileImage=" + defaultProfileImage +
                ", following=" + following +
                ", followRequestSent=" + followRequestSent +
                ", notifications=" + notifications +
                ", translatorType='" + translatorType + '\'' +
                '}'
    }
}
