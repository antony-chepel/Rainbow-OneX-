package com.game.space.shooter2t.ncdswwe

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.game.space.shooter2t.R
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class Vfsuixizuhs : Fragment() {
    val isusdhyasgd: SharedPreferences by inject(named("SharedPreferences"))
    private lateinit var oijvjichu: Context
    val obivijbvuhf by activityViewModel<Koisijjxzji>(named("MainModel"))
    lateinit var siodska: String



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.feokdsi, container, false)
    }




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        obivijbvuhf.roeeji.observe(viewLifecycleOwner) {
            if (it!=null) {
                siodska = it.ivjb
                isusdhyasgd.edit().putString("country", siodska).apply()
                findNavController().navigate(R.id.hdsuhsd)
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        oijvjichu = context
    }

}