package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x61 implements Parcelable {
    public static final Parcelable.Creator<x61> CREATOR = new u5(25);
    public int c;
    public int d;
    public int e;
    public int[] f;
    public int g;
    public int[] h;
    public ArrayList i;
    public boolean j;
    public boolean k;
    public boolean l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        if (this.e > 0) {
            parcel.writeIntArray(this.f);
        }
        parcel.writeInt(this.g);
        if (this.g > 0) {
            parcel.writeIntArray(this.h);
        }
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeList(this.i);
    }
}
