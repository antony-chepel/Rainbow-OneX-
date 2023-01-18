package com.game.space.shooter2t.vffhtr

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.game.space.shooter2t.R
import com.game.space.shooter2t.ncdswwe.Koisijjxzji
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Feosoksakoks : Fragment() {
    lateinit var noonbij: String
    private lateinit var obbjivji: Context
    val mcocxicjx: SharedPreferences by inject(named("SharedPreferences"))

    lateinit var rihudhusdxokz: String

    lateinit var sijds: String
    val appsosokdasidj by activityViewModel<Koisijjxzji>(named("MainModel"))



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.gtudsi, container, false)
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        obbjivji = context
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        appsosokdasidj.eisako.observe(viewLifecycleOwner) {
            if (it != null) {
                val main = it.toString()
                mcocxicjx.edit().putString("mainId", main).apply()
            }
        }

        appsosokdasidj.eoijrjir.observe(viewLifecycleOwner) {
            if (it != null) {

                rihudhusdxokz = it.fiodjffd
                sijds = it.woowijjisdjia
                noonbij = it.zoxzizjas

                mcocxicjx.edit().putString("countryDev", rihudhusdxokz).apply()
                mcocxicjx.edit().putString("apps", sijds).apply()
                mcocxicjx.edit().putString("wv", noonbij).apply()

                findNavController().navigate(R.id.icxuhhxu)
            }
        }
    }




}