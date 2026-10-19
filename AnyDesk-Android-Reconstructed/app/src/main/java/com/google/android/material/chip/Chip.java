package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.samsung.android.knox.EnterpriseDeviceManager;
import defpackage.d41;
import defpackage.dj;
import defpackage.dk0;
import defpackage.ec1;
import defpackage.ek0;
import defpackage.ge1;
import defpackage.id;
import defpackage.im0;
import defpackage.l91;
import defpackage.lg;
import defpackage.lk0;
import defpackage.m41;
import defpackage.m91;
import defpackage.nh1;
import defpackage.o91;
import defpackage.oe1;
import defpackage.ov0;
import defpackage.pl;
import defpackage.ql;
import defpackage.rl;
import defpackage.sl;
import defpackage.ta;
import defpackage.th1;
import defpackage.tl;
import defpackage.uj;
import defpackage.v3;
import defpackage.x2;
import defpackage.zy0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Chip extends ta implements sl, m41, ek0 {
    public tl g;
    public InsetDrawable h;
    public RippleDrawable i;
    public View.OnClickListener j;
    public CompoundButton.OnCheckedChangeListener k;
    public dk0 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public CharSequence t;
    public final rl u;
    public boolean v;
    public final Rect w;
    public final RectF x;
    public final pl y;
    public static final Rect z = new Rect();
    public static final int[] A = {R.attr.state_selected};
    public static final int[] B = {R.attr.state_checkable};

    public Chip(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(lk0.N(context, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, i);
        this.w = new Rect();
        this.x = new RectF();
        int i2 = 0;
        this.y = new pl(i2, this);
        Context context2 = getContext();
        int i3 = 1;
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                id.m("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                id.m("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                id.m("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                id.m("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                id.m("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        tl tlVar = new tl(context2, attributeSet, i);
        Context context3 = tlVar.g0;
        int[] iArr = ov0.h;
        TypedArray typedArrayE = th1.E(context3, attributeSet, iArr, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        tlVar.G0 = typedArrayE.hasValue(37);
        Context context4 = tlVar.g0;
        ColorStateList colorStateListN = ec1.n(context4, typedArrayE, 24);
        if (tlVar.z != colorStateListN) {
            tlVar.z = colorStateListN;
            tlVar.onStateChange(tlVar.getState());
        }
        ColorStateList colorStateListN2 = ec1.n(context4, typedArrayE, 11);
        if (tlVar.A != colorStateListN2) {
            tlVar.A = colorStateListN2;
            tlVar.onStateChange(tlVar.getState());
        }
        float dimension = typedArrayE.getDimension(19, 0.0f);
        if (tlVar.B != dimension) {
            tlVar.B = dimension;
            tlVar.invalidateSelf();
            tlVar.z();
        }
        if (typedArrayE.hasValue(12)) {
            tlVar.F(typedArrayE.getDimension(12, 0.0f));
        }
        tlVar.K(ec1.n(context4, typedArrayE, 22));
        tlVar.L(typedArrayE.getDimension(23, 0.0f));
        tlVar.U(ec1.n(context4, typedArrayE, 36));
        String text = typedArrayE.getText(5);
        text = text == null ? "" : text;
        boolean zEquals = TextUtils.equals(tlVar.G, text);
        o91 o91Var = tlVar.m0;
        if (!zEquals) {
            tlVar.G = text;
            o91Var.e = true;
            tlVar.invalidateSelf();
            tlVar.z();
        }
        l91 l91Var = (!typedArrayE.hasValue(0) || (resourceId = typedArrayE.getResourceId(0, 0)) == 0) ? null : new l91(context4, resourceId);
        l91Var.k = typedArrayE.getDimension(1, l91Var.k);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 23) {
            l91Var.j = ec1.n(context4, typedArrayE, 2);
        }
        o91Var.b(l91Var, context4);
        int i5 = typedArrayE.getInt(3, 0);
        if (i5 == 1) {
            tlVar.D0 = TextUtils.TruncateAt.START;
        } else if (i5 == 2) {
            tlVar.D0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i5 == 3) {
            tlVar.D0 = TextUtils.TruncateAt.END;
        }
        tlVar.J(typedArrayE.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            tlVar.J(typedArrayE.getBoolean(15, false));
        }
        tlVar.G(ec1.s(context4, typedArrayE, 14));
        if (typedArrayE.hasValue(17)) {
            tlVar.I(ec1.n(context4, typedArrayE, 17));
        }
        tlVar.H(typedArrayE.getDimension(16, -1.0f));
        tlVar.R(typedArrayE.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            tlVar.R(typedArrayE.getBoolean(26, false));
        }
        tlVar.M(ec1.s(context4, typedArrayE, 25));
        tlVar.Q(ec1.n(context4, typedArrayE, 30));
        tlVar.O(typedArrayE.getDimension(28, 0.0f));
        tlVar.B(typedArrayE.getBoolean(6, false));
        tlVar.E(typedArrayE.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            tlVar.E(typedArrayE.getBoolean(8, false));
        }
        tlVar.C(ec1.s(context4, typedArrayE, 7));
        if (typedArrayE.hasValue(9)) {
            tlVar.D(ec1.n(context4, typedArrayE, 9));
        }
        tlVar.W = im0.a(context4, typedArrayE, 39);
        tlVar.X = im0.a(context4, typedArrayE, 33);
        float dimension2 = typedArrayE.getDimension(21, 0.0f);
        if (tlVar.Y != dimension2) {
            tlVar.Y = dimension2;
            tlVar.invalidateSelf();
            tlVar.z();
        }
        tlVar.T(typedArrayE.getDimension(35, 0.0f));
        tlVar.S(typedArrayE.getDimension(34, 0.0f));
        float dimension3 = typedArrayE.getDimension(41, 0.0f);
        if (tlVar.b0 != dimension3) {
            tlVar.b0 = dimension3;
            tlVar.invalidateSelf();
            tlVar.z();
        }
        float dimension4 = typedArrayE.getDimension(40, 0.0f);
        if (tlVar.c0 != dimension4) {
            tlVar.c0 = dimension4;
            tlVar.invalidateSelf();
            tlVar.z();
        }
        tlVar.P(typedArrayE.getDimension(29, 0.0f));
        tlVar.N(typedArrayE.getDimension(27, 0.0f));
        float dimension5 = typedArrayE.getDimension(13, 0.0f);
        if (tlVar.f0 != dimension5) {
            tlVar.f0 = dimension5;
            tlVar.invalidateSelf();
            tlVar.z();
        }
        tlVar.F0 = typedArrayE.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArrayE.recycle();
        th1.b(context2, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_Chip_Action);
        th1.e(context2, attributeSet, iArr, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_Chip_Action);
        this.q = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.s = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48.0f, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(tlVar);
        tlVar.l(ge1.e(this));
        th1.b(context2, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_Chip_Action);
        th1.e(context2, attributeSet, iArr, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i, com.anydesk.anydeskandroid.R.style.Widget_MaterialComponents_Chip_Action);
        if (i4 < 23) {
            setTextColor(ec1.n(context2, typedArrayObtainStyledAttributes2, 2));
        }
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.u = new rl(this, this);
        d();
        if (!zHasValue) {
            setOutlineProvider(new ql(i2, this));
        }
        setChecked(this.m);
        setText(tlVar.G);
        setEllipsize(tlVar.D0);
        g();
        if (!this.g.E0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        f();
        if (this.q) {
            setMinHeight(this.s);
        }
        this.r = getLayoutDirection();
        super.setOnCheckedChangeListener(new x2(i3, this));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.x;
        rectF.setEmpty();
        if (c() && this.j != null) {
            tl tlVar = this.g;
            Rect bounds = tlVar.getBounds();
            rectF.setEmpty();
            if (tlVar.X()) {
                float f = tlVar.f0 + tlVar.e0 + tlVar.Q + tlVar.d0 + tlVar.c0;
                if (uj.o(tlVar) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.w;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private l91 getTextAppearance() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.m0.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.o != z2) {
            this.o = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.n != z2) {
            this.n = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        this.s = i;
        if (!this.q) {
            InsetDrawable insetDrawable = this.h;
            if (insetDrawable == null) {
                int[] iArr = zy0.a;
                e();
                return;
            } else {
                if (insetDrawable != null) {
                    this.h = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr2 = zy0.a;
                    e();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.g.B));
        int iMax2 = Math.max(0, i - this.g.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.h;
            if (insetDrawable2 == null) {
                int[] iArr3 = zy0.a;
                e();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.h = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    int[] iArr4 = zy0.a;
                    e();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.h != null) {
            Rect rect = new Rect();
            this.h.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int[] iArr5 = zy0.a;
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.h = new InsetDrawable((Drawable) this.g, i2, i3, i2, i3);
        int[] iArr6 = zy0.a;
        e();
    }

    public final boolean c() {
        tl tlVar = this.g;
        if (tlVar == null) {
            return false;
        }
        Drawable drawable = tlVar.N;
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof nh1) {
            drawable = ((nh1) drawable).h;
        }
        return drawable != null;
    }

    public final void d() {
        tl tlVar;
        if (!c() || (tlVar = this.g) == null || !tlVar.M || this.j == null) {
            oe1.n(this, null);
            this.v = false;
        } else {
            oe1.n(this, this.u);
            this.v = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.v) {
            return super.dispatchHoverEvent(motionEvent);
        }
        rl rlVar = this.u;
        AccessibilityManager accessibilityManager = rlVar.h;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Chip chip = rlVar.n;
                if (chip.c() && chip.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = rlVar.m;
                if (i3 != i2) {
                    rlVar.m = i2;
                    rlVar.p(i2, 128);
                    rlVar.p(i3, 256);
                    return true;
                }
            } else if (action == 10 && (i = rlVar.m) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    rlVar.m = Integer.MIN_VALUE;
                    rlVar.p(Integer.MIN_VALUE, 128);
                    rlVar.p(i, 256);
                    return true;
                }
            } else if (super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        Chip chip;
        View.OnClickListener onClickListener;
        if (!this.v) {
            return super.dispatchKeyEvent(keyEvent);
        }
        rl rlVar = this.u;
        rlVar.getClass();
        boolean zM = false;
        int i2 = 0;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        zM = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case EnterpriseDeviceManager.KNOX_2_6 /* 19 */:
                        case EnterpriseDeviceManager.KNOX_2_7 /* 20 */:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i2 < repeatCount && rlVar.m(i3, null)) {
                                    i2++;
                                    z2 = true;
                                }
                                zM = z2;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = rlVar.l;
                                if (i != Integer.MIN_VALUE) {
                                    chip = rlVar.n;
                                    if (i == 0) {
                                        chip.performClick();
                                    } else if (i == 1) {
                                        chip.playSoundEffect(0);
                                        onClickListener = chip.j;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                        }
                                        if (chip.v) {
                                            chip.u.p(1, 1);
                                        }
                                    }
                                }
                                zM = true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = rlVar.l;
                    if (i != Integer.MIN_VALUE) {
                        chip = rlVar.n;
                        if (i == 0) {
                            chip.performClick();
                        } else if (i == 1) {
                            chip.playSoundEffect(0);
                            onClickListener = chip.j;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.v) {
                                chip.u.p(1, 1);
                            }
                        }
                    }
                    zM = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                zM = rlVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                zM = rlVar.m(1, null);
            }
        }
        if (!zM || rlVar.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.ta, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        int i2;
        super.drawableStateChanged();
        tl tlVar = this.g;
        boolean zA = false;
        if (tlVar != null && tl.y(tlVar.N)) {
            tl tlVar2 = this.g;
            ?? IsEnabled = isEnabled();
            if (this.p) {
                i = IsEnabled;
                i = IsEnabled + 1;
            }
            i = IsEnabled;
            int i3 = i;
            if (this.o) {
                i3 = i + 1;
            }
            int i4 = i3;
            if (this.n) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.p) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.o) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.n) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(tlVar2.A0, iArr)) {
                tlVar2.A0 = iArr;
                if (tlVar2.X()) {
                    zA = tlVar2.A(tlVar2.getState(), iArr);
                }
            }
        }
        if (zA) {
            invalidate();
        }
    }

    public final void e() {
        this.i = new RippleDrawable(zy0.a(this.g.F), getBackgroundDrawable(), null);
        this.g.getClass();
        RippleDrawable rippleDrawable = this.i;
        WeakHashMap weakHashMap = oe1.a;
        setBackground(rippleDrawable);
        f();
    }

    public final void f() {
        tl tlVar;
        if (TextUtils.isEmpty(getText()) || (tlVar = this.g) == null) {
            return;
        }
        int iV = (int) (tlVar.v() + tlVar.f0 + tlVar.c0);
        tl tlVar2 = this.g;
        int iU = (int) (tlVar2.u() + tlVar2.Y + tlVar2.b0);
        if (this.h != null) {
            Rect rect = new Rect();
            this.h.getPadding(rect);
            iU += rect.left;
            iV += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = oe1.a;
        setPaddingRelative(iU, paddingTop, iV, paddingBottom);
    }

    public final void g() {
        TextPaint paint = getPaint();
        tl tlVar = this.g;
        if (tlVar != null) {
            paint.drawableState = tlVar.getState();
        }
        l91 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.y);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.t)) {
            return this.t;
        }
        tl tlVar = this.g;
        if (tlVar == null || !tlVar.S) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).j.d) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.h;
        return insetDrawable == null ? this.g : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.U;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.V;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.A;
        }
        return null;
    }

    public float getChipCornerRadius() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return Math.max(0.0f, tlVar.w());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.g;
    }

    public float getChipEndPadding() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.f0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        tl tlVar = this.g;
        if (tlVar == null || (drawable = tlVar.I) == null) {
            return null;
        }
        return drawable instanceof nh1 ? ((nh1) drawable).h : drawable;
    }

    public float getChipIconSize() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.K;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.J;
        }
        return null;
    }

    public float getChipMinHeight() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.B;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.Y;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.D;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.E;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        tl tlVar = this.g;
        if (tlVar == null || (drawable = tlVar.N) == null) {
            return null;
        }
        return drawable instanceof nh1 ? ((nh1) drawable).h : drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.R;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.e0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.Q;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.d0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.P;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.D0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.v) {
            rl rlVar = this.u;
            if (rlVar.l == 1 || rlVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public im0 getHideMotionSpec() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.X;
        }
        return null;
    }

    public float getIconEndPadding() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.a0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.Z;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.F;
        }
        return null;
    }

    public d41 getShapeAppearanceModel() {
        return this.g.c.a;
    }

    public im0 getShowMotionSpec() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.W;
        }
        return null;
    }

    public float getTextEndPadding() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.c0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        tl tlVar = this.g;
        if (tlVar != null) {
            return tlVar.b0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        th1.S(this, this.g);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        tl tlVar = this.g;
        if (tlVar != null && tlVar.S) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, B);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.v) {
            rl rlVar = this.u;
            int i2 = rlVar.l;
            if (i2 != Integer.MIN_VALUE) {
                rlVar.j(i2);
            }
            if (z2) {
                rlVar.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        tl tlVar = this.g;
        int i2 = 0;
        accessibilityNodeInfo.setCheckable(tlVar != null && tlVar.S);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.e) {
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    View childAt = chipGroup.getChildAt(i2);
                    if ((childAt instanceof Chip) && chipGroup.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(com.anydesk.anydeskandroid.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) v3.a(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i, 1, false, isChecked()).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.r != i) {
            this.r = i;
            f();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.n) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                    z2 = true;
                }
                z2 = false;
            } else {
                if (this.n) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.j;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.v) {
                        this.u.p(1, 1);
                    }
                    z2 = true;
                }
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else if (zContains) {
            setCloseIconPressed(true);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.t = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.i) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.ta, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.i) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.ta, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.B(z2);
        }
    }

    public void setCheckableResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.B(tlVar.g0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        tl tlVar = this.g;
        if (tlVar == null) {
            this.m = z2;
        } else if (tlVar.S) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.C(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.C(ec1.r(tlVar.g0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.D(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.D(uj.m(tlVar.g0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.E(tlVar.g0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        tl tlVar = this.g;
        if (tlVar == null || tlVar.A == colorStateList) {
            return;
        }
        tlVar.A = colorStateList;
        tlVar.onStateChange(tlVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListM;
        tl tlVar = this.g;
        if (tlVar == null || tlVar.A == (colorStateListM = uj.m(tlVar.g0, i))) {
            return;
        }
        tlVar.A = colorStateListM;
        tlVar.onStateChange(tlVar.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.F(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.F(tlVar.g0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(tl tlVar) {
        tl tlVar2 = this.g;
        if (tlVar2 != tlVar) {
            if (tlVar2 != null) {
                tlVar2.C0 = new WeakReference(null);
            }
            this.g = tlVar;
            tlVar.E0 = false;
            tlVar.C0 = new WeakReference(this);
            b(this.s);
        }
    }

    public void setChipEndPadding(float f) {
        tl tlVar = this.g;
        if (tlVar == null || tlVar.f0 == f) {
            return;
        }
        tlVar.f0 = f;
        tlVar.invalidateSelf();
        tlVar.z();
    }

    public void setChipEndPaddingResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            float dimension = tlVar.g0.getResources().getDimension(i);
            if (tlVar.f0 != dimension) {
                tlVar.f0 = dimension;
                tlVar.invalidateSelf();
                tlVar.z();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.G(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.G(ec1.r(tlVar.g0, i));
        }
    }

    public void setChipIconSize(float f) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.H(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.H(tlVar.g0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.I(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.I(uj.m(tlVar.g0, i));
        }
    }

    public void setChipIconVisible(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.J(tlVar.g0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        tl tlVar = this.g;
        if (tlVar == null || tlVar.B == f) {
            return;
        }
        tlVar.B = f;
        tlVar.invalidateSelf();
        tlVar.z();
    }

    public void setChipMinHeightResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            float dimension = tlVar.g0.getResources().getDimension(i);
            if (tlVar.B != dimension) {
                tlVar.B = dimension;
                tlVar.invalidateSelf();
                tlVar.z();
            }
        }
    }

    public void setChipStartPadding(float f) {
        tl tlVar = this.g;
        if (tlVar == null || tlVar.Y == f) {
            return;
        }
        tlVar.Y = f;
        tlVar.invalidateSelf();
        tlVar.z();
    }

    public void setChipStartPaddingResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            float dimension = tlVar.g0.getResources().getDimension(i);
            if (tlVar.Y != dimension) {
                tlVar.Y = dimension;
                tlVar.invalidateSelf();
                tlVar.z();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.K(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.K(uj.m(tlVar.g0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.L(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.L(tlVar.g0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.M(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        tl tlVar = this.g;
        if (tlVar == null || tlVar.R == charSequence) {
            return;
        }
        lg lgVarC = lg.c();
        lgVarC.getClass();
        dj djVar = m91.a;
        tlVar.R = lgVarC.d(charSequence);
        tlVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.N(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.N(tlVar.g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.M(ec1.r(tlVar.g0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.O(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.O(tlVar.g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.P(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.P(tlVar.g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.Q(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.Q(uj.m(tlVar.g0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.ta, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            id.m("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            id.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // defpackage.ta, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            id.m("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            id.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            id.m("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            id.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            id.m("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            id.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.l(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.g == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            id.m("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.D0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.q = z2;
        b(this.s);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(im0 im0Var) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.X = im0Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.X = im0.b(tlVar.g0, i);
        }
    }

    public void setIconEndPadding(float f) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.S(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.S(tlVar.g0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.T(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.T(tlVar.g0.getResources().getDimension(i));
        }
    }

    @Override // defpackage.ek0
    public void setInternalOnCheckedChangeListener(dk0 dk0Var) {
        this.l = dk0Var;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.g == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            id.m("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            id.m("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.F0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            id.m("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.k = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.j = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.U(colorStateList);
        }
        this.g.getClass();
        e();
    }

    public void setRippleColorResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.U(uj.m(tlVar.g0, i));
            this.g.getClass();
            e();
        }
    }

    @Override // defpackage.m41
    public void setShapeAppearanceModel(d41 d41Var) {
        this.g.setShapeAppearanceModel(d41Var);
    }

    public void setShowMotionSpec(im0 im0Var) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.W = im0Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.W = im0.b(tlVar.g0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
        } else {
            id.m("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        tl tlVar = this.g;
        if (tlVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(tlVar.E0 ? null : charSequence, bufferType);
        tl tlVar2 = this.g;
        if (tlVar2 == null || TextUtils.equals(tlVar2.G, charSequence)) {
            return;
        }
        tlVar2.G = charSequence;
        tlVar2.m0.e = true;
        tlVar2.invalidateSelf();
        tlVar2.z();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        tl tlVar = this.g;
        if (tlVar != null) {
            Context context2 = tlVar.g0;
            tlVar.m0.b(new l91(context2, i), context2);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        tl tlVar = this.g;
        if (tlVar == null || tlVar.c0 == f) {
            return;
        }
        tlVar.c0 = f;
        tlVar.invalidateSelf();
        tlVar.z();
    }

    public void setTextEndPaddingResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            float dimension = tlVar.g0.getResources().getDimension(i);
            if (tlVar.c0 != dimension) {
                tlVar.c0 = dimension;
                tlVar.invalidateSelf();
                tlVar.z();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        tl tlVar = this.g;
        if (tlVar != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            o91 o91Var = tlVar.m0;
            l91 l91Var = o91Var.g;
            if (l91Var != null) {
                l91Var.k = fApplyDimension;
                o91Var.a.setTextSize(fApplyDimension);
                tlVar.a();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        tl tlVar = this.g;
        if (tlVar == null || tlVar.b0 == f) {
            return;
        }
        tlVar.b0 = f;
        tlVar.invalidateSelf();
        tlVar.z();
    }

    public void setTextStartPaddingResource(int i) {
        tl tlVar = this.g;
        if (tlVar != null) {
            float dimension = tlVar.g0.getResources().getDimension(i);
            if (tlVar.b0 != dimension) {
                tlVar.b0 = dimension;
                tlVar.invalidateSelf();
                tlVar.z();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.R(z2);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z2) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.E(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.J(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            id.m("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            id.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            id.m("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            id.m("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(l91 l91Var) {
        tl tlVar = this.g;
        if (tlVar != null) {
            tlVar.m0.b(l91Var, tlVar.g0);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        tl tlVar = this.g;
        if (tlVar != null) {
            Context context = tlVar.g0;
            tlVar.m0.b(new l91(context, i), context);
        }
        g();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.anydesk.anydeskandroid.R.attr.chipStyle);
    }

    public Chip(Context context) {
        this(context, null);
    }
}
