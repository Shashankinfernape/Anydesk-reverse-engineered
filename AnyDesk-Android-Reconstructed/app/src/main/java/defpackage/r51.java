package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class r51 implements Comparable {
    public boolean c;
    public float g;
    public int n;
    public int d = -1;
    public int e = -1;
    public int f = 0;
    public boolean h = false;
    public final float[] i = new float[9];
    public final float[] j = new float[9];
    public yd[] k = new yd[16];
    public int l = 0;
    public int m = 0;

    public r51(int i) {
        this.n = i;
    }

    public final void a(yd ydVar) {
        int i = 0;
        while (true) {
            int i2 = this.l;
            yd[] ydVarArr = this.k;
            if (i >= i2) {
                if (i2 >= ydVarArr.length) {
                    this.k = (yd[]) Arrays.copyOf(ydVarArr, ydVarArr.length * 2);
                }
                yd[] ydVarArr2 = this.k;
                int i3 = this.l;
                ydVarArr2[i3] = ydVar;
                this.l = i3 + 1;
                return;
            }
            if (ydVarArr[i] == ydVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(yd ydVar) {
        int i = this.l;
        int i2 = 0;
        while (i2 < i) {
            if (this.k[i2] == ydVar) {
                while (i2 < i - 1) {
                    yd[] ydVarArr = this.k;
                    int i3 = i2 + 1;
                    ydVarArr[i2] = ydVarArr[i3];
                    i2 = i3;
                }
                this.l--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.n = 5;
        this.f = 0;
        this.d = -1;
        this.e = -1;
        this.g = 0.0f;
        this.h = false;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = null;
        }
        this.l = 0;
        this.m = 0;
        this.c = false;
        Arrays.fill(this.j, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.d - ((r51) obj).d;
    }

    public final void d(xf0 xf0Var, float f) {
        this.g = f;
        this.h = true;
        int i = this.l;
        this.e = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].h(xf0Var, this, false);
        }
        this.l = 0;
    }

    public final void e(xf0 xf0Var, yd ydVar) {
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].i(xf0Var, ydVar, false);
        }
        this.l = 0;
    }

    public final String toString() {
        return "" + this.d;
    }
}
