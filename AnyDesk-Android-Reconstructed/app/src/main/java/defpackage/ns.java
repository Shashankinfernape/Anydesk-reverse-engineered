package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class ns extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ os b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ qs e;

    public /* synthetic */ ns(qs qsVar, os osVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = qsVar;
        this.b = osVar;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        os osVar = this.b;
        qs qsVar = this.e;
        View view = this.d;
        ViewPropertyAnimator viewPropertyAnimator = this.c;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                qsVar.c(osVar.a);
                qsVar.r.remove(osVar.a);
                qsVar.j();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                qsVar.c(osVar.b);
                qsVar.r.remove(osVar.b);
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
}
