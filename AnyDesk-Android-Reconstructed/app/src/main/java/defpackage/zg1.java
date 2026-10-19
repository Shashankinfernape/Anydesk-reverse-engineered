package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class zg1 extends yg1 {
    public s90 o;
    public s90 p;
    public s90 q;

    public zg1(gh1 gh1Var, WindowInsets windowInsets) {
        super(gh1Var, windowInsets);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override // defpackage.dh1
    public s90 g() {
        if (this.p == null) {
            this.p = s90.b(this.c.getMandatorySystemGestureInsets());
        }
        return this.p;
    }

    @Override // defpackage.dh1
    public s90 i() {
        if (this.o == null) {
            this.o = s90.b(this.c.getSystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.dh1
    public s90 k() {
        if (this.q == null) {
            this.q = s90.b(this.c.getTappableElementInsets());
        }
        return this.q;
    }

    @Override // defpackage.wg1, defpackage.dh1
    public gh1 l(int i, int i2, int i3, int i4) {
        return gh1.g(this.c.inset(i, i2, i3, i4), null);
    }

    @Override // defpackage.xg1, defpackage.dh1
    public void r(s90 s90Var) {
    }
}
