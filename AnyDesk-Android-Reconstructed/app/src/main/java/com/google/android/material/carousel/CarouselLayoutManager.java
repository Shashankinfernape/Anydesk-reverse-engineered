package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.R;
import defpackage.cw;
import defpackage.cx0;
import defpackage.dx0;
import defpackage.gr0;
import defpackage.id;
import defpackage.nh0;
import defpackage.nj;
import defpackage.oj;
import defpackage.ov0;
import defpackage.pj;
import defpackage.rw0;
import defpackage.sw0;
import defpackage.yw0;
import defpackage.z2;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends rw0 implements cx0 {
    public final cw p;
    public pj q;
    public final View.OnLayoutChangeListener r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new oj();
        this.r = new z2(1, this);
        this.p = new cw();
        o0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ov0.g);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            o0();
            F0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.rw0
    public final void A0(RecyclerView recyclerView, int i) {
        nj njVar = new nj(recyclerView.getContext());
        njVar.a = i;
        B0(njVar);
    }

    public final boolean D0() {
        return this.q.a == 0;
    }

    public final boolean E0() {
        return D0() && this.b.getLayoutDirection() == 1;
    }

    public final void F0(int i) {
        pj pjVar;
        if (i != 0 && i != 1) {
            id.q(gr0.e(i, "invalid orientation:"));
            return;
        }
        c(null);
        pj pjVar2 = this.q;
        if (pjVar2 == null || i != pjVar2.a) {
            if (i == 0) {
                pjVar = new pj(this, 1);
            } else {
                if (i != 1) {
                    id.q("invalid orientation");
                    return;
                }
                pjVar = new pj(this, 0);
            }
            this.q = pjVar;
            o0();
        }
    }

    @Override // defpackage.rw0
    public final boolean K() {
        return true;
    }

    @Override // defpackage.rw0
    public final void R(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        cw cwVar = this.p;
        float dimension = cwVar.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        cwVar.a = dimension;
        float dimension2 = cwVar.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        cwVar.b = dimension2;
        o0();
        recyclerView.addOnLayoutChangeListener(this.r);
    }

    @Override // defpackage.rw0
    public final void S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.r);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    @Override // defpackage.rw0
    public final View T(View view, int i, yw0 yw0Var, dx0 dx0Var) {
        byte b;
        if (v() != 0) {
            int i2 = this.q.a;
            if (i == 1) {
                b = -1;
            } else if (i == 2) {
                b = 1;
            } else if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        } else if (i2 == 1) {
                            b = 1;
                        }
                        b = -2147483648;
                    } else if (i2 != 0) {
                        b = -2147483648;
                    } else if (E0()) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                } else if (i2 == 1) {
                    b = -1;
                } else {
                    b = -2147483648;
                }
            } else if (i2 != 0) {
                b = -2147483648;
            } else if (E0()) {
                b = 1;
            } else {
                b = -1;
            }
            if (b != -2147483648) {
                if (b == -1) {
                    if (rw0.G(view) != 0) {
                        int iG = rw0.G(u(0)) - 1;
                        if (iG < 0 || iG >= B()) {
                            return u(E0() ? v() - 1 : 0);
                        }
                        this.q.a();
                        throw null;
                    }
                } else if (rw0.G(view) != B() - 1) {
                    int iG2 = rw0.G(u(v() - 1)) + 1;
                    if (iG2 < 0 || iG2 >= B()) {
                        return u(E0() ? 0 : v() - 1);
                    }
                    this.q.a();
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.rw0
    public final void U(AccessibilityEvent accessibilityEvent) {
        super.U(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(rw0.G(u(0)));
            accessibilityEvent.setToIndex(rw0.G(u(v() - 1)));
        }
    }

    @Override // defpackage.rw0
    public final void Y(int i, int i2) {
        B();
    }

    @Override // defpackage.cx0
    public final PointF a(int i) {
        return null;
    }

    @Override // defpackage.rw0
    public final void b0(int i, int i2) {
        B();
    }

    @Override // defpackage.rw0
    public final boolean d() {
        return D0();
    }

    @Override // defpackage.rw0
    public final void d0(yw0 yw0Var, dx0 dx0Var) {
        if (dx0Var.b() > 0) {
            if ((D0() ? this.n : this.o) > 0.0f) {
                E0();
                View view = yw0Var.q(0, Long.MAX_VALUE).a;
                nh0.j("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        j0(yw0Var);
    }

    @Override // defpackage.rw0
    public final boolean e() {
        return !D0();
    }

    @Override // defpackage.rw0
    public final void e0(dx0 dx0Var) {
        if (v() == 0) {
            return;
        }
        rw0.G(u(0));
    }

    @Override // defpackage.rw0
    public final int j(dx0 dx0Var) {
        v();
        return 0;
    }

    @Override // defpackage.rw0
    public final int k(dx0 dx0Var) {
        return 0;
    }

    @Override // defpackage.rw0
    public final int l(dx0 dx0Var) {
        return 0;
    }

    @Override // defpackage.rw0
    public final int m(dx0 dx0Var) {
        v();
        return 0;
    }

    @Override // defpackage.rw0
    public final int n(dx0 dx0Var) {
        return 0;
    }

    @Override // defpackage.rw0
    public final boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // defpackage.rw0
    public final int o(dx0 dx0Var) {
        return 0;
    }

    @Override // defpackage.rw0
    public final int p0(int i, yw0 yw0Var, dx0 dx0Var) {
        if (!D0() || v() == 0 || i == 0) {
            return 0;
        }
        View view = yw0Var.q(0, Long.MAX_VALUE).a;
        nh0.j("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.rw0
    public final void q0(int i) {
    }

    @Override // defpackage.rw0
    public final sw0 r() {
        return new sw0(-2, -2);
    }

    @Override // defpackage.rw0
    public final int r0(int i, yw0 yw0Var, dx0 dx0Var) {
        if (!e() || v() == 0 || i == 0) {
            return 0;
        }
        View view = yw0Var.q(0, Long.MAX_VALUE).a;
        nh0.j("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // defpackage.rw0
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerY();
        if (D0()) {
            rect.centerX();
        }
        throw null;
    }

    public CarouselLayoutManager() {
        cw cwVar = new cw();
        new oj();
        this.r = new z2(1, this);
        this.p = cwVar;
        o0();
        F0(0);
    }
}
