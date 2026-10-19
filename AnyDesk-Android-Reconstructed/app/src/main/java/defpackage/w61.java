package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class w61 implements Parcelable {
    public static final Parcelable.Creator<w61> CREATOR = new u5(24);
    public int c;
    public int d;
    public int[] e;
    public boolean f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.c + ", mGapDir=" + this.d + ", mHasUnwantedGapAfter=" + this.f + ", mGapPerSpan=" + Arrays.toString(this.e) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.f ? 1 : 0);
        int[] iArr = this.e;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.e);
        }
    }
}
