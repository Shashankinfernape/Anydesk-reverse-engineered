package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class v70 extends bq {
    public bq[] q0 = new bq[4];
    public int r0 = 0;

    public final void R(int i, gg1 gg1Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            bq bqVar = this.q0[i2];
            ArrayList arrayList2 = gg1Var.a;
            if (!arrayList2.contains(bqVar)) {
                arrayList2.add(bqVar);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            y90.o(this.q0[i3], i, arrayList, gg1Var);
        }
    }

    public void S() {
    }
}
