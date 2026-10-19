package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public abstract class o10 extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public boolean a;
    public float b;
    public float c;
    public final /* synthetic */ r10 d;

    public o10(r10 r10Var) {
        this.d = r10Var;
    }

    public abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = (int) this.c;
        q10 q10Var = this.d.b;
        if (q10Var != null) {
            q10Var.l(f);
        }
        this.a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z = this.a;
        r10 r10Var = this.d;
        if (!z) {
            q10 q10Var = r10Var.b;
            this.b = q10Var == null ? 0.0f : q10Var.c.m;
            this.c = a();
            this.a = true;
        }
        float f = this.b;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.c - f)) + f);
        q10 q10Var2 = r10Var.b;
        if (q10Var2 != null) {
            q10Var2.l(animatedFraction);
        }
    }
}
