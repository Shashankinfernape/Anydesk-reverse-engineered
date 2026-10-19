package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class v60 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ x60 d;

    public /* synthetic */ v60(x60 x60Var, int i) {
        this.c = i;
        this.d = x60Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        x60 x60Var = this.d;
        switch (i2) {
            case 0:
                w60 w60Var = x60Var.q0;
                if (w60Var != null) {
                    w60Var.Q(x60Var.s0, x60Var.w0);
                }
                break;
            default:
                Dialog dialog = x60Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
