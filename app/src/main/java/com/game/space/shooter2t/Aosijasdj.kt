package com.game.space.shooter2t

import android.app.Application
import android.content.Context
import com.game.space.shooter2t.vffhtr.odicjixjixc
import com.game.space.shooter2t.vffhtr.gfocok
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class Aosijasdj: Application() {

    companion object {
        var qopskd: String? = "instID"
        const val vockvokc = "1da397d9-2f2d-46aa-8b4a-078bbd3b82d5"

        var fokfdij: String? = "main_id"
        val jkxzjnxjz: String = "myID"


    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(vockvokc)




        val dokfs = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val apapaslplaspoksa = getSharedPreferences("PREFS_NAME", 0)

        val xijczji = MyTracker.getTrackerParams()
        val sodkoskod = MyTracker.getTrackerConfig()
        val sijdisdjsdji = MyTracker.getInstanceId(this)
        sodkoskod.isTrackingLaunchEnabled = true
        val mxcxckxc = UUID.randomUUID().toString()

        if (apapaslplaspoksa.getBoolean("my_first_time", true)) {
            xijczji.setCustomUserId(mxcxckxc)
            dokfs.edit().putString(jkxzjnxjz, mxcxckxc).apply()
            dokfs.edit().putString(qopskd, sijdisdjsdji).apply()
            apapaslplaspoksa.edit().putBoolean("my_first_time", false).apply()
        } else {
            val aoksosa = dokfs.getString(jkxzjnxjz, mxcxckxc)
            xijczji.setCustomUserId(aoksosa)
        }
        MyTracker.initTracker("11832830270674061243", this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Aosijasdj)
            modules(
                listOf(
                    odicjixjixc, gfocok
                )
            )
        }
    }
}