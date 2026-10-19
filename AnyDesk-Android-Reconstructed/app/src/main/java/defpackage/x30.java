package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class x30 extends b40 {
    public final /* synthetic */ c40 a;

    public x30(c40 c40Var) {
        this.a = c40Var;
    }

    @Override // defpackage.b40
    public final void a() {
        c40 c40Var = this.a;
        ((f01) c40Var.U.e).a();
        lk0.m(c40Var);
        Bundle bundle = c40Var.d;
        c40Var.U.p(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
