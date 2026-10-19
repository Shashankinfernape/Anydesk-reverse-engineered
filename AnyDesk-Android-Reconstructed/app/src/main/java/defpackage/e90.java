package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class e90 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TextView d;
    public final /* synthetic */ g90 e;

    public e90(g90 g90Var, int i, TextView textView, int i2, TextView textView2) {
        this.e = g90Var;
        this.a = i;
        this.b = textView;
        this.c = i2;
        this.d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ad adVar;
        int i = this.a;
        g90 g90Var = this.e;
        g90Var.n = i;
        g90Var.l = null;
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.c == 1 && (adVar = g90Var.r) != null) {
                adVar.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
