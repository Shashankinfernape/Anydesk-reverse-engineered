package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sb1 extends rb1 {
    public final /* synthetic */ xd a;
    public final /* synthetic */ tb1 b;

    public sb1(tb1 tb1Var, xd xdVar) {
        this.b = tb1Var;
        this.a = xdVar;
    }

    @Override // defpackage.pb1
    public final void e(qb1 qb1Var) {
        ((ArrayList) this.a.get(this.b.d)).remove(qb1Var);
        qb1Var.x(this);
    }
}
