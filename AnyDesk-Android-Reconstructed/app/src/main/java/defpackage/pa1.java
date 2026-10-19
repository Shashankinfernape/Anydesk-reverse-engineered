package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class pa1 extends d2 {
    public static final Parcelable.Creator<pa1> CREATOR = new c2(9);
    public int e;
    public boolean f;

    public pa1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = parcel.readInt();
        this.f = parcel.readInt() != 0;
    }

    @Override // defpackage.d2, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
