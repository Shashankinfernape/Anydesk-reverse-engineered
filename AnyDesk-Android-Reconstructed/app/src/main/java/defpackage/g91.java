package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class g91 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ i91 d;

    public /* synthetic */ g91(i91 i91Var, int i) {
        this.c = i;
        this.d = i91Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        i91 i91Var = this.d;
        switch (i) {
            case 0:
                if (!i91Var.C0) {
                    i91Var.s0.setVisibility(8);
                    break;
                }
                break;
            default:
                if (!i91Var.C0) {
                    i91Var.s0.setVisibility(0);
                    break;
                }
                break;
        }
    }
}
