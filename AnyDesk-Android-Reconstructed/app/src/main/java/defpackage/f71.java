package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class f71 extends w2 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.w2
    public final boolean a(v2 v2Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(ec1.f);
        return true;
    }

    @Override // defpackage.w2
    public final rq[] b(v2 v2Var) {
        this.a.set(null);
        return uj.a;
    }
}
