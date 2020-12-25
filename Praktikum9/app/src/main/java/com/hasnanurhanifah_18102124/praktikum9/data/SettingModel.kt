package com.hasnanurhanifah_18102124.praktikum9.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


    @Parcelize
    data class SettingModel (
        var name: String? = null,
        var email: String? = null,
        var age: Int = 0,
        var phoneNumber: String? = null,
        var hobi: String? = null,
        var address: String? = null,
        var isDarkTheme: Boolean = false
    ): Parcelable