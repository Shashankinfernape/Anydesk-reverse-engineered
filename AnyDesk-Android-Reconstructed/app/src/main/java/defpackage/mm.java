package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class mm extends sx {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public EditText i;
    public final m j;
    public final jm k;
    public AnimatorSet l;
    public ValueAnimator m;

    public mm(rx rxVar) {
        super(rxVar);
        this.j = new m(2, this);
        this.k = new jm(this, 0);
        this.e = lk0.G(rxVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = lk0.G(rxVar.getContext(), R.attr.motionDurationShort3, 150);
        this.g = lk0.H(rxVar.getContext(), R.attr.motionEasingLinearInterpolator, x8.a);
        this.h = lk0.H(rxVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, x8.d);
    }

    @Override // defpackage.sx
    public final void a() {
        if (this.b.r != null) {
            return;
        }
        s(t());
    }

    @Override // defpackage.sx
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.sx
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.sx
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    @Override // defpackage.sx
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // defpackage.sx
    public final View.OnFocusChangeListener g() {
        return this.k;
    }

    @Override // defpackage.sx
    public final void l(EditText editText) {
        this.i = editText;
        this.a.setEndIconVisible(t());
    }

    @Override // defpackage.sx
    public final void o(boolean z) {
        if (this.b.r == null) {
            return;
        }
        s(z);
    }

    @Override // defpackage.sx
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: km
            public final /* synthetic */ mm b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                mm mmVar = this.b;
                switch (i2) {
                    case 0:
                        mmVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = mmVar.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.e;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: km
            public final /* synthetic */ mm b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i3;
                mm mmVar = this.b;
                switch (i4) {
                    case 0:
                        mmVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = mmVar.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.l.addListener(new lm(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: km
            public final /* synthetic */ mm b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i3;
                mm mmVar = this.b;
                switch (i4) {
                    case 0:
                        mmVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = mmVar.d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new lm(this, i));
    }

    @Override // defpackage.sx
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new l(5, this));
        }
    }

    public final void s(boolean z) {
        boolean z2 = this.b.d() == z;
        if (z && !this.l.isRunning()) {
            this.m.cancel();
            this.l.start();
            if (z2) {
                this.l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.l.cancel();
        this.m.start();
        if (z2) {
            this.m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}
