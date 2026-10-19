package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class vx0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ wx0 d;

    public /* synthetic */ vx0(wx0 wx0Var, int i) {
        this.c = i;
        this.d = wx0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        wx0 wx0Var = this.d;
        switch (i2) {
            case 0:
                JniAdExt.I0.post(new cp(wx0Var.x0.isChecked() ? 3 : 2, 21));
                break;
            default:
                Dialog dialog = wx0Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
