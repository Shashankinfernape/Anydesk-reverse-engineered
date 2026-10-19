package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.u5;
import defpackage.xd1;
import defpackage.yd1;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new u5(19);
    public final yd1 c;

    public ParcelImpl(Parcel parcel) {
        this.c = new xd1(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new xd1(parcel).k(this.c);
    }
}
