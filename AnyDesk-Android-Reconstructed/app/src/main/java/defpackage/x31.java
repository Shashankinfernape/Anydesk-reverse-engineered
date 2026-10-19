package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class x31 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ z31 d;

    public /* synthetic */ x31(z31 z31Var, int i) {
        this.c = i;
        this.d = z31Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        z31 z31Var = this.d;
        switch (i2) {
            case 0:
                y31 y31Var = z31Var.q0;
                if (y31Var != null) {
                    y31Var.u(z31Var.r0, z31Var.s0);
                }
                break;
            default:
                Dialog dialog = z31Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
