package com.tess.android_template.ext

import android.content.Context
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat

fun Context.getColorCompat(@ColorRes resourceId: Int) = ContextCompat.getColor(this, resourceId)