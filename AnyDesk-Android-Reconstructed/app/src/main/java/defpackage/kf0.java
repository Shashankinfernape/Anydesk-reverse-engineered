package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class kf0 extends dr implements ft {
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = AtomicIntegerFieldUpdater.newUpdater(kf0.class, "runningWorkers$volatile");
    public final /* synthetic */ ft e;
    public final dr f;
    public final int g;
    public final rh0 h;
    public final Object i;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public kf0(dr drVar, int i) {
        ft ftVar = drVar instanceof ft ? (ft) drVar : null;
        this.e = ftVar == null ? hs.a : ftVar;
        this.f = drVar;
        this.g = i;
        this.h = new rh0();
        this.i = new Object();
    }

    @Override // defpackage.ft
    public final uu c(long j2, ca1 ca1Var, br brVar) {
        return this.e.c(j2, ca1Var, brVar);
    }

    @Override // defpackage.ft
    public final void d(long j2, xi xiVar) {
        this.e.d(j2, xiVar);
    }

    @Override // defpackage.dr
    public final void e(br brVar, Runnable runnable) {
        Runnable runnableO;
        this.h.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
        if (atomicIntegerFieldUpdater.get(this) >= this.g || !p() || (runnableO = o()) == null) {
            return;
        }
        try {
            r71.L(this.f, this, new d3(this, 21, runnableO));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.dr
    public final void f(br brVar, Runnable runnable) {
        Runnable runnableO;
        this.h.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
        if (atomicIntegerFieldUpdater.get(this) >= this.g || !p() || (runnableO = o()) == null) {
            return;
        }
        try {
            this.f.f(this, new d3(this, 21, runnableO));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    public final Runnable o() {
        while (true) {
            Runnable runnable = (Runnable) this.h.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.i) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.h.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean p() {
        synchronized (this.i) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = j;
            if (atomicIntegerFieldUpdater.get(this) >= this.g) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.dr
    public final String toString() {
        return this.f + ".limitedParallelism(" + this.g + ')';
    }
}
