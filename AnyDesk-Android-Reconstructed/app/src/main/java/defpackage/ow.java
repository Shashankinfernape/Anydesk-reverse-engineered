package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class ow {
    public int a;
    public final Object b;
    public final Object c;

    public ow(rw0 rw0Var) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = rw0Var;
    }

    public static ow a(rw0 rw0Var, int i) {
        if (i == 0) {
            return new fr0(rw0Var, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new fr0(rw0Var, i2);
        }
        id.q("invalid orientation");
        return null;
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i);

    public ow(qw qwVar) {
        this.a = 0;
        this.c = new is();
        this.b = qwVar;
    }
}
