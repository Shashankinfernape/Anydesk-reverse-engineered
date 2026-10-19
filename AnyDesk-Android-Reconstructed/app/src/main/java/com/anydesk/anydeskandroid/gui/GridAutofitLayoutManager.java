package com.anydesk.anydeskandroid.gui;

import androidx.recyclerview.widget.GridLayoutManager;
import defpackage.dx0;
import defpackage.yw0;

/* JADX INFO: loaded from: classes.dex */
public class GridAutofitLayoutManager extends GridLayoutManager {
    public int Q;

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, defpackage.rw0
    public final void d0(yw0 yw0Var, dx0 dx0Var) {
        int i = this.n;
        int i2 = this.o;
        if (i > 0 && i2 > 0) {
            int iMax = Math.max(1, (this.p == 1 ? (i - E()) - D() : (i2 - F()) - C()) / this.Q);
            if (iMax != this.F) {
                s1(iMax);
            }
        }
        super.d0(yw0Var, dx0Var);
    }
}
