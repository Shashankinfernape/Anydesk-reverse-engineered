package defpackage;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class uy0 extends TimerTask {
    public final /* synthetic */ vy0 c;

    public uy0(vy0 vy0Var) {
        this.c = vy0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        Runnable runnable;
        synchronized (this.c) {
            try {
                vy0 vy0Var = this.c;
                runnable = vy0Var.b == this ? vy0Var.a : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
