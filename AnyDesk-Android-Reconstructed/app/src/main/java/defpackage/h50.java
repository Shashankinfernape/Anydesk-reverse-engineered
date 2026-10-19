package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h50 implements Parcelable {
    public static final Parcelable.Creator<h50> CREATOR = new u5(8);
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final int m;
    public final String n;
    public final int o;
    public final boolean p;

    public h50(Parcel parcel) {
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readString();
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt();
        this.n = parcel.readString();
        this.o = parcel.readInt();
        this.p = parcel.readInt() != 0;
    }

    public final c40 a(n40 n40Var) {
        c40 c40VarA = n40Var.a(this.c);
        c40VarA.g = this.d;
        c40VarA.p = this.e;
        c40VarA.r = true;
        c40VarA.y = this.f;
        c40VarA.z = this.g;
        c40VarA.A = this.h;
        c40VarA.D = this.i;
        c40VarA.n = this.j;
        c40VarA.C = this.k;
        c40VarA.B = this.l;
        c40VarA.P = af0.values()[this.m];
        c40VarA.j = this.n;
        c40VarA.k = this.o;
        c40VarA.J = this.p;
        return c40VarA;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.c);
        sb.append(" (");
        sb.append(this.d);
        sb.append(")}:");
        if (this.e) {
            sb.append(" fromLayout");
        }
        int i = this.g;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.h;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.i) {
            sb.append(" retainInstance");
        }
        if (this.j) {
            sb.append(" removing");
        }
        if (this.k) {
            sb.append(" detached");
        }
        if (this.l) {
            sb.append(" hidden");
        }
        String str2 = this.n;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.o);
        }
        if (this.p) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p ? 1 : 0);
    }

    public h50(c40 c40Var) {
        this.c = c40Var.getClass().getName();
        this.d = c40Var.g;
        this.e = c40Var.p;
        this.f = c40Var.y;
        this.g = c40Var.z;
        this.h = c40Var.A;
        this.i = c40Var.D;
        this.j = c40Var.n;
        this.k = c40Var.C;
        this.l = c40Var.B;
        this.m = c40Var.P.ordinal();
        this.n = c40Var.j;
        this.o = c40Var.k;
        this.p = c40Var.J;
    }
}
