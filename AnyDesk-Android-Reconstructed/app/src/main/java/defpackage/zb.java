package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public final class zb extends MultiAutoCompleteTextView implements ia1 {
    public static final int[] f = {R.attr.popupBackground};
    public final m7 c;
    public final wc d;
    public final bc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.anydesk.anydeskandroid.R.attr.autoCompleteTextViewStyle);
        ea1.a(context);
        w91.a(getContext(), this);
        y6 y6VarC = y6.C(getContext(), attributeSet, f, com.anydesk.anydeskandroid.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) y6VarC.e).hasValue(0)) {
            setDropDownBackgroundDrawable(y6VarC.t(0));
        }
        y6VarC.F();
        m7 m7Var = new m7(this);
        this.c = m7Var;
        m7Var.k(attributeSet, com.anydesk.anydeskandroid.R.attr.autoCompleteTextViewStyle);
        wc wcVar = new wc(this);
        this.d = wcVar;
        wcVar.f(attributeSet, com.anydesk.anydeskandroid.R.attr.autoCompleteTextViewStyle);
        wcVar.b();
        bc bcVar = new bc(this, 8);
        this.e = bcVar;
        bcVar.Z(attributeSet, com.anydesk.anydeskandroid.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerX = bcVar.X(keyListener);
        if (keyListenerX == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerX);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        r71.C(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.e.a0(inputConnectionOnCreateInputConnection, editorInfo);
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
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(ec1.r(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.h0(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.X(keyListener));
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
}
