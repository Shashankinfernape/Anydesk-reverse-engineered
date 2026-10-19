package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ly extends d2 {
    public static final Parcelable.Creator<ly> CREATOR = new c2(3);
    public final i51 e;

    public ly(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.e = new i51(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.e.put(strArr[i2], bundleArr[i2]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.e + "}";
    }

    @Override // defpackage.d2, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        i51 i51Var = this.e;
        int i2 = i51Var.e;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) i51Var.f(i3);
            bundleArr[i3] = (Bundle) i51Var.i(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ly(Parcelable parcelable) {
        super(parcelable);
        this.e = new i51(0);
    }
}
