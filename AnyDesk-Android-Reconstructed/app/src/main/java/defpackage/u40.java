package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u40 implements Parcelable {
    public static final Parcelable.Creator<u40> CREATOR = new u5(7);
    public ArrayList c;
    public ArrayList d;
    public tf[] e;
    public int f;
    public String g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.c);
        parcel.writeStringList(this.d);
        parcel.writeTypedArray(this.e, i);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeStringList(this.h);
        parcel.writeTypedList(this.i);
        parcel.writeTypedList(this.j);
    }
}
