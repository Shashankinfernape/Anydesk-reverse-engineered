package defpackage;

import android.window.BackEvent;

/* JADX INFO: loaded from: classes.dex */
public final class rf {
    public final float a;
    public final float b;
    public final float c;
    public final int d;

    public rf(BackEvent backEvent) {
        backEvent.getClass();
        h9 h9Var = h9.a;
        float fD = h9Var.d(backEvent);
        float fE = h9Var.e(backEvent);
        float fB = h9Var.b(backEvent);
        int iC = h9Var.c(backEvent);
        this.a = fD;
        this.b = fE;
        this.c = fB;
        this.d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
