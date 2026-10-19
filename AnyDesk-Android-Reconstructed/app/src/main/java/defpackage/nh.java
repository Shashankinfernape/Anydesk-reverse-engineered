package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class nh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hk0 hk0Var = ((BottomSheetBehavior) obj).f;
                if (hk0Var != null) {
                    hk0Var.n(fFloatValue);
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                ty tyVar = (ty) obj;
                tyVar.b.setAlpha(iFloatValue);
                tyVar.c.setAlpha(iFloatValue);
                tyVar.s.invalidate();
                break;
            case 2:
                int iFloatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                uy uyVar = (uy) obj;
                uyVar.c.setAlpha(iFloatValue2);
                uyVar.d.setAlpha(iFloatValue2);
                uyVar.s.invalidate();
                break;
            case 3:
                ((s81) obj).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((TextInputLayout) obj).x0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
