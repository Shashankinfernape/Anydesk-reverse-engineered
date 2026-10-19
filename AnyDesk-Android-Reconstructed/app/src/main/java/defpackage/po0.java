package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class po0 extends o3 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ qo0 f;

    public po0(qo0 qo0Var, int i, boolean z) {
        this.f = qo0Var;
        this.d = i;
        this.e = z;
    }

    @Override // defpackage.o3
    public final void d(View view, w3 w3Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, w3Var.a);
        yo0 yo0Var = this.f.g;
        int i = this.d;
        int i2 = i;
        for (int i3 = 0; i3 < i; i3++) {
            if (yo0Var.g.c(i3) == 2 || yo0Var.g.c(i3) == 3) {
                i2--;
            }
        }
        w3Var.k(v3.a(i2, 1, 1, 1, this.e, view.isSelected()));
    }
}
