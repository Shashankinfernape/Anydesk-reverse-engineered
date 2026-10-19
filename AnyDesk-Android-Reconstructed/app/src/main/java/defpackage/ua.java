package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.anydesk.anydeskandroid.R;

/* JADX INFO: loaded from: classes.dex */
public final class ua extends CheckedTextView implements ia1 {
    public final va c;
    public final m7 d;
    public final wc e;
    public wb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        ea1.a(context);
        w91.a(getContext(), this);
        wc wcVar = new wc(this);
        this.e = wcVar;
        wcVar.f(attributeSet, R.attr.checkedTextViewStyle);
        wcVar.b();
        m7 m7Var = new m7(this);
        this.d = m7Var;
        m7Var.k(attributeSet, R.attr.checkedTextViewStyle);
        this.c = new va(this);
        Context context2 = getContext();
        int[] iArr = yv0.l;
        y6 y6VarC = y6.C(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) y6VarC.e;
        oe1.m(this, getContext(), iArr, attributeSet, (TypedArray) y6VarC.e, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(ec1.r(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(ec1.r(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(ec1.r(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(y6VarC.s(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(av.b(typedArray.getInt(3, -1), null));
            }
            y6VarC.F();
            getEmojiTextViewHelper().a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            y6VarC.F();
            throw th;
        }
    }

    private wb getEmojiTextViewHelper() {
        if (this.f == null) {
            this.f = new wb(this);
        }
        return this.f;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        wc wcVar = this.e;
        if (wcVar != null) {
            wcVar.b();
        }
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.a();
        }
        va vaVar = this.c;
        if (vaVar != null) {
            vaVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return nd0.X(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        va vaVar = this.c;
        if (vaVar != null) {
            return vaVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        r71.C(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        va vaVar = this.c;
        if (vaVar != null) {
            if (vaVar.e) {
                vaVar.e = false;
            } else {
                vaVar.e = true;
                vaVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        wc wcVar = this.e;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        wc wcVar = this.e;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(nd0.Y(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().c(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        va vaVar = this.c;
        if (vaVar != null) {
            vaVar.a = colorStateList;
            vaVar.c = true;
            vaVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        va vaVar = this.c;
        if (vaVar != null) {
            vaVar.b = mode;
            vaVar.d = true;
            vaVar.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        wc wcVar = this.e;
        if (wcVar != null) {
            wcVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(ec1.r(getContext(), i));
    }
}
