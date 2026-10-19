package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class xx0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ yx0 d;

    public /* synthetic */ xx0(yx0 yx0Var, int i) {
        this.c = i;
        this.d = yx0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.c;
        yx0 yx0Var = this.d;
        switch (i2) {
            case 0:
                AdEditTextSecure adEditTextSecure = yx0Var.u0;
                t01 text = adEditTextSecure == null ? t01.e : adEditTextSecure.getText();
                AdEditTextSecure adEditTextSecure2 = yx0Var.v0;
                JniAdExt.I0.post(new rc0(text, adEditTextSecure2 == null ? t01.e : adEditTextSecure2.getText(), 0));
                break;
            default:
                Dialog dialog = yx0Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
