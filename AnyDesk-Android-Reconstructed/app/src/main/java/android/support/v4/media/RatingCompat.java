package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.u5;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new u5(22);
    public final int c;
    public final float d;

    public RatingCompat(int i, float f) {
        this.c = i;
        this.d = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.c);
        sb.append(" rating=");
        float f = this.d;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeFloat(this.d);
    }
}
