package com.tess.androidTemplate.ext

import androidx.fragment.app.Fragment
import androidx.appcompat.app.AlertDialog
import android.widget.Toast

fun Fragment.toastL(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) = activity?.toastL(message)
fun Fragment.toastS(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) = activity?.toastS(message)

inline fun Fragment.alertDialog(body: AlertDialog.Builder.() -> AlertDialog.Builder) = activity?.alertDialog(body)