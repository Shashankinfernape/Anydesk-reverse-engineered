package defpackage;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cm extends nb {
    public static final int[] k = {0, 1350, 2700, 4050};
    public static final int[] l = {667, 2017, 3367, 4717};
    public static final int[] m = {1000, 2350, 3700, 5050};
    public static final zj n = new zj(Float.class, "animationFraction", 5);
    public static final zj o = new zj(Float.class, "completeEndFraction", 6);
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final qy e;
    public final dm f;
    public int g;
    public float h;
    public float i;
    public cg j;

    public cm(dm dmVar) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = dmVar;
        this.e = new qy();
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
        this.g = 0;
        ((nv) ((ArrayList) this.b).get(0)).c = this.f.c[0];
        this.i = 0.0f;
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
        if (((c90) this.a).isVisible()) {
            this.d.start();
        } else {
            c();
        }
    }

    @Override // defpackage.nb
    public final void p() {
        if (this.c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new bm(this, 0));
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.d.setInterpolator(this.e);
            this.d.addListener(new bm(this, 1));
        }
        this.g = 0;
        ((nv) ((ArrayList) this.b).get(0)).c = this.f.c[0];
        this.i = 0.0f;
        this.c.start();
    }

    @Override // defpackage.nb
    public final void q() {
        this.j = null;
    }
}
