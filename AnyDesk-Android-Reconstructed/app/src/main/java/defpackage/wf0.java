package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class wf0 {
    public int a = -1;
    public RecyclerView b;
    public rw0 c;
    public boolean d;
    public boolean e;
    public View f;
    public final bx0 g;
    public boolean h;
    public final LinearInterpolator i;
    public final DecelerateInterpolator j;
    public PointF k;
    public final DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    public wf0(Context context) {
        bx0 bx0Var = new bx0();
        bx0Var.d = -1;
        bx0Var.f = false;
        bx0Var.g = 0;
        bx0Var.a = 0;
        bx0Var.b = 0;
        bx0Var.c = Integer.MIN_VALUE;
        bx0Var.e = null;
        this.g = bx0Var;
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            id.q("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        rw0 rw0Var = this.c;
        if (rw0Var == null || !rw0Var.d()) {
            return 0;
        }
        sw0 sw0Var = (sw0) view.getLayoutParams();
        return a((view.getLeft() - ((sw0) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) sw0Var).leftMargin, view.getRight() + ((sw0) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) sw0Var).rightMargin, rw0Var.D(), rw0Var.n - rw0Var.E(), i);
    }

    public int c(View view, int i) {
        rw0 rw0Var = this.c;
        if (rw0Var == null || !rw0Var.e()) {
            return 0;
        }
        sw0 sw0Var = (sw0) view.getLayoutParams();
        return a((view.getTop() - ((sw0) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) sw0Var).topMargin, view.getBottom() + ((sw0) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) sw0Var).bottomMargin, rw0Var.F(), rw0Var.o - rw0Var.C(), i);
    }

    public final int d(int i) {
        float fAbs = Math.abs(i);
        if (!this.m) {
            this.n = 25.0f / this.l.densityDpi;
            this.m = true;
        }
        return (int) Math.ceil(fAbs * this.n);
    }

    public PointF e(int i) {
        Object obj = this.c;
        if (obj instanceof cx0) {
            return ((cx0) obj).a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + cx0.class.getCanonicalName());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0085  */
    /* JADX WARN: Code duplicated, block: B:71:0x0155  */
    public final void f(int i, int i2) {
        int i3;
        PointF pointFE;
        RecyclerView recyclerView = this.b;
        int i4 = -1;
        if (this.a == -1 || recyclerView == null) {
            g();
        }
        if (this.d && this.f == null && this.c != null && (pointFE = e(this.a)) != null) {
            float f = pointFE.x;
            if (f != 0.0f || pointFE.y != 0.0f) {
                recyclerView.g0((int) Math.signum(f), (int) Math.signum(pointFE.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        bx0 bx0Var = this.g;
        if (view != null) {
            this.b.getClass();
            hx0 hx0VarM = RecyclerView.M(view);
            if ((hx0VarM != null ? hx0VarM.c() : -1) == this.a) {
                View view2 = this.f;
                dx0 dx0Var = recyclerView.h0;
                PointF pointF = this.k;
                if (pointF != null) {
                    float f2 = pointF.x;
                    if (f2 == 0.0f) {
                        i3 = 0;
                    } else {
                        i3 = f2 > 0.0f ? 1 : -1;
                    }
                } else {
                    i3 = 0;
                }
                int iB = b(view2, i3);
                PointF pointF2 = this.k;
                if (pointF2 != null) {
                    float f3 = pointF2.y;
                    if (f3 == 0.0f) {
                        i4 = 0;
                    } else if (f3 > 0.0f) {
                        i4 = 1;
                    }
                } else {
                    i4 = 0;
                }
                int iC = c(view2, i4);
                int iCeil = (int) Math.ceil(((double) d((int) Math.sqrt((iC * iC) + (iB * iB)))) / 0.3356d);
                if (iCeil > 0) {
                    bx0Var.a = -iB;
                    bx0Var.b = -iC;
                    bx0Var.c = iCeil;
                    bx0Var.e = this.j;
                    bx0Var.f = true;
                }
                bx0Var.a(recyclerView);
                g();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            dx0 dx0Var2 = recyclerView.h0;
            if (this.b.p.v() == 0) {
                g();
            } else {
                int i5 = this.o;
                int i6 = i5 - i;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.o = i6;
                int i7 = this.p;
                int i8 = i7 - i2;
                if (i7 * i8 <= 0) {
                    i8 = 0;
                }
                this.p = i8;
                if (i6 == 0 && i8 == 0) {
                    PointF pointFE2 = e(this.a);
                    if (pointFE2 != null) {
                        float f4 = pointFE2.x;
                        if (f4 == 0.0f && pointFE2.y == 0.0f) {
                            bx0Var.d = this.a;
                            g();
                        } else {
                            float f5 = pointFE2.y;
                            float fSqrt = (float) Math.sqrt((f5 * f5) + (f4 * f4));
                            float f6 = pointFE2.x / fSqrt;
                            pointFE2.x = f6;
                            float f7 = pointFE2.y / fSqrt;
                            pointFE2.y = f7;
                            this.k = pointFE2;
                            this.o = (int) (f6 * 10000.0f);
                            this.p = (int) (f7 * 10000.0f);
                            int iD = d(10000);
                            int i9 = (int) (this.o * 1.2f);
                            int i10 = (int) (this.p * 1.2f);
                            bx0Var.a = i9;
                            bx0Var.b = i10;
                            bx0Var.c = (int) (iD * 1.2f);
                            bx0Var.e = this.i;
                            bx0Var.f = true;
                        }
                    } else {
                        bx0Var.d = this.a;
                        g();
                    }
                }
            }
            boolean z = bx0Var.d >= 0;
            bx0Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.e0.b();
            }
        }
    }

    public final void g() {
        if (this.e) {
            this.e = false;
            this.p = 0;
            this.o = 0;
            this.k = null;
            this.b.h0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            rw0 rw0Var = this.c;
            if (rw0Var.e == this) {
                rw0Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
