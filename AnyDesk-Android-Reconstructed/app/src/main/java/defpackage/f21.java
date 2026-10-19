package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class f21 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ h21 d;

    public /* synthetic */ f21(h21 h21Var, int i) {
        this.c = i;
        this.d = h21Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        h21 h21Var = this.d;
        switch (i2) {
            case 0:
                g21 g21Var = h21Var.q0;
                if (g21Var != null) {
                    AdEditTextSecure adEditTextSecure = h21Var.u0;
                    t01 text = adEditTextSecure == null ? t01.e : adEditTextSecure.getText();
                    r21 r21Var = (r21) g21Var;
                    if (text != null) {
                        JniAdExt.I0.post(new d3(text, r21Var.r0, 17, false));
                    }
                    r21Var.T0();
                    t70.Y(new n21(r21Var, 0));
                }
                break;
            default:
                Dialog dialog = h21Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
