package com.tess.androidTemplate.ext

import android.app.Activity
import androidx.appcompat.app.AlertDialog
import android.util.Log
import android.widget.Toast
import com.tess.androidTemplate.App
import com.tess.androidTemplate.LogLevel

fun Activity.toastL(message: CharSequence, isLong: Boolean = true) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()
fun Activity.toastS(message: CharSequence, isLong: Boolean = true) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

inline fun Activity.alertDialog(body: AlertDialog.Builder.() -> AlertDialog.Builder): AlertDialog {
    return AlertDialog.Builder(this).body().show()
}

//activity lifecycle log
fun Activity.logLC(message: String) {
    when (App.liveCycleLogLevel) {
        LogLevel.NONE -> {}
        LogLevel.D -> Log.d(this::class.java.simpleName, "lifecycle : $message")
        LogLevel.E -> Log.e(this::class.java.simpleName, "lifecycle : $message")
        LogLevel.W -> Log.w(this::class.java.simpleName, "lifecycle : $message")
        LogLevel.V -> Log.v(this::class.java.simpleName, "lifecycle : $message")
        LogLevel.I -> Log.i(this::class.java.simpleName, "lifecycle : $message")
    }
}
