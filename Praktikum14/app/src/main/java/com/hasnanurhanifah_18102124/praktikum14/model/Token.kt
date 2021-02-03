package com.hasnanurhanifah_18102124.praktikum14.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Token (
    var token: String? = null
): Parcelable
