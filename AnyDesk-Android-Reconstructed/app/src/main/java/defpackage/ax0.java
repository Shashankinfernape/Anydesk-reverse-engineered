package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ax0 extends d2 {
    public static final Parcelable.Creator<ax0> CREATOR = new c2(7);
    public Parcelable e;

    public ax0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = parcel.readParcelable(classLoader == null ? rw0.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.d2, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.e, 0);
    }
}
