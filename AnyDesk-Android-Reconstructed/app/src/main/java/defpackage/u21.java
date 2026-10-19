package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class u21 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ v21 d;

    public /* synthetic */ u21(v21 v21Var, int i) {
        this.c = i;
        this.d = v21Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        v21 v21Var = this.d;
        switch (i2) {
            case 0:
                v21Var.U0();
                break;
            default:
                Dialog dialog = v21Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
