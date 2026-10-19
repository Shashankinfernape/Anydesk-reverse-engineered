package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class jw implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ kw d;

    public /* synthetic */ jw(kw kwVar, int i) {
        this.c = i;
        this.d = kwVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        kw kwVar = this.d;
        switch (i2) {
            case 0:
                kw.S0(kwVar);
                break;
            default:
                Dialog dialog = kwVar.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
