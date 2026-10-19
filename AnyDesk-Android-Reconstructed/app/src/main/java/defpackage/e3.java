package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class e3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ k3 d;

    public /* synthetic */ e3(k3 k3Var, int i) {
        this.c = i;
        this.d = k3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        k3 k3Var = this.d;
        switch (i2) {
            case 0:
                if (k3Var.t0 && k3Var.r0 != null) {
                    JniAdExt.I0.post(new cp(k3Var.s0, 18));
                    break;
                }
                break;
            default:
                Dialog dialog = k3Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
