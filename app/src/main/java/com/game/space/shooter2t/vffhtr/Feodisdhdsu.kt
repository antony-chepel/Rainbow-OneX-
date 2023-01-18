package com.game.space.shooter2t.vffhtr

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

class Roeisjid(private val kxzijcxji: Feodisdhdsu) {
    suspend fun orijokdskox() = kxzijcxji.kcixcjxvuh()
}



@Keep
data class Klxozxijxzjicshu(
    @SerializedName("geo")
    val fiodjffd: String,
    @SerializedName("view")
    val zoxzizjas: String,
    @SerializedName("appsChecker")
    val woowijjisdjia: String,
)
@Keep
data class Qiosiasudh(
    @SerializedName("countryCode")
    val ivjb: String,
)
interface Feodisdhdsu {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun kcixcjxvuh(): Response<Qiosiasudh>
}

class Nysixzhchu(private val gijgfjig: Aosoxizjcxhu) {
    suspend fun loxcijxcuhxc() = gijgfjig.iobvj()
}

interface Aosoxizjcxhu {
    @GET("file.json")
    suspend fun iobvj(): Response<Klxozxijxzjicshu>
}
















