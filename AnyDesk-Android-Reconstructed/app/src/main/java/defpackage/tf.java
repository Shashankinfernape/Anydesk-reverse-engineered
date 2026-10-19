package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class tf implements Parcelable {
    public static final Parcelable.Creator<tf> CREATOR = new u5(3);
    public final int[] c;
    public final ArrayList d;
    public final int[] e;
    public final int[] f;
    public final int g;
    public final String h;
    public final int i;
    public final int j;
    public final CharSequence k;
    public final int l;
    public final CharSequence m;
    public final ArrayList n;
    public final ArrayList o;
    public final boolean p;

    public tf(sf sfVar) {
        int size = sfVar.a.size();
        this.c = new int[size * 6];
        if (!sfVar.g) {
            nh0.j("Not on back stack");
            throw null;
        }
        this.d = new ArrayList(size);
        this.e = new int[size];
        this.f = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            l50 l50Var = (l50) sfVar.a.get(i2);
            int i3 = i + 1;
            this.c[i] = l50Var.a;
            ArrayList arrayList = this.d;
            c40 c40Var = l50Var.b;
            arrayList.add(c40Var != null ? c40Var.g : null);
            int[] iArr = this.c;
            iArr[i3] = l50Var.c ? 1 : 0;
            iArr[i + 2] = l50Var.d;
            iArr[i + 3] = l50Var.e;
            int i4 = i + 5;
            iArr[i + 4] = l50Var.f;
            i += 6;
            iArr[i4] = l50Var.g;
            this.e[i2] = l50Var.h.ordinal();
            this.f[i2] = l50Var.i.ordinal();
        }
        this.g = sfVar.f;
        this.h = sfVar.i;
        this.i = sfVar.s;
        this.j = sfVar.j;
        this.k = sfVar.k;
        this.l = sfVar.l;
        this.m = sfVar.m;
        this.n = sfVar.n;
        this.o = sfVar.o;
        this.p = sfVar.p;
    }

    public final void a(sf sfVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.c;
            boolean z = true;
            if (i >= iArr.length) {
                sfVar.f = this.g;
                sfVar.i = this.h;
                sfVar.g = true;
                sfVar.j = this.j;
                sfVar.k = this.k;
                sfVar.l = this.l;
                sfVar.m = this.m;
                sfVar.n = this.n;
                sfVar.o = this.o;
                sfVar.p = this.p;
                return;
            }
            l50 l50Var = new l50();
            int i3 = i + 1;
            l50Var.a = iArr[i];
            if (t40.H(2)) {
                Log.v("FragmentManager", "Instantiate " + sfVar + " op #" + i2 + " base fragment #" + iArr[i3]);
            }
            l50Var.h = af0.values()[this.e[i2]];
            l50Var.i = af0.values()[this.f[i2]];
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            l50Var.c = z;
            int i5 = iArr[i4];
            l50Var.d = i5;
            int i6 = iArr[i + 3];
            l50Var.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            l50Var.f = i8;
            i += 6;
            int i9 = iArr[i7];
            l50Var.g = i9;
            sfVar.b = i5;
            sfVar.c = i6;
            sfVar.d = i8;
            sfVar.e = i9;
            sfVar.b(l50Var);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.c);
        parcel.writeStringList(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeIntArray(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeInt(this.l);
        TextUtils.writeToParcel(this.m, parcel, 0);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }

    public tf(Parcel parcel) {
        this.c = parcel.createIntArray();
        this.d = parcel.createStringArrayList();
        this.e = parcel.createIntArray();
        this.f = parcel.createIntArray();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.readInt();
        this.m = (CharSequence) creator.createFromParcel(parcel);
        this.n = parcel.createStringArrayList();
        this.o = parcel.createStringArrayList();
        this.p = parcel.readInt() != 0;
    }
}
