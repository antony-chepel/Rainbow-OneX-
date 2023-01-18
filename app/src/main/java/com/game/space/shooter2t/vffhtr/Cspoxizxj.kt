package com.game.space.shooter2t.vffhtr

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.game.space.shooter2t.R
import com.game.space.shooter2t.ncdswwe.Koisijjxzji
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named

class Cspoxizxj : Fragment() {

    private lateinit var apsoasij: Context

    val koiddoskdsij by activityViewModel<Koisijjxzji>(named("MainModel"))



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        koiddoskdsij.apapoxioxzkizxj(apsoasij)

        findNavController().navigate(R.id.bovjiv)

    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        apsoasij=context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dsdsddfe, container, false)
    }
}