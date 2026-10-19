package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class p5 extends v30 {
    public final /* synthetic */ int l = 0;
    public final /* synthetic */ View m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.m = actionMenuItemView;
    }

    @Override // defpackage.v30
    public final b51 b() {
        r5 r5Var;
        int i = this.l;
        View view = this.m;
        switch (i) {
            case 0:
                q5 q5Var = ((ActionMenuItemView) view).o;
                if (q5Var == null || (r5Var = ((s5) q5Var).a.w) == null) {
                    return null;
                }
                return r5Var.a();
            default:
                r5 r5Var2 = ((t5) view).f.v;
                if (r5Var2 == null) {
                    return null;
                }
                return r5Var2.a();
        }
    }

    @Override // defpackage.v30
    public final boolean c() {
        b51 b51VarB;
        int i = this.l;
        View view = this.m;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) view;
                qk0 qk0Var = actionMenuItemView.m;
                return qk0Var != null && qk0Var.a(actionMenuItemView.j) && (b51VarB = b()) != null && b51VarB.b();
            default:
                ((t5) view).f.n();
                return true;
        }
    }

    @Override // defpackage.v30
    public boolean d() {
        switch (this.l) {
            case 1:
                w5 w5Var = ((t5) this.m).f;
                if (w5Var.x != null) {
                    return false;
                }
                w5Var.d();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(t5 t5Var, t5 t5Var2) {
        super(t5Var2);
        this.m = t5Var;
    }
}
