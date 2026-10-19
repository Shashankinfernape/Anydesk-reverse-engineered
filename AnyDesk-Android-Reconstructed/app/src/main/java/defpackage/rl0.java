package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class rl0 {
    public final SparseArray a;
    public mc1 b;

    public rl0(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(mc1 mc1Var, int i, int i2) {
        int iA = mc1Var.a(i);
        SparseArray sparseArray = this.a;
        rl0 rl0Var = sparseArray == null ? null : (rl0) sparseArray.get(iA);
        if (rl0Var == null) {
            rl0Var = new rl0(1);
            sparseArray.put(mc1Var.a(i), rl0Var);
        }
        if (i2 > i) {
            rl0Var.a(mc1Var, i + 1, i2);
        } else {
            rl0Var.b = mc1Var;
        }
    }
}
