package com.game.space.shooter2t.zaswdw

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import com.game.space.shooter2t.databinding.ActivityVdeoidoxzijcBinding
import com.game.space.shooter2t.ncdswwe.Hyisijxzijxz
import kotlin.random.Random

class Vdeoidoxzijc : AppCompatActivity() {
    private lateinit var kxzji : ActivityVdeoidoxzijcBinding
    var tp = 5
    val listssda = listOf(
        2,
        3,
        5,
        10,
        8,
        15
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kxzji = ActivityVdeoidoxzijcBinding.inflate(layoutInflater)
        setContentView(kxzji.root)
        ysdnixcz()
    }


    @SuppressLint("ClickableViewAccessibility")
    private fun ysdnixcz() = with(kxzji){
        imageView.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                if(event?.action == MotionEvent.ACTION_DOWN) {
                    tp-=1
                    textView2.text = "Tap chances : $tp"
                    val scr = listssda[Random.nextInt(6)]
                    tvBonuses.text = "Bonuses : x$scr"

                    if(tp == 0){
                     startActivity(Intent(this@Vdeoidoxzijc,Hyisijxzijxz::class.java)
                         .putExtra("bonuses",scr)
                     )
                    }
                    v?.animate()?.scaleX(0.80f)?.scaleY(0.80f)?.setDuration(0)
                } else if(event?.action == MotionEvent.ACTION_UP){
                    v?.animate()?.scaleX(1.0f)?.scaleY(1.0f)?.setDuration(0)
                }

                return true
            }

        })

        imageView2.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                if(event?.action == MotionEvent.ACTION_DOWN) {

                    tp-=1
                    textView2.text = "Tap chances : $tp"
                    val scr = listssda[Random.nextInt(6)]
                    tvBonuses.text = "Bonuses : x$scr"

                    if(tp == 0){
                        startActivity(Intent(this@Vdeoidoxzijc,Hyisijxzijxz::class.java)
                            .putExtra("bonuses",scr)
                        )
                    }

                    v?.animate()?.scaleX(0.80f)?.scaleY(0.80f)?.setDuration(0)
                } else if(event?.action == MotionEvent.ACTION_UP){
                    v?.animate()?.scaleX(1.0f)?.scaleY(1.0f)?.setDuration(0)
                }

                return true
            }

        })

        imageView3.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                if(event?.action == MotionEvent.ACTION_DOWN) {

                    tp-=1
                    textView2.text = "Tap chances : $tp"
                    val scr = listssda[Random.nextInt(6)]
                    tvBonuses.text = "Bonuses : x$scr"

                    if(tp == 0){
                        startActivity(Intent(this@Vdeoidoxzijc,Hyisijxzijxz::class.java)
                            .putExtra("bonuses",scr)
                        )
                    }

                    v?.animate()?.scaleX(0.80f)?.scaleY(0.80f)?.setDuration(0)
                } else if(event?.action == MotionEvent.ACTION_UP){
                    v?.animate()?.scaleX(1.0f)?.scaleY(1.0f)?.setDuration(0)
                }

                return true
            }

        })
    }
}