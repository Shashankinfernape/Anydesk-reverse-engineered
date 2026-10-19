package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class uf implements Parcelable {
    public static final Parcelable.Creator<uf> CREATOR = new u5(4);
    public final ArrayList c;
    public final ArrayList d;

    public uf(Parcel parcel) {
        this.c = parcel.createStringArrayList();
        this.d = parcel.createTypedArrayList(tf.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.c);
        parcel.writeTypedList(this.d);
    }

    public uf(ArrayList arrayList, ArrayList arrayList2) {
        this.c = arrayList;
        this.d = arrayList2;
    }
}
