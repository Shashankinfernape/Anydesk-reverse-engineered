package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class iu0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ ju0 d;

    public /* synthetic */ iu0(ju0 ju0Var, int i) {
        this.c = i;
        this.d = ju0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        ju0 ju0Var = this.d;
        switch (i2) {
            case 0:
                ju0.S0(ju0Var);
                break;
            default:
                Dialog dialog = ju0Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
