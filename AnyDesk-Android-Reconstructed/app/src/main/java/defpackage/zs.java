package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class zs extends AnimatorListenerAdapter {
    public final /* synthetic */ ct a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a61 d;
    public final /* synthetic */ xs e;

    public zs(ct ctVar, View view, boolean z, a61 a61Var, xs xsVar) {
        this.a = ctVar;
        this.b = view;
        this.c = z;
        this.d = a61Var;
        this.e = xsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ViewGroup viewGroup = this.a.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        a61 a61Var = this.d;
        if (z) {
            int i = a61Var.a;
            view.getClass();
            gr0.a(view, i);
        }
        this.e.e();
        if (t40.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + a61Var + " has ended.");
        }
    }
}
