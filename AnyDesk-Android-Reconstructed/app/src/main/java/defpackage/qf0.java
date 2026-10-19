package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class qf0 extends ViewGroup {
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public boolean j;
    public int[] k;
    public int[] l;
    public Drawable m;
    public int n;
    public int o;
    public int p;
    public int q;

    public qf0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        this.d = -1;
        this.e = 0;
        this.g = 8388659;
        int[] iArr = yv0.o;
        y6 y6VarC = y6.C(context, attributeSet, iArr, i);
        oe1.m(this, context, iArr, attributeSet, (TypedArray) y6VarC.e, i);
        TypedArray typedArray = (TypedArray) y6VarC.e;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.i = typedArray.getFloat(4, -1.0f);
        this.d = typedArray.getInt(3, -1);
        this.j = typedArray.getBoolean(7, false);
        setDividerDrawable(y6VarC.t(5));
        this.p = typedArray.getInt(8, 0);
        this.q = typedArray.getDimensionPixelSize(6, 0);
        y6VarC.F();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof pf0;
    }

    public final void d(Canvas canvas, int i) {
        this.m.setBounds(getPaddingLeft() + this.q, i, (getWidth() - getPaddingRight()) - this.q, this.o + i);
        this.m.draw(canvas);
    }

    public final void e(Canvas canvas, int i) {
        this.m.setBounds(i, getPaddingTop() + this.q, this.n + i, (getHeight() - getPaddingBottom()) - this.q);
        this.m.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public pf0 generateDefaultLayoutParams() {
        int i = this.f;
        if (i == 0) {
            return new pf0(-2, -2);
        }
        if (i == 1) {
            return new pf0(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public pf0 generateLayoutParams(AttributeSet attributeSet) {
        return new pf0(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.d < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.d;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.d == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.e;
        if (this.f == 1 && (i = this.g & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.h) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.h;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((pf0) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.d;
    }

    public Drawable getDividerDrawable() {
        return this.m;
    }

    public int getDividerPadding() {
        return this.q;
    }

    public int getDividerWidth() {
        return this.n;
    }

    public int getGravity() {
        return this.g;
    }

    public int getOrientation() {
        return this.f;
    }

    public int getShowDividers() {
        return this.p;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public pf0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof pf0) {
            return new pf0((pf0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new pf0((ViewGroup.MarginLayoutParams) layoutParams) : new pf0(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.p & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.p;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.m == null) {
            return;
        }
        int i2 = 0;
        if (this.f == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && i(i2)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((pf0) childAt.getLayoutParams())).topMargin) - this.o);
                }
                i2++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.o;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((pf0) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = kf1.a;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i2)) {
                pf0 pf0Var = (pf0) childAt3.getLayoutParams();
                e(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) pf0Var).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) pf0Var).leftMargin) - this.n);
            }
            i2++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                pf0 pf0Var2 = (pf0) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) pf0Var2).leftMargin;
                    i = this.n;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) pf0Var2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.n;
                right = left - i;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0159  */
    /* JADX WARN: Code duplicated, block: B:65:0x0162  */
    /* JADX WARN: Code duplicated, block: B:67:0x0166  */
    /* JADX WARN: Code duplicated, block: B:69:0x016a  */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0176  */
    /* JADX WARN: Code duplicated, block: B:74:0x0182  */
    /* JADX WARN: Code duplicated, block: B:76:0x0189  */
    /* JADX WARN: Code duplicated, block: B:77:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a8  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int i11;
        int measuredHeight;
        int i12;
        int paddingTop;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        if (this.f == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i17 = i3 - i;
            int paddingRight = i17 - getPaddingRight();
            int paddingRight2 = (i17 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i18 = this.g;
            int i19 = i18 & 112;
            int i20 = 8388615 & i18;
            if (i19 != 16) {
                paddingTop = i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.h;
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.h) / 2);
            }
            int i21 = 0;
            while (i21 < virtualChildCount) {
                View childAt = getChildAt(i21);
                if (childAt != null && childAt.getVisibility() != i16) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    pf0 pf0Var = (pf0) childAt.getLayoutParams();
                    int i22 = ((LinearLayout.LayoutParams) pf0Var).gravity;
                    if (i22 < 0) {
                        i22 = i20;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i22, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i15 = ((LinearLayout.LayoutParams) pf0Var).leftMargin + paddingLeft2;
                        } else {
                            i13 = paddingRight - measuredWidth;
                            i14 = ((LinearLayout.LayoutParams) pf0Var).rightMargin;
                        }
                        if (i(i21)) {
                            paddingTop += this.o;
                        }
                        int i23 = paddingTop + ((LinearLayout.LayoutParams) pf0Var).topMargin;
                        childAt.layout(i15, i23, measuredWidth + i15, i23 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) pf0Var).bottomMargin + i23;
                    } else {
                        i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) pf0Var).leftMargin;
                        i14 = ((LinearLayout.LayoutParams) pf0Var).rightMargin;
                    }
                    i15 = i13 - i14;
                    if (i(i21)) {
                        paddingTop += this.o;
                    }
                    int i24 = paddingTop + ((LinearLayout.LayoutParams) pf0Var).topMargin;
                    childAt.layout(i15, i24, measuredWidth + i15, i24 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) pf0Var).bottomMargin + i24;
                }
                i21++;
                i16 = 8;
            }
            return;
        }
        boolean z2 = kf1.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i25 = i4 - i2;
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i26 = this.g;
        int i27 = 8388615 & i26;
        int i28 = i26 & 112;
        boolean z4 = this.c;
        int[] iArr = this.k;
        int[] iArr2 = this.l;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i27, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.h;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.h) / 2);
        }
        if (z3) {
            i5 = virtualChildCount2 - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i29 = 0;
        while (i29 < virtualChildCount2) {
            int i30 = (i6 * i29) + i5;
            View childAt2 = getChildAt(i30);
            if (childAt2 == null) {
                i7 = i5;
            } else {
                i7 = i5;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    pf0 pf0Var2 = (pf0) childAt2.getLayoutParams();
                    int i31 = paddingLeft;
                    if (z4) {
                        i8 = paddingTop2;
                        baseline = ((LinearLayout.LayoutParams) pf0Var2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) pf0Var2).gravity;
                        if (i9 < 0) {
                            i9 = i28;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            if (i10 != 48) {
                                i11 = i8 + ((LinearLayout.LayoutParams) pf0Var2).topMargin;
                                if (baseline != -1) {
                                    i11 = (iArr[1] - baseline) + i11;
                                }
                            } else if (i10 != 80) {
                                i11 = i8;
                            } else {
                                i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) pf0Var2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (i(i30)) {
                                i12 = i31 + this.n;
                            } else {
                                i12 = i31;
                            }
                            int i32 = i12 + ((LinearLayout.LayoutParams) pf0Var2).leftMargin;
                            childAt2.layout(i32, i11, i32 + measuredWidth2, i11 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) pf0Var2).rightMargin + i32;
                        } else {
                            i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) pf0Var2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) pf0Var2).bottomMargin;
                        }
                        i11 -= measuredHeight;
                        if (i(i30)) {
                            i12 = i31 + this.n;
                        } else {
                            i12 = i31;
                        }
                        int i33 = i12 + ((LinearLayout.LayoutParams) pf0Var2).leftMargin;
                        childAt2.layout(i33, i11, i33 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) pf0Var2).rightMargin + i33;
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = ((LinearLayout.LayoutParams) pf0Var2).gravity;
                    if (i9 < 0) {
                        i9 = i28;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            i11 = i8 + ((LinearLayout.LayoutParams) pf0Var2).topMargin;
                            if (baseline != -1) {
                                i11 = (iArr[1] - baseline) + i11;
                            }
                        } else if (i10 != 80) {
                            i11 = i8;
                        } else {
                            i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) pf0Var2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (i(i30)) {
                            i12 = i31 + this.n;
                        } else {
                            i12 = i31;
                        }
                        int i34 = i12 + ((LinearLayout.LayoutParams) pf0Var2).leftMargin;
                        childAt2.layout(i34, i11, i34 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) pf0Var2).rightMargin + i34;
                    } else {
                        i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) pf0Var2).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) pf0Var2).bottomMargin;
                    }
                    i11 -= measuredHeight;
                    if (i(i30)) {
                        i12 = i31 + this.n;
                    } else {
                        i12 = i31;
                    }
                    int i35 = i12 + ((LinearLayout.LayoutParams) pf0Var2).leftMargin;
                    childAt2.layout(i35, i11, i35 + measuredWidth2, i11 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((LinearLayout.LayoutParams) pf0Var2).rightMargin + i35;
                }
                i29++;
                i5 = i7;
                paddingTop2 = i8;
            }
            i8 = paddingTop2;
            i29++;
            i5 = i7;
            paddingTop2 = i8;
        }
    }

    /* JADX WARN: Code duplicated, block: B:229:0x04da  */
    /* JADX WARN: Code duplicated, block: B:232:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:234:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:236:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:238:0x051d  */
    /* JADX WARN: Code duplicated, block: B:244:0x052c  */
    /* JADX WARN: Code duplicated, block: B:247:0x0533 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x0536  */
    /* JADX WARN: Code duplicated, block: B:251:0x053d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0540  */
    /* JADX WARN: Code duplicated, block: B:368:0x078c  */
    /* JADX WARN: Code duplicated, block: B:64:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0148  */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int iMax;
        int i5;
        int baseline;
        int i6;
        int i7;
        int[] iArr;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        pf0 pf0Var;
        View view;
        int i10;
        int[] iArr2;
        int i11;
        int i12;
        boolean z3;
        int i13;
        int measuredHeight;
        boolean z4;
        boolean z5;
        int iMax2;
        int i14;
        int baseline2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z6;
        int i20;
        int i21;
        int i22;
        View view2;
        boolean z7;
        qf0 qf0Var = this;
        int i23 = -2;
        int iMax3 = 0;
        int i24 = 1073741824;
        int i25 = 8;
        if (qf0Var.f == 1) {
            qf0Var.h = 0;
            int virtualChildCount = qf0Var.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i26 = qf0Var.d;
            boolean z8 = qf0Var.j;
            int i27 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            int iMax6 = 0;
            float f = 0.0f;
            boolean z9 = false;
            int i28 = 0;
            boolean z10 = false;
            boolean z11 = true;
            while (i27 < virtualChildCount) {
                int i29 = mode;
                View childAt = qf0Var.getChildAt(i27);
                if (childAt == null) {
                    qf0Var.h = qf0Var.h;
                } else {
                    if (childAt.getVisibility() != i25) {
                        if (qf0Var.i(i27)) {
                            qf0Var.h += qf0Var.o;
                        }
                        pf0 pf0Var2 = (pf0) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) pf0Var2).weight;
                        f += f2;
                        if (mode2 == i24 && ((LinearLayout.LayoutParams) pf0Var2).height == 0 && f2 > 0.0f) {
                            int i30 = qf0Var.h;
                            qf0Var.h = Math.max(i30, ((LinearLayout.LayoutParams) pf0Var2).topMargin + i30 + ((LinearLayout.LayoutParams) pf0Var2).bottomMargin);
                            view2 = childAt;
                            i19 = mode2;
                            i20 = i26;
                            z6 = z8;
                            i21 = i27;
                            i22 = i29;
                            z9 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) pf0Var2).height != 0 || f2 <= 0.0f) {
                                i18 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) pf0Var2).height = i23;
                                i18 = 0;
                            }
                            i19 = mode2;
                            z6 = z8;
                            i20 = i26;
                            i21 = i27;
                            i22 = i29;
                            qf0Var.measureChildWithMargins(childAt, i, 0, i2, f == 0.0f ? qf0Var.h : 0);
                            if (i18 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) pf0Var2).height = i18;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i31 = qf0Var.h;
                            view2 = childAt;
                            qf0Var.h = Math.max(i31, i31 + measuredHeight2 + ((LinearLayout.LayoutParams) pf0Var2).topMargin + ((LinearLayout.LayoutParams) pf0Var2).bottomMargin);
                            if (z6) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i20 >= 0 && i20 == i21 + 1) {
                            qf0Var.e = qf0Var.h;
                        }
                        if (i21 < i20 && ((LinearLayout.LayoutParams) pf0Var2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i22 == 1073741824 || ((LinearLayout.LayoutParams) pf0Var2).width != -1) {
                            z7 = false;
                        } else {
                            z7 = true;
                            z10 = true;
                        }
                        int i32 = ((LinearLayout.LayoutParams) pf0Var2).leftMargin + ((LinearLayout.LayoutParams) pf0Var2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i32;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z12 = z7;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i28, measuredState);
                        if (z11) {
                            i28 = iCombineMeasuredStates;
                            boolean z13 = ((LinearLayout.LayoutParams) pf0Var2).width == -1;
                            if (((LinearLayout.LayoutParams) pf0Var2).weight > 0.0f) {
                                if (!z12) {
                                    i32 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i32);
                            } else {
                                if (!z12) {
                                    i32 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i32);
                            }
                            z11 = z13;
                        } else {
                            i28 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) pf0Var2).weight > 0.0f) {
                            if (!z12) {
                                i32 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i32);
                        } else {
                            if (!z12) {
                                i32 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i32);
                        }
                        z11 = z13;
                    }
                    i27 = i21 + 1;
                    i26 = i20;
                    mode = i22;
                    z8 = z6;
                    mode2 = i19;
                    i23 = -2;
                    i24 = 1073741824;
                    i25 = 8;
                }
                i19 = mode2;
                i20 = i26;
                z6 = z8;
                i21 = i27;
                i22 = i29;
                i27 = i21 + 1;
                i26 = i20;
                mode = i22;
                z8 = z6;
                mode2 = i19;
                i23 = -2;
                i24 = 1073741824;
                i25 = 8;
            }
            int i33 = mode;
            int i34 = mode2;
            boolean z14 = z8;
            int i35 = i28;
            int i36 = i2;
            if (qf0Var.h > 0 && qf0Var.i(virtualChildCount)) {
                qf0Var.h += qf0Var.o;
            }
            if (z14 && (i34 == Integer.MIN_VALUE || i34 == 0)) {
                qf0Var.h = 0;
                for (int i37 = 0; i37 < virtualChildCount; i37++) {
                    View childAt2 = qf0Var.getChildAt(i37);
                    if (childAt2 == null) {
                        qf0Var.h = qf0Var.h;
                    } else if (childAt2.getVisibility() != 8) {
                        pf0 pf0Var3 = (pf0) childAt2.getLayoutParams();
                        int i38 = qf0Var.h;
                        qf0Var.h = Math.max(i38, i38 + iMax6 + ((LinearLayout.LayoutParams) pf0Var3).topMargin + ((LinearLayout.LayoutParams) pf0Var3).bottomMargin);
                    }
                }
            }
            int paddingBottom = qf0Var.getPaddingBottom() + qf0Var.getPaddingTop() + qf0Var.h;
            qf0Var.h = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, qf0Var.getSuggestedMinimumHeight()), i36, 0);
            int i39 = (iResolveSizeAndState & 16777215) - qf0Var.h;
            if (z9 || (i39 != 0 && f > 0.0f)) {
                float f3 = qf0Var.i;
                if (f3 > 0.0f) {
                    f = f3;
                }
                qf0Var.h = 0;
                int iCombineMeasuredStates2 = i35;
                int i40 = 0;
                while (i40 < virtualChildCount) {
                    View childAt3 = qf0Var.getChildAt(i40);
                    if (childAt3.getVisibility() == 8) {
                        i40 = i40;
                    } else {
                        pf0 pf0Var4 = (pf0) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) pf0Var4).weight;
                        if (f4 > 0.0f) {
                            int i41 = (int) ((i39 * f4) / f);
                            f -= f4;
                            i39 -= i41;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, qf0Var.getPaddingRight() + qf0Var.getPaddingLeft() + ((LinearLayout.LayoutParams) pf0Var4).leftMargin + ((LinearLayout.LayoutParams) pf0Var4).rightMargin, ((LinearLayout.LayoutParams) pf0Var4).width);
                            if (((LinearLayout.LayoutParams) pf0Var4).height == 0) {
                                i17 = 1073741824;
                                if (i34 == 1073741824) {
                                    if (i41 <= 0) {
                                        i41 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i41, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i17 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i41;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i17));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i42 = ((LinearLayout.LayoutParams) pf0Var4).leftMargin + ((LinearLayout.LayoutParams) pf0Var4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i42;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i33 != 1073741824) {
                            i16 = -1;
                            if (((LinearLayout.LayoutParams) pf0Var4).width == -1) {
                                measuredWidth2 = i42;
                            }
                        } else {
                            i16 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z15 = z11 && ((LinearLayout.LayoutParams) pf0Var4).width == i16;
                        int i43 = qf0Var.h;
                        qf0Var.h = Math.max(i43, childAt3.getMeasuredHeight() + i43 + ((LinearLayout.LayoutParams) pf0Var4).topMargin + ((LinearLayout.LayoutParams) pf0Var4).bottomMargin);
                        z11 = z15;
                    }
                    i40++;
                }
                qf0Var.h = qf0Var.getPaddingBottom() + qf0Var.getPaddingTop() + qf0Var.h;
                i35 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z14 && i34 != 1073741824) {
                    for (int i44 = 0; i44 < virtualChildCount; i44++) {
                        View childAt4 = qf0Var.getChildAt(i44);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((pf0) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z11 || i33 == 1073741824) {
                iMax4 = iMax3;
            }
            qf0Var.setMeasuredDimension(View.resolveSizeAndState(Math.max(qf0Var.getPaddingRight() + qf0Var.getPaddingLeft() + iMax4, qf0Var.getSuggestedMinimumWidth()), i, i35), iResolveSizeAndState);
            if (z10) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(qf0Var.getMeasuredWidth(), 1073741824);
                int i45 = 0;
                while (i45 < virtualChildCount) {
                    View childAt5 = qf0Var.getChildAt(i45);
                    if (childAt5.getVisibility() != 8) {
                        pf0 pf0Var5 = (pf0) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) pf0Var5).width == -1) {
                            int i46 = ((LinearLayout.LayoutParams) pf0Var5).height;
                            ((LinearLayout.LayoutParams) pf0Var5).height = childAt5.getMeasuredHeight();
                            qf0Var.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i36, 0);
                            ((LinearLayout.LayoutParams) pf0Var5).height = i46;
                        }
                    }
                    i45++;
                    i36 = i2;
                }
                return;
            }
            return;
        }
        int i47 = i;
        qf0Var.h = 0;
        int virtualChildCount2 = qf0Var.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i47);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (qf0Var.k == null || qf0Var.l == null) {
            qf0Var.k = new int[4];
            qf0Var.l = new int[4];
        }
        int[] iArr3 = qf0Var.k;
        int[] iArr4 = qf0Var.l;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z16 = qf0Var.c;
        boolean z17 = qf0Var.j;
        boolean z18 = mode3 == 1073741824;
        int i48 = 0;
        int i49 = 0;
        int i50 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z19 = false;
        boolean z20 = false;
        float f5 = 0.0f;
        boolean z21 = true;
        while (i48 < virtualChildCount2) {
            View childAt6 = qf0Var.getChildAt(i48);
            if (childAt6 == null) {
                qf0Var.h = qf0Var.h;
                i9 = i48;
                i14 = i50;
                iArr2 = iArr3;
                iArr = iArr4;
                z = z16;
                z2 = z17;
            } else {
                int i51 = i49;
                if (childAt6.getVisibility() == 8) {
                    i47 = i;
                    i9 = i48;
                    i14 = i50;
                    iArr = iArr4;
                    z = z16;
                    z2 = z17;
                    i49 = i51;
                    iArr2 = iArr3;
                } else {
                    if (qf0Var.i(i48)) {
                        qf0Var.h += qf0Var.n;
                    }
                    pf0 pf0Var6 = (pf0) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) pf0Var6).weight;
                    f5 += f6;
                    int i52 = i48;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) pf0Var6).width == 0 && f6 > 0.0f) {
                        int i53 = qf0Var.h;
                        int i54 = ((LinearLayout.LayoutParams) pf0Var6).leftMargin;
                        if (z18) {
                            qf0Var.h = i54 + ((LinearLayout.LayoutParams) pf0Var6).rightMargin + i53;
                        } else {
                            qf0Var.h = Math.max(i53, i53 + i54 + ((LinearLayout.LayoutParams) pf0Var6).rightMargin);
                        }
                        if (z16) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z = z16;
                            z2 = z17;
                            i10 = i51;
                            i9 = i52;
                            pf0Var = pf0Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i47 = i;
                            i11 = i50;
                            i8 = iMax7;
                        } else {
                            view = childAt6;
                            z = z16;
                            z2 = z17;
                            i10 = i51;
                            i9 = i52;
                            i12 = 1073741824;
                            z20 = true;
                            pf0Var = pf0Var6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i47 = i;
                            i11 = i50;
                            i8 = iMax7;
                        }
                        if (mode4 == i12 && ((LinearLayout.LayoutParams) pf0Var).height == -1) {
                            z3 = true;
                            z19 = true;
                        } else {
                            z3 = false;
                        }
                        i13 = ((LinearLayout.LayoutParams) pf0Var).topMargin + ((LinearLayout.LayoutParams) pf0Var).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i13;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z) {
                            baseline2 = view.getBaseline();
                            z4 = z3;
                            if (baseline2 != -1) {
                                i15 = ((LinearLayout.LayoutParams) pf0Var).gravity;
                                if (i15 < 0) {
                                    i15 = qf0Var.g;
                                }
                                int i55 = (((i15 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i55] = Math.max(iArr2[i55], baseline2);
                                iArr[i55] = Math.max(iArr[i55], measuredHeight - baseline2);
                            }
                        } else {
                            z4 = z3;
                        }
                        int iMax9 = Math.max(i10, measuredHeight);
                        if (z21 || ((LinearLayout.LayoutParams) pf0Var).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (((LinearLayout.LayoutParams) pf0Var).weight > 0.0f) {
                            if (!z4) {
                                i13 = measuredHeight;
                            }
                            iMax7 = Math.max(i8, i13);
                            iMax2 = i11;
                        } else {
                            if (!z4) {
                                i13 = measuredHeight;
                            }
                            iMax2 = Math.max(i11, i13);
                            iMax7 = i8;
                        }
                        int i56 = iMax2;
                        i49 = iMax9;
                        i14 = i56;
                        z21 = z5;
                    } else {
                        if (((LinearLayout.LayoutParams) pf0Var6).width != 0 || f6 <= 0.0f) {
                            i7 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) pf0Var6).width = -2;
                            i7 = 0;
                        }
                        iArr = iArr4;
                        i8 = iMax7;
                        i9 = i52;
                        z = z16;
                        z2 = z17;
                        int i57 = i7;
                        pf0Var = pf0Var6;
                        view = childAt6;
                        i10 = i51;
                        i47 = i;
                        iArr2 = iArr3;
                        i11 = i50;
                        qf0Var.measureChildWithMargins(view, i47, f5 == 0.0f ? qf0Var.h : 0, i2, 0);
                        if (i57 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) pf0Var).width = i57;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        int i58 = qf0Var.h;
                        int i59 = ((LinearLayout.LayoutParams) pf0Var).leftMargin;
                        if (z18) {
                            qf0Var.h = i59 + measuredWidth3 + ((LinearLayout.LayoutParams) pf0Var).rightMargin + i58;
                        } else {
                            qf0Var.h = Math.max(i58, i58 + measuredWidth3 + i59 + ((LinearLayout.LayoutParams) pf0Var).rightMargin);
                        }
                        if (z2) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i12 = 1073741824;
                    if (mode4 == i12) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    i13 = ((LinearLayout.LayoutParams) pf0Var).topMargin + ((LinearLayout.LayoutParams) pf0Var).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i13;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z) {
                        baseline2 = view.getBaseline();
                        z4 = z3;
                        if (baseline2 != -1) {
                            i15 = ((LinearLayout.LayoutParams) pf0Var).gravity;
                            if (i15 < 0) {
                                i15 = qf0Var.g;
                            }
                            int i510 = (((i15 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i510] = Math.max(iArr2[i510], baseline2);
                            iArr[i510] = Math.max(iArr[i510], measuredHeight - baseline2);
                        }
                    } else {
                        z4 = z3;
                    }
                    int iMax10 = Math.max(i10, measuredHeight);
                    if (z21) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (((LinearLayout.LayoutParams) pf0Var).weight > 0.0f) {
                        if (!z4) {
                            i13 = measuredHeight;
                        }
                        iMax7 = Math.max(i8, i13);
                        iMax2 = i11;
                    } else {
                        if (!z4) {
                            i13 = measuredHeight;
                        }
                        iMax2 = Math.max(i11, i13);
                        iMax7 = i8;
                    }
                    int i511 = iMax2;
                    i49 = iMax10;
                    i14 = i511;
                    z21 = z5;
                }
            }
            i50 = i14;
            i48 = i9 + 1;
            iArr3 = iArr2;
            iArr4 = iArr;
            z16 = z;
            z17 = z2;
        }
        int i60 = i49;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        boolean z22 = z16;
        boolean z23 = z17;
        int i61 = i50;
        int i62 = iMax7;
        if (qf0Var.h > 0 && qf0Var.i(virtualChildCount2)) {
            qf0Var.h += qf0Var.n;
        }
        int i63 = iArr5[1];
        int iMax11 = (i63 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i60 : Math.max(i60, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i63, iArr5[2]))));
        if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            qf0Var.h = 0;
            for (int i64 = 0; i64 < virtualChildCount2; i64++) {
                View childAt7 = qf0Var.getChildAt(i64);
                if (childAt7 == null) {
                    qf0Var.h = qf0Var.h;
                } else if (childAt7.getVisibility() != 8) {
                    pf0 pf0Var7 = (pf0) childAt7.getLayoutParams();
                    int i65 = qf0Var.h;
                    if (z18) {
                        qf0Var.h = ((LinearLayout.LayoutParams) pf0Var7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) pf0Var7).rightMargin + i65;
                    } else {
                        qf0Var.h = Math.max(i65, i65 + iMax8 + ((LinearLayout.LayoutParams) pf0Var7).leftMargin + ((LinearLayout.LayoutParams) pf0Var7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = qf0Var.getPaddingRight() + qf0Var.getPaddingLeft() + qf0Var.h;
        qf0Var.h = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, qf0Var.getSuggestedMinimumWidth()), i47, 0);
        int i66 = (iResolveSizeAndState2 & 16777215) - qf0Var.h;
        if (z20 || (i66 != 0 && f5 > 0.0f)) {
            float f7 = qf0Var.i;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            qf0Var.h = 0;
            iMax11 = -1;
            int i67 = 0;
            while (i67 < virtualChildCount2) {
                View childAt8 = qf0Var.getChildAt(i67);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    pf0 pf0Var8 = (pf0) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) pf0Var8).weight;
                    if (f8 > 0.0f) {
                        int i68 = (int) ((i66 * f8) / f5);
                        f5 -= f8;
                        i66 -= i68;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, qf0Var.getPaddingBottom() + qf0Var.getPaddingTop() + ((LinearLayout.LayoutParams) pf0Var8).topMargin + ((LinearLayout.LayoutParams) pf0Var8).bottomMargin, ((LinearLayout.LayoutParams) pf0Var8).height);
                        if (((LinearLayout.LayoutParams) pf0Var8).width == 0) {
                            i6 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i68 <= 0) {
                                    i68 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i68, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i6 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i68;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i6), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    int i69 = qf0Var.h;
                    if (z18) {
                        qf0Var.h = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) pf0Var8).leftMargin + ((LinearLayout.LayoutParams) pf0Var8).rightMargin + i69;
                    } else {
                        qf0Var.h = Math.max(i69, childAt8.getMeasuredWidth() + i69 + ((LinearLayout.LayoutParams) pf0Var8).leftMargin + ((LinearLayout.LayoutParams) pf0Var8).rightMargin);
                    }
                    boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) pf0Var8).height == -1;
                    int i70 = ((LinearLayout.LayoutParams) pf0Var8).topMargin + ((LinearLayout.LayoutParams) pf0Var8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i70;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z24) {
                        i70 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i61, i70);
                    if (z21) {
                        i5 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) pf0Var8).height == -1;
                        if (!z22 && (baseline = childAt8.getBaseline()) != i5) {
                            int i71 = ((LinearLayout.LayoutParams) pf0Var8).gravity;
                            if (i71 < 0) {
                                i71 = qf0Var.g;
                            }
                            int i72 = (((i71 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i72] = Math.max(iArr5[i72], baseline);
                            iArr6[i72] = Math.max(iArr6[i72], measuredHeight4 - baseline);
                        }
                        z21 = z25;
                        i61 = iMax12;
                    } else {
                        i5 = -1;
                    }
                    if (!z22) {
                    }
                    z21 = z25;
                    i61 = iMax12;
                }
                i67++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            qf0Var.h = qf0Var.getPaddingRight() + qf0Var.getPaddingLeft() + qf0Var.h;
            int i73 = iArr5[1];
            if (i73 != -1 || iArr5[0] != -1 || iArr5[2] != -1 || iArr5[3] != -1) {
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i73, iArr5[2]))));
            }
            iMax = i61;
        } else {
            iMax = Math.max(i61, i62);
            if (z23 && mode3 != 1073741824) {
                for (int i74 = 0; i74 < virtualChildCount2; i74++) {
                    View childAt9 = qf0Var.getChildAt(i74);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((pf0) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
        }
        if (!z21 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        qf0Var.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(qf0Var.getPaddingBottom() + qf0Var.getPaddingTop() + iMax11, qf0Var.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
        if (z19) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(qf0Var.getMeasuredHeight(), 1073741824);
            int i75 = 0;
            while (i75 < virtualChildCount2) {
                View childAt10 = qf0Var.getChildAt(i75);
                if (childAt10.getVisibility() != 8) {
                    pf0 pf0Var9 = (pf0) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) pf0Var9).height == -1) {
                        int i76 = ((LinearLayout.LayoutParams) pf0Var9).width;
                        ((LinearLayout.LayoutParams) pf0Var9).width = childAt10.getMeasuredWidth();
                        qf0Var.measureChildWithMargins(childAt10, i47, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) pf0Var9).width = i76;
                    }
                }
                i75++;
                qf0Var = this;
                i47 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.c = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.d = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.m) {
            return;
        }
        this.m = drawable;
        if (drawable != null) {
            this.n = drawable.getIntrinsicWidth();
            this.o = drawable.getIntrinsicHeight();
        } else {
            this.n = 0;
            this.o = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.q = i;
    }

    public void setGravity(int i) {
        if (this.g != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.g = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.g;
        if ((8388615 & i3) != i2) {
            this.g = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.j = z;
    }

    public void setOrientation(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.p) {
            requestLayout();
        }
        this.p = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.g;
        if ((i3 & 112) != i2) {
            this.g = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.i = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
