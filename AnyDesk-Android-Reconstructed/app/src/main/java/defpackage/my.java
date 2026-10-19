package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class my extends AnimatorListenerAdapter implements pb1 {
    public final View a;
    public boolean b = false;

    public my(View view) {
        this.a = view;
    }

    @Override // defpackage.pb1
    public final void a(qb1 qb1Var) {
    }

    @Override // defpackage.pb1
    public final void b(qb1 qb1Var) {
        throw null;
    }

    @Override // defpackage.pb1
    public final void c() {
        View view = this.a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? jf1.a.o(view) : 0.0f));
    }

    @Override // defpackage.pb1
    public final void d() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.pb1
    public final void e(qb1 qb1Var) {
        throw null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        jf1.a.t(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        us0 us0Var = jf1.a;
        us0Var.t(view, 1.0f);
        us0Var.getClass();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.pb1
    public final void f(qb1 qb1Var) {
    }

    @Override // defpackage.pb1
    public final void g(qb1 qb1Var) {
    }
}
