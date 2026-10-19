package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ z0 d;

    public /* synthetic */ x0(z0 z0Var, int i) {
        this.c = i;
        this.d = z0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        z0 z0Var = this.d;
        switch (i2) {
            case 0:
                z0.S0(z0Var);
                break;
            default:
                Dialog dialog = z0Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
