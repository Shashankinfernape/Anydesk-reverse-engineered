package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class u90 implements Iterable, yd0 {
    public final int c;
    public final int d;
    public final int e;

    public u90(int i, int i2, int i3) {
        if (i3 == 0) {
            id.q("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            id.q("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.c = i;
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                int i5 = i % i3;
                int i6 = ((i4 < 0 ? i4 + i3 : i4) - (i5 < 0 ? i5 + i3 : i5)) % i3;
                i2 -= i6 < 0 ? i6 + i3 : i6;
            }
        } else {
            if (i3 >= 0) {
                id.q("Step is zero.");
                throw null;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                int i9 = i2 % i7;
                int i10 = ((i8 < 0 ? i8 + i7 : i8) - (i9 < 0 ? i9 + i7 : i9)) % i7;
                i2 += i10 < 0 ? i10 + i7 : i10;
            }
        }
        this.d = i2;
        this.e = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u90)) {
            return false;
        }
        if (isEmpty() && ((u90) obj).isEmpty()) {
            return true;
        }
        u90 u90Var = (u90) obj;
        return this.c == u90Var.c && this.d == u90Var.d && this.e == u90Var.e;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.c * 31) + this.d) * 31) + this.e;
    }

    public boolean isEmpty() {
        int i = this.d;
        int i2 = this.e;
        int i3 = this.c;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new v90(this.c, this.d, this.e);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.d;
        int i2 = this.e;
        int i3 = this.c;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
