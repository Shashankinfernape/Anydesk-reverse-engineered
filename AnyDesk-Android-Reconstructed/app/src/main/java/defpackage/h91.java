package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class h91 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ i91 d;

    public /* synthetic */ h91(i91 i91Var, int i) {
        this.c = i;
        this.d = i91Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        i91 i91Var = this.d;
        switch (i2) {
            case 0:
                i91.S0(i91Var);
                break;
            default:
                Dialog dialog = i91Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
