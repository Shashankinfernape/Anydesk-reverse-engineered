package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class x51 implements Cloneable {
    public /* synthetic */ boolean c;
    public /* synthetic */ int[] d;
    public /* synthetic */ Object[] e;
    public /* synthetic */ int f;

    public x51(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.d = new int[i5];
        this.e = new Object[i5];
    }

    public final void a(int i, Object obj) {
        int i2 = this.f;
        if (i2 != 0 && i <= this.d[i2 - 1]) {
            e(i, obj);
            return;
        }
        if (this.c && i2 >= this.d.length) {
            r71.b(this);
        }
        int i3 = this.f;
        if (i3 >= this.d.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.d = Arrays.copyOf(this.d, i7);
            this.e = Arrays.copyOf(this.e, i7);
        }
        this.d[i3] = i;
        this.e[i3] = obj;
        this.f = i3 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final x51 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        x51 x51Var = (x51) objClone;
        x51Var.d = (int[]) this.d.clone();
        x51Var.e = (Object[]) this.e.clone();
        return x51Var;
    }

    public final Object c(int i) {
        Object obj;
        int iF = y90.f(this.f, i, this.d);
        if (iF < 0 || (obj = this.e[iF]) == r71.e) {
            return null;
        }
        return obj;
    }

    public final int d(int i) {
        if (this.c) {
            r71.b(this);
        }
        return this.d[i];
    }

    public final void e(int i, Object obj) {
        int iF = y90.f(this.f, i, this.d);
        if (iF >= 0) {
            this.e[iF] = obj;
            return;
        }
        int i2 = ~iF;
        int i3 = this.f;
        if (i2 < i3) {
            Object[] objArr = this.e;
            if (objArr[i2] == r71.e) {
                this.d[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.c && i3 >= this.d.length) {
            r71.b(this);
            i2 = ~y90.f(this.f, i, this.d);
        }
        int i4 = this.f;
        if (i4 >= this.d.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            this.d = Arrays.copyOf(this.d, i8);
            this.e = Arrays.copyOf(this.e, i8);
        }
        int i9 = this.f;
        if (i9 - i2 != 0) {
            int[] iArr = this.d;
            int i10 = i2 + 1;
            ae.N(i10, i2, i9, iArr, iArr);
            Object[] objArr2 = this.e;
            ae.O(objArr2, objArr2, i10, i2, this.f);
        }
        this.d[i2] = i;
        this.e[i2] = obj;
        this.f++;
    }

    public final int f() {
        if (this.c) {
            r71.b(this);
        }
        return this.f;
    }

    public final Object g(int i) {
        if (this.c) {
            r71.b(this);
        }
        return this.e[i];
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 28);
        sb.append('{');
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            Object objG = g(i2);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
