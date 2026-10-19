package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class dz implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ ez d;

    public /* synthetic */ dz(ez ezVar, int i) {
        this.c = i;
        this.d = ezVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        ez ezVar = this.d;
        switch (i2) {
            case 0:
                ez.S0(ezVar);
                break;
            default:
                Dialog dialog = ezVar.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
