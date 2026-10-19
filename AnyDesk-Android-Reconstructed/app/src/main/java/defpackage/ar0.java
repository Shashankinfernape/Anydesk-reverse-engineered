package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class ar0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View c;
    public ViewTreeObserver d;
    public final Runnable e;

    public ar0(View view, Runnable runnable) {
        this.c = view;
        this.d = view.getViewTreeObserver();
        this.e = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ar0 ar0Var = new ar0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(ar0Var);
        view.addOnAttachStateChangeListener(ar0Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.d.isAlive();
        View view = this.c;
        if (zIsAlive) {
            this.d.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.e.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.d = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.d.isAlive();
        View view2 = this.c;
        if (zIsAlive) {
            this.d.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
