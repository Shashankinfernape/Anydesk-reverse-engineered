package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;

/* JADX INFO: loaded from: classes.dex */
public final class jq0 {
    public float a;
    public float b;
    public float c;
    public float d;
    public final /* synthetic */ kq0 e;

    public jq0(kq0 kq0Var) {
        this.e = kq0Var;
    }

    public final void a(float f, float f2) {
        kq0 kq0Var = this.e;
        if (kq0Var.g) {
            kq0Var.f.a(kq0Var.j, kq0Var.k, kq0Var.h, kq0Var.i, f, f2);
            kq0Var.g = false;
            return;
        }
        ConnectionFragment connectionFragment = kq0Var.d;
        connectionFragment.v1(0);
        nu0 nu0Var = connectionFragment.F0;
        if (nu0Var != null) {
            t70.Y(new xo(nu0Var, 0));
        }
        connectionFragment.b1();
    }

    public final void b(float f, float f2) {
        kq0 kq0Var = this.e;
        if (!kq0Var.g) {
            ConnectionFragment connectionFragment = kq0Var.d;
            int i = (int) f;
            int i2 = (int) f2;
            connectionFragment.v1(0);
            nu0 nu0Var = connectionFragment.F0;
            if (nu0Var != null) {
                t70.Y(new wo(nu0Var, i, i2));
                return;
            }
            return;
        }
        int i3 = (int) ((this.c + f) - this.a);
        kq0Var.j = i3;
        int i4 = (int) ((this.d + f2) - this.b);
        kq0Var.k = i4;
        if (i3 < 0) {
            kq0Var.j = 0;
        }
        int i5 = kq0Var.j;
        int i6 = kq0Var.h;
        if (i5 > i6) {
            kq0Var.j = i6;
        }
        if (i4 < 0) {
            kq0Var.k = 0;
        }
        int i7 = kq0Var.k;
        int i8 = kq0Var.i;
        if (i7 > i8) {
            kq0Var.k = i8;
        }
        kq0Var.c.d1(kq0Var.j, kq0Var.k);
    }

    public final void c(float f, float f2) {
        kq0 kq0Var = this.e;
        kq0Var.f.b(true);
        this.a = f;
        this.b = f2;
        this.c = kq0Var.j;
        this.d = kq0Var.k;
        Looper looper = t70.a;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - kq0Var.n > 500) {
            ConnectionFragment connectionFragment = kq0Var.c;
            connectionFragment.v1(0);
            connectionFragment.r1();
        } else {
            kq0Var.g = true;
        }
        kq0Var.n = jUptimeMillis;
    }
}
