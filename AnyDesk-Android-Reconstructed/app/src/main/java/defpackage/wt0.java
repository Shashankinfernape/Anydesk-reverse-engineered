package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.CheckBox;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class wt0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ yt0 d;

    public /* synthetic */ wt0(yt0 yt0Var, int i) {
        this.c = i;
        this.d = yt0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        CheckBox checkBox;
        int i2 = this.c;
        yt0 yt0Var = this.d;
        switch (i2) {
            case 0:
                AdEditTextSecure adEditTextSecure = yt0Var.u0;
                if (adEditTextSecure != null && (checkBox = yt0Var.v0) != null) {
                    JniAdExt.I0.post(new ap(adEditTextSecure.getText(), 2, checkBox.isChecked()));
                }
                break;
            default:
                Dialog dialog = yt0Var.k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
