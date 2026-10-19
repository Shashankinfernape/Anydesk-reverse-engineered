package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class jl extends d2 {
    public static final Parcelable.Creator<jl> CREATOR = new c2(1);
    public boolean e;

    public jl(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.e = parcel.readInt() == 1;
    }

    @Override // defpackage.d2, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.e ? 1 : 0);
    }
}
