package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d2 implements Parcelable {
    public final Parcelable c;
    public static final b2 d = new b2();
    public static final Parcelable.Creator<d2> CREATOR = new c2(0);

    public d2(Parcelable parcelable) {
        if (parcelable != null) {
            this.c = parcelable == d ? null : parcelable;
        } else {
            id.q("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
    }

    public d2() {
        this.c = null;
    }

    public d2(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.c = parcelable == null ? d : parcelable;
    }
}
