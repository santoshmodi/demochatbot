package com.utils.myapp

import android.app.Application
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.location.Location
import android.os.Build.VERSION.SDK
import android.util.Log
import android.view.LayoutInflater
import com.utils.dialogs.DialogUtil
import com.utils.session.Session


val session: Session by lazy {
    MyApp.prefs!!
}
val dialog: DialogUtil by lazy {
    MyApp.dialog!!
}

val location: Location by lazy {
    MyApp.latlong!!
}

class MyApp : Application()  {

//    private lateinit var fusedLocationClient: FusedLocationProviderClient


    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)

    }
    override fun onCreate() {
        super.onCreate()
//        instance = this
        prefs = Session(applicationContext)
        dialog = DialogUtil()

//        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
//        fusedLocationClient.lastLocation
//            .addOnSuccessListener { location ->
//                if (location != null) {
//                    latlong = location
//                }
//
//            }
    }

    companion object {
        var prefs: Session? = null
        var dialog: DialogUtil? = null
        var latlong: Location? = null

    }





}