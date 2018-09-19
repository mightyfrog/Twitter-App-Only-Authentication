package org.mightyfrog.android.twitterapponlyauthsample.util

import com.google.gson.JsonObject
import io.reactivex.Single
import okhttp3.MediaType
import okhttp3.RequestBody
import org.mightyfrog.android.twitterapponlyauthsample.data.search.Statuses
import retrofit2.http.*

/**
 * https://dev.twitter.com/oauth/application-only
 *
 * @author Shigehiro Soejima
 */
interface TwitterService {
    @POST("oauth2/token")
    @Headers("Content-Type: application/x-www-form-urlencoded;charset=UTF-8", "Authorization: Basic <ENCODED-CONSUMER-KEY-AND-SECRET-HERE>")
    fun oauth2(@Body grantType: RequestBody = RequestBody.create(MediaType.parse("text/plain"), "grant_type=client_credentials")): Single<JsonObject>

    @GET("1.1/search/tweets.json")
    @Headers("Content-Type: application/x-www-form-urlencoded;charset=UTF-8")
    fun search(@Header("Authorization") bearer: String, @Query("q") query: String): Single<Statuses>
}
