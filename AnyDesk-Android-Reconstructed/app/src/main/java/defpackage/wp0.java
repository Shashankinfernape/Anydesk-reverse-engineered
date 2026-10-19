package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class wp0 extends h2 implements pd0 {
    public static final wp0 d = new wp0(fw.f);

    @Override // defpackage.pd0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.pd0
    public final ml i(wd0 wd0Var) {
        return xp0.c;
    }

    @Override // defpackage.pd0
    public final uu m(boolean z, boolean z2, sd0 sd0Var) {
        return xp0.c;
    }

    @Override // defpackage.pd0
    public final CancellationException n() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.pd0
    public final Object s(sq sqVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.pd0
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.pd0, defpackage.fk
    public final void b(CancellationException cancellationException) {
    }
}
