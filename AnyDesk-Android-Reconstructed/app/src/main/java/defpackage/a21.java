package defpackage;

import android.app.Dialog;
import android.view.View;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class a21 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ e21 d;

    public /* synthetic */ a21(e21 e21Var, int i) {
        this.c = i;
        this.d = e21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        e21 e21Var = this.d;
        switch (i) {
            case 0:
                String strS0 = e21Var.S0();
                if (!e21.T0(strS0)) {
                    e21Var.V0(2);
                } else {
                    e21Var.V0(5);
                    JniAdExt.I0.post(new ua0(strS0, 4));
                }
                break;
            default:
                Dialog dialog = e21Var.k0;
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
        }
    }
}
