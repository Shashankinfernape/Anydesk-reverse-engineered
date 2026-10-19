package defpackage;

import android.content.Context;
import android.view.View;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class r5 extends cl0 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ w5 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(w5 w5Var, Context context, q71 q71Var, View view) {
        super(context, q71Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = w5Var;
        if ((q71Var.A.x & 32) != 32) {
            View view2 = w5Var.l;
            this.e = view2 == null ? (View) w5Var.j : view2;
        }
        af1 af1Var = w5Var.z;
        this.h = af1Var;
        al0 al0Var = this.i;
        if (al0Var != null) {
            al0Var.f(af1Var);
        }
    }

    @Override // defpackage.cl0
    public final void c() {
        int i = this.l;
        w5 w5Var = this.m;
        switch (i) {
            case 0:
                w5Var.w = null;
                w5Var.A = 0;
                super.c();
                break;
            default:
                rk0 rk0Var = w5Var.e;
                if (rk0Var != null) {
                    rk0Var.c(true);
                }
                w5Var.v = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(w5 w5Var, Context context, rk0 rk0Var, View view) {
        super(context, rk0Var, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = w5Var;
        this.f = 8388613;
        af1 af1Var = w5Var.z;
        this.h = af1Var;
        al0 al0Var = this.i;
        if (al0Var != null) {
            al0Var.f(af1Var);
        }
    }
}
