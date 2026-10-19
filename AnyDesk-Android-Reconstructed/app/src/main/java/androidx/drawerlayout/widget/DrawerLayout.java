package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import defpackage.c;
import defpackage.cb1;
import defpackage.cr0;
import defpackage.ev;
import defpackage.fv;
import defpackage.ge1;
import defpackage.gh1;
import defpackage.gv;
import defpackage.hv;
import defpackage.id;
import defpackage.il;
import defpackage.iv;
import defpackage.jv;
import defpackage.n3;
import defpackage.o3;
import defpackage.oe1;
import defpackage.q3;
import defpackage.qe1;
import defpackage.s90;
import defpackage.tv0;
import defpackage.xb;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements cr0 {
    public static final int[] E = {R.attr.colorPrimaryDark};
    public static final int[] F = {R.attr.layout_gravity};
    public static final boolean G;
    public final ArrayList A;
    public Rect B;
    public Matrix C;
    public final ev D;
    public float c;
    public final int d;
    public int e;
    public float f;
    public final Paint g;
    public final qe1 h;
    public final qe1 i;
    public final xb j;
    public final xb k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public hv t;
    public ArrayList u;
    public float v;
    public float w;
    public Drawable x;
    public WindowInsets y;
    public boolean z;

    static {
        G = Build.VERSION.SDK_INT >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2 = 0;
        new gv(i2);
        this.e = -1728053248;
        this.g = new Paint();
        this.n = true;
        this.o = 3;
        this.p = 3;
        this.q = 3;
        this.r = 3;
        this.D = new ev(i2, this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.d = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        xb xbVar = new xb(this, 3);
        this.j = xbVar;
        xb xbVar2 = new xb(this, 5);
        this.k = xbVar2;
        qe1 qe1Var = new qe1(getContext(), this, xbVar);
        qe1Var.b = (int) (qe1Var.b * 1.0f);
        this.h = qe1Var;
        qe1Var.q = 1;
        qe1Var.n = f2;
        xbVar.d = qe1Var;
        qe1 qe1Var2 = new qe1(getContext(), this, xbVar2);
        qe1Var2.b = (int) (1.0f * qe1Var2.b);
        this.i = qe1Var2;
        qe1Var2.q = 2;
        qe1Var2.n = f2;
        xbVar2.d = qe1Var2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = oe1.a;
        setImportantForAccessibility(1);
        oe1.n(this, new il(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new fv());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(E);
            try {
                this.x = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, tv0.a, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.c = typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.c = getResources().getDimension(com.anydesk.anydeskandroid.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.A = new ArrayList();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static String j(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean k(View view) {
        return ((iv) view.getLayoutParams()).a == 0;
    }

    public static boolean l(View view) {
        if (m(view)) {
            return (((iv) view.getLayoutParams()).d & 1) == 1;
        }
        cb1.e(view, " is not a drawer", "View ");
        return false;
    }

    public static boolean m(View view) {
        int i = ((iv) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = oe1.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public final void a(hv hvVar) {
        if (hvVar == null) {
            return;
        }
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(hvVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.A;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!m(childAt)) {
                arrayList2.add(childAt);
            } else if (l(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if ((((iv) childAt.getLayoutParams()).d & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt != null || m(view)) {
            WeakHashMap weakHashMap = oe1.a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = oe1.a;
            view.setImportantForAccessibility(1);
        }
    }

    public final boolean b(View view, int i) {
        return (i(view) & i) == i;
    }

    public final void c(View view, boolean z) {
        if (!m(view)) {
            cb1.e(view, " is not a sliding drawer", "View ");
            return;
        }
        iv ivVar = (iv) view.getLayoutParams();
        if (this.n) {
            ivVar.b = 0.0f;
            ivVar.d = 0;
        } else if (z) {
            ivVar.d |= 4;
            if (b(view, 3)) {
                this.h.s(view, -view.getWidth(), view.getTop());
            } else {
                this.i.s(view, getWidth(), view.getTop());
            }
        } else {
            float f = ((iv) view.getLayoutParams()).b;
            float width = view.getWidth();
            int i = ((int) (width * 0.0f)) - ((int) (f * width));
            if (!b(view, 3)) {
                i = -i;
            }
            view.offsetLeftAndRight(i);
            q(view, 0.0f);
            t(view, 0);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof iv) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((iv) getChildAt(i).getLayoutParams()).b);
        }
        this.f = fMax;
        boolean zG = this.h.g();
        boolean zG2 = this.i.g();
        if (zG || zG2) {
            WeakHashMap weakHashMap = oe1.a;
            postInvalidateOnAnimation();
        }
    }

    public final void d() {
        View viewF = f(8388611);
        if (viewF != null) {
            c(viewF, true);
        } else {
            id.f(j(8388611), "No drawer view found with gravity ");
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.B == null) {
                this.B = new Rect();
            }
            childAt.getHitRect(this.B);
            if (this.B.contains((int) x, (int) y) && !k(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.C == null) {
                            this.C = new Matrix();
                        }
                        matrix.invert(this.C);
                        motionEventObtain.transform(this.C);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zK = k(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zK) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && m(childAt) && childAt.getHeight() >= height) {
                    if (b(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.f;
        if (f > 0.0f && zK) {
            int i4 = this.e;
            Paint paint = this.g;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, 0.0f, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final void e(boolean z) {
        boolean zS;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            iv ivVar = (iv) childAt.getLayoutParams();
            if (m(childAt) && (!z || ivVar.c)) {
                int width = childAt.getWidth();
                if (b(childAt, 3)) {
                    int top = childAt.getTop();
                    zS = this.h.s(childAt, -width, top);
                } else {
                    zS = this.i.s(childAt, getWidth(), childAt.getTop());
                }
                z2 |= zS;
                ivVar.c = false;
            }
        }
        xb xbVar = this.j;
        ((DrawerLayout) xbVar.f).removeCallbacks((c) xbVar.e);
        xb xbVar2 = this.k;
        ((DrawerLayout) xbVar2.f).removeCallbacks((c) xbVar2.e);
        if (z2) {
            invalidate();
        }
    }

    public final View f(int i) {
        WeakHashMap weakHashMap = oe1.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((i(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View g() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m(childAt)) {
                if (!m(childAt)) {
                    cb1.e(childAt, " is not a drawer", "View ");
                    return null;
                }
                if (((iv) childAt.getLayoutParams()).b > 0.0f) {
                    return childAt;
                }
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        iv ivVar = new iv(-1, -1);
        ivVar.a = 0;
        return ivVar;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof iv) {
            iv ivVar = (iv) layoutParams;
            iv ivVar2 = new iv(ivVar);
            ivVar2.a = 0;
            ivVar2.a = ivVar.a;
            return ivVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            iv ivVar3 = new iv((ViewGroup.MarginLayoutParams) layoutParams);
            ivVar3.a = 0;
            return ivVar3;
        }
        iv ivVar4 = new iv(layoutParams);
        ivVar4.a = 0;
        return ivVar4;
    }

    public float getDrawerElevation() {
        return this.c;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.x;
    }

    public final int h(View view) {
        if (!m(view)) {
            cb1.e(view, " is not a drawer", "View ");
            return 0;
        }
        int i = ((iv) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = oe1.a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.o;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.q : this.r;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.p;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.r : this.q;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.q;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.o : this.p;
            if (i7 != 3) {
                return i7;
            }
        } else if (i == 8388613) {
            int i8 = this.r;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.p : this.o;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    public final int i(View view) {
        int i = ((iv) view.getLayoutParams()).a;
        WeakHashMap weakHashMap = oe1.a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    public final void n(View view) {
        if (!m(view)) {
            cb1.e(view, " is not a sliding drawer", "View ");
            return;
        }
        iv ivVar = (iv) view.getLayoutParams();
        if (this.n) {
            ivVar.b = 1.0f;
            ivVar.d = 1;
            s(view, true);
            r(view);
        } else {
            ivVar.d |= 2;
            if (b(view, 3)) {
                this.h.s(view, 0, view.getTop());
            } else {
                this.i.s(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void o() {
        View viewF = f(8388611);
        if (viewF != null) {
            n(viewF);
        } else {
            id.f(j(8388611), "No drawer view found with gravity ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.z || this.x == null) {
            return;
        }
        WindowInsets windowInsets = this.y;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.x.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.x.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View viewI;
        int actionMasked = motionEvent.getActionMasked();
        qe1 qe1Var = this.h;
        boolean zR = qe1Var.r(motionEvent) | this.i.r(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                e(true);
                this.s = false;
            } else if (actionMasked == 2) {
                int length = qe1Var.d.length;
                for (int i = 0; i < length; i++) {
                    if ((qe1Var.k & (1 << i)) != 0) {
                        float f = qe1Var.f[i] - qe1Var.d[i];
                        float f2 = qe1Var.g[i] - qe1Var.e[i];
                        float f3 = (f2 * f2) + (f * f);
                        int i2 = qe1Var.b;
                        if (f3 > i2 * i2) {
                            xb xbVar = this.j;
                            ((DrawerLayout) xbVar.f).removeCallbacks((c) xbVar.e);
                            xb xbVar2 = this.k;
                            ((DrawerLayout) xbVar2.f).removeCallbacks((c) xbVar2.e);
                            break;
                        }
                    }
                }
            } else if (actionMasked == 3) {
                e(true);
                this.s = false;
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.v = x;
            this.w = y;
            z = this.f > 0.0f && (viewI = qe1Var.i((int) x, (int) y)) != null && k(viewI);
            this.s = false;
        }
        if (!zR && !z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (!((iv) getChildAt(i3).getLayoutParams()).c) {
                }
            }
            if (!this.s) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || g() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewG = g();
        if (viewG != null && h(viewG) == 0) {
            e(false);
        }
        return viewG != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        this.m = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                iv ivVar = (iv) childAt.getLayoutParams();
                if (k(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) ivVar).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) ivVar).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) ivVar).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (ivVar.b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        int i9 = i6 - ((int) (ivVar.b * f3));
                        f = (i6 - i9) / f3;
                        i5 = i9;
                    }
                    boolean z2 = f != ivVar.b;
                    int i10 = ivVar.a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = ((ViewGroup.MarginLayoutParams) ivVar).topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = i11 - ((ViewGroup.MarginLayoutParams) ivVar).bottomMargin;
                            if (i14 > i15) {
                                i12 = i15 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = ((ViewGroup.MarginLayoutParams) ivVar).topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - ((ViewGroup.MarginLayoutParams) ivVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - ((ViewGroup.MarginLayoutParams) ivVar).bottomMargin);
                    }
                    if (z2) {
                        q(childAt, f);
                    }
                    int i18 = ivVar.b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
        }
        if (G && (rootWindowInsets = getRootWindowInsets()) != null) {
            s90 s90VarI = gh1.g(rootWindowInsets, null).a.i();
            qe1 qe1Var = this.h;
            qe1Var.o = Math.max(qe1Var.p, s90VarI.a);
            qe1 qe1Var2 = this.i;
            qe1Var2.o = Math.max(qe1Var2.p, s90VarI.c);
        }
        this.m = false;
        this.n = false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                id.q("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
                return;
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        if (this.y != null) {
            WeakHashMap weakHashMap = oe1.a;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        WeakHashMap weakHashMap2 = oe1.a;
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                iv ivVar = (iv) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(ivVar.a, layoutDirection);
                    boolean fitsSystemWindows = childAt.getFitsSystemWindows();
                    WindowInsets windowInsetsReplaceSystemWindowInsets = this.y;
                    if (fitsSystemWindows) {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        if (absoluteGravity == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (absoluteGravity == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) ivVar).leftMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) ivVar).topMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) ivVar).rightMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) ivVar).bottomMargin = windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom();
                    }
                }
                if (k(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) ivVar).leftMargin) - ((ViewGroup.MarginLayoutParams) ivVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) ivVar).topMargin) - ((ViewGroup.MarginLayoutParams) ivVar).bottomMargin, 1073741824));
                } else {
                    if (!m(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i3 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    float fE = ge1.e(childAt);
                    float f = this.c;
                    if (fE != f) {
                        ge1.j(childAt, f);
                    }
                    int i4 = i(childAt) & 7;
                    boolean z4 = i4 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + j(i4) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, this.d + ((ViewGroup.MarginLayoutParams) ivVar).leftMargin + ((ViewGroup.MarginLayoutParams) ivVar).rightMargin, ((ViewGroup.MarginLayoutParams) ivVar).width), ViewGroup.getChildMeasureSpec(i2, ((ViewGroup.MarginLayoutParams) ivVar).topMargin + ((ViewGroup.MarginLayoutParams) ivVar).bottomMargin, ((ViewGroup.MarginLayoutParams) ivVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewF;
        if (!(parcelable instanceof jv)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        jv jvVar = (jv) parcelable;
        super.onRestoreInstanceState(jvVar.c);
        int i = jvVar.e;
        if (i != 0 && (viewF = f(i)) != null) {
            n(viewF);
        }
        int i2 = jvVar.f;
        if (i2 != 3) {
            p(i2, 3);
        }
        int i3 = jvVar.g;
        if (i3 != 3) {
            p(i3, 5);
        }
        int i4 = jvVar.h;
        if (i4 != 3) {
            p(i4, 8388611);
        }
        int i5 = jvVar.i;
        if (i5 != 3) {
            p(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        jv jvVar = new jv(super.onSaveInstanceState());
        jvVar.e = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            iv ivVar = (iv) getChildAt(i).getLayoutParams();
            int i2 = ivVar.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                jvVar.e = ivVar.a;
                break;
            }
        }
        jvVar.f = this.o;
        jvVar.g = this.p;
        jvVar.h = this.q;
        jvVar.i = this.r;
        return jvVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        qe1 qe1Var = this.h;
        qe1Var.l(motionEvent);
        this.i.l(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.v = x;
            this.w = y;
            this.s = false;
            return true;
        }
        if (action != 1) {
            if (action != 3) {
                return true;
            }
            e(true);
            this.s = false;
            return true;
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        View viewI = qe1Var.i((int) x2, (int) y2);
        if (viewI != null && k(viewI)) {
            float f = x2 - this.v;
            float f2 = y2 - this.w;
            int i = qe1Var.b;
            if ((f2 * f2) + (f * f) < i * i) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        childAt = null;
                        break;
                    }
                    childAt = getChildAt(i2);
                    if ((((iv) childAt.getLayoutParams()).d & 1) == 1) {
                        break;
                    }
                    i2++;
                }
                z = childAt == null || h(childAt) == 2;
            }
        }
        e(z);
        return true;
    }

    public final void p(int i, int i2) {
        View viewF;
        WeakHashMap weakHashMap = oe1.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.o = i;
        } else if (i2 == 5) {
            this.p = i;
        } else if (i2 == 8388611) {
            this.q = i;
        } else if (i2 == 8388613) {
            this.r = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.h : this.i).a();
        }
        if (i != 1) {
            if (i == 2 && (viewF = f(absoluteGravity)) != null) {
                n(viewF);
                return;
            }
            return;
        }
        View viewF2 = f(absoluteGravity);
        if (viewF2 != null) {
            c(viewF2, true);
        }
    }

    public final void q(View view, float f) {
        iv ivVar = (iv) view.getLayoutParams();
        if (f == ivVar.b) {
            return;
        }
        ivVar.b = f;
        ArrayList arrayList = this.u;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((hv) this.u.get(size)).getClass();
            }
        }
    }

    public final void r(View view) {
        o3 o3Var;
        q3 q3Var = q3.j;
        oe1.l(view, q3Var.a());
        oe1.h(view, 0);
        if (!l(view) || h(view) == 2) {
            return;
        }
        ev evVar = this.D;
        if (evVar == null) {
            oe1.l(view, q3Var.a());
            oe1.h(view, 0);
            return;
        }
        q3 q3Var2 = new q3(null, q3Var.b, null, evVar, q3Var.c);
        View.AccessibilityDelegate accessibilityDelegateD = oe1.d(view);
        if (accessibilityDelegateD == null) {
            o3Var = null;
        } else {
            o3Var = accessibilityDelegateD instanceof n3 ? ((n3) accessibilityDelegateD).a : new o3(accessibilityDelegateD);
        }
        if (o3Var == null) {
            o3Var = new o3();
        }
        oe1.n(view, o3Var);
        oe1.l(view, q3Var2.a());
        oe1.e(view).add(q3Var2);
        oe1.h(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            e(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.m) {
            return;
        }
        super.requestLayout();
    }

    public final void s(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || m(childAt)) && !(z && childAt == view)) {
                WeakHashMap weakHashMap = oe1.a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = oe1.a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public void setDrawerElevation(float f) {
        this.c = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (m(childAt)) {
                float f2 = this.c;
                WeakHashMap weakHashMap = oe1.a;
                ge1.j(childAt, f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(hv hvVar) {
        ArrayList arrayList;
        hv hvVar2 = this.t;
        if (hvVar2 != null && (arrayList = this.u) != null) {
            arrayList.remove(hvVar2);
        }
        if (hvVar != null) {
            a(hvVar);
        }
        this.t = hvVar;
    }

    public void setDrawerLockMode(int i) {
        p(i, 3);
        p(i, 5);
    }

    public void setScrimColor(int i) {
        this.e = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.x = i != 0 ? getContext().getDrawable(i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.x = new ColorDrawable(i);
        invalidate();
    }

    public final void t(View view, int i) {
        int i2;
        View rootView;
        int i3 = this.h.a;
        int i4 = this.i.a;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((iv) view.getLayoutParams()).b;
            if (f == 0.0f) {
                iv ivVar = (iv) view.getLayoutParams();
                if ((ivVar.d & 1) == 1) {
                    ivVar.d = 0;
                    ArrayList arrayList = this.u;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((hv) this.u.get(size)).b(view);
                        }
                    }
                    s(view, false);
                    r(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                iv ivVar2 = (iv) view.getLayoutParams();
                if ((ivVar2.d & 1) == 0) {
                    ivVar2.d = 1;
                    ArrayList arrayList2 = this.u;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((hv) this.u.get(size2)).a(view);
                        }
                    }
                    s(view, true);
                    r(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.l) {
            this.l = i2;
            ArrayList arrayList3 = this.u;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((hv) this.u.get(size3)).getClass();
                }
            }
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.x = drawable;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        iv ivVar = new iv(context, attributeSet);
        ivVar.a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, F);
        ivVar.a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return ivVar;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.anydesk.anydeskandroid.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }
}
