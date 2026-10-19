package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class y30 extends hq {
    public final /* synthetic */ c40 s;

    public y30(c40 c40Var) {
        this.s = c40Var;
    }

    @Override // defpackage.hq
    public final View A(int i) {
        c40 c40Var = this.s;
        View view = c40Var.H;
        if (view != null) {
            return view.findViewById(i);
        }
        nh0.j(q51.l("Fragment ", c40Var, " does not have a view"));
        return null;
    }

    @Override // defpackage.hq
    public final boolean B() {
        return this.s.H != null;
    }
}
