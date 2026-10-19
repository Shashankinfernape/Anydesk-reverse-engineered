package defpackage;

import java.util.Timer;

/* JADX INFO: loaded from: classes.dex */
public final class vy0 {
    public static final Timer c = new Timer("ReusableTimer");
    public final Runnable a;
    public uy0 b = null;

    public vy0(Runnable runnable) {
        this.a = runnable;
    }

    public final synchronized boolean a() {
        return this.b != null;
    }

    public final synchronized void b(long j) {
        d();
        uy0 uy0Var = new uy0(this);
        this.b = uy0Var;
        c.schedule(uy0Var, j);
    }

    public final synchronized void c(long j, long j2) {
        d();
        uy0 uy0Var = new uy0(this);
        this.b = uy0Var;
        c.schedule(uy0Var, j, j2);
    }

    public final synchronized void d() {
        uy0 uy0Var = this.b;
        if (uy0Var != null) {
            uy0Var.cancel();
            this.b = null;
            c.purge();
        }
    }
}
