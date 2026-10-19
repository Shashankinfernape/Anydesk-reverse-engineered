package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import defpackage.ds;
import defpackage.ev;
import defpackage.ew;
import defpackage.ge1;
import defpackage.gv;
import defpackage.hp0;
import defpackage.ip0;
import defpackage.jp0;
import defpackage.ju;
import defpackage.kp0;
import defpackage.mp0;
import defpackage.nh0;
import defpackage.oe1;
import defpackage.q01;
import defpackage.vl0;
import defpackage.y90;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements mp0 {
    public static final float F = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final gv G = new gv(1);
    public static final int[] H = {R.attr.fillViewport};
    public final vl0 A;
    public final kp0 B;
    public float C;
    public ip0 D;
    public final ju E;
    public final float c;
    public long d;
    public final Rect e;
    public final OverScroller f;
    public final EdgeEffect g;
    public final EdgeEffect h;
    public q01 i;
    public int j;
    public boolean k;
    public boolean l;
    public View m;
    public boolean n;
    public VelocityTracker o;
    public boolean p;
    public boolean q;
    public final int r;
    public final int s;
    public final int t;
    public int u;
    public final int[] v;
    public final int[] w;
    public int x;
    public int y;
    public jp0 z;

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Rect();
        this.k = true;
        this.l = false;
        this.m = null;
        this.n = false;
        this.q = true;
        this.u = -1;
        this.v = new int[2];
        this.w = new int[2];
        this.E = new ju(getContext(), new ev(26, this));
        int i2 = Build.VERSION.SDK_INT;
        this.g = i2 >= 31 ? ew.a(context, attributeSet) : new EdgeEffect(context);
        this.h = i2 >= 31 ? ew.a(context, attributeSet) : new EdgeEffect(context);
        this.c = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.r = viewConfiguration.getScaledTouchSlop();
        this.s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.t = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.A = new vl0();
        this.B = new kp0(this);
        setNestedScrollingEnabled(true);
        oe1.n(this, G);
    }

    private q01 getScrollFeedbackProvider() {
        if (this.i == null) {
            this.i = new q01(this);
        }
        return this.i;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // defpackage.lp0
    public final void a(View view, View view2, int i, int i2) {
        vl0 vl0Var = this.A;
        if (i2 == 1) {
            vl0Var.b = i;
        } else {
            vl0Var.a = i;
        }
        this.B.g(2, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            nh0.j("ScrollView can host only one direct child");
        }
    }

    @Override // defpackage.lp0
    public final void b(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        n(i4, i5, null);
    }

    @Override // defpackage.lp0
    public final void c(View view, int i) {
        vl0 vl0Var = this.A;
        if (i == 1) {
            vl0Var.b = 0;
        } else {
            vl0Var.a = 0;
        }
        w(i);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f3  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int overScrollMode;
        OverScroller overScroller = this.f;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i2 = currY - this.y;
        int height = getHeight();
        EdgeEffect edgeEffect = this.g;
        EdgeEffect edgeEffect2 = this.h;
        if (i2 <= 0 || ds.r(edgeEffect) == 0.0f) {
            if (i2 < 0 && ds.r(edgeEffect2) != 0.0f) {
                float f = height;
                iRound = Math.round(ds.x(edgeEffect2, (i2 * 4.0f) / f, 0.5f) * (f / 4.0f));
                if (iRound != i2) {
                    edgeEffect2.finish();
                }
            }
            int i3 = i2;
            this.y = currY;
            iArr = this.w;
            iArr[1] = 0;
            this.B.c(0, i3, 1, iArr, null);
            i = i3 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                hp0.a(this, Math.abs(overScroller.getCurrVelocity()));
            }
            if (i != 0) {
                int scrollY = getScrollY();
                p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i - scrollY2;
                iArr[1] = 0;
                this.B.d(0, scrollY2, 0, i4, this.v, 1, iArr);
                i = i4 - iArr[1];
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                w(1);
            }
            if (overScroller.isFinished()) {
                w(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(ds.x(edgeEffect, ((-i2) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i2) {
            edgeEffect.finish();
        }
        i2 -= iRound;
        int i5 = i2;
        this.y = currY;
        iArr = this.w;
        iArr[1] = 0;
        this.B.c(0, i5, 1, iArr, null);
        i = i5 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            hp0.a(this, Math.abs(overScroller.getCurrVelocity()));
        }
        if (i != 0) {
            int scrollY3 = getScrollY();
            p(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i6 = i - scrollY4;
            iArr[1] = 0;
            this.B.d(0, scrollY4, 0, i6, this.v, 1, iArr);
            i = i6 - iArr[1];
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
            }
            overScroller.abortAnimation();
            w(1);
        }
        if (overScroller.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            w(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // defpackage.lp0
    public final void d(int[] iArr, int i, int i2, int i3) {
        this.B.c(i, i2, i3, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.B.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.B.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.B.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.B.d(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.g;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.h;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // defpackage.mp0
    public final void e(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        n(i4, i5, iArr);
    }

    @Override // defpackage.lp0
    public final boolean f(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final boolean g(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.e;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            s(h(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !m(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        vl0 vl0Var = this.A;
        return vl0Var.b | vl0Var.a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                nh0.j("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
            this.C = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.C;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.B.f(0);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    public final boolean i(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.e.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? k(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? k(130) : g(130);
                    }
                    if (keyCode == 62) {
                        q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return k(33);
                    }
                    if (keyCode == 93) {
                        return k(130);
                    }
                    if (keyCode == 122) {
                        q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        q(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.B.d;
    }

    public final void j(int i) {
        if (getChildCount() > 0) {
            this.f.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.B.g(2, 1);
            this.y = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                hp0.a(this, Math.abs(this.f.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.e;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i, int i2) {
        Rect rect = this.e;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.B.d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.u) {
            int i = actionIndex == 0 ? 1 : 0;
            this.j = (int) motionEvent.getY(i);
            this.u = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        int width;
        if (motionEvent.getAction() == 8 && !this.n) {
            if (y90.H(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
                i = 9;
            } else if (y90.H(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                axisValue = axisValue2;
                i = 26;
            } else {
                axisValue = 0.0f;
                i = 0;
                width = 0;
            }
            if (axisValue != 0.0f) {
                s(-((int) (getVerticalScrollFactorCompat() * axisValue)), i, motionEvent, width, 1, y90.H(motionEvent, 8194));
                if (i == 0) {
                    return true;
                }
                this.E.a(motionEvent, i);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.n) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.f;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!v(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.n = z;
                    velocityTracker = this.o;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.o = null;
                    }
                } else {
                    this.j = y;
                    this.u = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.o;
                    if (velocityTracker3 == null) {
                        this.o = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.o.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!v(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.n = z;
                    this.B.g(2, 0);
                }
            } else {
                if (!v(motionEvent)) {
                    z = false;
                }
                this.n = z;
                velocityTracker = this.o;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.o = null;
                }
            }
        } else if (i == 1) {
            this.n = false;
            this.u = -1;
            velocityTracker2 = this.o;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.o = null;
            }
            if (this.f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i == 2) {
            int i2 = this.u;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.j) > this.r && (2 & getNestedScrollAxes()) == 0) {
                        this.n = true;
                        this.j = y2;
                        if (this.o == null) {
                            this.o = VelocityTracker.obtain();
                        }
                        this.o.addMovement(motionEvent);
                        this.x = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.n = false;
            this.u = -1;
            velocityTracker2 = this.o;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.o = null;
            }
            if (this.f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else if (i == 6) {
            o(motionEvent);
        }
        return this.n;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.k = false;
        View view = this.m;
        if (view != null && l(view, this)) {
            View view2 = this.m;
            Rect rect = this.e;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.m = null;
        if (!this.l) {
            if (this.z != null) {
                scrollTo(getScrollX(), this.z.c);
                this.z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i5 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i5 != scrollY) {
                scrollTo(getScrollX(), i5);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.l = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.p && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        j((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.B.b(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.B.c(i, i2, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        n(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof jp0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        jp0 jp0Var = (jp0) parcelable;
        super.onRestoreInstanceState(jp0Var.getSuperState());
        this.z = jp0Var;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        jp0 jp0Var = new jp0(super.onSaveInstanceState());
        jp0Var.c = getScrollY();
        return jp0Var;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ip0 ip0Var = this.D;
        if (ip0Var != null) {
            ip0Var.m(this, i2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m(viewFindFocus, 0, i4)) {
            return;
        }
        Rect rect = this.e;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.q) {
                u(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x0129  */
    /* JADX WARN: Code duplicated, block: B:54:0x0131  */
    /* JADX WARN: Code duplicated, block: B:56:0x0137  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0140  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fX;
        int iRound;
        int i;
        int iAbs;
        int i2;
        ViewParent parent2;
        if (this.o == null) {
            this.o = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.x = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.x);
        kp0 kp0Var = this.B;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.g;
            EdgeEffect edgeEffect2 = this.h;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.o;
                velocityTracker.computeCurrentVelocity(1000, this.t);
                int yVelocity = (int) velocityTracker.getYVelocity(this.u);
                if (Math.abs(yVelocity) >= this.s) {
                    if (ds.r(edgeEffect) != 0.0f) {
                        if (t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (ds.r(edgeEffect2) != 0.0f) {
                        int i3 = -yVelocity;
                        if (t(edgeEffect2, i3)) {
                            edgeEffect2.onAbsorb(i3);
                        } else {
                            j(i3);
                        }
                    } else {
                        int i4 = -yVelocity;
                        float f2 = i4;
                        if (!kp0Var.b(0.0f, f2)) {
                            dispatchNestedFling(0.0f, f2, true);
                            j(i4);
                        }
                    }
                } else if (this.f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.u = -1;
                this.n = false;
                VelocityTracker velocityTracker2 = this.o;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.o = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.u);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.u + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i5 = this.j - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i5 / getHeight();
                    if (ds.r(edgeEffect) != 0.0f) {
                        fX = -ds.x(edgeEffect, -height, x);
                        if (ds.r(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (ds.r(edgeEffect2) != 0.0f) {
                        fX = ds.x(edgeEffect2, height, 1.0f - x);
                        if (ds.r(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i5 - iRound;
                        if (!this.n) {
                            iAbs = Math.abs(i);
                            i2 = this.r;
                            if (iAbs > i2) {
                                parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.n = true;
                                if (i > 0) {
                                    i -= i2;
                                } else {
                                    i += i2;
                                }
                            }
                        }
                        if (this.n) {
                            int iS = s(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.j = y - iS;
                            this.x += iS;
                        }
                    }
                    f = fX;
                    iRound = Math.round(f * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i5 - iRound;
                    if (!this.n) {
                        iAbs = Math.abs(i);
                        i2 = this.r;
                        if (iAbs > i2) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.n = true;
                            if (i > 0) {
                                i -= i2;
                            } else {
                                i += i2;
                            }
                        }
                    }
                    if (this.n) {
                        int iS2 = s(i, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.j = y - iS2;
                        this.x += iS2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.n && getChildCount() > 0) {
                    if (this.f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.u = -1;
                this.n = false;
                VelocityTracker velocityTracker3 = this.o;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.o = null;
                }
                w(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.j = (int) motionEvent.getY(actionIndex);
                this.u = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.j = (int) motionEvent.getY(motionEvent.findPointerIndex(this.u));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.n && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.f;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                w(1);
            }
            int y2 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.j = y2;
            this.u = pointerId;
            kp0Var.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.o;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i, int i2, int i3, int i4) {
        int i5;
        boolean z;
        int i6;
        boolean z2;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i7 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            i5 = i2;
            z = false;
        } else {
            z = true;
            i5 = 0;
        }
        if (i7 > i4) {
            i6 = i4;
            z2 = true;
        } else if (i7 < 0) {
            z2 = true;
            i6 = 0;
        } else {
            i6 = i7;
            z2 = false;
        }
        if (z2 && !this.B.f(1)) {
            this.f.springBack(i5, i6, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i5, i6);
        return z || z2;
    }

    public final void q(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.e;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        r(i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean r(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i2 < scrollY || i3 > i4) {
            s(z2 ? i2 - scrollY : i3 - i4, -1, null, 0, 1, true);
            z = true;
        } else {
            z = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i);
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.k) {
            this.m = view2;
        } else {
            Rect rect = this.e;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z2 = iH != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iH);
                return z2;
            }
            u(0, iH, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.o) != null) {
            velocityTracker.recycle();
            this.o = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.k = true;
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    public final int s(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        boolean z2;
        VelocityTracker velocityTracker;
        kp0 kp0Var = this.B;
        if (i4 == 1) {
            kp0Var.g(2, i4);
        }
        boolean zC = this.B.c(0, i, i4, this.w, this.v);
        int[] iArr = this.v;
        int[] iArr2 = this.w;
        if (zC) {
            i5 = i - iArr2[1];
            i6 = iArr[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z;
        boolean z4 = p(i5, 0, scrollY, scrollRange) && !kp0Var.f(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        iArr2[1] = 0;
        this.B.d(0, scrollY2, 0, i5 - scrollY2, this.v, i4, iArr2);
        int i7 = i6 + iArr[1];
        int i8 = i5 - iArr2[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.h;
        EdgeEffect edgeEffect2 = this.g;
        if (i9 >= 0) {
            if (i9 > scrollRange && z3) {
                ds.x(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
                if (motionEvent != null) {
                    getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z2 = false;
            } else {
                z2 = z4;
            }
            if (z2 && i4 == 0 && (velocityTracker = this.o) != null) {
                velocityTracker.clear();
            }
            if (i4 == 1) {
                w(i4);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i7;
        }
        if (z3) {
            ds.x(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z2 = false;
        } else {
            postInvalidateOnAnimation();
            z2 = false;
        }
        if (z2) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            w(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.p) {
            this.p = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        kp0 kp0Var = this.B;
        if (kp0Var.d) {
            ViewGroup viewGroup = kp0Var.c;
            WeakHashMap weakHashMap = oe1.a;
            ge1.l(viewGroup);
        }
        kp0Var.d = z;
    }

    public void setOnScrollChangeListener(ip0 ip0Var) {
        this.D = ip0Var;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.q = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.B.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fR = ds.r(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.c * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = F;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fR;
    }

    public final void u(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.d > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z) {
                this.B.g(2, 1);
            } else {
                w(1);
            }
            this.y = getScrollY();
            postInvalidateOnAnimation();
        } else {
            OverScroller overScroller = this.f;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                w(1);
            }
            scrollBy(i, i2);
        }
        this.d = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.g;
        if (ds.r(edgeEffect) != 0.0f) {
            ds.x(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.h;
        if (ds.r(edgeEffect2) == 0.0f) {
            return z;
        }
        ds.x(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void w(int i) {
        this.B.h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
        } else {
            nh0.j("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            nh0.j("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
        } else {
            nh0.j("ScrollView can host only one direct child");
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.anydesk.anydeskandroid.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }
}
