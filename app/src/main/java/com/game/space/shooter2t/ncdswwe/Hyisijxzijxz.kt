package com.game.space.shooter2t.ncdswwe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.game.space.shooter2t.R
import com.game.space.shooter2t.databinding.ActivityHyisijxzijxzBinding
import com.game.space.shooter2t.zaswdw.Vdeoidoxzijc
import kotlin.random.Random

class Hyisijxzijxz : AppCompatActivity() {
    private lateinit var kxzixzjzx : ActivityHyisijxzijxzBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kxzixzjzx = ActivityHyisijxzijxzBinding.inflate(layoutInflater)
        setContentView(kxzixzjzx.root)
        val lisuhsd = listOf(
            50,
            75,
            80,
            60,
            25,
            86,
            100,
            120,
            150,
            200
        )
        val usaisjd = listOf(
            R.drawable.b_xb_bask,
            R.drawable.b_xb_fb,
            R.drawable.b_xb_sand,
        )
        kxzixzjzx.imageView4.setImageResource(usaisjd[Random.nextInt(3)])
        val siajdjias = intent.getIntExtra("bonuses",0)
        val xizjczji = lisuhsd[Random.nextInt(10)]
        val slsosdkoasdko = siajdjias * xizjczji
        kxzixzjzx.fijg.text = "Total Win : $slsosdkoasdko"
        kxzixzjzx.rokods.setOnClickListener {
            startActivity(Intent(this,Vdeoidoxzijc::class.java))
        }
    }
}