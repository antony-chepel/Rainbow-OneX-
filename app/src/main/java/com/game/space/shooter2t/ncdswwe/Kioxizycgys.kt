package com.game.space.shooter2t.ncdswwe

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.game.space.shooter2t.Aosijasdj.Companion.qopskd
import com.game.space.shooter2t.Aosijasdj.Companion.fokfdij
import com.game.space.shooter2t.databinding.NaokiuysaBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*

class Kioxizycgys : AppCompatActivity() {
    private var eosijd: ValueCallback<Array<Uri>>? = null
    lateinit var gokfgigj: WebView
    private var gokovcji: String? = null
    var mckxoxci = ""
    private var vocokvvjivcuhd = false
    private val xxoxzxizx by viewModel<Xosixuhgggxzy>(
        named("BeamModel")
    )
    private val mkcxiocxk = 1
    private lateinit var qpwokw: NaokiuysaBinding






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        qpwokw = NaokiuysaBinding.inflate(layoutInflater)
        setContentView(qpwokw.root)
        gokfgigj = qpwokw.gofid
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(gokfgigj, true)
        xxoxzxizx.odkejidjisjif(gokfgigj)


        gokfgigj.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(url)) {
                        return false
                    }
                    if (xxoxzxizx.eoijisjid(url)) {

                        val fokokoc = Intent(Intent.ACTION_VIEW)
                        fokokoc.data = Uri.parse(url)
                        startActivity(fokokoc)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                bivuhvbhu(url)
            }


            override fun onReceivedError(
                view: WebView?,
                errorCode: Int,
                description: String?,
                failingUrl: String?
            ) {
                Toast.makeText(this@Kioxizycgys, description, Toast.LENGTH_SHORT).show()
            }
        }

        gokfgigj.webChromeClient = Soxizxijzhcncjxz()
        gokfgigj.loadUrl(gokgfo())
    }




    override fun onActivityResult(vokcv: Int, mkvcjcv: Int, roijisdija: Intent?) {

        if (vokcv != mkcxiocxk || eosijd == null) {
            super.onActivityResult(vokcv, mkvcjcv, roijisdija)
            return
        }
        var nbivjbbvhu: Array<Uri>? = null

        if (mkvcjcv == RESULT_OK) {
            if (roijisdija == null) {
                if (gokovcji != null) {
                    nbivjbbvhu = arrayOf(Uri.parse(gokovcji))
                }
            } else {
                val qowkwejsjid = roijisdija.dataString
                if (qowkwejsjid != null) {
                    nbivjbbvhu = arrayOf(Uri.parse(qowkwejsjid))
                }
            }
        }
        eosijd!!.onReceiveValue(nbivjbbvhu)
        eosijd = null
        return
    }

    private fun gokgfo(): String {

        val vocvkcvjiijvbji = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)


        val owiushdshu = getSharedPreferences(
            "SHARED_PREF",
            Context.MODE_PRIVATE
        )

        val zokxzo = owiushdshu.getString(qopskd, null)
        val ropkkodf = owiushdshu.getString("link", null)

        val cokcxkoxcv = owiushdshu.getString(fokfdij, null)
        val osokdo = owiushdshu.getString("WebInt", null)



        when (osokdo) {
            "campaign" -> {
                xxoxzxizx.dokejiidjisjf(cokcxkoxcv.toString())
            }
            "deepLink" -> {
                xxoxzxizx.dokejiidjisjf(cokcxkoxcv.toString())
            }
            "deepLinkNOApps" -> {
                xxoxzxizx.dokejiidjisjf(zokxzo.toString())
            }
            "geo" -> {
                xxoxzxizx.dokejiidjisjf(zokxzo.toString())
            }

        }
        return vocvkcvjiijvbji.getString("SAVED_URL", ropkkodf).toString()
    }
    override fun onBackPressed() {

        if (gokfgigj.canGoBack()) {
            if (vocokvvjivcuhd) {
                gokfgigj.stopLoading()
                gokfgigj.loadUrl(mckxoxci)
            }
            this.vocokvvjivcuhd = true
            gokfgigj.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                vocokvvjivcuhd = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    inner class Soxizxijzhcncjxz : WebChromeClient() {

        override fun onShowFileChooser(
            ijcv: WebView?,
            oodsok: ValueCallback<Array<Uri>>?,
            wooskdosdko: FileChooserParams?
        ): Boolean {
            eosijd?.onReceiveValue(null)
            eosijd = oodsok
            var ocokxjcvhu: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (ocokxjcvhu!!.resolveActivity(packageManager) != null) {
                var oeoewjijiwji: File? = null
                try {
                    oeoewjijiwji = tidijdsfuh()
                    ocokxjcvhu.putExtra("PhotoPath", gokovcji)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (oeoewjijiwji != null) {
                    gokovcji = "file:" + oeoewjijiwji.absolutePath
                    ocokxjcvhu.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(oeoewjijiwji)
                    )
                } else {
                    ocokxjcvhu = null
                }
            }
            val icchuxcgxy = Intent(Intent.ACTION_GET_CONTENT)
            icchuxcgxy.addCategory(Intent.CATEGORY_OPENABLE)
            icchuxcgxy.type = "image/*"
            val sidjdsji: Array<Intent?> =
                ocokxjcvhu?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val xokzckozxc = Intent(Intent.ACTION_CHOOSER)
            xokzckozxc.putExtra(Intent.EXTRA_INTENT, icchuxcgxy)
            xokzckozxc.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            xokzckozxc.putExtra(Intent.EXTRA_INITIAL_INTENTS, sidjdsji)
            startActivityForResult(xokzckozxc, mkcxiocxk)
            return true
        }

        fun tidijdsfuh(): File? {
            val difjfdi = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val voicvjib = "JPEG_" + difjfdi + "_"
            val lsksdijsdji = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                voicvjib,
                ".jpg",
                lsksdijsdji
            )
        }
    }

    fun bivuhvbhu(odufhudf: String?) {
        if (!odufhudf!!.contains("t.me")) {

            if (mckxoxci == "") {
                mckxoxci = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    odufhudf
                ).toString()

                val nncjxcxhcxu =
                    getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val wisisokdosk = nncjxcxhcxu.edit()
                wisisokdosk.putString("SAVED_URL", odufhudf)
                wisisokdosk.apply()
            }
        }
    }


}

