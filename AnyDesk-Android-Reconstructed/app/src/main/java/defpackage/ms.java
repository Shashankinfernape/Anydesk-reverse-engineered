package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class ms extends AnimatorListenerAdapter {
    public final /* synthetic */ hx0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewPropertyAnimator e;
    public final /* synthetic */ qs f;

    public ms(qs qsVar, hx0 hx0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = qsVar;
        this.a = hx0Var;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.b;
        View view = this.c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        qs qsVar = this.f;
        hx0 hx0Var = this.a;
        qsVar.k(hx0Var);
        qsVar.p.remove(hx0Var);
        qsVar.j();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.p();
    }
}
