package defpackage;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class mf0 extends nb {
    public static final zj i = new zj(Float.class, "animationFraction", 8);
    public ObjectAnimator c;
    public final qy d;
    public final vf0 e;
    public int f;
    public boolean g;
    public float h;

    public mf0(vf0 vf0Var) {
        super(3);
        this.f = 1;
        this.e = vf0Var;
        this.d = new qy();
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
    public final void p() {
        if (this.c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, i, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new h0(5, this));
        }
        r();
        this.c.start();
    }

    public final void r() {
        this.g = true;
        this.f = 1;
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            nv nvVar = (nv) obj;
            vf0 vf0Var = this.e;
            nvVar.c = vf0Var.c[0];
            nvVar.d = vf0Var.g / 2;
        }
    }

    @Override // defpackage.nb
    public final void m(cg cgVar) {
    }

    @Override // defpackage.nb
    public final void n() {
    }

    @Override // defpackage.nb
    public final void q() {
    }
}
