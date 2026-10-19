package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class dp0 extends d2 {
    public static final Parcelable.Creator<dp0> CREATOR = new c2(5);
    public Bundle e;

    public dp0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = parcel.readBundle(classLoader);
    }

    @Override // defpackage.d2, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.e);
    }
}
