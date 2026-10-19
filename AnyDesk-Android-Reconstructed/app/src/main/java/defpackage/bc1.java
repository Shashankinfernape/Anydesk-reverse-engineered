package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class bc1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ cc1 d;

    public /* synthetic */ bc1(cc1 cc1Var, int i) {
        this.c = i;
        this.d = cc1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        cc1 cc1Var = this.d;
        switch (i2) {
            case 0:
                AdEditText adEditText = cc1Var.q0;
                if (adEditText != null) {
                    JniAdExt.I0.post(new ua0(adEditText.getText(), 10));
                    break;
                }
                break;
            default:
                Dialog dialog = cc1Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
