package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class ut implements DialogInterface.OnDismissListener {
    public final /* synthetic */ xt c;

    public ut(xt xtVar) {
        this.c = xtVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        xt xtVar = this.c;
        Dialog dialog = xtVar.k0;
        if (dialog != null) {
            xtVar.onDismiss(dialog);
        }
    }
}
