package defpackage;

import android.app.Dialog;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class c21 implements Runnable {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ String e;
    public final /* synthetic */ b21 f;

    public c21(b21 b21Var, String str, boolean z) {
        this.f = b21Var;
        this.e = str;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        String str = this.e;
        b21 b21Var = this.f;
        boolean z = this.d;
        switch (i) {
            case 0:
                if (!str.isEmpty() && str.replaceAll("@ad$", "").equals(b21Var.c.S0())) {
                    b21Var.c.V0(z ? 3 : 4);
                    break;
                }
                break;
            default:
                if (!z) {
                    Dialog dialog = b21Var.c.k0;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    d21 d21Var = b21Var.c.z0;
                    if (d21Var != null) {
                        d21Var.g(str);
                    }
                } else {
                    b21Var.c.v0.setText(String.format(JniAdExt.n1("ad.alias.already_registered"), JniAdExt.k2(io.KEY_ALIAS)));
                    b21Var.c.V0(6);
                }
                break;
        }
    }

    public c21(b21 b21Var, boolean z, String str) {
        this.f = b21Var;
        this.d = z;
        this.e = str;
    }
}
