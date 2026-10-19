package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class tt implements DialogInterface.OnCancelListener {
    public final /* synthetic */ xt c;

    public tt(xt xtVar) {
        this.c = xtVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        xt xtVar = this.c;
        Dialog dialog = xtVar.k0;
        if (dialog != null) {
            xtVar.onCancel(dialog);
        }
    }
}
