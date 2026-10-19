package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class rw0 {
    public ol a;
    public RecyclerView b;
    public final ui0 c;
    public final ui0 d;
    public wf0 e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public rw0() {
        pw0 pw0Var = new pw0(this, 0);
        pw0 pw0Var2 = new pw0(this, 1);
        this.c = new ui0(pw0Var);
        this.d = new ui0(pw0Var2);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((sw0) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int G(View view) {
        return ((sw0) view.getLayoutParams()).a.c();
    }

    public static qw0 H(Context context, AttributeSet attributeSet, int i, int i2) {
        qw0 qw0Var = new qw0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mv0.a, i, i2);
        qw0Var.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        qw0Var.b = typedArrayObtainStyledAttributes.getInt(10, 1);
        qw0Var.c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        qw0Var.d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return qw0Var;
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        sw0 sw0Var = (sw0) view.getLayoutParams();
        Rect rect = sw0Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) sw0Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) sw0Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) sw0Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) sw0Var).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i2, i3) : size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int w(boolean z, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int z(View view) {
        Rect rect = ((sw0) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public abstract void A0(RecyclerView recyclerView, int i);

    public final int B() {
        RecyclerView recyclerView = this.b;
        iw0 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public final void B0(wf0 wf0Var) {
        wf0 wf0Var2 = this.e;
        if (wf0Var2 != null && wf0Var != wf0Var2 && wf0Var2.e) {
            wf0Var2.g();
        }
        this.e = wf0Var;
        RecyclerView recyclerView = this.b;
        gx0 gx0Var = recyclerView.e0;
        gx0Var.i.removeCallbacks(gx0Var);
        gx0Var.e.abortAnimation();
        if (wf0Var.h) {
            Log.w("RecyclerView", "An instance of " + wf0Var.getClass().getSimpleName() + " was started more than once. Each instance of" + wf0Var.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        wf0Var.b = recyclerView;
        wf0Var.c = this;
        int i = wf0Var.a;
        if (i == -1) {
            id.q("Invalid target position");
            return;
        }
        recyclerView.h0.a = i;
        wf0Var.e = true;
        wf0Var.d = true;
        wf0Var.f = recyclerView.p.q(i);
        wf0Var.b.e0.b();
        wf0Var.h = true;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public boolean C0() {
        return false;
    }

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int I(yw0 yw0Var, dx0 dx0Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.o == null || !e()) {
            return 1;
        }
        return this.b.o.a();
    }

    public final void J(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((sw0) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.n;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean K();

    public boolean L() {
        return false;
    }

    public void O(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iE = recyclerView.h.e();
            for (int i2 = 0; i2 < iE; i2++) {
                recyclerView.h.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int iE = recyclerView.h.e();
            for (int i2 = 0; i2 < iE; i2++) {
                recyclerView.h.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, yw0 yw0Var, dx0 dx0Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        yw0 yw0Var = recyclerView.e;
        dx0 dx0Var = recyclerView.h0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        iw0 iw0Var = this.b.o;
        if (iw0Var != null) {
            accessibilityEvent.setItemCount(iw0Var.a());
        }
    }

    public void V(yw0 yw0Var, dx0 dx0Var, w3 w3Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = w3Var.a;
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            w3Var.a(8192);
            accessibilityNodeInfo.setScrollable(true);
            w3Var.i(67108864, true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            w3Var.a(4096);
            accessibilityNodeInfo.setScrollable(true);
            w3Var.i(67108864, true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(I(yw0Var, dx0Var), x(yw0Var, dx0Var), false, 0));
    }

    public void W(yw0 yw0Var, dx0 dx0Var, View view, w3 w3Var) {
        w3Var.k(v3.a(e() ? G(view) : 0, 1, d() ? G(view) : 0, 1, false, false));
    }

    public final void X(View view, w3 w3Var) {
        hx0 hx0VarM = RecyclerView.M(view);
        if (hx0VarM == null || hx0VarM.i()) {
            return;
        }
        ol olVar = this.a;
        if (olVar.c.contains(hx0VarM.a)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        W(recyclerView.e, recyclerView.h0, view, w3Var);
    }

    public final void b(View view, int i, boolean z) {
        hx0 hx0VarM = RecyclerView.M(view);
        if (z || hx0VarM.i()) {
            i51 i51Var = (i51) this.b.i.e;
            te1 te1VarA = (te1) i51Var.get(hx0VarM);
            if (te1VarA == null) {
                te1VarA = te1.a();
                i51Var.put(hx0VarM, te1VarA);
            }
            te1VarA.a |= 1;
        } else {
            this.b.i.t(hx0VarM);
        }
        sw0 sw0Var = (sw0) view.getLayoutParams();
        if (hx0VarM.q() || hx0VarM.j()) {
            if (hx0VarM.j()) {
                hx0VarM.n.r(hx0VarM);
            } else {
                hx0VarM.j &= -33;
            }
            this.a.b(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            ol olVar = this.a;
            if (parent == recyclerView) {
                aa aaVar = olVar.b;
                int iIndexOfChild = olVar.a.c.indexOfChild(view);
                int iC = (iIndexOfChild == -1 || aaVar.e(iIndexOfChild)) ? -1 : iIndexOfChild - aaVar.c(iIndexOfChild);
                if (i == -1) {
                    i = this.a.e();
                }
                if (iC == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.B());
                }
                if (iC != i) {
                    rw0 rw0Var = this.b.p;
                    View viewU = rw0Var.u(iC);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iC + rw0Var.b.toString());
                    }
                    rw0Var.u(iC);
                    rw0Var.a.c(iC);
                    sw0 sw0Var2 = (sw0) viewU.getLayoutParams();
                    hx0 hx0VarM2 = RecyclerView.M(viewU);
                    boolean zI = hx0VarM2.i();
                    RecyclerView recyclerView2 = rw0Var.b;
                    if (zI) {
                        i51 i51Var2 = (i51) recyclerView2.i.e;
                        te1 te1VarA2 = (te1) i51Var2.get(hx0VarM2);
                        if (te1VarA2 == null) {
                            te1VarA2 = te1.a();
                            i51Var2.put(hx0VarM2, te1VarA2);
                        }
                        te1VarA2.a = 1 | te1VarA2.a;
                    } else {
                        recyclerView2.i.t(hx0VarM2);
                    }
                    rw0Var.a.b(viewU, i, sw0Var2, hx0VarM2.i());
                }
            } else {
                olVar.a(view, i, false);
                sw0Var.c = true;
                wf0 wf0Var = this.e;
                if (wf0Var != null && wf0Var.e) {
                    wf0Var.b.getClass();
                    hx0 hx0VarM3 = RecyclerView.M(view);
                    if ((hx0VarM3 != null ? hx0VarM3.c() : -1) == wf0Var.a) {
                        wf0Var.f = view;
                        if (RecyclerView.D0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (sw0Var.d) {
            if (RecyclerView.D0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + sw0Var.a);
            }
            hx0VarM.a.invalidate();
            sw0Var.d = false;
        }
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public abstract boolean d();

    public abstract void d0(yw0 yw0Var, dx0 dx0Var);

    public abstract boolean e();

    public abstract void e0(dx0 dx0Var);

    public boolean f(sw0 sw0Var) {
        return sw0Var != null;
    }

    public Parcelable g0() {
        return null;
    }

    public boolean i0(int i, Bundle bundle) {
        int iF;
        int iD;
        float f;
        yw0 yw0Var = this.b.e;
        int iHeight = this.o;
        int iWidth = this.n;
        Rect rect = new Rect();
        if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i != 4096) {
            if (i != 8192) {
                iF = 0;
            } else {
                iF = this.b.canScrollVertically(-1) ? -((iHeight - F()) - C()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    iD = -((iWidth - D()) - E());
                }
            }
        } else {
            iF = this.b.canScrollVertically(1) ? (iHeight - F()) - C() : 0;
            iD = this.b.canScrollHorizontally(1) ? (iWidth - D()) - E() : 0;
        }
        if (iF != 0 || iD != 0) {
            if (bundle != null) {
                f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                if (f < 0.0f) {
                    if (RecyclerView.C0) {
                        throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                    }
                }
            } else {
                f = 1.0f;
            }
            if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
                if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                    iD = (int) (iD * f);
                    iF = (int) (iF * f);
                }
                this.b.j0(iD, iF, true);
                return true;
            }
            RecyclerView recyclerView = this.b;
            iw0 iw0Var = recyclerView.o;
            if (iw0Var != null) {
                if (i == 4096) {
                    recyclerView.k0(iw0Var.a() - 1);
                    return true;
                }
                if (i != 8192) {
                    return true;
                }
                recyclerView.k0(0);
                return true;
            }
        }
        return false;
    }

    public abstract int j(dx0 dx0Var);

    public final void j0(yw0 yw0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.M(u(iV)).p()) {
                View viewU = u(iV);
                m0(iV);
                yw0Var.m(viewU);
            }
        }
    }

    public abstract int k(dx0 dx0Var);

    public final void k0(yw0 yw0Var) {
        ArrayList arrayList;
        int size = ((ArrayList) yw0Var.c).size();
        int i = size - 1;
        while (true) {
            arrayList = (ArrayList) yw0Var.c;
            if (i < 0) {
                break;
            }
            View view = ((hx0) arrayList.get(i)).a;
            hx0 hx0VarM = RecyclerView.M(view);
            if (!hx0VarM.p()) {
                hx0VarM.o(false);
                if (hx0VarM.k()) {
                    this.b.removeDetachedView(view, false);
                }
                nw0 nw0Var = this.b.N;
                if (nw0Var != null) {
                    nw0Var.d(hx0VarM);
                }
                hx0VarM.o(true);
                hx0 hx0VarM2 = RecyclerView.M(view);
                hx0VarM2.n = null;
                hx0VarM2.o = false;
                hx0VarM2.j &= -33;
                yw0Var.n(hx0VarM2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = (ArrayList) yw0Var.d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int l(dx0 dx0Var);

    public final void l0(View view, yw0 yw0Var) {
        ol olVar = this.a;
        hw0 hw0Var = olVar.a;
        int i = olVar.d;
        if (i == 1) {
            nh0.j("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            nh0.j("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        try {
            olVar.d = 1;
            olVar.e = view;
            int iIndexOfChild = hw0Var.c.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (olVar.b.h(iIndexOfChild)) {
                    olVar.j(view);
                }
                hw0Var.k(iIndexOfChild);
            }
            olVar.d = 0;
            olVar.e = null;
            yw0Var.m(view);
        } catch (Throwable th) {
            olVar.d = 0;
            olVar.e = null;
            throw th;
        }
    }

    public abstract int m(dx0 dx0Var);

    public final void m0(int i) {
        if (u(i) != null) {
            ol olVar = this.a;
            hw0 hw0Var = olVar.a;
            int i2 = olVar.d;
            if (i2 == 1) {
                nh0.j("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i2 == 2) {
                nh0.j("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                int iF = olVar.f(i);
                View childAt = hw0Var.c.getChildAt(iF);
                if (childAt == null) {
                    return;
                }
                olVar.d = 1;
                olVar.e = childAt;
                if (olVar.b.h(iF)) {
                    olVar.j(childAt);
                }
                hw0Var.k(iF);
            } finally {
                olVar.d = 0;
                olVar.e = null;
            }
        }
    }

    public abstract int n(dx0 dx0Var);

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    public boolean n0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iD = D();
        int iF = F();
        int iE = this.n - E();
        int iC = this.o - C();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iD;
        int iMin = Math.min(0, i);
        int i2 = top - iF;
        int iMin2 = Math.min(0, i2);
        int i3 = iWidth - iE;
        int iMax = Math.max(0, i3);
        int iMax2 = Math.max(0, iHeight - iC);
        if (this.b.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i3);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i2, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iD2 = D();
                int iF2 = F();
                int iE2 = this.n - E();
                int iC2 = this.o - C();
                Rect rect2 = this.b.l;
                y(focusedChild, rect2);
                if (rect2.left - i4 < iE2 && rect2.right - i4 > iD2 && rect2.top - i5 < iC2 && rect2.bottom - i5 > iF2) {
                    if (i4 == 0) {
                    }
                    if (z) {
                        recyclerView.scrollBy(i4, i5);
                        return true;
                    }
                    recyclerView.j0(i4, i5, false);
                    return true;
                }
            }
        } else if (i4 == 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.j0(i4, i5, false);
            return true;
        }
        return false;
    }

    public abstract int o(dx0 dx0Var);

    public final void o0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void p(yw0 yw0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            hx0 hx0VarM = RecyclerView.M(viewU);
            if (hx0VarM.p()) {
                if (RecyclerView.D0) {
                    Log.d("RecyclerView", "ignoring view " + hx0VarM);
                }
            } else if (!hx0VarM.g() || hx0VarM.i() || this.b.o.b) {
                u(iV);
                this.a.c(iV);
                yw0Var.o(viewU);
                this.b.i.t(hx0VarM);
            } else {
                m0(iV);
                yw0Var.n(hx0VarM);
            }
        }
    }

    public abstract int p0(int i, yw0 yw0Var, dx0 dx0Var);

    public View q(int i) {
        int iV = v();
        for (int i2 = 0; i2 < iV; i2++) {
            View viewU = u(i2);
            hx0 hx0VarM = RecyclerView.M(viewU);
            if (hx0VarM != null && hx0VarM.c() == i && !hx0VarM.p() && (this.b.h0.g || !hx0VarM.i())) {
                return viewU;
            }
        }
        return null;
    }

    public abstract void q0(int i);

    public abstract sw0 r();

    public abstract int r0(int i, yw0 yw0Var, dx0 dx0Var);

    public sw0 s(Context context, AttributeSet attributeSet) {
        return new sw0(context, attributeSet);
    }

    public final void s0(RecyclerView recyclerView) {
        t0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public sw0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof sw0) {
            return new sw0((sw0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new sw0((ViewGroup.MarginLayoutParams) layoutParams) : new sw0(layoutParams);
    }

    public final void t0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.G0) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.G0) {
            return;
        }
        this.o = 0;
    }

    public final View u(int i) {
        ol olVar = this.a;
        if (olVar != null) {
            return olVar.d(i);
        }
        return null;
    }

    public void u0(int i, int i2, Rect rect) {
        int iE = E() + D() + rect.width();
        int iC = C() + F() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = oe1.a;
        this.b.setMeasuredDimension(g(i, iE, recyclerView.getMinimumWidth()), g(i2, iC, this.b.getMinimumHeight()));
    }

    public final int v() {
        ol olVar = this.a;
        if (olVar != null) {
            return olVar.e();
        }
        return 0;
    }

    public final void v0(int i, int i2) {
        int iV = v();
        if (iV == 0) {
            this.b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < iV; i7++) {
            View viewU = u(i7);
            Rect rect = this.b.l;
            y(viewU, rect);
            int i8 = rect.left;
            if (i8 < i5) {
                i5 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i6) {
                i6 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i4) {
                i4 = i11;
            }
        }
        this.b.l.set(i5, i6, i3, i4);
        u0(i, i2, this.b.l);
    }

    public final void w0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.h;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public int x(yw0 yw0Var, dx0 dx0Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.o == null || !d()) {
            return 1;
        }
        return this.b.o.a();
    }

    public final boolean x0(View view, int i, int i2, sw0 sw0Var) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) sw0Var).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) sw0Var).height)) ? false : true;
    }

    public void y(View view, Rect rect) {
        boolean z = RecyclerView.C0;
        sw0 sw0Var = (sw0) view.getLayoutParams();
        Rect rect2 = sw0Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) sw0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) sw0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) sw0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) sw0Var).bottomMargin);
    }

    public boolean y0() {
        return false;
    }

    public final boolean z0(View view, int i, int i2, sw0 sw0Var) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) sw0Var).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) sw0Var).height)) ? false : true;
    }

    public void R(RecyclerView recyclerView) {
    }

    public void f0(Parcelable parcelable) {
    }

    public void h0(int i) {
    }

    public void Q() {
    }

    public void Z() {
    }

    public void Y(int i, int i2) {
    }

    public void a0(int i, int i2) {
    }

    public void b0(int i, int i2) {
    }

    public void c0(int i, int i2) {
    }

    public void i(int i, p60 p60Var) {
    }

    public void h(int i, int i2, dx0 dx0Var, p60 p60Var) {
    }
}
