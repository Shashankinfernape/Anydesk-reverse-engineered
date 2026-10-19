package defpackage;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

/* JADX INFO: loaded from: classes.dex */
public final class bt implements Animation.AnimationListener {
    public final /* synthetic */ a61 a;
    public final /* synthetic */ ct b;
    public final /* synthetic */ View c;
    public final /* synthetic */ xs d;

    public bt(xs xsVar, ct ctVar, a61 a61Var, View view) {
        this.a = a61Var;
        this.b = ctVar;
        this.c = view;
        this.d = xsVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ct ctVar = this.b;
        ctVar.a.post(new at(ctVar, this.c, this.d, 0));
        if (t40.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (t40.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}
