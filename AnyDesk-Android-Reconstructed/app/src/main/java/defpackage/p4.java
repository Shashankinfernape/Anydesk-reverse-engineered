package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class p4 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ n4 d;

    public /* synthetic */ p4(n4 n4Var, int i) {
        this.c = i;
        this.d = n4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        n4 n4Var = this.d;
        switch (i) {
            case 0:
                r4 r4Var = (r4) n4Var.b;
                if (!r4Var.r0) {
                    r4.S0(r4Var);
                } else {
                    r4Var.O0(false, false);
                }
                break;
            default:
                Dialog dialog = ((r4) n4Var.b).k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
