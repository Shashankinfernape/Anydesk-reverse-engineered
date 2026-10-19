package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class nl0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ ol0 d;

    public /* synthetic */ nl0(ol0 ol0Var, int i) {
        this.c = i;
        this.d = ol0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        ol0 ol0Var = this.d;
        switch (i2) {
            case 0:
                Runnable runnable = ol0Var.w0.d;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                Dialog dialog = ol0Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
