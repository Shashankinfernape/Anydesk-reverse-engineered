package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o7 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ View e;
    public final /* synthetic */ u7 f;

    public /* synthetic */ o7(u7 u7Var, View view, View view2, int i) {
        this.c = i;
        this.f = u7Var;
        this.d = view;
        this.e = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                u7.b(this.f.r, this.d, this.e);
                break;
            default:
                u7.b(this.f.f, this.d, this.e);
                break;
        }
    }
}
