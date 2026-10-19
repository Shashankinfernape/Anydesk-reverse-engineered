package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class ik0 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ jk0 c;

    public ik0(jk0 jk0Var, boolean z, int i) {
        this.c = jk0Var;
        this.a = z;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jk0 jk0Var = this.c;
        jk0Var.b.setTranslationX(0.0f);
        jk0Var.a(0.0f, this.a, this.b);
    }
}
