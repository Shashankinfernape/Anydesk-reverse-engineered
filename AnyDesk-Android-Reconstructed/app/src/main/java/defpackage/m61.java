package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class m61 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ ui0 e;

    public /* synthetic */ m61(ui0 ui0Var, View view, int i) {
        this.c = i;
        this.e = ui0Var;
        this.d = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.c;
        View view = this.d;
        ui0 ui0Var = this.e;
        switch (i) {
            case 0:
                if (((p61) ui0Var.d).a()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            default:
                if (((p61) ((o61) ui0Var).d).a()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
        }
    }
}
