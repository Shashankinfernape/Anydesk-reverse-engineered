package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class zl0 extends z60 {
    public final int a;
    public final bm0 b;
    public final xl0 c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public boolean j;

    public zl0(int i, int i2, int i3, int i4, bm0 bm0Var, xl0 xl0Var, String str, String str2, String str3, String str4, int i5, int i6) {
        super(i, i2, i3);
        this.a = i4;
        this.b = bm0Var;
        this.c = xl0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = i5;
        this.i = i6;
        this.j = false;
    }

    public final boolean a() {
        int i = this.a;
        if (i < 10 || i > 13) {
            return i >= 20 && i <= 23;
        }
        return true;
    }
}
