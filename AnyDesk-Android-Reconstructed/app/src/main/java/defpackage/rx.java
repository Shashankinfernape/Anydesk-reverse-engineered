package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rx extends LinearLayout {
    public final TextInputLayout c;
    public final FrameLayout d;
    public final CheckableImageButton e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public View.OnLongClickListener h;
    public final CheckableImageButton i;
    public final fj0 j;
    public int k;
    public final LinkedHashSet l;
    public ColorStateList m;
    public PorterDuff.Mode n;
    public int o;
    public ImageView.ScaleType p;
    public View.OnLongClickListener q;
    public CharSequence r;
    public final ad s;
    public boolean t;
    public EditText u;
    public final AccessibilityManager v;
    public tk w;
    public final zo x;

    public rx(TextInputLayout textInputLayout, y6 y6Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.k = 0;
        this.l = new LinkedHashSet();
        this.x = new zo(2, this);
        qx qxVar = new qx(this);
        this.v = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.c = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.e = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.i = checkableImageButtonA2;
        this.j = new fj0(this, y6Var);
        ad adVar = new ad(getContext(), null);
        this.s = adVar;
        TypedArray typedArray = (TypedArray) y6Var.e;
        if (typedArray.hasValue(38)) {
            this.f = ec1.m(getContext(), y6Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.g = ds.z(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(y6Var.t(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = oe1.a;
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.m = ec1.m(getContext(), y6Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.n = ds.z(typedArray.getInt(33, -1), null);
            }
        }
        int i = 1;
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.m = ec1.m(getContext(), y6Var, 54);
            }
            if (typedArray.hasValue(55)) {
                this.n = ds.z(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            id.q("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.o) {
            this.o = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeJ = ec1.j(typedArray.getInt(31, -1));
            this.p = scaleTypeJ;
            checkableImageButtonA2.setScaleType(scaleTypeJ);
            checkableImageButtonA.setScaleType(scaleTypeJ);
        }
        adVar.setVisibility(8);
        adVar.setId(R.id.textinput_suffix_text);
        adVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        adVar.setAccessibilityLiveRegion(1);
        nd0.O(adVar, typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            adVar.setTextColor(y6Var.s(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.r = TextUtils.isEmpty(text3) ? null : text3;
        adVar.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(adVar);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.g0.add(qxVar);
        if (textInputLayout.f != null) {
            qxVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new qj(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (Build.VERSION.SDK_INT <= 22) {
            Context context = checkableImageButton.getContext();
            int iApplyDimension = (int) TypedValue.applyDimension(1, 4.0f, checkableImageButton.getContext().getResources().getDisplayMetrics());
            int[] iArr = zy0.a;
            checkableImageButton.setBackground(yy0.b(context, iApplyDimension));
        }
        if (ec1.w(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final sx b() {
        sx urVar;
        int i = this.k;
        fj0 fj0Var = this.j;
        SparseArray sparseArray = (SparseArray) fj0Var.c;
        sx sxVar = (sx) sparseArray.get(i);
        if (sxVar != null) {
            return sxVar;
        }
        rx rxVar = (rx) fj0Var.d;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                urVar = new ur(rxVar, i2);
            } else if (i == 1) {
                urVar = new zt0(rxVar, fj0Var.b);
            } else if (i == 2) {
                urVar = new mm(rxVar);
            } else {
                if (i != 3) {
                    id.q(gr0.e(i, "Invalid end icon mode: "));
                    return null;
                }
                urVar = new xv(rxVar);
            }
        } else {
            urVar = new ur(rxVar, 0);
        }
        sparseArray.append(i, urVar);
        return urVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.i;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = oe1.a;
        return this.s.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.d.getVisibility() == 0 && this.i.getVisibility() == 0;
    }

    public final boolean e() {
        return this.e.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        sx sxVarB = b();
        boolean zJ = sxVarB.j();
        CheckableImageButton checkableImageButton = this.i;
        boolean z4 = true;
        if (!zJ || (z3 = checkableImageButton.f) == sxVarB.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(sxVarB instanceof xv) || (zIsActivated = checkableImageButton.isActivated()) == ((xv) sxVarB).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            ec1.G(this.c, checkableImageButton, this.m);
        }
    }

    public final void g(int i) {
        if (this.k == i) {
            return;
        }
        sx sxVarB = b();
        tk tkVar = this.w;
        AccessibilityManager accessibilityManager = this.v;
        if (tkVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new p3(tkVar));
        }
        this.w = null;
        sxVarB.r();
        this.k = i;
        Iterator it = this.l.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            id.c();
            return;
        }
        h(i != 0);
        sx sxVarB2 = b();
        int iD = this.j.a;
        if (iD == 0) {
            iD = sxVarB2.d();
        }
        Drawable drawableR = iD != 0 ? ec1.r(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(drawableR);
        TextInputLayout textInputLayout = this.c;
        if (drawableR != null) {
            ec1.c(textInputLayout, checkableImageButton, this.m, this.n);
            ec1.G(textInputLayout, checkableImageButton, this.m);
        }
        int iC = sxVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(sxVarB2.j());
        if (!sxVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        sxVarB2.q();
        tk tkVarH = sxVarB2.h();
        this.w = tkVarH;
        if (tkVarH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = oe1.a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new p3(this.w));
            }
        }
        View.OnClickListener onClickListenerF = sxVarB2.f();
        View.OnLongClickListener onLongClickListener = this.q;
        checkableImageButton.setOnClickListener(onClickListenerF);
        ec1.H(checkableImageButton, onLongClickListener);
        EditText editText = this.u;
        if (editText != null) {
            sxVarB2.l(editText);
            j(sxVarB2);
        }
        ec1.c(textInputLayout, checkableImageButton, this.m, this.n);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.i.setVisibility(z ? 0 : 8);
            k();
            m();
            this.c.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.e;
        checkableImageButton.setImageDrawable(drawable);
        l();
        ec1.c(this.c, checkableImageButton, this.f, this.g);
    }

    public final void j(sx sxVar) {
        if (this.u == null) {
            return;
        }
        if (sxVar.e() != null) {
            this.u.setOnFocusChangeListener(sxVar.e());
        }
        if (sxVar.g() != null) {
            this.i.setOnFocusChangeListener(sxVar.g());
        }
    }

    public final void k() {
        this.d.setVisibility((this.i.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.r == null || this.t) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.e;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.c;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.l.q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.k != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int paddingEnd;
        TextInputLayout textInputLayout = this.c;
        if (textInputLayout.f == null) {
            return;
        }
        if (d() || e()) {
            paddingEnd = 0;
        } else {
            EditText editText = textInputLayout.f;
            WeakHashMap weakHashMap = oe1.a;
            paddingEnd = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f.getPaddingTop();
        int paddingBottom = textInputLayout.f.getPaddingBottom();
        WeakHashMap weakHashMap2 = oe1.a;
        this.s.setPaddingRelative(dimensionPixelSize, paddingTop, paddingEnd, paddingBottom);
    }

    public final void n() {
        ad adVar = this.s;
        int visibility = adVar.getVisibility();
        int i = (this.r == null || this.t) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        adVar.setVisibility(i);
        this.c.q();
    }
}
