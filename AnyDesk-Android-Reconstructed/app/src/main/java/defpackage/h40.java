package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class h40 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ i50 c;
    public final /* synthetic */ i40 d;

    public h40(i40 i40Var, i50 i50Var) {
        this.d = i40Var;
        this.c = i50Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        i50 i50Var = this.c;
        c40 c40Var = i50Var.c;
        i50Var.k();
        ct.f((ViewGroup) c40Var.H.getParent(), this.d.c).e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
