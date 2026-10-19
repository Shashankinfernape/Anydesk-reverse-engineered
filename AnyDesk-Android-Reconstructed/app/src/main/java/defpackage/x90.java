package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class x90 implements Parcelable {
    public static final Parcelable.Creator<x90> CREATOR = new u5(9);
    public final IntentSender c;
    public final Intent d;
    public final int e;
    public final int f;

    public x90(IntentSender intentSender, Intent intent, int i, int i2) {
        this.c = intentSender;
        this.d = intent;
        this.e = i;
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }
}
