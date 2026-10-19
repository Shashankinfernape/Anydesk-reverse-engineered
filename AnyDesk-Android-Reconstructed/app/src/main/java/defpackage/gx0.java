package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gx0 implements Runnable {
    public int c;
    public int d;
    public OverScroller e;
    public Interpolator f;
    public boolean g;
    public boolean h;
    public final /* synthetic */ RecyclerView i;

    public gx0(RecyclerView recyclerView) {
        this.i = recyclerView;
        gw0 gw0Var = RecyclerView.J0;
        this.f = gw0Var;
        this.g = false;
        this.h = false;
        this.e = new OverScroller(recyclerView.getContext(), gw0Var);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.i;
        recyclerView.setScrollState(2);
        this.d = 0;
        this.c = 0;
        Interpolator interpolator = this.f;
        gw0 gw0Var = RecyclerView.J0;
        if (interpolator != gw0Var) {
            this.f = gw0Var;
            this.e = new OverScroller(recyclerView.getContext(), gw0Var);
        }
        this.e.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.g) {
            this.h = true;
            return;
        }
        RecyclerView recyclerView = this.i;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = oe1.a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        RecyclerView recyclerView = this.i;
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            i3 = Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.J0;
        }
        if (this.f != interpolator) {
            this.f = interpolator;
            this.e = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.d = 0;
        this.c = 0;
        recyclerView.setScrollState(2);
        this.e.startScroll(0, 0, i, i2, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.e.computeScrollOffset();
        }
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.i;
        int[] iArr = recyclerView.t0;
        if (recyclerView.p == null) {
            recyclerView.removeCallbacks(this);
            this.e.abortAnimation();
            return;
        }
        this.h = false;
        this.g = true;
        recyclerView.p();
        OverScroller overScroller = this.e;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.c;
            int i7 = currY - this.d;
            this.c = currX;
            this.d = currY;
            int iO = RecyclerView.o(i6, recyclerView.J, recyclerView.L, recyclerView.getWidth());
            int iO2 = RecyclerView.o(i7, recyclerView.K, recyclerView.M, recyclerView.getHeight());
            int[] iArr2 = recyclerView.t0;
            iArr2[0] = 0;
            iArr2[1] = 0;
            if (recyclerView.u(iO, iO2, 1, iArr2, null)) {
                iO -= iArr[0];
                iO2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(iO, iO2);
            }
            if (recyclerView.o != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.g0(iO, iO2, iArr);
                int i8 = iArr[0];
                int i9 = iArr[1];
                int i10 = iO - i8;
                int i11 = iO2 - i9;
                wf0 wf0Var = recyclerView.p.e;
                if (wf0Var != null && !wf0Var.d && wf0Var.e) {
                    int iB = recyclerView.h0.b();
                    if (iB == 0) {
                        wf0Var.g();
                    } else if (wf0Var.a >= iB) {
                        wf0Var.a = iB - 1;
                        wf0Var.f(i8, i9);
                    } else {
                        wf0Var.f(i8, i9);
                    }
                }
                i = i10;
                i3 = i8;
                i2 = i11;
                i4 = i9;
            } else {
                i = iO;
                i2 = iO2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.r.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.t0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.v(i3, i4, i, i2, null, 1, iArr3);
            int i12 = i - iArr[0];
            int i13 = i2 - iArr[1];
            if (i3 != 0 || i4 != 0) {
                recyclerView.w(i3, i4);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            wf0 wf0Var2 = recyclerView.p.e;
            if ((wf0Var2 == null || !wf0Var2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i12 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i12 > 0 ? currVelocity : 0;
                    }
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.y();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.z();
                        if (recyclerView.L.isFinished()) {
                            recyclerView.L.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.M.isFinished()) {
                            recyclerView.M.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.H0) {
                    p60 p60Var = recyclerView.g0;
                    int[] iArr4 = p60Var.c;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    p60Var.d = 0;
                }
            } else {
                b();
                r60 r60Var = recyclerView.f0;
                if (r60Var != null) {
                    r60Var.a(recyclerView, i3, i4);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                kw0.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        wf0 wf0Var3 = recyclerView.p.e;
        if (wf0Var3 != null && wf0Var3.d) {
            wf0Var3.f(0, 0);
        }
        this.g = false;
        if (!this.h) {
            recyclerView.setScrollState(0);
            recyclerView.o0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = oe1.a;
            recyclerView.postOnAnimation(this);
        }
    }
}
