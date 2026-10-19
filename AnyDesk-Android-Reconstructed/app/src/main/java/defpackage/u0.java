package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ w0 d;

    public /* synthetic */ u0(w0 w0Var, int i) {
        this.c = i;
        this.d = w0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        w0 w0Var = this.d;
        switch (i2) {
            case 0:
                w0.S0(w0Var);
                break;
            default:
                Dialog dialog = w0Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
