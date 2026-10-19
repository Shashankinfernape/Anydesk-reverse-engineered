package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class lm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ mm b;

    public /* synthetic */ lm(mm mmVar, int i) {
        this.a = i;
        this.b = mmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                this.b.b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
