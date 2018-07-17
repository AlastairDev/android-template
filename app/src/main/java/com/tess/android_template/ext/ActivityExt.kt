package com.tess.android_template.ext

import android.app.Activity
import android.support.v7.app.AlertDialog
import android.util.Log
import android.widget.Toast
import com.tess.android_template.App
import com.tess.android_template.LogLevel

fun Activity.toast(message: CharSequence, isLong: Boolean = true) {
    if (isLong) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    } else {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}


inline fun Activity.alertDialog(body: AlertDialog.Builder.() -> AlertDialog.Builder): AlertDialog {
    return AlertDialog.Builder(this).body().show()
}

//activity livecycle log
fun Activity.logLC(message: String) {
    when (App.liveCycleLogLevel) {
        LogLevel.NONE -> {}
        LogLevel.D -> Log.d(this::class.java.simpleName, "livecycle : $message")
        LogLevel.E -> Log.e(this::class.java.simpleName, "livecycle : $message")
        LogLevel.W -> Log.w(this::class.java.simpleName, "livecycle : $message")
        LogLevel.V -> Log.v(this::class.java.simpleName, "livecycle : $message")
        LogLevel.I -> Log.i(this::class.java.simpleName, "livecycle : $message")
    }
}
