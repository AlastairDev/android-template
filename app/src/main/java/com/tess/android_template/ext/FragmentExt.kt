package com.tess.android_template.ext

import android.support.v4.app.Fragment
import android.support.v7.app.AlertDialog
import android.widget.Toast

fun Fragment.toastL(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) = activity?.toastL(message)
fun Fragment.toastS(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) = activity?.toastS(message)

inline fun Fragment.alertDialog(body: AlertDialog.Builder.() -> AlertDialog.Builder) = activity?.alertDialog(body)