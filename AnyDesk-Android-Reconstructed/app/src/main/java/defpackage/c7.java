package defpackage;

import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class c7 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ d7 d;

    public /* synthetic */ c7(d7 d7Var, int i) {
        this.c = i;
        this.d = d7Var;
    }

    private final void a() {
        d7 d7Var = this.d;
        synchronized (d7Var) {
            try {
                vy0 vy0Var = d7Var.e;
                if (vy0Var != null && vy0Var.a()) {
                    vy0Var.d();
                    a7 a7Var = d7Var.a;
                    if (a7Var != null) {
                        a7Var.d(d7Var.h, d7Var.i, d7Var.j);
                    }
                    Looper looper = t70.a;
                    d7Var.m = SystemClock.uptimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        d7 d7Var = this.d;
        synchronized (d7Var) {
            try {
                vy0 vy0Var = d7Var.f;
                if (vy0Var != null && vy0Var.a()) {
                    vy0Var.d();
                    a7 a7Var = d7Var.a;
                    if (a7Var != null) {
                        a7Var.e(d7Var.h, d7Var.k, d7Var.l);
                    }
                    Looper looper = t70.a;
                    d7Var.m = SystemClock.uptimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                a();
                return;
            case 1:
                b();
                return;
            default:
                d7 d7Var = this.d;
                synchronized (d7Var) {
                    try {
                        vy0 vy0Var = d7Var.g;
                        if (vy0Var != null && vy0Var.a()) {
                            vy0Var.d();
                            e7 e7Var = d7Var.o;
                            if (e7Var != null) {
                                a7 a7Var = d7Var.a;
                                if (a7Var != null) {
                                    a7Var.c(e7Var);
                                }
                                d7Var.o = null;
                                Looper looper = t70.a;
                                d7Var.n = SystemClock.uptimeMillis();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
