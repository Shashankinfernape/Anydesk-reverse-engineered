package defpackage;

import android.graphics.Insets;

/* JADX INFO: loaded from: classes.dex */
public final class s90 {
    public static final s90 e = new s90(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public s90(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static s90 a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new s90(i, i2, i3, i4);
    }

    public static s90 b(Insets insets) {
        return a(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets c() {
        return ld.i(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s90.class != obj.getClass()) {
            return false;
        }
        s90 s90Var = (s90) obj;
        return this.d == s90Var.d && this.a == s90Var.a && this.c == s90Var.c && this.b == s90Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
