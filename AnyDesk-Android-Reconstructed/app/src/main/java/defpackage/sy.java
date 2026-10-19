package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class sy extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b = false;
    public final /* synthetic */ ow0 c;

    public /* synthetic */ sy(ow0 ow0Var, int i) {
        this.a = i;
        this.c = ow0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
            default:
                this.b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        ow0 ow0Var = this.c;
        switch (i) {
            case 0:
                ty tyVar = (ty) ow0Var;
                if (this.b) {
                    this.b = false;
                } else if (((Float) tyVar.A.getAnimatedValue()).floatValue() != 0.0f) {
                    tyVar.B = 2;
                    tyVar.s.invalidate();
                } else {
                    tyVar.B = 0;
                    tyVar.i(0);
                }
                break;
            default:
                uy uyVar = (uy) ow0Var;
                if (this.b) {
                    this.b = false;
                } else if (((Float) uyVar.z.getAnimatedValue()).floatValue() != 0.0f) {
                    uyVar.A = 2;
                    uyVar.s.invalidate();
                } else {
                    uyVar.A = 0;
                    uyVar.h(0);
                }
                break;
        }
    }
}
