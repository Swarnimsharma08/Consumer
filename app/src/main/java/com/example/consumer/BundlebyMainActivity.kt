package com.example.consumer

import android.os.Parcel
import android.os.Parcelable

data class BundlebyMainActivity(var msg: String?, var ID: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(msg)
        parcel.writeString(ID)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BundlebyMainActivity> {
        override fun createFromParcel(parcel: Parcel): BundlebyMainActivity {
            return BundlebyMainActivity(parcel)
        }

        override fun newArray(size: Int): Array<BundlebyMainActivity?> {
            return arrayOfNulls(size)
        }
    }
}
