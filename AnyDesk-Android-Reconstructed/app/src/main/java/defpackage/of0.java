package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.anydesk.anydeskandroid.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class of0 extends nb {
    public static final int[] k = {533, 567, 850, 750};
    public static final int[] l = {1267, 1000, 333, 0};
    public static final zj m = new zj(Float.class, "animationFraction", 9);
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final Interpolator[] e;
    public final vf0 f;
    public int g;
    public boolean h;
    public float i;
    public cg j;

    public of0(Context context, vf0 vf0Var) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = vf0Var;
        this.e = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // defpackage.nb
    public final void c() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.nb
    public final void j() {
        r();
    }

    @Override // defpackage.nb
    public final void m(cg cgVar) {
        this.j = cgVar;
    }

    @Override // defpackage.nb
    public final void n() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        c();
        if (((c90) this.a).isVisible()) {
            this.d.setFloatValues(this.i, 1.0f);
            this.d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.d.start();
        }
    }

    @Override // defpackage.nb
    public final void p() {
        ObjectAnimator objectAnimator = this.c;
        int i = 0;
        zj zjVar = m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, zjVar, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new nf0(this, i));
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, zjVar, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.d.setInterpolator(null);
            this.d.addListener(new nf0(this, 1));
        }
        r();
        this.c.start();
    }

    @Override // defpackage.nb
    public final void q() {
        this.j = null;
    }

    public final void r() {
        this.g = 0;
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((nv) obj).c = this.f.c[0];
        }
    }
}
