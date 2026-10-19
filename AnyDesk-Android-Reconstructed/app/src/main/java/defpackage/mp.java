package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class mp implements f11 {
    public final AtomicReference a;

    public mp(f11 f11Var) {
        this.a = new AtomicReference(f11Var);
    }

    @Override // defpackage.f11
    public final Iterator iterator() {
        f11 f11Var = (f11) this.a.getAndSet(null);
        if (f11Var != null) {
            return f11Var.iterator();
        }
        nh0.j("This sequence can be consumed only once.");
        return null;
    }
}
