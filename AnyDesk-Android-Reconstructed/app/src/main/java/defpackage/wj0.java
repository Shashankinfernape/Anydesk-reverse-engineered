package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class wj0 extends d2 {
    public static final Parcelable.Creator<wj0> CREATOR = new c2(4);
    public boolean e;

    public wj0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            wj0.class.getClassLoader();
        }
        this.e = parcel.readInt() == 1;
    }

    @Override // defpackage.d2, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
