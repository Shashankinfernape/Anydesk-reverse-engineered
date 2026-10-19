package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class sp {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public sp(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(bq bqVar, hg hgVar) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int measuredWidth;
        int baseline;
        int i;
        if (bqVar == null) {
            return;
        }
        np npVar = bqVar.K;
        np npVar2 = bqVar.I;
        if (bqVar.g0 == 8) {
            hgVar.e = 0;
            hgVar.f = 0;
            hgVar.g = 0;
            return;
        }
        if (bqVar.T == null) {
            return;
        }
        x41 x41Var = ConstraintLayout.r;
        int i2 = hgVar.a;
        int i3 = hgVar.b;
        int i4 = hgVar.c;
        int i5 = hgVar.d;
        int i6 = this.b + this.c;
        int i7 = this.d;
        View view = bqVar.f0;
        int iR = q51.r(i2);
        if (iR == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else if (iR == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
        } else if (iR == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i7, -2);
            boolean z = bqVar.r == 1;
            int i8 = hgVar.j;
            if (i8 == 1 || i8 == 2) {
                boolean z2 = view.getMeasuredHeight() == bqVar.k();
                if (hgVar.j == 2 || !z || ((z && z2) || bqVar.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(bqVar.q(), 1073741824);
                }
            }
        } else if (iR != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i9 = this.f;
            int i10 = npVar2 != null ? npVar2.g : 0;
            if (npVar != null) {
                i10 += npVar.g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i9, i7 + i10, -1);
        }
        int iR2 = q51.r(i3);
        if (iR2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else if (iR2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
        } else if (iR2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i6, -2);
            boolean z3 = bqVar.s == 1;
            int i11 = hgVar.j;
            if (i11 == 1 || i11 == 2) {
                boolean z4 = view.getMeasuredWidth() == bqVar.q();
                if (hgVar.j == 2 || !z3 || ((z3 && z4) || bqVar.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(bqVar.k(), 1073741824);
                }
            }
        } else if (iR2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i12 = this.g;
            int i13 = npVar2 != null ? bqVar.J.g : 0;
            if (npVar != null) {
                i13 += bqVar.L.g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, i6 + i13, -1);
        }
        cq cqVar = (cq) bqVar.T;
        ConstraintLayout constraintLayout = this.h;
        if (cqVar != null && th1.p(constraintLayout.k, 256) && view.getMeasuredWidth() == bqVar.q() && view.getMeasuredWidth() < cqVar.q() && view.getMeasuredHeight() == bqVar.k() && view.getMeasuredHeight() < cqVar.k() && view.getBaseline() == bqVar.a0 && !bqVar.z() && a(bqVar.G, iMakeMeasureSpec, bqVar.q()) && a(bqVar.H, iMakeMeasureSpec2, bqVar.k())) {
            hgVar.e = bqVar.q();
            hgVar.f = bqVar.k();
            hgVar.g = bqVar.a0;
            return;
        }
        boolean z5 = i2 == 3;
        boolean z6 = i3 == 3;
        boolean z7 = i3 == 4 || i3 == 1;
        boolean z8 = i2 == 4 || i2 == 1;
        boolean z9 = z5 && bqVar.W > 0.0f;
        boolean z10 = z6 && bqVar.W > 0.0f;
        if (view == null) {
            return;
        }
        rp rpVar = (rp) view.getLayoutParams();
        int i14 = hgVar.j;
        if (i14 != 1 && i14 != 2 && z5 && bqVar.r == 0 && z6 && bqVar.s == 0) {
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            iMax = 0;
        } else {
            if ((view instanceof wf1) && (bqVar instanceof u10)) {
                ((wf1) view).j((u10) bqVar, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            bqVar.G = iMakeMeasureSpec;
            bqVar.H = iMakeMeasureSpec2;
            bqVar.g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i15 = bqVar.u;
            int iMax2 = i15 > 0 ? Math.max(i15, measuredWidth2) : measuredWidth2;
            int i16 = bqVar.v;
            if (i16 > 0) {
                iMax2 = Math.min(i16, iMax2);
            }
            int i17 = bqVar.x;
            iMax = i17 > 0 ? Math.max(i17, measuredHeight) : measuredHeight;
            int i18 = iMakeMeasureSpec2;
            int i19 = bqVar.y;
            if (i19 > 0) {
                iMax = Math.min(i19, iMax);
            }
            if (!th1.p(constraintLayout.k, 1)) {
                if (z9 && z7) {
                    iMax2 = (int) ((iMax * bqVar.W) + 0.5f);
                } else if (z10 && z8) {
                    iMax = (int) ((iMax2 / bqVar.W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i18;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                bqVar.G = iMakeMeasureSpec;
                bqVar.H = iMakeMeasureSpec3;
                bqVar.g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i = -1;
        }
        boolean z11 = baseline != i;
        hgVar.i = (measuredWidth == hgVar.c && iMax == hgVar.d) ? false : true;
        boolean z12 = rpVar.c0 ? true : z11;
        if (z12 && baseline != -1 && bqVar.a0 != baseline) {
            hgVar.i = true;
        }
        hgVar.e = measuredWidth;
        hgVar.f = iMax;
        hgVar.h = z12;
        hgVar.g = baseline;
    }
}
