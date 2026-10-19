package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d2;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d2 {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public boolean e;
    public boolean f;
    public int g;
    public float h;
    public boolean i;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = parcel.readByte() != 0;
        this.f = parcel.readByte() != 0;
        this.g = parcel.readInt();
        this.h = parcel.readFloat();
        this.i = parcel.readByte() != 0;
    }

    @Override // defpackage.d2, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.g);
        parcel.writeFloat(this.h);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
    }
}
