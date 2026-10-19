package defpackage;

import android.graphics.RectF;
import android.view.View;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: classes.dex */
public final class p41 extends n41 {
    public boolean f = false;
    public float g = 0.0f;

    public p41(NavigationView navigationView) {
        d(navigationView);
    }

    private void d(View view) {
        view.setOutlineProvider(new ql(1, this));
    }

    @Override // defpackage.n41
    public final void a(NavigationView navigationView) {
        d41 d41Var;
        d41 d41Var2;
        RectF rectF;
        d41 d41Var3 = this.c;
        this.g = (d41Var3 == null || (rectF = this.d) == null) ? 0.0f : d41Var3.f.a(rectF);
        boolean z = false;
        if ((this.d.isEmpty() || (d41Var2 = this.c) == null) ? false : d41Var2.d(this.d)) {
            z = true;
        } else if (!this.d.isEmpty() && (d41Var = this.c) != null && this.b && !d41Var.d(this.d)) {
            d41 d41Var4 = this.c;
            if ((d41Var4.a instanceof iz0) && (d41Var4.b instanceof iz0) && (d41Var4.d instanceof iz0) && (d41Var4.c instanceof iz0)) {
                float fA = d41Var4.e.a(this.d);
                float fA2 = this.c.f.a(this.d);
                float fA3 = this.c.h.a(this.d);
                float fA4 = this.c.g.a(this.d);
                if (fA == 0.0f && fA3 == 0.0f && fA2 == fA4) {
                    RectF rectF2 = this.d;
                    rectF2.set(rectF2.left - fA2, rectF2.top, rectF2.right, rectF2.bottom);
                    this.g = fA2;
                } else if (fA == 0.0f && fA2 == 0.0f && fA3 == fA4) {
                    RectF rectF3 = this.d;
                    rectF3.set(rectF3.left, rectF3.top - fA3, rectF3.right, rectF3.bottom);
                    this.g = fA3;
                } else if (fA2 == 0.0f && fA4 == 0.0f && fA == fA3) {
                    RectF rectF4 = this.d;
                    rectF4.set(rectF4.left, rectF4.top, rectF4.right + fA, rectF4.bottom);
                    this.g = fA;
                } else if (fA3 == 0.0f && fA4 == 0.0f && fA == fA2) {
                    RectF rectF5 = this.d;
                    rectF5.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom + fA);
                    this.g = fA;
                }
                z = true;
            }
        }
        this.f = z;
        navigationView.setClipToOutline(!b());
        if (b()) {
            navigationView.invalidate();
        } else {
            navigationView.invalidateOutline();
        }
    }

    @Override // defpackage.n41
    public final boolean b() {
        return !this.f || this.a;
    }
}
