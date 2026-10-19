package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes.dex */
public class ta extends CheckBox implements ha1, ia1 {
    public final va c;
    public final m7 d;
    public final wc e;
    public wb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ea1.a(context);
        w91.a(getContext(), this);
        va vaVar = new va(this);
        this.c = vaVar;
        vaVar.c(attributeSet, i);
        m7 m7Var = new m7(this);
        this.d = m7Var;
        m7Var.k(attributeSet, i);
        wc wcVar = new wc(this);
        this.e = wcVar;
        wcVar.f(attributeSet, i);
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private wb getEmojiTextViewHelper() {
        if (this.f == null) {
            this.f = new wb(this);
        }
        return this.f;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.a();
        }
        wc wcVar = this.e;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        m7 m7Var = this.d;
        if (m7Var != null) {
            return m7Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        m7 m7Var = this.d;
        if (m7Var != null) {
            return m7Var.i();
        }
        return null;
    }

    @Override // defpackage.ha1
    public ColorStateList getSupportButtonTintList() {
        va vaVar = this.c;
        if (vaVar != null) {
            return vaVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        va vaVar = this.c;
        if (vaVar != null) {
            return vaVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.e.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.e.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().b(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.n(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        va vaVar = this.c;
        if (vaVar != null) {
            if (vaVar.e) {
                vaVar.e = false;
            } else {
                vaVar.e = true;
                vaVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        wc wcVar = this.e;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        wc wcVar = this.e;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((bu0) getEmojiTextViewHelper().b.d).q(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.t(mode);
        }
    }

    @Override // defpackage.ha1
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        va vaVar = this.c;
        if (vaVar != null) {
            vaVar.a = colorStateList;
            vaVar.c = true;
            vaVar.a();
        }
    }

    @Override // defpackage.ha1
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        va vaVar = this.c;
        if (vaVar != null) {
            vaVar.b = mode;
            vaVar.d = true;
            vaVar.a();
        }
    }

    @Override // defpackage.ia1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        wc wcVar = this.e;
        wcVar.l(colorStateList);
        wcVar.b();
    }

    @Override // defpackage.ia1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        wc wcVar = this.e;
        wcVar.m(mode);
        wcVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ec1.r(getContext(), i));
    }
}
