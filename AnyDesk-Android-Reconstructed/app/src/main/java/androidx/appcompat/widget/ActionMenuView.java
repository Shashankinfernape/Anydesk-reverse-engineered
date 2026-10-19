package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import defpackage.af1;
import defpackage.dj;
import defpackage.fw;
import defpackage.hl0;
import defpackage.kf1;
import defpackage.ll0;
import defpackage.pf0;
import defpackage.pk0;
import defpackage.qf0;
import defpackage.qk0;
import defpackage.r5;
import defpackage.rk0;
import defpackage.t5;
import defpackage.vk0;
import defpackage.w5;
import defpackage.x5;
import defpackage.y5;
import defpackage.z5;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends qf0 implements qk0, ll0 {
    public final int A;
    public final int B;
    public z5 C;
    public rk0 r;
    public Context s;
    public int t;
    public boolean u;
    public w5 v;
    public dj w;
    public pk0 x;
    public boolean y;
    public int z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.A = (int) (56.0f * f);
        this.B = (int) (f * 4.0f);
        this.s = context;
        this.t = 0;
    }

    public static y5 j() {
        y5 y5Var = new y5(-2, -2);
        y5Var.a = false;
        ((LinearLayout.LayoutParams) y5Var).gravity = 16;
        return y5Var;
    }

    public static y5 k(ViewGroup.LayoutParams layoutParams) {
        y5 y5Var;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof y5) {
            y5 y5Var2 = (y5) layoutParams;
            y5Var = new y5(y5Var2);
            y5Var.a = y5Var2.a;
        } else {
            y5Var = new y5(layoutParams);
        }
        if (((LinearLayout.LayoutParams) y5Var).gravity <= 0) {
            ((LinearLayout.LayoutParams) y5Var).gravity = 16;
        }
        return y5Var;
    }

    @Override // defpackage.qk0
    public final boolean a(vk0 vk0Var) {
        return this.r.q(vk0Var, null, 0);
    }

    @Override // defpackage.ll0
    public final void b(rk0 rk0Var) {
        this.r = rk0Var;
    }

    @Override // defpackage.qf0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof y5;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // defpackage.qf0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ pf0 generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.qf0
    /* JADX INFO: renamed from: g */
    public final pf0 generateLayoutParams(AttributeSet attributeSet) {
        return new y5(getContext(), attributeSet);
    }

    @Override // defpackage.qf0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.qf0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new y5(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.r == null) {
            Context context = getContext();
            rk0 rk0Var = new rk0(context);
            this.r = rk0Var;
            rk0Var.e = new af1(14, this);
            w5 w5Var = new w5(context);
            this.v = w5Var;
            w5Var.o = true;
            w5Var.p = true;
            hl0 fwVar = this.w;
            if (fwVar == null) {
                fwVar = new fw(8);
            }
            w5Var.g = fwVar;
            this.r.b(w5Var, this.s);
            w5 w5Var2 = this.v;
            w5Var2.j = this;
            this.r = w5Var2.e;
        }
        return this.r;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        w5 w5Var = this.v;
        t5 t5Var = w5Var.l;
        if (t5Var != null) {
            return t5Var.getDrawable();
        }
        if (w5Var.n) {
            return w5Var.m;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.qf0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ pf0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof x5)) {
            zA = ((x5) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof x5)) ? zA : ((x5) childAt2).b() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w5 w5Var = this.v;
        if (w5Var != null) {
            w5Var.h();
            if (this.v.i()) {
                this.v.d();
                this.v.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        w5 w5Var = this.v;
        if (w5Var != null) {
            w5Var.d();
            r5 r5Var = w5Var.w;
            if (r5Var == null || !r5Var.b()) {
                return;
            }
            r5Var.i.dismiss();
        }
    }

    @Override // defpackage.qf0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.y) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = kf1.a;
        boolean z3 = getLayoutDirection() == 1;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                y5 y5Var = (y5) childAt.getLayoutParams();
                if (y5Var.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) y5Var).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) y5Var).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) y5Var).leftMargin) + ((LinearLayout.LayoutParams) y5Var).rightMargin;
                    l(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                y5 y5Var2 = (y5) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !y5Var2.a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) y5Var2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) y5Var2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            y5 y5Var3 = (y5) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !y5Var3.a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) y5Var3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) y5Var3).rightMargin + iMax + i18;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // defpackage.qf0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        ?? r11;
        int i5;
        int i6;
        rk0 rk0Var;
        boolean z = this.y;
        boolean z2 = View.MeasureSpec.getMode(i) == 1073741824;
        this.y = z2;
        if (z != z2) {
            this.z = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.y && (rk0Var = this.r) != null && size != this.z) {
            this.z = size;
            rk0Var.p(true);
        }
        int childCount = getChildCount();
        if (!this.y || childCount <= 0) {
            for (int i7 = 0; i7 < childCount; i7++) {
                y5 y5Var = (y5) getChildAt(i7).getLayoutParams();
                ((LinearLayout.LayoutParams) y5Var).rightMargin = 0;
                ((LinearLayout.LayoutParams) y5Var).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i8 = size2 - paddingRight;
        int i9 = this.A;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = (i11 / i10) + i9;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i13 = 0;
        int iMax2 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        long j = 0;
        while (true) {
            i3 = this.B;
            if (i14 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i14);
            int i16 = size3;
            int i17 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i5 = i12;
            } else {
                boolean z4 = childAt instanceof ActionMenuItemView;
                i13++;
                if (z4) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                y5 y5Var2 = (y5) childAt.getLayoutParams();
                y5Var2.f = false;
                y5Var2.c = 0;
                y5Var2.b = 0;
                y5Var2.d = false;
                ((LinearLayout.LayoutParams) y5Var2).leftMargin = 0;
                ((LinearLayout.LayoutParams) y5Var2).rightMargin = 0;
                y5Var2.e = z4 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i18 = y5Var2.a ? 1 : i10;
                y5 y5Var3 = (y5) childAt.getLayoutParams();
                int i19 = i10;
                i5 = i12;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i17, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z4 ? (ActionMenuItemView) childAt : null;
                boolean z5 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z6 = z5;
                if (i18 <= 0 || (z5 && i18 < 2)) {
                    i6 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5 * i18, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i6 = measuredWidth / i5;
                    if (measuredWidth % i5 != 0) {
                        i6++;
                    }
                    if (z6 && i6 < 2) {
                        i6 = 2;
                    }
                }
                y5Var3.d = !y5Var3.a && z6;
                y5Var3.b = i6;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i6);
                if (y5Var2.d) {
                    i15++;
                }
                if (y5Var2.a) {
                    z3 = true;
                }
                i10 = i19 - i6;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i6 == 1) {
                    j |= (long) (1 << i14);
                }
            }
            i14++;
            size3 = i16;
            paddingBottom = i17;
            i12 = i5;
        }
        int i20 = size3;
        int i21 = i10;
        int i22 = i12;
        boolean z7 = z3 && i13 == 2;
        int i23 = i21;
        boolean z8 = false;
        while (true) {
            if (i15 <= 0 || i23 <= 0) {
                i4 = iMax;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j2 = 0;
            int i25 = 0;
            int i26 = 0;
            while (i26 < childCount2) {
                int i27 = iMax;
                y5 y5Var4 = (y5) getChildAt(i26).getLayoutParams();
                boolean z9 = z7;
                if (y5Var4.d) {
                    int i28 = y5Var4.b;
                    if (i28 < i24) {
                        j2 = 1 << i26;
                        i24 = i28;
                        i25 = 1;
                    } else if (i28 == i24) {
                        j2 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z7 = z9;
                iMax = i27;
            }
            i4 = iMax;
            boolean z10 = z7;
            j |= j2;
            if (i25 > i23) {
                break;
            }
            int i29 = i24 + 1;
            int i30 = 0;
            while (i30 < childCount2) {
                View childAt2 = getChildAt(i30);
                y5 y5Var5 = (y5) childAt2.getLayoutParams();
                boolean z11 = z3;
                long j3 = 1 << i30;
                if ((j2 & j3) != 0) {
                    if (z10 && y5Var5.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i23 == 1) {
                            childAt2.setPadding(i3 + i22, 0, i3, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    y5Var5.b += r11;
                    y5Var5.f = r11;
                    i23--;
                } else if (y5Var5.b == i29) {
                    j |= j3;
                }
                i30++;
                z3 = z11;
            }
            z7 = z10;
            iMax = i4;
            z8 = true;
        }
        boolean z12 = !z3 && i13 == 1;
        if (i23 > 0 && j != 0 && (i23 < i13 - 1 || z12 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j);
            if (!z12) {
                if ((j & 1) != 0 && !((y5) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i31 = childCount2 - 1;
                if ((j & ((long) (1 << i31))) != 0 && !((y5) getChildAt(i31).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i23 * i22) / fBitCount) : 0;
            boolean z13 = z8;
            for (int i33 = 0; i33 < childCount2; i33++) {
                if ((j & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    y5 y5Var6 = (y5) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        y5Var6.c = i32;
                        y5Var6.f = true;
                        if (i33 == 0 && !y5Var6.e) {
                            ((LinearLayout.LayoutParams) y5Var6).leftMargin = (-i32) / 2;
                        }
                        z13 = true;
                    } else if (y5Var6.a) {
                        y5Var6.c = i32;
                        y5Var6.f = true;
                        ((LinearLayout.LayoutParams) y5Var6).rightMargin = (-i32) / 2;
                        z13 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) y5Var6).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) y5Var6).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z8 = z13;
        }
        if (z8) {
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt4 = getChildAt(i34);
                y5 y5Var7 = (y5) childAt4.getLayoutParams();
                if (y5Var7.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((y5Var7.b * i22) + y5Var7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i4 : i20);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.v.t = z;
    }

    public void setOnMenuItemClickListener(z5 z5Var) {
        this.C = z5Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        w5 w5Var = this.v;
        t5 t5Var = w5Var.l;
        if (t5Var != null) {
            t5Var.setImageDrawable(drawable);
        } else {
            w5Var.n = true;
            w5Var.m = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.u = z;
    }

    public void setPopupTheme(int i) {
        if (this.t != i) {
            this.t = i;
            if (i == 0) {
                this.s = getContext();
            } else {
                this.s = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(w5 w5Var) {
        this.v = w5Var;
        w5Var.j = this;
        this.r = w5Var.e;
    }

    @Override // defpackage.qf0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }
}
