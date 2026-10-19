package defpackage;

import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class d7 {
    public a7 a;
    public c7 b;
    public c7 c;
    public c7 d;
    public vy0 e;
    public vy0 f;
    public vy0 g;
    public nm0 h;
    public float i;
    public float j;
    public float k;
    public float l;
    public long m;
    public long n;
    public e7 o;

    public final void a() {
        synchronized (this) {
            try {
                vy0 vy0Var = this.e;
                if (vy0Var != null) {
                    vy0Var.d();
                }
                vy0 vy0Var2 = this.f;
                if (vy0Var2 != null) {
                    vy0Var2.d();
                }
                vy0 vy0Var3 = this.g;
                if (vy0Var3 != null) {
                    vy0Var3.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = null;
        this.e.d();
        this.e = null;
        this.f.d();
        this.f = null;
        this.g.d();
        this.g = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final void b() {
        a7 a7Var = this.a;
        if (a7Var != null) {
            synchronized (a7Var.b) {
                try {
                    a70 a70Var = (a70) a7Var.b.g();
                    if (a70Var == null) {
                        return;
                    }
                    a70Var.a = 8;
                    a7Var.b.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c() {
        a7 a7Var = this.a;
        if (a7Var != null) {
            synchronized (a7Var.b) {
                try {
                    a70 a70Var = (a70) a7Var.b.g();
                    if (a70Var == null) {
                        return;
                    }
                    a70Var.a = 3;
                    a7Var.b.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void d(float f, float f2, int i) {
        a7 a7Var = this.a;
        if (a7Var != null) {
            synchronized (a7Var.b) {
                try {
                    a70 a70Var = (a70) a7Var.b.g();
                    if (a70Var == null) {
                        return;
                    }
                    a70Var.a = 5;
                    a70Var.c = f;
                    a70Var.d = f2;
                    a70Var.e = i;
                    a7Var.b.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized void e(nm0 nm0Var, float f, float f2) {
        try {
            vy0 vy0Var = this.e;
            Looper looper = t70.a;
            long jUptimeMillis = SystemClock.uptimeMillis();
            boolean z = !this.h.equals(nm0Var) || jUptimeMillis - this.m > 10;
            this.h = nm0Var;
            this.i = f;
            this.j = f2;
            if (z) {
                if (vy0Var != null) {
                    vy0Var.d();
                }
                a7 a7Var = this.a;
                if (a7Var != null) {
                    a7Var.d(nm0Var, f, f2);
                }
                this.m = jUptimeMillis;
            } else if (vy0Var != null && !vy0Var.a()) {
                vy0Var.b(10L);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(nm0 nm0Var, float f, float f2) {
        try {
            vy0 vy0Var = this.f;
            Looper looper = t70.a;
            long jUptimeMillis = SystemClock.uptimeMillis();
            boolean z = !this.h.equals(nm0Var) || jUptimeMillis - this.m > 10;
            this.h = nm0Var;
            this.k = f;
            this.l = f2;
            if (z) {
                if (vy0Var != null) {
                    vy0Var.d();
                }
                a7 a7Var = this.a;
                if (a7Var != null) {
                    a7Var.e(nm0Var, f, f2);
                }
                this.m = jUptimeMillis;
            } else if (vy0Var != null && !vy0Var.a()) {
                vy0Var.b(10L);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void g() {
        a7 a7Var = this.a;
        if (a7Var != null) {
            synchronized (a7Var.b) {
                try {
                    a70 a70Var = (a70) a7Var.b.g();
                    if (a70Var == null) {
                        return;
                    }
                    a70Var.a = 10;
                    a7Var.b.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void h(float f, float f2, float f3) {
        a7 a7Var = this.a;
        if (a7Var != null) {
            synchronized (a7Var.b) {
                try {
                    a70 a70Var = (a70) a7Var.b.g();
                    if (a70Var == null) {
                        return;
                    }
                    a70Var.a = 7;
                    a70Var.c = f;
                    a70Var.d = f2;
                    a70Var.f = f3;
                    a7Var.b.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void i(float f, float f2) {
        a7 a7Var = this.a;
        if (a7Var != null) {
            synchronized (a7Var.b) {
                try {
                    a70 a70Var = (a70) a7Var.b.g();
                    if (a70Var == null) {
                        return;
                    }
                    a70Var.a = 2;
                    a70Var.c = f;
                    a70Var.d = f2;
                    a7Var.b.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void j(float f, float f2, float f3) {
        a7 a7Var = this.a;
        if (a7Var != null) {
            synchronized (a7Var.b) {
                try {
                    a70 a70Var = (a70) a7Var.b.g();
                    if (a70Var == null) {
                        return;
                    }
                    a70Var.a = 6;
                    a70Var.c = f;
                    a70Var.d = f2;
                    a70Var.f = f3;
                    a7Var.b.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void k(float f, float f2) {
        a7 a7Var = this.a;
        if (a7Var != null) {
            synchronized (a7Var.b) {
                try {
                    a70 a70Var = (a70) a7Var.b.g();
                    if (a70Var == null) {
                        return;
                    }
                    a70Var.a = 1;
                    a70Var.c = f;
                    a70Var.d = f2;
                    a7Var.b.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void l(float f, float f2, int i) {
        a7 a7Var = this.a;
        if (a7Var != null) {
            synchronized (a7Var.b) {
                try {
                    a70 a70Var = (a70) a7Var.b.g();
                    if (a70Var == null) {
                        return;
                    }
                    a70Var.a = 4;
                    a70Var.c = f;
                    a70Var.d = f2;
                    a70Var.e = i;
                    a7Var.b.b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
