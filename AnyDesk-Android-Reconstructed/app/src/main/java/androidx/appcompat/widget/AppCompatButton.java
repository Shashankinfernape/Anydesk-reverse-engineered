package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.anydesk.anydeskandroid.R;
import defpackage.bu0;
import defpackage.ea1;
import defpackage.fd;
import defpackage.ia1;
import defpackage.kf1;
import defpackage.m7;
import defpackage.nd0;
import defpackage.w91;
import defpackage.wb;
import defpackage.wc;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements ia1 {
    public final m7 c;
    public final wc d;
    public wb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ea1.a(context);
        w91.a(getContext(), this);
        m7 m7Var = new m7(this);
        this.c = m7Var;
        m7Var.k(attributeSet, i);
        wc wcVar = new wc(this);
        this.d = wcVar;
        wcVar.f(attributeSet, i);
        wcVar.b();
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private wb getEmojiTextViewHelper() {
        if (this.e == null) {
            this.e = new wb(this);
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.a();
        }
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (kf1.c) {
            return super.getAutoSizeMaxTextSize();
        }
        wc wcVar = this.d;
        if (wcVar != null) {
            return Math.round(wcVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (kf1.c) {
            return super.getAutoSizeMinTextSize();
        }
        wc wcVar = this.d;
        if (wcVar != null) {
            return Math.round(wcVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (kf1.c) {
            return super.getAutoSizeStepGranularity();
        }
        wc wcVar = this.d;
        if (wcVar != null) {
            return Math.round(wcVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (kf1.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        wc wcVar = this.d;
        return wcVar != null ? wcVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (kf1.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        wc wcVar = this.d;
        if (wcVar != null) {
            return wcVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return nd0.X(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        m7 m7Var = this.c;
        if (m7Var != null) {
            return m7Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m7 m7Var = this.c;
        if (m7Var != null) {
            return m7Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.d.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.d.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        wc wcVar = this.d;
        if (wcVar == null || kf1.c) {
            return;
        }
        wcVar.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        wc wcVar = this.d;
        if (wcVar != null) {
            fd fdVar = wcVar.i;
            if (kf1.c || !fdVar.f()) {
                return;
            }
            fdVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (kf1.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (kf1.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (kf1.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.n(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(nd0.Y(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((bu0) getEmojiTextViewHelper().b.d).q(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.t(mode);
        }
    }

    @Override // defpackage.ia1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        wc wcVar = this.d;
        wcVar.l(colorStateList);
        wcVar.b();
    }

    @Override // defpackage.ia1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        wc wcVar = this.d;
        wcVar.m(mode);
        wcVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = kf1.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        wc wcVar = this.d;
        if (wcVar != null) {
            fd fdVar = wcVar.i;
            if (z || fdVar.f()) {
                return;
            }
            fdVar.g(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(Context context) {
        this(context, null);
    }
}
