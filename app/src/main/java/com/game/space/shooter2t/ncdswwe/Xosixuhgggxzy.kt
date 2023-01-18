package com.game.space.shooter2t.ncdswwe

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class Xosixuhgggxzy(ifjdfijdf: Application): ViewModel() {

    val zozkxoz = ifjdfijdf.packageManager




    fun dokejiidjisjf(pxlcx: String) {
        OneSignal.setExternalUserId(
            pxlcx,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(pffdko: JSONObject) {
                    try {
                        if (pffdko.has("push") && pffdko.getJSONObject("push").has("success")) {
                            val lxozicjzxji = pffdko.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $lxozicjzxji"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (pffdko.has("email") && pffdko.getJSONObject("email").has("success")) {
                            val eirjuhdhuf =
                                pffdko.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $eirjuhdhuf"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (pffdko.has("sms") && pffdko.getJSONObject("sms").has("success")) {
                            val mcxkvnkxvc = pffdko.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $mcxkvnkxvc"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    fun eoijisjid(hudffhud: String): Boolean {
        try {
            zozkxoz.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }


    fun odkejidjisjif(hoighjgh: WebView): WebSettings{
        val zokxzko = hoighjgh.settings
        zokxzko.setSupportMultipleWindows(false)
        zokxzko.javaScriptEnabled = true
        zokxzko.allowContentAccess = true
        zokxzko.useWideViewPort = true

        zokxzko.allowContentAccess = true
        zokxzko.userAgentString = zokxzko.userAgentString.replace("; wv", "")
        zokxzko.javaScriptCanOpenWindowsAutomatically = true
        zokxzko.mediaPlaybackRequiresUserGesture = false
        zokxzko.loadWithOverviewMode = true

        zokxzko.allowFileAccess = true
        zokxzko.domStorageEnabled = true

        zokxzko.setSupportZoom(true)
        zokxzko.builtInZoomControls = true
        zokxzko.setAppCacheEnabled(true)
        zokxzko.allowFileAccess = true
        zokxzko.pluginState = WebSettings.PluginState.ON
        zokxzko.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        zokxzko.displayZoomControls = false


        return zokxzko
    }








}