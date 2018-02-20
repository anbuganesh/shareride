package com.example.ganesh.ShareRide

import android.app.Activity
import android.widget.Toast

/**
 * Created by ganesh on 16-01-2018.
 */

fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

