package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class wf implements Parcelable {
    public static final Parcelable.Creator<wf> CREATOR = new u5(5);
    public Integer A;
    public Integer B;
    public Integer C;
    public Integer D;
    public Integer E;
    public Boolean F;
    public int c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public String l;
    public Locale p;
    public CharSequence q;
    public CharSequence r;
    public int s;
    public int t;
    public Integer u;
    public Integer w;
    public Integer x;
    public Integer y;
    public Integer z;
    public int k = 255;
    public int m = -2;
    public int n = -2;
    public int o = -2;
    public Boolean v = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeSerializable(this.h);
        parcel.writeSerializable(this.i);
        parcel.writeSerializable(this.j);
        parcel.writeInt(this.k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        CharSequence charSequence = this.q;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        CharSequence charSequence2 = this.r;
        parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
        parcel.writeInt(this.s);
        parcel.writeSerializable(this.u);
        parcel.writeSerializable(this.w);
        parcel.writeSerializable(this.x);
        parcel.writeSerializable(this.y);
        parcel.writeSerializable(this.z);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.E);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.v);
        parcel.writeSerializable(this.p);
        parcel.writeSerializable(this.F);
    }
}
