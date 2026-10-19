package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kv implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kv(xt0 xt0Var, View view) {
        this.a = 3;
        this.b = xt0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((DrawerLayout) obj).setScrimColor(cn.d(-1728053248, x8.c(mv.a, 0, valueAnimator.getAnimatedFraction())));
                break;
            case 1:
                ((xv) obj).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                ak0 ak0Var = (ak0) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ak0Var.j.setAlpha((int) (255.0f * fFloatValue));
                ak0Var.x = fFloatValue;
                break;
            default:
                ((View) ((ng1) ((xt0) obj).d).m.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ kv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
