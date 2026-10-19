package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ca0 extends td0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(ca0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final sd0 j;

    public ca0(sd0 sd0Var) {
        this.j = sd0Var;
    }

    @Override // defpackage.td0
    public final boolean r() {
        return true;
    }

    @Override // defpackage.td0
    public final void s(Throwable th) {
        if (k.compareAndSet(this, 0, 1)) {
            this.j.h(th);
        }
    }
}
