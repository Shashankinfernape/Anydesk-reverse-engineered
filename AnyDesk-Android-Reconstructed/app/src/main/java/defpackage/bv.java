package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bv extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ cv b;

    public /* synthetic */ bv(cv cvVar, int i) {
        this.a = i;
        this.b = cvVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                cv cvVar = this.b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = cvVar.h;
                if (arrayList != null && !cvVar.i) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((cg) obj).a(cvVar);
                    }
                    break;
                }
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
                super.onAnimationStart(animator);
                cv cvVar = this.b;
                ArrayList arrayList = cvVar.h;
                if (arrayList != null && !cvVar.i) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((cg) obj).b(cvVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
