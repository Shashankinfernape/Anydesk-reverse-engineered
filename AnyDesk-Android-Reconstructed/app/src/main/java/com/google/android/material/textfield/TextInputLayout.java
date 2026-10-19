package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.ad;
import defpackage.af1;
import defpackage.av;
import defpackage.b71;
import defpackage.bc0;
import defpackage.bu0;
import defpackage.c41;
import defpackage.cn;
import defpackage.d41;
import defpackage.ds;
import defpackage.e2;
import defpackage.ec1;
import defpackage.f90;
import defpackage.fw;
import defpackage.g90;
import defpackage.gk0;
import defpackage.hk0;
import defpackage.id;
import defpackage.ie1;
import defpackage.iz0;
import defpackage.l;
import defpackage.l91;
import defpackage.lg;
import defpackage.lk0;
import defpackage.lt;
import defpackage.nd0;
import defpackage.nh;
import defpackage.nh0;
import defpackage.ny;
import defpackage.oe1;
import defpackage.ov0;
import defpackage.p91;
import defpackage.q91;
import defpackage.qj0;
import defpackage.qx;
import defpackage.r71;
import defpackage.r91;
import defpackage.rx;
import defpackage.s91;
import defpackage.sm;
import defpackage.tb;
import defpackage.th1;
import defpackage.ti;
import defpackage.ub1;
import defpackage.uj;
import defpackage.x8;
import defpackage.xr;
import defpackage.xv;
import defpackage.y6;
import defpackage.yq;
import defpackage.yr;
import defpackage.zr;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] E0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public ValueAnimator A0;
    public ColorStateList B;
    public boolean B0;
    public ColorStateList C;
    public boolean C0;
    public ColorStateList D;
    public boolean D0;
    public boolean E;
    public CharSequence F;
    public boolean G;
    public hk0 H;
    public hk0 I;
    public StateListDrawable J;
    public boolean K;
    public hk0 L;
    public hk0 M;
    public d41 N;
    public boolean O;
    public final int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public final Rect a0;
    public final Rect b0;
    public final FrameLayout c;
    public final RectF c0;
    public final b71 d;
    public Typeface d0;
    public final rx e;
    public ColorDrawable e0;
    public EditText f;
    public int f0;
    public CharSequence g;
    public final LinkedHashSet g0;
    public int h;
    public ColorDrawable h0;
    public int i;
    public int i0;
    public int j;
    public Drawable j0;
    public int k;
    public ColorStateList k0;
    public final g90 l;
    public ColorStateList l0;
    public boolean m;
    public int m0;
    public int n;
    public int n0;
    public boolean o;
    public int o0;
    public r91 p;
    public ColorStateList p0;
    public ad q;
    public int q0;
    public int r;
    public int r0;
    public int s;
    public int s0;
    public CharSequence t;
    public int t0;
    public boolean u;
    public int u0;
    public ad v;
    public int v0;
    public ColorStateList w;
    public boolean w0;
    public int x;
    public final sm x0;
    public ny y;
    public boolean y0;
    public ny z;
    public boolean z0;

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(lk0.N(context, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_Design_TextInputLayout), attributeSet, i);
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = new g90(this);
        this.p = new nh0();
        this.a0 = new Rect();
        this.b0 = new Rect();
        this.c0 = new RectF();
        this.g0 = new LinkedHashSet();
        sm smVar = new sm(this);
        this.x0 = smVar;
        this.D0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.c = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = x8.a;
        smVar.Q = linearInterpolator;
        smVar.h(false);
        smVar.P = linearInterpolator;
        smVar.h(false);
        if (smVar.g != 8388659) {
            smVar.g = 8388659;
            smVar.h(false);
        }
        th1.b(context2, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_Design_TextInputLayout);
        int[] iArr = ov0.F;
        th1.e(context2, attributeSet, iArr, i, com.anydesk.anydeskandroid.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, com.anydesk.anydeskandroid.R.style.Widget_Design_TextInputLayout);
        y6 y6Var = new y6(context2, typedArrayObtainStyledAttributes);
        b71 b71Var = new b71(this, y6Var);
        this.d = b71Var;
        this.E = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.z0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.y0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.N = d41.b(context2, attributeSet, i, com.anydesk.anydeskandroid.R.style.Widget_Design_TextInputLayout).a();
        this.P = context2.getResources().getDimensionPixelOffset(com.anydesk.anydeskandroid.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.anydesk.anydeskandroid.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.anydesk.anydeskandroid.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.S = this.T;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        c41 c41VarE = this.N.e();
        if (dimension >= 0.0f) {
            c41VarE.e = new e2(dimension);
        }
        if (dimension2 >= 0.0f) {
            c41VarE.f = new e2(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c41VarE.g = new e2(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c41VarE.h = new e2(dimension4);
        }
        this.N = c41VarE.a();
        ColorStateList colorStateListM = ec1.m(context2, y6Var, 7);
        if (colorStateListM != null) {
            int defaultColor = colorStateListM.getDefaultColor();
            this.q0 = defaultColor;
            this.W = defaultColor;
            if (colorStateListM.isStateful()) {
                this.r0 = colorStateListM.getColorForState(new int[]{-16842910}, -1);
                this.s0 = colorStateListM.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.t0 = colorStateListM.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.s0 = this.q0;
                ColorStateList colorStateListM2 = uj.m(context2, com.anydesk.anydeskandroid.R.color.mtrl_filled_background_color);
                this.r0 = colorStateListM2.getColorForState(new int[]{-16842910}, -1);
                this.t0 = colorStateListM2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.W = 0;
            this.q0 = 0;
            this.r0 = 0;
            this.s0 = 0;
            this.t0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListS = y6Var.s(1);
            this.l0 = colorStateListS;
            this.k0 = colorStateListS;
        }
        ColorStateList colorStateListM3 = ec1.m(context2, y6Var, 14);
        this.o0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.m0 = uj.l(context2, com.anydesk.anydeskandroid.R.color.mtrl_textinput_default_box_stroke_color);
        this.u0 = uj.l(context2, com.anydesk.anydeskandroid.R.color.mtrl_textinput_disabled_color);
        this.n0 = uj.l(context2, com.anydesk.anydeskandroid.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM3 != null) {
            setBoxStrokeColorStateList(colorStateListM3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(ec1.m(context2, y6Var, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.C = y6Var.s(24);
        this.D = y6Var.s(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i2 = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.s = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.r = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.r);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.s);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(y6Var.s(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(y6Var.s(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(y6Var.s(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(y6Var.s(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(y6Var.s(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(y6Var.s(58));
        }
        rx rxVar = new rx(this, y6Var);
        this.e = rxVar;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        y6Var.F();
        setImportantForAccessibility(2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26 && i3 >= 26) {
            ie1.d(this, 1);
        }
        frameLayout.addView(b71Var);
        frameLayout.addView(rxVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.H;
        }
        int iU = r71.u(this.f, com.anydesk.anydeskandroid.R.attr.colorControlHighlight);
        int i = this.Q;
        int[][] iArr = E0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            hk0 hk0Var = this.H;
            int i2 = this.W;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{r71.B(iU, i2, 0.1f), i2}), hk0Var, hk0Var);
        }
        Context context = getContext();
        hk0 hk0Var2 = this.H;
        TypedValue typedValueY = bu0.y(context, com.anydesk.anydeskandroid.R.attr.colorSurface);
        if (typedValueY == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", "TextInputLayout", context.getResources().getResourceName(com.anydesk.anydeskandroid.R.attr.colorSurface)));
        }
        int i3 = typedValueY.resourceId;
        int iL = i3 != 0 ? uj.l(context, i3) : typedValueY.data;
        hk0 hk0Var3 = new hk0(hk0Var2.c.a);
        int iB = r71.B(iU, iL, 0.1f);
        hk0Var3.m(new ColorStateList(iArr, new int[]{iB, 0}));
        hk0Var3.setTint(iL);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iB, iL});
        hk0 hk0Var4 = new hk0(hk0Var2.c.a);
        hk0Var4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, hk0Var3, hk0Var4), hk0Var2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.J == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.J = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.J.addState(new int[0], f(false));
        }
        return this.J;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.I == null) {
            this.I = f(true);
        }
        return this.I;
    }

    public static void k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f != null) {
            id.q("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f = editText;
        int i = this.h;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.j);
        }
        int i2 = this.i;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.k);
        }
        this.K = false;
        i();
        setTextInputAccessibilityDelegate(new q91(this));
        Typeface typeface = this.f.getTypeface();
        sm smVar = this.x0;
        smVar.m(typeface);
        float textSize = this.f.getTextSize();
        if (smVar.h != textSize) {
            smVar.h = textSize;
            smVar.h(false);
        }
        float letterSpacing = this.f.getLetterSpacing();
        if (smVar.W != letterSpacing) {
            smVar.W = letterSpacing;
            smVar.h(false);
        }
        int gravity = this.f.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (smVar.g != i3) {
            smVar.g = i3;
            smVar.h(false);
        }
        if (smVar.f != gravity) {
            smVar.f = gravity;
            smVar.h(false);
        }
        WeakHashMap weakHashMap = oe1.a;
        this.v0 = editText.getMinimumHeight();
        this.f.addTextChangedListener(new p91(this, editText));
        if (this.k0 == null) {
            this.k0 = this.f.getHintTextColors();
        }
        if (this.E) {
            if (TextUtils.isEmpty(this.F)) {
                CharSequence hint = this.f.getHint();
                this.g = hint;
                setHint(hint);
                this.f.setHint((CharSequence) null);
            }
            this.G = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        if (this.q != null) {
            n(this.f.getText());
        }
        r();
        this.l.b();
        this.d.bringToFront();
        rx rxVar = this.e;
        rxVar.bringToFront();
        Iterator it = this.g0.iterator();
        while (it.hasNext()) {
            ((qx) it.next()).a(this);
        }
        rxVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.F)) {
            return;
        }
        this.F = charSequence;
        sm smVar = this.x0;
        if (charSequence == null || !TextUtils.equals(smVar.A, charSequence)) {
            smVar.A = charSequence;
            smVar.B = null;
            Bitmap bitmap = smVar.E;
            if (bitmap != null) {
                bitmap.recycle();
                smVar.E = null;
            }
            smVar.h(false);
        }
        if (this.w0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.u == z) {
            return;
        }
        ad adVar = this.v;
        if (!z) {
            if (adVar != null) {
                adVar.setVisibility(8);
            }
            this.v = null;
        } else if (adVar != null) {
            this.c.addView(adVar);
            this.v.setVisibility(0);
        }
        this.u = z;
    }

    public final void a(float f) {
        sm smVar = this.x0;
        if (smVar.b == f) {
            return;
        }
        if (this.A0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0 = valueAnimator;
            valueAnimator.setInterpolator(lk0.H(getContext(), com.anydesk.anydeskandroid.R.attr.motionEasingEmphasizedInterpolator, x8.b));
            this.A0.setDuration(lk0.G(getContext(), com.anydesk.anydeskandroid.R.attr.motionDurationMedium4, 167));
            this.A0.addUpdateListener(new nh(4, this));
        }
        this.A0.setFloatValues(smVar.b, f);
        this.A0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.c;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        hk0 hk0Var = this.H;
        if (hk0Var == null) {
            return;
        }
        d41 d41Var = hk0Var.c.a;
        d41 d41Var2 = this.N;
        if (d41Var != d41Var2) {
            hk0Var.setShapeAppearanceModel(d41Var2);
        }
        if (this.Q == 2 && (i = this.S) > -1 && (i2 = this.V) != 0) {
            hk0 hk0Var2 = this.H;
            hk0Var2.c.j = i;
            hk0Var2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            gk0 gk0Var = hk0Var2.c;
            if (gk0Var.d != colorStateListValueOf) {
                gk0Var.d = colorStateListValueOf;
                hk0Var2.onStateChange(hk0Var2.getState());
            }
        }
        int iB = this.W;
        if (this.Q == 1) {
            iB = cn.b(this.W, r71.t(getContext(), com.anydesk.anydeskandroid.R.attr.colorSurface, 0));
        }
        this.W = iB;
        this.H.m(ColorStateList.valueOf(iB));
        hk0 hk0Var3 = this.L;
        if (hk0Var3 != null && this.M != null) {
            if (this.S > -1 && this.V != 0) {
                hk0Var3.m(this.f.isFocused() ? ColorStateList.valueOf(this.m0) : ColorStateList.valueOf(this.V));
                this.M.m(ColorStateList.valueOf(this.V));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fD;
        if (!this.E) {
            return 0;
        }
        int i = this.Q;
        sm smVar = this.x0;
        if (i == 0) {
            fD = smVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            fD = smVar.d() / 2.0f;
        }
        return (int) fD;
    }

    public final ny d() {
        ny nyVar = new ny();
        nyVar.e = lk0.G(getContext(), com.anydesk.anydeskandroid.R.attr.motionDurationShort2, 87);
        nyVar.f = lk0.H(getContext(), com.anydesk.anydeskandroid.R.attr.motionEasingLinearInterpolator, x8.a);
        return nyVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.g != null) {
            boolean z = this.G;
            this.G = false;
            CharSequence hint = editText.getHint();
            this.f.setHint(this.g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f.setHint(hint);
                this.G = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.c;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.C0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.C0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        hk0 hk0Var;
        super.draw(canvas);
        boolean z = this.E;
        sm smVar = this.x0;
        if (z) {
            TextPaint textPaint = smVar.N;
            RectF rectF = smVar.e;
            int iSave = canvas.save();
            if (smVar.B != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(smVar.G);
                float f = smVar.p;
                float f2 = smVar.q;
                float f3 = smVar.F;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                if (smVar.d0 <= 1 || smVar.C) {
                    canvas.translate(f, f2);
                    smVar.Y.draw(canvas);
                } else {
                    float lineStart = smVar.p - smVar.Y.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (smVar.b0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        textPaint.setShadowLayer(smVar.H, smVar.I, smVar.J, r71.j(smVar.K, textPaint.getAlpha()));
                    }
                    smVar.Y.draw(canvas);
                    textPaint.setAlpha((int) (smVar.a0 * f4));
                    if (i >= 31) {
                        textPaint.setShadowLayer(smVar.H, smVar.I, smVar.J, r71.j(smVar.K, textPaint.getAlpha()));
                    }
                    int lineBaseline = smVar.Y.getLineBaseline(0);
                    CharSequence charSequence = smVar.c0;
                    float f5 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(smVar.H, smVar.I, smVar.J, smVar.K);
                    }
                    String strTrim = smVar.c0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(smVar.Y.getLineEnd(0), str.length()), 0.0f, f5, (Paint) textPaint);
                    canvas = canvas;
                }
                canvas.restoreToCount(iSave);
            }
        }
        if (this.M == null || (hk0Var = this.L) == null) {
            return;
        }
        hk0Var.draw(canvas);
        if (this.f.isFocused()) {
            Rect bounds = this.M.getBounds();
            Rect bounds2 = this.L.getBounds();
            float f6 = smVar.b;
            int iCenterX = bounds2.centerX();
            bounds.left = x8.c(iCenterX, bounds2.left, f6);
            bounds.right = x8.c(iCenterX, bounds2.right, f6);
            this.M.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.B0) {
            return;
        }
        this.B0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        sm smVar = this.x0;
        if (smVar != null) {
            smVar.L = drawableState;
            ColorStateList colorStateList2 = smVar.k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = smVar.j) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                smVar.h(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.f != null) {
            WeakHashMap weakHashMap = oe1.a;
            u(isLaidOut() && isEnabled(), false);
        }
        r();
        x();
        if (z) {
            invalidate();
        }
        this.B0 = false;
    }

    public final boolean e() {
        return this.E && !TextUtils.isEmpty(this.F) && (this.H instanceof zr);
    }

    public final hk0 f(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.anydesk.anydeskandroid.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f;
        float popupElevation = editText instanceof qj0 ? ((qj0) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.anydesk.anydeskandroid.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.anydesk.anydeskandroid.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        iz0 iz0Var = new iz0();
        iz0 iz0Var2 = new iz0();
        iz0 iz0Var3 = new iz0();
        iz0 iz0Var4 = new iz0();
        int i = 0;
        fw fwVar = new fw(i);
        fw fwVar2 = new fw(i);
        fw fwVar3 = new fw(i);
        fw fwVar4 = new fw(i);
        e2 e2Var = new e2(f);
        e2 e2Var2 = new e2(f);
        e2 e2Var3 = new e2(dimensionPixelOffset);
        e2 e2Var4 = new e2(dimensionPixelOffset);
        d41 d41Var = new d41();
        d41Var.a = iz0Var;
        d41Var.b = iz0Var2;
        d41Var.c = iz0Var3;
        d41Var.d = iz0Var4;
        d41Var.e = e2Var;
        d41Var.f = e2Var2;
        d41Var.g = e2Var4;
        d41Var.h = e2Var3;
        d41Var.i = fwVar;
        d41Var.j = fwVar2;
        d41Var.k = fwVar3;
        d41Var.l = fwVar4;
        EditText editText2 = this.f;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof qj0 ? ((qj0) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = hk0.y;
            String simpleName = hk0.class.getSimpleName();
            TypedValue typedValueY = bu0.y(context, com.anydesk.anydeskandroid.R.attr.colorSurface);
            if (typedValueY == null) {
                throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", simpleName, context.getResources().getResourceName(com.anydesk.anydeskandroid.R.attr.colorSurface)));
            }
            int i2 = typedValueY.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? uj.l(context, i2) : typedValueY.data);
        }
        hk0 hk0Var = new hk0();
        hk0Var.j(context);
        hk0Var.m(dropDownBackgroundTintList);
        hk0Var.l(popupElevation);
        hk0Var.setShapeAppearanceModel(d41Var);
        gk0 gk0Var = hk0Var.c;
        if (gk0Var.g == null) {
            gk0Var.g = new Rect();
        }
        hk0Var.c.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        hk0Var.invalidateSelf();
        return hk0Var;
    }

    public final int g(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.f.getCompoundPaddingLeft() : this.e.c();
        } else {
            compoundPaddingLeft = this.d.a();
        }
        return compoundPaddingLeft + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public hk0 getBoxBackground() {
        int i = this.Q;
        if (i == 1 || i == 2) {
            return this.H;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.W;
    }

    public int getBoxBackgroundMode() {
        return this.Q;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.R;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zV = ds.v(this);
        d41 d41Var = this.N;
        RectF rectF = this.c0;
        return zV ? d41Var.h.a(rectF) : d41Var.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zV = ds.v(this);
        d41 d41Var = this.N;
        RectF rectF = this.c0;
        return zV ? d41Var.g.a(rectF) : d41Var.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zV = ds.v(this);
        d41 d41Var = this.N;
        RectF rectF = this.c0;
        return zV ? d41Var.e.a(rectF) : d41Var.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zV = ds.v(this);
        d41 d41Var = this.N;
        RectF rectF = this.c0;
        return zV ? d41Var.f.a(rectF) : d41Var.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.o0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.p0;
    }

    public int getBoxStrokeWidth() {
        return this.T;
    }

    public int getBoxStrokeWidthFocused() {
        return this.U;
    }

    public int getCounterMaxLength() {
        return this.n;
    }

    public CharSequence getCounterOverflowDescription() {
        ad adVar;
        if (this.m && this.o && (adVar = this.q) != null) {
            return adVar.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.B;
    }

    public ColorStateList getCounterTextColor() {
        return this.A;
    }

    public ColorStateList getCursorColor() {
        return this.C;
    }

    public ColorStateList getCursorErrorColor() {
        return this.D;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.k0;
    }

    public EditText getEditText() {
        return this.f;
    }

    public CharSequence getEndIconContentDescription() {
        return this.e.i.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.e.i.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.e.o;
    }

    public int getEndIconMode() {
        return this.e.k;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.e.p;
    }

    public CheckableImageButton getEndIconView() {
        return this.e.i;
    }

    public CharSequence getError() {
        g90 g90Var = this.l;
        if (g90Var.q) {
            return g90Var.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.l.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.l.s;
    }

    public int getErrorCurrentTextColors() {
        ad adVar = this.l.r;
        if (adVar != null) {
            return adVar.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.e.e.getDrawable();
    }

    public CharSequence getHelperText() {
        g90 g90Var = this.l;
        if (g90Var.x) {
            return g90Var.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        ad adVar = this.l.y;
        if (adVar != null) {
            return adVar.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.E) {
            return this.F;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.x0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        sm smVar = this.x0;
        return smVar.e(smVar.k);
    }

    public ColorStateList getHintTextColor() {
        return this.l0;
    }

    public r91 getLengthCounter() {
        return this.p;
    }

    public int getMaxEms() {
        return this.i;
    }

    public int getMaxWidth() {
        return this.k;
    }

    public int getMinEms() {
        return this.h;
    }

    public int getMinWidth() {
        return this.j;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.e.i.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.e.i.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.u) {
            return this.t;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.x;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.w;
    }

    public CharSequence getPrefixText() {
        return this.d.e;
    }

    public ColorStateList getPrefixTextColor() {
        return this.d.d.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.d.d;
    }

    public d41 getShapeAppearanceModel() {
        return this.N;
    }

    public CharSequence getStartIconContentDescription() {
        return this.d.f.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.d.f.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.d.i;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.d.j;
    }

    public CharSequence getSuffixText() {
        return this.e.r;
    }

    public ColorStateList getSuffixTextColor() {
        return this.e.s.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.e.s;
    }

    public Typeface getTypeface() {
        return this.d0;
    }

    public final int h(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.f.getCompoundPaddingRight() : this.d.a();
        } else {
            compoundPaddingRight = this.e.c();
        }
        return i - compoundPaddingRight;
    }

    public final void i() {
        int i = this.Q;
        if (i == 0) {
            this.H = null;
            this.L = null;
            this.M = null;
        } else if (i == 1) {
            this.H = new hk0(this.N);
            this.L = new hk0();
            this.M = new hk0();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.Q + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.E || (this.H instanceof zr)) {
                this.H = new hk0(this.N);
            } else {
                d41 d41Var = this.N;
                int i2 = zr.A;
                if (d41Var == null) {
                    d41Var = new d41();
                }
                xr xrVar = new xr(d41Var, new RectF());
                yr yrVar = new yr(xrVar);
                yrVar.z = xrVar;
                this.H = yrVar;
            }
            this.L = null;
            this.M = null;
        }
        s();
        x();
        if (this.Q == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.R = getResources().getDimensionPixelSize(com.anydesk.anydeskandroid.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (ec1.w(getContext())) {
                this.R = getResources().getDimensionPixelSize(com.anydesk.anydeskandroid.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f != null && this.Q == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f;
                WeakHashMap weakHashMap = oe1.a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.anydesk.anydeskandroid.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f.getPaddingEnd(), getResources().getDimensionPixelSize(com.anydesk.anydeskandroid.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (ec1.w(getContext())) {
                EditText editText2 = this.f;
                WeakHashMap weakHashMap2 = oe1.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.anydesk.anydeskandroid.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f.getPaddingEnd(), getResources().getDimensionPixelSize(com.anydesk.anydeskandroid.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.Q != 0) {
            t();
        }
        EditText editText3 = this.f;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.Q;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    public final void j() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (e()) {
            int width = this.f.getWidth();
            int gravity = this.f.getGravity();
            sm smVar = this.x0;
            boolean zB = smVar.b(smVar.A);
            smVar.C = zB;
            Rect rect = smVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = smVar.Z;
                    }
                } else if (zB) {
                    f = rect.right;
                    f2 = smVar.Z;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.c0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (smVar.Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (smVar.C) {
                        f5 = smVar.Z;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (smVar.C) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = smVar.Z;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = smVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.P;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.S);
                zr zrVar = (zr) this.H;
                zrVar.getClass();
                zrVar.s(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = smVar.Z / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.c0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (smVar.Z / 2.0f);
            } else {
                f4 = (width / 2.0f) + (smVar.Z / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = smVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(ad adVar, int i) {
        try {
            nd0.O(adVar, i);
            if (Build.VERSION.SDK_INT < 23 || adVar.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        nd0.O(adVar, com.anydesk.anydeskandroid.R.style.TextAppearance_AppCompat_Caption);
        adVar.setTextColor(uj.l(getContext(), com.anydesk.anydeskandroid.R.color.design_error));
    }

    public final boolean m() {
        g90 g90Var = this.l;
        return (g90Var.o != 1 || g90Var.r == null || TextUtils.isEmpty(g90Var.p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((nh0) this.p).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.o;
        int i = this.n;
        if (i == -1) {
            this.q.setText(String.valueOf(length));
            this.q.setContentDescription(null);
            this.o = false;
        } else {
            this.o = length > i;
            Context context = getContext();
            this.q.setContentDescription(context.getString(this.o ? com.anydesk.anydeskandroid.R.string.character_counter_overflowed_content_description : com.anydesk.anydeskandroid.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.n)));
            if (z != this.o) {
                o();
            }
            this.q.setText(lg.c().e(getContext().getString(com.anydesk.anydeskandroid.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.n))));
        }
        if (this.f == null || z == this.o) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ad adVar = this.q;
        if (adVar != null) {
            l(adVar, this.o ? this.r : this.s);
            if (!this.o && (colorStateList2 = this.A) != null) {
                this.q.setTextColor(colorStateList2);
            }
            if (!this.o || (colorStateList = this.B) == null) {
                return;
            }
            this.q.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.x0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        rx rxVar = this.e;
        rxVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.D0 = false;
        if (this.f != null && this.f.getMeasuredHeight() < (iMax = Math.max(rxVar.getMeasuredHeight(), this.d.getMeasuredHeight()))) {
            this.f.setMinimumHeight(iMax);
            z = true;
        }
        boolean zQ = q();
        if (z || zQ) {
            this.f.post(new l(19, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f;
        if (editText != null) {
            ThreadLocal threadLocal = lt.a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.a0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = lt.a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            lt.a(this, editText, matrix);
            ThreadLocal threadLocal3 = lt.b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            hk0 hk0Var = this.L;
            if (hk0Var != null) {
                int i5 = rect.bottom;
                hk0Var.setBounds(rect.left, i5 - this.T, rect.right, i5);
            }
            hk0 hk0Var2 = this.M;
            if (hk0Var2 != null) {
                int i6 = rect.bottom;
                hk0Var2.setBounds(rect.left, i6 - this.U, rect.right, i6);
            }
            if (this.E) {
                float textSize = this.f.getTextSize();
                sm smVar = this.x0;
                if (smVar.h != textSize) {
                    smVar.h = textSize;
                    smVar.h(false);
                }
                int gravity = this.f.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (smVar.g != i7) {
                    smVar.g = i7;
                    smVar.h(false);
                }
                if (smVar.f != gravity) {
                    smVar.f = gravity;
                    smVar.h(false);
                }
                if (this.f == null) {
                    throw new IllegalStateException();
                }
                boolean zV = ds.v(this);
                int i8 = rect.bottom;
                Rect rect2 = this.b0;
                rect2.bottom = i8;
                int i9 = this.Q;
                int i10 = rect.left;
                if (i9 == 1) {
                    rect2.left = g(i10, zV);
                    rect2.top = rect.top + this.R;
                    rect2.right = h(rect.right, zV);
                } else if (i9 != 2) {
                    rect2.left = g(i10, zV);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zV);
                } else {
                    rect2.left = this.f.getPaddingLeft() + i10;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f.getPaddingRight();
                }
                int i11 = rect2.left;
                int i12 = rect2.top;
                int i13 = rect2.right;
                int i14 = rect2.bottom;
                Rect rect3 = smVar.d;
                if (rect3.left != i11 || rect3.top != i12 || rect3.right != i13 || rect3.bottom != i14) {
                    rect3.set(i11, i12, i13, i14);
                    smVar.M = true;
                }
                if (this.f == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = smVar.O;
                textPaint.setTextSize(smVar.h);
                textPaint.setTypeface(smVar.u);
                textPaint.setLetterSpacing(smVar.W);
                float f = -textPaint.ascent();
                rect2.left = this.f.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.Q != 1 || this.f.getMinLines() > 1) ? rect.top + this.f.getCompoundPaddingTop() : (int) (rect.centerY() - (f / 2.0f));
                rect2.right = rect.right - this.f.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.Q != 1 || this.f.getMinLines() > 1) ? rect.bottom - this.f.getCompoundPaddingBottom() : (int) (rect2.top + f);
                rect2.bottom = compoundPaddingBottom;
                int i15 = rect2.left;
                int i16 = rect2.top;
                int i17 = rect2.right;
                Rect rect4 = smVar.c;
                if (rect4.left != i15 || rect4.top != i16 || rect4.right != i17 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i15, i16, i17, compoundPaddingBottom);
                    smVar.M = true;
                }
                smVar.h(false);
                if (!e() || this.w0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.D0;
        rx rxVar = this.e;
        if (!z) {
            rxVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.D0 = true;
        }
        if (this.v != null && (editText = this.f) != null) {
            this.v.setGravity(editText.getGravity());
            this.v.setPadding(this.f.getCompoundPaddingLeft(), this.f.getCompoundPaddingTop(), this.f.getCompoundPaddingRight(), this.f.getCompoundPaddingBottom());
        }
        rxVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof s91)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        s91 s91Var = (s91) parcelable;
        super.onRestoreInstanceState(s91Var.c);
        setError(s91Var.e);
        if (s91Var.f) {
            post(new bc0(20, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.O) {
            yq yqVar = this.N.e;
            RectF rectF = this.c0;
            float fA = yqVar.a(rectF);
            float fA2 = this.N.f.a(rectF);
            float fA3 = this.N.h.a(rectF);
            float fA4 = this.N.g.a(rectF);
            d41 d41Var = this.N;
            r71 r71Var = d41Var.a;
            r71 r71Var2 = d41Var.b;
            r71 r71Var3 = d41Var.d;
            r71 r71Var4 = d41Var.c;
            fw fwVar = new fw(0);
            fw fwVar2 = new fw(0);
            fw fwVar3 = new fw(0);
            fw fwVar4 = new fw(0);
            e2 e2Var = new e2(fA2);
            e2 e2Var2 = new e2(fA);
            e2 e2Var3 = new e2(fA4);
            e2 e2Var4 = new e2(fA3);
            d41 d41Var2 = new d41();
            d41Var2.a = r71Var2;
            d41Var2.b = r71Var;
            d41Var2.c = r71Var3;
            d41Var2.d = r71Var4;
            d41Var2.e = e2Var;
            d41Var2.f = e2Var2;
            d41Var2.g = e2Var4;
            d41Var2.h = e2Var3;
            d41Var2.i = fwVar;
            d41Var2.j = fwVar2;
            d41Var2.k = fwVar3;
            d41Var2.l = fwVar4;
            this.O = z;
            setShapeAppearanceModel(d41Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        s91 s91Var = new s91(super.onSaveInstanceState());
        if (m()) {
            s91Var.e = getError();
        }
        rx rxVar = this.e;
        s91Var.f = rxVar.k != 0 && rxVar.i.f;
        return s91Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.C;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueY = bu0.y(context, com.anydesk.anydeskandroid.R.attr.colorControlActivated);
            if (typedValueY != null) {
                int i = typedValueY.resourceId;
                if (i != 0) {
                    colorStateListValueOf = uj.m(context, i);
                } else {
                    int i2 = typedValueY.data;
                    if (i2 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i2);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = uj.K(this.f.getTextCursorDrawable()).mutate();
        if ((m() || (this.q != null && this.o)) && (colorStateList = this.D) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean q() {
        boolean z;
        if (this.f == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            b71 b71Var = this.d;
            if (b71Var.getMeasuredWidth() > 0) {
                int measuredWidth = b71Var.getMeasuredWidth() - this.f.getPaddingLeft();
                if (this.e0 == null || this.f0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.e0 = colorDrawable;
                    this.f0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.e0;
                if (drawable != colorDrawable2) {
                    this.f.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.e0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f.getCompoundDrawablesRelative();
                this.f.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.e0 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.e0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f.getCompoundDrawablesRelative();
            this.f.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.e0 = null;
            z = true;
        } else {
            z = false;
        }
        rx rxVar = this.e;
        if ((rxVar.e() || ((rxVar.k != 0 && rxVar.d()) || rxVar.r != null)) && rxVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = rxVar.s.getMeasuredWidth() - this.f.getPaddingRight();
            if (rxVar.e()) {
                checkableImageButton = rxVar.e;
            } else if (rxVar.k != 0 && rxVar.d()) {
                checkableImageButton = rxVar.i;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.f.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.h0;
            if (colorDrawable3 != null && this.i0 != measuredWidth2) {
                this.i0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.h0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.h0 = colorDrawable4;
                this.i0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.h0;
            if (drawable2 != colorDrawable5) {
                this.j0 = drawable2;
                this.f.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.h0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.f.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.h0) {
                this.f.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.j0, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.h0 = null;
            return z2;
        }
        return z;
    }

    public final void r() {
        Drawable background;
        ad adVar;
        EditText editText = this.f;
        if (editText == null || this.Q != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = av.a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(tb.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.o && (adVar = this.q) != null) {
            drawableMutate.setColorFilter(tb.c(adVar.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            uj.g(drawableMutate);
            this.f.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f;
        if (editText == null || this.H == null) {
            return;
        }
        if ((this.K || editText.getBackground() == null) && this.Q != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f;
            WeakHashMap weakHashMap = oe1.a;
            editText2.setBackground(editTextBoxBackground);
            this.K = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.W != i) {
            this.W = i;
            this.q0 = i;
            this.s0 = i;
            this.t0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(uj.l(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.q0 = defaultColor;
        this.W = defaultColor;
        this.r0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.s0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.t0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.Q) {
            return;
        }
        this.Q = i;
        if (this.f != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.R = i;
    }

    public void setBoxCornerFamily(int i) {
        c41 c41VarE = this.N.e();
        yq yqVar = this.N.e;
        c41VarE.a = th1.n(i);
        c41VarE.e = yqVar;
        yq yqVar2 = this.N.f;
        c41VarE.b = th1.n(i);
        c41VarE.f = yqVar2;
        yq yqVar3 = this.N.h;
        c41VarE.d = th1.n(i);
        c41VarE.h = yqVar3;
        yq yqVar4 = this.N.g;
        c41VarE.c = th1.n(i);
        c41VarE.g = yqVar4;
        this.N = c41VarE.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.o0 != i) {
            this.o0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.m0 = colorStateList.getDefaultColor();
            this.u0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.n0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.o0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.o0 != colorStateList.getDefaultColor()) {
            this.o0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.p0 != colorStateList) {
            this.p0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.T = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.U = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.m != z) {
            g90 g90Var = this.l;
            if (z) {
                ad adVar = new ad(getContext(), null);
                this.q = adVar;
                adVar.setId(com.anydesk.anydeskandroid.R.id.textinput_counter);
                Typeface typeface = this.d0;
                if (typeface != null) {
                    this.q.setTypeface(typeface);
                }
                this.q.setMaxLines(1);
                g90Var.a(this.q, 2);
                ((ViewGroup.MarginLayoutParams) this.q.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.anydesk.anydeskandroid.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.q != null) {
                    EditText editText = this.f;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                g90Var.g(this.q, 2);
                this.q = null;
            }
            this.m = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.n != i) {
            if (i > 0) {
                this.n = i;
            } else {
                this.n = -1;
            }
            if (!this.m || this.q == null) {
                return;
            }
            EditText editText = this.f;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.r != i) {
            this.r = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.s != i) {
            this.s = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            if (m() || (this.q != null && this.o)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.k0 = colorStateList;
        this.l0 = colorStateList;
        if (this.f != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.e.i.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.e.i.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        rx rxVar = this.e;
        CharSequence text = i != 0 ? rxVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = rxVar.i;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        rx rxVar = this.e;
        Drawable drawableR = i != 0 ? ec1.r(rxVar.getContext(), i) : null;
        TextInputLayout textInputLayout = rxVar.c;
        CheckableImageButton checkableImageButton = rxVar.i;
        checkableImageButton.setImageDrawable(drawableR);
        if (drawableR != null) {
            ec1.c(textInputLayout, checkableImageButton, rxVar.m, rxVar.n);
            ec1.G(textInputLayout, checkableImageButton, rxVar.m);
        }
    }

    public void setEndIconMinSize(int i) {
        rx rxVar = this.e;
        if (i < 0) {
            rxVar.getClass();
            id.q("endIconSize cannot be less than 0");
        } else if (i != rxVar.o) {
            rxVar.o = i;
            CheckableImageButton checkableImageButton = rxVar.i;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = rxVar.e;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.e.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        rx rxVar = this.e;
        CheckableImageButton checkableImageButton = rxVar.i;
        View.OnLongClickListener onLongClickListener = rxVar.q;
        checkableImageButton.setOnClickListener(onClickListener);
        ec1.H(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        rx rxVar = this.e;
        rxVar.q = onLongClickListener;
        CheckableImageButton checkableImageButton = rxVar.i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ec1.H(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        rx rxVar = this.e;
        rxVar.p = scaleType;
        rxVar.i.setScaleType(scaleType);
        rxVar.e.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        rx rxVar = this.e;
        if (rxVar.m != colorStateList) {
            rxVar.m = colorStateList;
            ec1.c(rxVar.c, rxVar.i, colorStateList, rxVar.n);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        rx rxVar = this.e;
        if (rxVar.n != mode) {
            rxVar.n = mode;
            ec1.c(rxVar.c, rxVar.i, rxVar.m, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.e.h(z);
    }

    public void setError(CharSequence charSequence) {
        g90 g90Var = this.l;
        if (!g90Var.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            g90Var.f();
            return;
        }
        g90Var.c();
        g90Var.p = charSequence;
        g90Var.r.setText(charSequence);
        int i = g90Var.n;
        if (i != 1) {
            g90Var.o = 1;
        }
        g90Var.i(i, g90Var.o, g90Var.h(g90Var.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        g90 g90Var = this.l;
        g90Var.t = i;
        ad adVar = g90Var.r;
        if (adVar != null) {
            WeakHashMap weakHashMap = oe1.a;
            adVar.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        g90 g90Var = this.l;
        g90Var.s = charSequence;
        ad adVar = g90Var.r;
        if (adVar != null) {
            adVar.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        g90 g90Var = this.l;
        TextInputLayout textInputLayout = g90Var.h;
        if (g90Var.q == z) {
            return;
        }
        g90Var.c();
        if (z) {
            ad adVar = new ad(g90Var.g, null);
            g90Var.r = adVar;
            adVar.setId(com.anydesk.anydeskandroid.R.id.textinput_error);
            g90Var.r.setTextAlignment(5);
            Typeface typeface = g90Var.B;
            if (typeface != null) {
                g90Var.r.setTypeface(typeface);
            }
            int i = g90Var.u;
            g90Var.u = i;
            ad adVar2 = g90Var.r;
            if (adVar2 != null) {
                g90Var.h.l(adVar2, i);
            }
            ColorStateList colorStateList = g90Var.v;
            g90Var.v = colorStateList;
            ad adVar3 = g90Var.r;
            if (adVar3 != null && colorStateList != null) {
                adVar3.setTextColor(colorStateList);
            }
            CharSequence charSequence = g90Var.s;
            g90Var.s = charSequence;
            ad adVar4 = g90Var.r;
            if (adVar4 != null) {
                adVar4.setContentDescription(charSequence);
            }
            int i2 = g90Var.t;
            g90Var.t = i2;
            ad adVar5 = g90Var.r;
            if (adVar5 != null) {
                WeakHashMap weakHashMap = oe1.a;
                adVar5.setAccessibilityLiveRegion(i2);
            }
            g90Var.r.setVisibility(4);
            g90Var.a(g90Var.r, 0);
        } else {
            g90Var.f();
            g90Var.g(g90Var.r, 0);
            g90Var.r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        g90Var.q = z;
    }

    public void setErrorIconDrawable(int i) {
        rx rxVar = this.e;
        rxVar.i(i != 0 ? ec1.r(rxVar.getContext(), i) : null);
        ec1.G(rxVar.c, rxVar.e, rxVar.f);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        rx rxVar = this.e;
        CheckableImageButton checkableImageButton = rxVar.e;
        View.OnLongClickListener onLongClickListener = rxVar.h;
        checkableImageButton.setOnClickListener(onClickListener);
        ec1.H(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        rx rxVar = this.e;
        rxVar.h = onLongClickListener;
        CheckableImageButton checkableImageButton = rxVar.e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ec1.H(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        rx rxVar = this.e;
        if (rxVar.f != colorStateList) {
            rxVar.f = colorStateList;
            ec1.c(rxVar.c, rxVar.e, colorStateList, rxVar.g);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        rx rxVar = this.e;
        if (rxVar.g != mode) {
            rxVar.g = mode;
            ec1.c(rxVar.c, rxVar.e, rxVar.f, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        g90 g90Var = this.l;
        g90Var.u = i;
        ad adVar = g90Var.r;
        if (adVar != null) {
            g90Var.h.l(adVar, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        g90 g90Var = this.l;
        g90Var.v = colorStateList;
        ad adVar = g90Var.r;
        if (adVar == null || colorStateList == null) {
            return;
        }
        adVar.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.y0 != z) {
            this.y0 = z;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        g90 g90Var = this.l;
        if (zIsEmpty) {
            if (g90Var.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!g90Var.x) {
            setHelperTextEnabled(true);
        }
        g90Var.c();
        g90Var.w = charSequence;
        g90Var.y.setText(charSequence);
        int i = g90Var.n;
        if (i != 2) {
            g90Var.o = 2;
        }
        g90Var.i(i, g90Var.o, g90Var.h(g90Var.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        g90 g90Var = this.l;
        g90Var.A = colorStateList;
        ad adVar = g90Var.y;
        if (adVar == null || colorStateList == null) {
            return;
        }
        adVar.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        g90 g90Var = this.l;
        TextInputLayout textInputLayout = g90Var.h;
        if (g90Var.x == z) {
            return;
        }
        g90Var.c();
        if (z) {
            ad adVar = new ad(g90Var.g, null);
            g90Var.y = adVar;
            adVar.setId(com.anydesk.anydeskandroid.R.id.textinput_helper_text);
            g90Var.y.setTextAlignment(5);
            Typeface typeface = g90Var.B;
            if (typeface != null) {
                g90Var.y.setTypeface(typeface);
            }
            g90Var.y.setVisibility(4);
            g90Var.y.setAccessibilityLiveRegion(1);
            int i = g90Var.z;
            g90Var.z = i;
            ad adVar2 = g90Var.y;
            if (adVar2 != null) {
                nd0.O(adVar2, i);
            }
            ColorStateList colorStateList = g90Var.A;
            g90Var.A = colorStateList;
            ad adVar3 = g90Var.y;
            if (adVar3 != null && colorStateList != null) {
                adVar3.setTextColor(colorStateList);
            }
            g90Var.a(g90Var.y, 1);
            g90Var.y.setAccessibilityDelegate(new f90(g90Var));
        } else {
            g90Var.c();
            int i2 = g90Var.n;
            if (i2 == 2) {
                g90Var.o = 0;
            }
            g90Var.i(i2, g90Var.o, g90Var.h(g90Var.y, ""));
            g90Var.g(g90Var.y, 1);
            g90Var.y = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        g90Var.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        g90 g90Var = this.l;
        g90Var.z = i;
        ad adVar = g90Var.y;
        if (adVar != null) {
            nd0.O(adVar, i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.z0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.E) {
            this.E = z;
            if (z) {
                CharSequence hint = this.f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.F)) {
                        setHint(hint);
                    }
                    this.f.setHint((CharSequence) null);
                }
                this.G = true;
            } else {
                this.G = false;
                if (!TextUtils.isEmpty(this.F) && TextUtils.isEmpty(this.f.getHint())) {
                    this.f.setHint(this.F);
                }
                setHintInternal(null);
            }
            if (this.f != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        sm smVar = this.x0;
        TextInputLayout textInputLayout = smVar.a;
        l91 l91Var = new l91(textInputLayout.getContext(), i);
        ColorStateList colorStateList = l91Var.j;
        if (colorStateList != null) {
            smVar.k = colorStateList;
        }
        float f = l91Var.k;
        if (f != 0.0f) {
            smVar.i = f;
        }
        ColorStateList colorStateList2 = l91Var.a;
        if (colorStateList2 != null) {
            smVar.U = colorStateList2;
        }
        smVar.S = l91Var.e;
        smVar.T = l91Var.f;
        smVar.R = l91Var.g;
        smVar.V = l91Var.i;
        ti tiVar = smVar.y;
        if (tiVar != null) {
            tiVar.k = true;
        }
        af1 af1Var = new af1(27, smVar);
        l91Var.a();
        smVar.y = new ti(af1Var, l91Var.n);
        l91Var.c(textInputLayout.getContext(), smVar.y);
        smVar.h(false);
        this.l0 = smVar.k;
        if (this.f != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.l0 != colorStateList) {
            if (this.k0 == null) {
                sm smVar = this.x0;
                if (smVar.k != colorStateList) {
                    smVar.k = colorStateList;
                    smVar.h(false);
                }
            }
            this.l0 = colorStateList;
            if (this.f != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(r91 r91Var) {
        this.p = r91Var;
    }

    public void setMaxEms(int i) {
        this.i = i;
        EditText editText = this.f;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.k = i;
        EditText editText = this.f;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.h = i;
        EditText editText = this.f;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.j = i;
        EditText editText = this.f;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        rx rxVar = this.e;
        rxVar.i.setContentDescription(i != 0 ? rxVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        rx rxVar = this.e;
        rxVar.i.setImageDrawable(i != 0 ? ec1.r(rxVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        rx rxVar = this.e;
        if (z && rxVar.k != 1) {
            rxVar.g(1);
        } else if (z) {
            rxVar.getClass();
        } else {
            rxVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        rx rxVar = this.e;
        rxVar.m = colorStateList;
        ec1.c(rxVar.c, rxVar.i, colorStateList, rxVar.n);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        rx rxVar = this.e;
        rxVar.n = mode;
        ec1.c(rxVar.c, rxVar.i, rxVar.m, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.v == null) {
            ad adVar = new ad(getContext(), null);
            this.v = adVar;
            adVar.setId(com.anydesk.anydeskandroid.R.id.textinput_placeholder);
            this.v.setImportantForAccessibility(2);
            ny nyVarD = d();
            this.y = nyVarD;
            nyVarD.d = 67L;
            this.z = d();
            setPlaceholderTextAppearance(this.x);
            setPlaceholderTextColor(this.w);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.u) {
                setPlaceholderTextEnabled(true);
            }
            this.t = charSequence;
        }
        EditText editText = this.f;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.x = i;
        ad adVar = this.v;
        if (adVar != null) {
            nd0.O(adVar, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            ad adVar = this.v;
            if (adVar == null || colorStateList == null) {
                return;
            }
            adVar.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        b71 b71Var = this.d;
        b71Var.getClass();
        b71Var.e = TextUtils.isEmpty(charSequence) ? null : charSequence;
        b71Var.d.setText(charSequence);
        b71Var.e();
    }

    public void setPrefixTextAppearance(int i) {
        nd0.O(this.d.d, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.d.d.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(d41 d41Var) {
        hk0 hk0Var = this.H;
        if (hk0Var == null || hk0Var.c.a == d41Var) {
            return;
        }
        this.N = d41Var;
        b();
    }

    public void setStartIconCheckable(boolean z) {
        this.d.f.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? ec1.r(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        b71 b71Var = this.d;
        if (i < 0) {
            b71Var.getClass();
            id.q("startIconSize cannot be less than 0");
        } else if (i != b71Var.i) {
            b71Var.i = i;
            CheckableImageButton checkableImageButton = b71Var.f;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        b71 b71Var = this.d;
        CheckableImageButton checkableImageButton = b71Var.f;
        View.OnLongClickListener onLongClickListener = b71Var.k;
        checkableImageButton.setOnClickListener(onClickListener);
        ec1.H(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        b71 b71Var = this.d;
        b71Var.k = onLongClickListener;
        CheckableImageButton checkableImageButton = b71Var.f;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        ec1.H(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        b71 b71Var = this.d;
        b71Var.j = scaleType;
        b71Var.f.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        b71 b71Var = this.d;
        if (b71Var.g != colorStateList) {
            b71Var.g = colorStateList;
            ec1.c(b71Var.c, b71Var.f, colorStateList, b71Var.h);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        b71 b71Var = this.d;
        if (b71Var.h != mode) {
            b71Var.h = mode;
            ec1.c(b71Var.c, b71Var.f, b71Var.g, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.d.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        rx rxVar = this.e;
        rxVar.getClass();
        rxVar.r = TextUtils.isEmpty(charSequence) ? null : charSequence;
        rxVar.s.setText(charSequence);
        rxVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        nd0.O(this.e.s, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.e.s.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(q91 q91Var) {
        EditText editText = this.f;
        if (editText != null) {
            oe1.n(editText, q91Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.d0) {
            this.d0 = typeface;
            this.x0.m(typeface);
            g90 g90Var = this.l;
            if (typeface != g90Var.B) {
                g90Var.B = typeface;
                ad adVar = g90Var.r;
                if (adVar != null) {
                    adVar.setTypeface(typeface);
                }
                ad adVar2 = g90Var.y;
                if (adVar2 != null) {
                    adVar2.setTypeface(typeface);
                }
            }
            ad adVar3 = this.q;
            if (adVar3 != null) {
                adVar3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.Q != 1) {
            FrameLayout frameLayout = this.c;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        ColorStateList colorStateList;
        ad adVar;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.k0;
        sm smVar = this.x0;
        if (colorStateList2 != null) {
            smVar.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.k0;
            int colorForState = this.u0;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            smVar.i(ColorStateList.valueOf(colorForState));
        } else if (m()) {
            ad adVar2 = this.l.r;
            smVar.i(adVar2 != null ? adVar2.getTextColors() : null);
        } else if (this.o && (adVar = this.q) != null) {
            smVar.i(adVar.getTextColors());
        } else if (z4 && (colorStateList = this.l0) != null && smVar.k != colorStateList) {
            smVar.k = colorStateList;
            smVar.h(false);
        }
        rx rxVar = this.e;
        b71 b71Var = this.d;
        if (z3 || !this.y0 || (isEnabled() && z4)) {
            if (z2 || this.w0) {
                ValueAnimator valueAnimator = this.A0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.A0.cancel();
                }
                if (z && this.z0) {
                    a(1.0f);
                } else {
                    smVar.k(1.0f);
                }
                this.w0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f;
                v(editText3 != null ? editText3.getText() : null);
                b71Var.l = false;
                b71Var.e();
                rxVar.t = false;
                rxVar.n();
                return;
            }
            return;
        }
        if (z2 || !this.w0) {
            ValueAnimator valueAnimator2 = this.A0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.A0.cancel();
            }
            if (z && this.z0) {
                a(0.0f);
            } else {
                smVar.k(0.0f);
            }
            if (e() && !((zr) this.H).z.q.isEmpty() && e()) {
                ((zr) this.H).s(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.w0 = true;
            ad adVar3 = this.v;
            if (adVar3 != null && this.u) {
                adVar3.setText((CharSequence) null);
                ub1.a(this.c, this.z);
                this.v.setVisibility(4);
            }
            b71Var.l = true;
            b71Var.e();
            rxVar.t = true;
            rxVar.n();
        }
    }

    public final void v(Editable editable) {
        ((nh0) this.p).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.c;
        if (length != 0 || this.w0) {
            ad adVar = this.v;
            if (adVar == null || !this.u) {
                return;
            }
            adVar.setText((CharSequence) null);
            ub1.a(frameLayout, this.z);
            this.v.setVisibility(4);
            return;
        }
        if (this.v == null || !this.u || TextUtils.isEmpty(this.t)) {
            return;
        }
        this.v.setText(this.t);
        ub1.a(frameLayout, this.y);
        this.v.setVisibility(0);
        this.v.bringToFront();
        announceForAccessibility(this.t);
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.p0.getDefaultColor();
        int colorForState = this.p0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.p0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.V = colorForState2;
        } else if (z2) {
            this.V = colorForState;
        } else {
            this.V = defaultColor;
        }
    }

    public final void x() {
        ad adVar;
        EditText editText;
        EditText editText2;
        if (this.H == null || this.Q == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.V = this.u0;
        } else if (m()) {
            if (this.p0 != null) {
                w(z2, z);
            } else {
                this.V = getErrorCurrentTextColors();
            }
        } else if (!this.o || (adVar = this.q) == null) {
            if (z2) {
                this.V = this.o0;
            } else if (z) {
                this.V = this.n0;
            } else {
                this.V = this.m0;
            }
        } else if (this.p0 != null) {
            w(z2, z);
        } else {
            this.V = adVar.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        rx rxVar = this.e;
        TextInputLayout textInputLayout = rxVar.c;
        CheckableImageButton checkableImageButton = rxVar.i;
        TextInputLayout textInputLayout2 = rxVar.c;
        rxVar.l();
        ec1.G(textInputLayout2, rxVar.e, rxVar.f);
        ec1.G(textInputLayout2, checkableImageButton, rxVar.m);
        if (rxVar.b() instanceof xv) {
            if (!textInputLayout.m() || checkableImageButton.getDrawable() == null) {
                ec1.c(textInputLayout, checkableImageButton, rxVar.m, rxVar.n);
            } else {
                Drawable drawableMutate = uj.K(checkableImageButton.getDrawable()).mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        b71 b71Var = this.d;
        ec1.G(b71Var.c, b71Var.f, b71Var.g);
        if (this.Q == 2) {
            int i = this.S;
            if (z2 && isEnabled()) {
                this.S = this.U;
            } else {
                this.S = this.T;
            }
            if (this.S != i && e() && !this.w0) {
                if (e()) {
                    ((zr) this.H).s(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.Q == 1) {
            if (!isEnabled()) {
                this.W = this.r0;
            } else if (z && !z2) {
                this.W = this.t0;
            } else if (z2) {
                this.W = this.s0;
            } else {
                this.W = this.q0;
            }
        }
        b();
    }

    public void setHint(CharSequence charSequence) {
        if (this.E) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.d.f;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.d.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.e.i.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.e.i.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.e.i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.e.i(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        rx rxVar = this.e;
        TextInputLayout textInputLayout = rxVar.c;
        CheckableImageButton checkableImageButton = rxVar.i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ec1.c(textInputLayout, checkableImageButton, rxVar.m, rxVar.n);
            ec1.G(textInputLayout, checkableImageButton, rxVar.m);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.anydesk.anydeskandroid.R.attr.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
