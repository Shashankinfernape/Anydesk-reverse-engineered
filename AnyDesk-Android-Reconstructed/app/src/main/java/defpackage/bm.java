package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class bm extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ cm b;

    public /* synthetic */ bm(cm cmVar, int i) {
        this.a = i;
        this.b = cmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                cm cmVar = this.b;
                cmVar.c();
                cg cgVar = cmVar.j;
                if (cgVar != null) {
                    cgVar.a((c90) cmVar.a);
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
                cm cmVar = this.b;
                cmVar.g = (cmVar.g + 4) % cmVar.f.c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
