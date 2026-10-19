package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c2 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ c2(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return d2.d;
                }
                nh0.j("superState must be null");
                return null;
            case 1:
                return new jl(parcel, classLoader);
            case 2:
                return new jv(parcel, classLoader);
            case 3:
                return new ly(parcel, classLoader);
            case 4:
                return new wj0(parcel, classLoader);
            case 5:
                return new dp0(parcel, classLoader);
            case 6:
                return new vt0(parcel, classLoader);
            case 7:
                return new ax0(parcel, classLoader);
            case 8:
                return new s91(parcel, classLoader);
            default:
                return new pa1(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new d2[i];
            case 1:
                return new jl[i];
            case 2:
                return new jv[i];
            case 3:
                return new ly[i];
            case 4:
                return new wj0[i];
            case 5:
                return new dp0[i];
            case 6:
                return new vt0[i];
            case 7:
                return new ax0[i];
            case 8:
                return new s91[i];
            default:
                return new pa1[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return d2.d;
                }
                nh0.j("superState must be null");
                return null;
            case 1:
                return new jl(parcel, null);
            case 2:
                return new jv(parcel, null);
            case 3:
                return new ly(parcel, null);
            case 4:
                return new wj0(parcel, null);
            case 5:
                return new dp0(parcel, null);
            case 6:
                return new vt0(parcel, null);
            case 7:
                return new ax0(parcel, null);
            case 8:
                return new s91(parcel, null);
            default:
                return new pa1(parcel, null);
        }
    }
}
