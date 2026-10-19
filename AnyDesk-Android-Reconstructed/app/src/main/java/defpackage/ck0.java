package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.R;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class ck0 extends ta {
    public static final int[] A = {R.attr.state_indeterminate};
    public static final int[] B = {R.attr.state_error};
    public static final int[][] C = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public static final int D = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public final LinkedHashSet g;
    public final LinkedHashSet h;
    public ColorStateList i;
    public boolean j;
    public boolean k;
    public boolean l;
    public CharSequence m;
    public Drawable n;
    public Drawable o;
    public boolean p;
    public ColorStateList q;
    public ColorStateList r;
    public PorterDuff.Mode s;
    public int t;
    public int[] u;
    public boolean v;
    public CharSequence w;
    public CompoundButton.OnCheckedChangeListener x;
    public final u8 y;
    public final cg z;

    public ck0(Context context, AttributeSet attributeSet) throws Throwable {
        u8 u8Var;
        int next;
        super(lk0.N(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.g = new LinkedHashSet();
        this.h = new LinkedHashSet();
        Context context2 = getContext();
        if (Build.VERSION.SDK_INT >= 24) {
            u8Var = new u8(context2, 0);
            Resources resources = context2.getResources();
            Resources.Theme theme = context2.getTheme();
            ThreadLocal threadLocal = my0.a;
            Drawable drawable = resources.getDrawable(R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
            u8Var.c = drawable;
            drawable.setCallback(u8Var.h);
            new t8(u8Var.c.getConstantState());
        } else {
            int i = u8.i;
            try {
                XmlResourceParser xml = context2.getResources().getXml(R.drawable.mtrl_checkbox_button_checked_unchecked);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                Resources resources2 = context2.getResources();
                Resources.Theme theme2 = context2.getTheme();
                u8 u8Var2 = new u8(context2, 0);
                u8Var2.inflate(resources2, xml, attributeSetAsAttributeSet, theme2);
                u8Var = u8Var2;
            } catch (IOException e) {
                Log.e("AnimatedVDCompat", "parser error", e);
                u8Var = null;
            } catch (XmlPullParserException e2) {
                Log.e("AnimatedVDCompat", "parser error", e2);
                u8Var = null;
            }
        }
        this.y = u8Var;
        this.z = new cg(this, 2);
        Context context3 = getContext();
        this.n = bu0.o(this);
        this.q = getSuperButtonTintList();
        setSupportButtonTintList(null);
        th1.b(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        int[] iArr = ov0.t;
        th1.e(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        y6 y6Var = new y6(context3, typedArrayObtainStyledAttributes);
        this.o = y6Var.t(2);
        if (this.n != null && bu0.z(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == D && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.n = ec1.r(context3, R.drawable.mtrl_checkbox_button);
                this.p = true;
                if (this.o == null) {
                    this.o = ec1.r(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.r = ec1.m(context3, y6Var, 3);
        this.s = ds.z(typedArrayObtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.j = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.k = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.l = typedArrayObtainStyledAttributes.getBoolean(9, false);
        this.m = typedArrayObtainStyledAttributes.getText(8);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            setCheckedState(typedArrayObtainStyledAttributes.getInt(7, 0));
        }
        y6Var.F();
        a();
    }

    private String getButtonStateDescription() {
        int i = this.t;
        if (i == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.i == null) {
            int iU = r71.u(this, R.attr.colorControlActivated);
            int iU2 = r71.u(this, R.attr.colorError);
            int iU3 = r71.u(this, R.attr.colorSurface);
            int iU4 = r71.u(this, R.attr.colorOnSurface);
            this.i = new ColorStateList(C, new int[]{r71.B(iU3, iU2, 1.0f), r71.B(iU3, iU, 1.0f), r71.B(iU3, iU4, 0.54f), r71.B(iU3, iU4, 0.38f), r71.B(iU3, iU4, 0.38f)});
        }
        return this.i;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.q;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        this.n = ld.c(this.n, this.q, getButtonTintMode());
        this.o = ld.c(this.o, this.r, this.s);
        if (this.p) {
            u8 u8Var = this.y;
            if (u8Var != null) {
                cg cgVar = this.z;
                u8Var.b(cgVar);
                u8Var.a(cgVar);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.n;
                if ((drawable instanceof AnimatedStateListDrawable) && u8Var != null) {
                    ((AnimatedStateListDrawable) drawable).addTransition(R.id.checked, R.id.unchecked, u8Var, false);
                    ((AnimatedStateListDrawable) this.n).addTransition(R.id.indeterminate, R.id.unchecked, u8Var, false);
                }
            }
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null && (colorStateList2 = this.q) != null) {
            drawable2.setTintList(colorStateList2);
        }
        Drawable drawable3 = this.o;
        if (drawable3 != null && (colorStateList = this.r) != null) {
            drawable3.setTintList(colorStateList);
        }
        super.setButtonDrawable(ld.a(this.n, this.o));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.n;
    }

    public Drawable getButtonIconDrawable() {
        return this.o;
    }

    public ColorStateList getButtonIconTintList() {
        return this.r;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.s;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.q;
    }

    public int getCheckedState() {
        return this.t;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.m;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j && this.q == null && this.r == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        if (this.l) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, B);
        }
        for (int i2 = 0; i2 < iArrOnCreateDrawableState.length; i2++) {
            int i3 = iArrOnCreateDrawableState[i2];
            if (i3 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i3 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i2] = 16842912;
            }
            this.u = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.u = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableO;
        if (!this.k || !TextUtils.isEmpty(getText()) || (drawableO = bu0.o(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableO.getIntrinsicWidth()) / 2) * (ds.v(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableO.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.l) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.m));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof bk0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bk0 bk0Var = (bk0) parcelable;
        super.onRestoreInstanceState(bk0Var.getSuperState());
        setCheckedState(bk0Var.c);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        bk0 bk0Var = new bk0(super.onSaveInstanceState());
        bk0Var.c = getCheckedState();
        return bk0Var;
    }

    @Override // defpackage.ta, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ec1.r(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.o = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(ec1.r(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.r == colorStateList) {
            return;
        }
        this.r = colorStateList;
        a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.s == mode) {
            return;
        }
        this.s = mode;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.q == colorStateList) {
            return;
        }
        this.q = colorStateList;
        a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.k = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i) {
            this.t = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && this.w == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.v) {
                return;
            }
            this.v = true;
            LinkedHashSet linkedHashSet = this.h;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    id.c();
                    return;
                }
            }
            if (this.t != 2 && (onCheckedChangeListener = this.x) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (i2 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.v = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.m = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.l == z) {
            return;
        }
        this.l = z;
        refreshDrawableState();
        Iterator it = this.g.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            id.c();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.x = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.w = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.j = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // defpackage.ta, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.n = drawable;
        this.p = false;
        a();
    }
}
