package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public final class ch1 extends bh1 {
    public static final gh1 s = gh1.g(WindowInsets.CONSUMED, null);

    public ch1(gh1 gh1Var, WindowInsets windowInsets) {
        super(gh1Var, windowInsets);
    }

    @Override // defpackage.ah1, defpackage.wg1, defpackage.dh1
    public s90 f(int i) {
        return s90.b(this.c.getInsets(fh1.a(i)));
    }

    @Override // defpackage.ah1, defpackage.wg1, defpackage.dh1
    public boolean o(int i) {
        return this.c.isVisible(fh1.a(i));
    }
}
