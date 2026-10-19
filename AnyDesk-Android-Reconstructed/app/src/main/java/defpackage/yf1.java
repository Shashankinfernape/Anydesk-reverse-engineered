package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class yf1 extends AnimatorListenerAdapter implements pb1 {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ ny e;

    public yf1(ny nyVar, ViewGroup viewGroup, View view, View view2) {
        this.e = nyVar;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.pb1
    public final void a(qb1 qb1Var) {
        qb1Var.x(this);
    }

    @Override // defpackage.pb1
    public final void b(qb1 qb1Var) {
        throw null;
    }

    @Override // defpackage.pb1
    public final void e(qb1 qb1Var) {
        qb1Var.x(this);
    }

    @Override // defpackage.pb1
    public final void f(qb1 qb1Var) {
    }

    @Override // defpackage.pb1
    public final void g(qb1 qb1Var) {
        if (this.d) {
            h();
        }
    }

    public final void h() {
        this.c.setTag(R.id.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            this.a.getOverlay().add(view);
        } else {
            this.e.c();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            View view2 = this.b;
            view.setTag(R.id.save_overlay_view, view2);
            this.a.getOverlay().add(view2);
            this.d = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // defpackage.pb1
    public final void c() {
    }

    @Override // defpackage.pb1
    public final void d() {
    }
}
