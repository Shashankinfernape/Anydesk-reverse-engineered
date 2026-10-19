package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class nf0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ of0 b;

    public /* synthetic */ nf0(of0 of0Var, int i) {
        this.a = i;
        this.b = of0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                of0 of0Var = this.b;
                of0Var.c();
                cg cgVar = of0Var.j;
                if (cgVar != null) {
                    cgVar.a((c90) of0Var.a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                of0 of0Var = this.b;
                of0Var.g = (of0Var.g + 1) % of0Var.f.c.length;
                of0Var.h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
