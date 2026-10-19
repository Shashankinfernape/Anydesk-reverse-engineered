package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class l2 extends m2 implements RandomAccess {
    public final m2 c;
    public final int d;
    public final int e;

    public l2(m2 m2Var, int i, int i2) {
        this.c = m2Var;
        this.d = i;
        bu0.g(i, i2, m2Var.a());
        this.e = i2 - i;
    }

    @Override // defpackage.f2
    public final int a() {
        return this.e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.e;
        if (i < 0 || i >= i2) {
            id.h("index: ", i, ", size: ", i2);
            return null;
        }
        return this.c.get(this.d + i);
    }

    @Override // defpackage.m2, java.util.List
    public final List subList(int i, int i2) {
        bu0.g(i, i2, this.e);
        int i3 = this.d;
        return new l2(this.c, i + i3, i3 + i2);
    }
}
