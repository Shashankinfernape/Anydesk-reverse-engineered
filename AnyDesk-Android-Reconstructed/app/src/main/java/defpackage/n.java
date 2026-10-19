package defpackage;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n(Object obj, int i, Object obj2) {
        this.c = i;
        this.d = obj;
        this.e = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        Object obj = this.e;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                t70.U(((o) obj2).a0(), (String) obj);
                break;
            default:
                bo0 bo0Var = (bo0) obj2;
                bc bcVar = (bc) obj;
                bo0Var.getClass();
                cr0 cr0Var = (cr0) bcVar.e;
                vn0 vn0VarF = bo0Var.b.f();
                if (cr0Var == null || vn0VarF == null || !bcVar.Y(vn0VarF)) {
                    bo0Var.d();
                } else {
                    ((DrawerLayout) cr0Var).o();
                }
                break;
        }
    }
}
