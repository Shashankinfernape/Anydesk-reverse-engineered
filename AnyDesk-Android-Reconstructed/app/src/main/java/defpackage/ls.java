package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class ls extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ hx0 b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ qs e;

    public ls(qs qsVar, hx0 hx0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = qsVar;
        this.b = hx0Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        hx0 hx0Var = this.b;
        qs qsVar = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                qsVar.c(hx0Var);
                qsVar.q.remove(hx0Var);
                qsVar.j();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                qsVar.i(hx0Var);
                qsVar.o.remove(hx0Var);
                qsVar.j();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public ls(qs qsVar, hx0 hx0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = qsVar;
        this.b = hx0Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
