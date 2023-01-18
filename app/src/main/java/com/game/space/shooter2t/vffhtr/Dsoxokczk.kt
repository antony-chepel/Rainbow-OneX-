package com.game.space.shooter2t.vffhtr
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.game.space.shooter2t.R
import com.game.space.shooter2t.ncdswwe.Koisijjxzji


import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Dsoxokczk : Fragment() {
    lateinit var idushs: String
    val xckzxc by activityViewModel<Koisijjxzji>(named("MainModel"))
    private lateinit var qwokeo: Context
    val cokvxxkocv: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        qwokeo = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.nixzuhhusa, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sodksdok = cokvxxkocv.getString("apps", null)
        val aoksakaso = cokvxxkocv.getString("appCamp", null)

        if (sodksdok=="1" &&aoksakaso == null) {
            xckzxc.ofijcixjc(qwokeo)
            xckzxc.vovcjivci.observe(viewLifecycleOwner) {

                if (it != null) {
                    idushs = it.toString()
                    cokvxxkocv.edit().putString("appCamp", idushs).apply()
                    findNavController().navigate(R.id.isajjaid)
                }
            }
        } else {
            findNavController().navigate(R.id.isajjaid)
        }
    }



}