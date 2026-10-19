package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class o0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ p0 d;

    public /* synthetic */ o0(p0 p0Var, int i) {
        this.c = i;
        this.d = p0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        p0 p0Var = this.d;
        switch (i2) {
            case 0:
                p0.S0(p0Var);
                break;
            default:
                Dialog dialog = p0Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
