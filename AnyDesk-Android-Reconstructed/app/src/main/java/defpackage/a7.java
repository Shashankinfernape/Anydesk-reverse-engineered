package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionFragment;

/* JADX INFO: loaded from: classes.dex */
public final class a7 {
    public ConnectionFragment a;
    public long c = 0;
    public nm0 d = nm0.d;
    public final h7 b = new h7(10, a70.h, new af1(15, this), "ClickDelayer");

    public a7(ConnectionFragment connectionFragment) {
        this.a = connectionFragment;
    }

    public static void a(a7 a7Var, a70 a70Var) {
        Looper looper = t70.a;
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = jUptimeMillis - a7Var.c;
        if (j < 20 && !a70Var.b.equals(a7Var.d)) {
            try {
                Thread.sleep(20 - j);
            } catch (InterruptedException unused) {
            }
        }
        a7Var.c = jUptimeMillis;
        a7Var.d = a70Var.b;
    }

    public final void b() {
        h7 h7Var = this.b;
        synchronized (h7Var) {
            h7Var.c = true;
            h7Var.a = 0;
            h7Var.b = 0;
            h7Var.notifyAll();
        }
        ((f7) h7Var.f).interrupt();
        this.a = null;
    }

    public final void c(e7 e7Var) {
        synchronized (this.b) {
            try {
                a70 a70Var = (a70) this.b.g();
                if (a70Var == null) {
                    return;
                }
                a70Var.a = 12;
                a70Var.g = e7Var;
                this.b.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(nm0 nm0Var, float f, float f2) {
        synchronized (this.b) {
            try {
                a70 a70Var = (a70) this.b.g();
                if (a70Var == null) {
                    return;
                }
                a70Var.a = 9;
                a70Var.b = nm0Var;
                a70Var.c = f;
                a70Var.d = f2;
                this.b.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(nm0 nm0Var, float f, float f2) {
        synchronized (this.b) {
            try {
                a70 a70Var = (a70) this.b.g();
                if (a70Var == null) {
                    return;
                }
                a70Var.a = 11;
                a70Var.b = nm0Var;
                a70Var.c = f;
                a70Var.d = f2;
                this.b.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
