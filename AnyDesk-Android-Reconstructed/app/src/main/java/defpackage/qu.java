package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class qu extends m01 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(qu.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.m01, defpackage.wd0
    public final void u(Object obj) throws ou {
        v(obj);
    }

    @Override // defpackage.m01, defpackage.wd0
    public final void v(Object obj) throws ou {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = i;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 == 1) {
                    r71.K(ds.u(this.h), lk0.F(obj));
                    return;
                } else {
                    nh0.j("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
