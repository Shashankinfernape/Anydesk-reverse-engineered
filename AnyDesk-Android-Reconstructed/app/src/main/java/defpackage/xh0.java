package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class xh0 implements Cloneable {
    public /* synthetic */ boolean c;
    public /* synthetic */ long[] d;
    public /* synthetic */ Object[] e;
    public /* synthetic */ int f;

    public xh0() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.d = new long[i4];
        this.e = new Object[i4];
    }

    public final void a(long j, Long l) {
        int i = this.f;
        if (i != 0 && j <= this.d[i - 1]) {
            g(l, j);
            return;
        }
        if (this.c) {
            long[] jArr = this.d;
            if (i >= jArr.length) {
                Object[] objArr = this.e;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != y90.d) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.c = false;
                this.f = i2;
            }
        }
        int i4 = this.f;
        if (i4 >= this.d.length) {
            int i5 = (i4 + 1) * 8;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 8;
            this.d = Arrays.copyOf(this.d, i8);
            this.e = Arrays.copyOf(this.e, i8);
        }
        this.d[i4] = j;
        this.e[i4] = l;
        this.f = i4 + 1;
    }

    public final void b() {
        int i = this.f;
        Object[] objArr = this.e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f = 0;
        this.c = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final xh0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        xh0 xh0Var = (xh0) objClone;
        xh0Var.d = (long[]) this.d.clone();
        xh0Var.e = (Object[]) this.e.clone();
        return xh0Var;
    }

    public final Object d(long j) {
        Object obj;
        int iG = y90.g(this.d, this.f, j);
        if (iG < 0 || (obj = this.e[iG]) == y90.d) {
            return null;
        }
        return obj;
    }

    public final Object e(long j) {
        Object obj;
        int iG = y90.g(this.d, this.f, j);
        if (iG < 0 || (obj = this.e[iG]) == y90.d) {
            return -1L;
        }
        return obj;
    }

    public final long f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f)) {
            nh0.e(gr0.e(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.c) {
            long[] jArr = this.d;
            Object[] objArr = this.e;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != y90.d) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.c = false;
            this.f = i3;
        }
        return this.d[i];
    }

    public final void g(Object obj, long j) {
        Object obj2 = y90.d;
        int iG = y90.g(this.d, this.f, j);
        if (iG >= 0) {
            this.e[iG] = obj;
            return;
        }
        int i = ~iG;
        int i2 = this.f;
        if (i < i2) {
            Object[] objArr = this.e;
            if (objArr[i] == obj2) {
                this.d[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.c) {
            long[] jArr = this.d;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.e;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.c = false;
                this.f = i3;
                i = ~y90.g(this.d, i3, j);
            }
        }
        int i5 = this.f;
        if (i5 >= this.d.length) {
            int i6 = (i5 + 1) * 8;
            for (int i7 = 4; i7 < 32; i7++) {
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
            }
            int i9 = i6 / 8;
            this.d = Arrays.copyOf(this.d, i9);
            this.e = Arrays.copyOf(this.e, i9);
        }
        int i10 = this.f - i;
        if (i10 != 0) {
            long[] jArr2 = this.d;
            int i11 = i + 1;
            jArr2.getClass();
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.e;
            ae.O(objArr3, objArr3, i11, i, this.f);
        }
        this.d[i] = j;
        this.e[i] = obj;
        this.f++;
    }

    public final int h() {
        if (this.c) {
            int i = this.f;
            long[] jArr = this.d;
            Object[] objArr = this.e;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != y90.d) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.c = false;
            this.f = i2;
        }
        return this.f;
    }

    public final Object i(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f)) {
            nh0.e(gr0.e(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.c) {
            long[] jArr = this.d;
            Object[] objArr = this.e;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != y90.d) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.c = false;
            this.f = i3;
        }
        return this.e[i];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 28);
        sb.append('{');
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(f(i2));
            sb.append('=');
            Object objI = i(i2);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
