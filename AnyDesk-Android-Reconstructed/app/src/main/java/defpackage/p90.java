package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import com.anydesk.anydeskandroid.MainApplication;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p90 implements ad0 {
    public final bc c;
    public final PointF d = new PointF();
    public final ArrayList e = new ArrayList();
    public final Object f = new Object();
    public boolean g = false;
    public final RectF h = new RectF();

    public p90(bc bcVar) {
        this.c = bcVar;
    }

    public final boolean a(float f, float f2) {
        synchronized (this.h) {
            try {
                if (this.h.isEmpty()) {
                    return false;
                }
                this.d.set(f, f2);
                if (!MainApplication.v().S(this.d)) {
                    return true;
                }
                RectF rectF = this.h;
                PointF pointF = this.d;
                return rectF.contains(pointF.x, pointF.y);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ad0
    public final boolean b(int i, int i2, nm0 nm0Var, int i3) {
        if (a(i, i2)) {
            return false;
        }
        return this.c.b(i, i2, nm0Var, i3);
    }

    @Override // defpackage.ad0
    public final boolean c(String str) {
        synchronized (this.f) {
            try {
                if (this.g) {
                    return false;
                }
                return this.c.c(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ad0
    public final boolean o(byte b, int i, de0 de0Var, int i2) {
        synchronized (this.f) {
            try {
                if (this.g) {
                    return false;
                }
                return this.c.o(b, i, de0Var, i2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ad0
    public final void t() {
        this.c.t();
    }

    @Override // defpackage.ad0
    public final boolean u(e7 e7Var) {
        boolean z;
        synchronized (this.h) {
            try {
                this.e.clear();
                int i = 0;
                if (this.h.isEmpty()) {
                    z = false;
                } else {
                    for (int i2 = 0; i2 < e7Var.g; i2++) {
                        if (!a(e7Var.n[i2], e7Var.o[i2])) {
                            this.e.add(Integer.valueOf(i2));
                        } else if (e7Var.m[i2] == e7Var.e) {
                            return false;
                        }
                    }
                    z = true;
                }
                if (this.e.size() == e7Var.g) {
                    z = false;
                }
                if (!z) {
                    return this.c.u(e7Var);
                }
                int[] iArr = new int[this.e.size()];
                float[] fArr = new float[this.e.size()];
                float[] fArr2 = new float[this.e.size()];
                ArrayList arrayList = this.e;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    int iIntValue = ((Integer) obj).intValue();
                    iArr[iIntValue] = e7Var.m[iIntValue];
                    fArr[iIntValue] = e7Var.n[iIntValue];
                    fArr2[iIntValue] = e7Var.o[iIntValue];
                }
                return this.c.u(new e7(e7Var.a, e7Var.b, e7Var.c, e7Var.d, e7Var.e, e7Var.f, (byte) this.e.size(), e7Var.h, e7Var.i, e7Var.j, e7Var.k, e7Var.l, iArr, fArr, fArr2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ad0
    public final void x() {
        this.c.x();
    }
}
