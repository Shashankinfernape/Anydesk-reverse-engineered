package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class t implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ u d;

    public /* synthetic */ t(u uVar, int i) {
        this.c = i;
        this.d = uVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        u uVar = this.d;
        switch (i2) {
            case 0:
                u.S0(uVar);
                break;
            default:
                Dialog dialog = uVar.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
