package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public h0(ff1 ff1Var, View view) {
        this.a = 7;
        this.b = ff1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.y = null;
                actionBarOverlayLayout.l = false;
                break;
            case 7:
                ((ff1) obj).c();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((View) obj).setVisibility(8);
                break;
            case 1:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.y = null;
                actionBarOverlayLayout.l = false;
                break;
            case 2:
                u8 u8Var = (u8) obj;
                ArrayList arrayList = new ArrayList(u8Var.g);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((cg) arrayList.get(i2)).a(u8Var);
                }
                break;
            case 3:
                xv xvVar = (xv) obj;
                xvVar.p();
                xvVar.r.start();
                break;
            case 4:
                s81 s81Var = (s81) ((bc) obj).e;
                try {
                    switch (s81Var.a) {
                        case 1:
                            t81 t81Var = s81Var.b;
                            t81Var.l0.start();
                            t81Var.e = true;
                            break;
                        case 4:
                            t81 t81Var2 = s81Var.b;
                            t81Var2.f();
                            ViewGroup viewGroup = t81Var2.q;
                            if (viewGroup != null) {
                                viewGroup.removeView(t81Var2);
                            }
                            break;
                        default:
                            t81 t81Var3 = s81Var.b;
                            t81Var3.f();
                            ViewGroup viewGroup2 = t81Var3.q;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(t81Var3);
                            }
                            break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            case 5:
            default:
                super.onAnimationEnd(animator);
                break;
            case 6:
                ((qb1) obj).m();
                animator.removeListener(this);
                break;
            case 7:
                ((ff1) obj).a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 5:
                super.onAnimationRepeat(animator);
                mf0 mf0Var = (mf0) this.b;
                mf0Var.f = (mf0Var.f + 1) % mf0Var.e.c.length;
                mf0Var.g = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                u8 u8Var = (u8) obj;
                ArrayList arrayList = new ArrayList(u8Var.g);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((cg) arrayList.get(i2)).b(u8Var);
                }
                break;
            case 7:
                ((ff1) obj).e();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ h0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
