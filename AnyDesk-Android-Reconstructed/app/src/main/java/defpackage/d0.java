package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.fragment.AbookRosterFragment;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements r6, ez0 {
    public final /* synthetic */ AbookRosterFragment c;

    public /* synthetic */ d0(AbookRosterFragment abookRosterFragment) {
        this.c = abookRosterFragment;
    }

    @Override // defpackage.r6
    public void h(String str) {
        v1 v1Var;
        v1 v1VarA;
        u1 u1Var = this.c.a0;
        u1Var.getClass();
        str.getClass();
        e71 e71Var = u1Var.d;
        do {
            v1Var = (v1) e71Var.getValue();
            v1VarA = v1.a(v1Var, null, false, str, null, null, false, false, false, null, null, 1019);
        } while (!e71Var.g(v1Var, v1VarA));
        if (v1VarA.c.equals(v1Var.c)) {
            return;
        }
        long j = u1.i;
        z61 z61Var = u1Var.c;
        if (z61Var != null) {
            z61Var.b(null);
        }
        u1Var.c = th1.B(hq.w(u1Var), null, null, new r1(j, u1Var, false, null), 3);
    }

    @Override // defpackage.r6
    public boolean k() {
        fz0 fz0Var;
        View view;
        AbookRosterFragment abookRosterFragment = this.c;
        ea0 ea0VarL = abookRosterFragment.d0.l();
        if (ea0VarL.isEmpty() || (fz0Var = (fz0) ea0VarL.get(0)) == null) {
            return false;
        }
        JniAdExt.u4(fz0Var.a);
        c40 c40Var = abookRosterFragment.x;
        if (c40Var == null || (view = c40Var.H) == null || view.findViewById(R.id.abookRosterItemDetails) != null) {
            return true;
        }
        uj.v(abookRosterFragment.Y(), R.id.abookRosterItemDetailsWrapper);
        return true;
    }

    @Override // defpackage.ez0
    public void m(String str) {
        this.c.a0.f(str);
    }

    @Override // defpackage.ez0
    public void p(View view, String str) {
    }
}
