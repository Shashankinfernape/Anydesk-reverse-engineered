package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class sy0 implements Parcelable {
    public static final Parcelable.Creator<sy0> CREATOR = new u5(23);
    public q80 c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new ry0(this);
                }
                parcel.writeStrongBinder(this.c.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i, Bundle bundle) {
    }
}
