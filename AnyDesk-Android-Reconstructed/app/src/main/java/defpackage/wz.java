package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class wz implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ xz d;

    public /* synthetic */ wz(xz xzVar, int i) {
        this.c = i;
        this.d = xzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        xz xzVar = this.d;
        switch (i2) {
            case 0:
                xz.S0(xzVar);
                break;
            default:
                Dialog dialog = xzVar.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
