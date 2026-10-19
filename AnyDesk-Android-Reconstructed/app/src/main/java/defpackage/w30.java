package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class w30 extends k6 {
    public final /* synthetic */ AtomicReference a;

    public w30(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.k6
    public final void a(Object obj) {
        k6 k6Var = (k6) this.a.get();
        if (k6Var != null) {
            k6Var.a(obj);
        } else {
            nh0.j("Operation cannot be started before fragment is in created state");
        }
    }
}
