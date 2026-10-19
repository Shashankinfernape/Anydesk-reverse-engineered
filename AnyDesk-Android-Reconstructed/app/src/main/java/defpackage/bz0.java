package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class bz0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ dz0 d;

    public /* synthetic */ bz0(dz0 dz0Var, int i) {
        this.c = i;
        this.d = dz0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        dz0 dz0Var = this.d;
        switch (i2) {
            case 0:
                dz0.S0(dz0Var);
                break;
            default:
                Dialog dialog = dz0Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
