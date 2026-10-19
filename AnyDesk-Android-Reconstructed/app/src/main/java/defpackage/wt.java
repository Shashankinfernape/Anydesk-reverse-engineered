package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class wt extends hq {
    public final /* synthetic */ y30 s;
    public final /* synthetic */ xt t;

    public wt(xt xtVar, y30 y30Var) {
        this.t = xtVar;
        this.s = y30Var;
    }

    @Override // defpackage.hq
    public final View A(int i) {
        y30 y30Var = this.s;
        if (y30Var.B()) {
            return y30Var.A(i);
        }
        Dialog dialog = this.t.k0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.hq
    public final boolean B() {
        return this.s.B() || this.t.o0;
    }
}
