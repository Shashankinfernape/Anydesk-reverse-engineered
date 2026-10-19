package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class xn implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long c = SystemClock.uptimeMillis() + 10000;
    public Runnable d;
    public boolean e;
    public final /* synthetic */ qa f;

    public xn(qa qaVar) {
        this.f = qaVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.d = runnable;
        View decorView = this.f.getWindow().getDecorView();
        decorView.getClass();
        if (!this.e) {
            decorView.postOnAnimation(new l(6, this));
        } else if (y90.e(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.d;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.c) {
                this.e = false;
                this.f.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.d = null;
        n50 n50Var = (n50) this.f.i.getValue();
        synchronized (n50Var.a) {
            z = n50Var.b;
        }
        if (z) {
            this.e = false;
            this.f.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
