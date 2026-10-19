package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class cb implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ qb d;

    public /* synthetic */ cb(qb qbVar, int i) {
        this.c = i;
        this.d = qbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.c;
        qb qbVar = this.d;
        switch (i) {
            case 0:
                if ((qbVar.a0 & 1) != 0) {
                    qbVar.v(0);
                }
                if ((qbVar.a0 & 4096) != 0) {
                    qbVar.v(108);
                }
                qbVar.Z = false;
                qbVar.a0 = 0;
                break;
            default:
                qbVar.x.showAtLocation(qbVar.w, 55, 0, 0);
                df1 df1Var = qbVar.z;
                if (df1Var != null) {
                    df1Var.b();
                }
                if (qbVar.A && (viewGroup = qbVar.B) != null && viewGroup.isLaidOut()) {
                    qbVar.w.setAlpha(0.0f);
                    df1 df1VarA = oe1.a(qbVar.w);
                    df1VarA.a(1.0f);
                    qbVar.z = df1VarA;
                    df1VarA.d(new eb(0, this));
                } else {
                    qbVar.w.setAlpha(1.0f);
                    qbVar.w.setVisibility(0);
                }
                break;
        }
    }
}
