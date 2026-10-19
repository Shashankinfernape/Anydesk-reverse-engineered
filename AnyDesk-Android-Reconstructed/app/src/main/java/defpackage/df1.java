package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class df1 {
    public final WeakReference a;

    public df1(View view) {
        this.a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(ff1 ff1Var) {
        View view = (View) this.a.get();
        if (view != null) {
            if (ff1Var != null) {
                view.animate().setListener(new h0(ff1Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
