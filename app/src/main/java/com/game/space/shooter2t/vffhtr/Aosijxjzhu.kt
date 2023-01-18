package com.game.space.shooter2t.vffhtr

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.game.space.shooter2t.ncdswwe.Koisijjxzji
import com.game.space.shooter2t.ncdswwe.Xosixuhgggxzy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val gfocok = module {

    single  <Aosoxizjcxhu> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Aosoxizjcxhu::class.java)
    }

    single <Feodisdhdsu> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Feodisdhdsu::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://rainbowcrown.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Roeisjid(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Nysixzhchu(get(named("HostInter")))
    }
    single{
        ohkogjifjigf()
    }
    single (named("SharedPreferences")) {
        zpoxzkjis(androidApplication())
    }
}

fun zpoxzkjis(roeokd: Application): SharedPreferences {
    return roeokd.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun ohkogjifjigf(): Gson {
    return GsonBuilder().create()
}

val odicjixjixc = module {
    viewModel (named("MainModel")){
        Koisijjxzji((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Xosixuhgggxzy(get())
    }
}
