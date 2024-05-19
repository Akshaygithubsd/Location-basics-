package com.example.locationbasics

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat

class locationutil(val context:Context) {
    fun hasLocationPermission(context: Context):Boolean{
    return ContextCompat.checkSelfPermission(context,
        Manifest.permission.ACCESS_FINE_LOCATION)==PackageManager.PERMISSION_GRANTED
            /*through package manager we check whether we gave permission of like gps in our phone to
            this app
            Context provides fundamental utilities & services like accessing resources
            ,launching activities & more
            */
            && ContextCompat.checkSelfPermission(context,
        Manifest.permission.ACCESS_COARSE_LOCATION)==PackageManager.PERMISSION_GRANTED}
}