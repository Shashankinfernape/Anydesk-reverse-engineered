package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class jv extends d2 {
    public static final Parcelable.Creator<jv> CREATOR = new c2(2);
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    public jv(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
    }

    @Override // defpackage.d2, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
    }
}
