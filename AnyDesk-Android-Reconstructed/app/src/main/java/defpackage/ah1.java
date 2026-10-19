package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class ah1 extends zg1 {
    public static final gh1 r = gh1.g(WindowInsets.CONSUMED, null);

    public ah1(gh1 gh1Var, WindowInsets windowInsets) {
        super(gh1Var, windowInsets);
    }

    @Override // defpackage.wg1, defpackage.dh1
    public s90 f(int i) {
        return s90.b(this.c.getInsets(eh1.a(i)));
    }

    @Override // defpackage.wg1, defpackage.dh1
    public boolean o(int i) {
        return this.c.isVisible(eh1.a(i));
    }

    @Override // defpackage.wg1, defpackage.dh1
    public final void d(View view) {
    }
}
