package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class uf0 implements Parcelable {
    public static final Parcelable.Creator<uf0> CREATOR = new u5(10);
    public int c;
    public int d;
    public boolean e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
