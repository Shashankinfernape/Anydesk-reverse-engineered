package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c90 extends cv {
    public final ov n;
    public nb o;
    public qd1 p;

    public c90(Context context, eg egVar, ov ovVar, nb nbVar) {
        super(context, egVar);
        this.n = ovVar;
        this.o = nbVar;
        nbVar.a = this;
    }

    @Override // defpackage.cv
    public final boolean d(boolean z, boolean z2, boolean z3) {
        qd1 qd1Var;
        boolean zD = super.d(z, z2, z3);
        if (f() && (qd1Var = this.p) != null) {
            return qd1Var.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.o.c();
        }
        if (z && (z3 || (Build.VERSION.SDK_INT <= 22 && !f()))) {
            this.o.p();
        }
        return zD;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        qd1 qd1Var;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            boolean zF = f();
            eg egVar = this.d;
            if (zF && (qd1Var = this.p) != null) {
                qd1Var.setBounds(getBounds());
                this.p.setTint(egVar.c[0]);
                this.p.draw(canvas);
                return;
            }
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.f;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.g;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            ov ovVar = this.n;
            ovVar.a.a();
            ovVar.a(canvas, bounds, fB, z, z2);
            int i2 = egVar.g;
            int i3 = this.l;
            Paint paint = this.k;
            if (i2 == 0) {
                this.n.d(canvas, paint, 0.0f, 1.0f, egVar.d, i3, 0);
                i = i2;
            } else {
                nv nvVar = (nv) ((ArrayList) this.o.b).get(0);
                ArrayList arrayList = (ArrayList) this.o.b;
                nv nvVar2 = (nv) arrayList.get(arrayList.size() - 1);
                ov ovVar2 = this.n;
                if (ovVar2 instanceof lf0) {
                    i = i2;
                    ovVar2.d(canvas, paint, 0.0f, nvVar.a, egVar.d, i3, i);
                    this.n.d(canvas, paint, nvVar2.b, 1.0f, egVar.d, i3, i);
                } else {
                    i = i2;
                    i3 = 0;
                    ovVar2.d(canvas, paint, nvVar2.b, 1.0f + nvVar.a, egVar.d, 0, i);
                }
            }
            for (int i4 = 0; i4 < ((ArrayList) this.o.b).size(); i4++) {
                nv nvVar3 = (nv) ((ArrayList) this.o.b).get(i4);
                this.n.c(canvas, paint, nvVar3, this.l);
                if (i4 > 0 && i > 0) {
                    this.n.d(canvas, paint, ((nv) ((ArrayList) this.o.b).get(i4 - 1)).b, nvVar3.a, egVar.d, i3, i);
                }
            }
            canvas.restore();
        }
    }

    public final boolean f() {
        return this.e != null && Settings.Global.getFloat(this.c.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.f();
    }
}
