package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class m4 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ n4 d;

    public /* synthetic */ m4(n4 n4Var, int i) {
        this.c = i;
        this.d = n4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        n4 n4Var = this.d;
        switch (i) {
            case 0:
                o4.S0((o4) n4Var.b);
                break;
            default:
                Dialog dialog = ((o4) n4Var.b).k0;
                if (dialog != null) {
                    dialog.cancel();
                }
                break;
        }
    }
}
