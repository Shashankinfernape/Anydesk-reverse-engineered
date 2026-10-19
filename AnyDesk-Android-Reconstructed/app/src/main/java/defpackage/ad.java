package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class ad extends TextView implements ia1 {
    public final m7 c;
    public final wc d;
    public final bc e;
    public wb f;
    public boolean g;
    public af1 h;
    public Future i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ea1.a(context);
        this.g = false;
        this.h = null;
        w91.a(getContext(), this);
        m7 m7Var = new m7(this);
        this.c = m7Var;
        m7Var.k(attributeSet, i);
        wc wcVar = new wc(this);
        this.d = wcVar;
        wcVar.f(attributeSet, i);
        wcVar.b();
        bc bcVar = new bc(9, false);
        bcVar.d = this;
        this.e = bcVar;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    private wb getEmojiTextViewHelper() {
        if (this.f == null) {
            this.f = new wb(this);
        }
        return this.f;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public xc getSuperCaller() {
        if (this.h == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.h = new zc(this);
            } else if (i >= 28) {
                this.h = new yc(this);
            } else if (i >= 26) {
                this.h = new af1(20, this);
            }
        }
        return this.h;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.i;
        if (future != null) {
            try {
                this.i = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                nd0.n(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        bc bcVar;
        if (Build.VERSION.SDK_INT >= 28 || (bcVar = this.e) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) bcVar.e;
        return textClassifier == null ? qc.a((TextView) bcVar.d) : textClassifier;
    }

    public xu0 getTextMetricsParamsCompat() {
        return nd0.n(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.d.getClass();
        wc.h(editorInfo, inputConnectionOnCreateInputConnection, this);
        r71.C(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        wc wcVar = this.d;
        if (wcVar == null || kf1.c) {
            return;
        }
        wcVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.i;
        if (future != null) {
            try {
                this.i = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                nd0.n(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
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

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? ec1.r(context, i) : null, i2 != 0 ? ec1.r(context, i2) : null, i3 != 0 ? ec1.r(context, i3) : null, i4 != 0 ? ec1.r(context, i4) : null);
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? ec1.r(context, i) : null, i2 != 0 ? ec1.r(context, i2) : null, i3 != 0 ? ec1.r(context, i3) : null, i4 != 0 ? ec1.r(context, i4) : null);
        wc wcVar = this.d;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((bu0) getEmojiTextViewHelper().b.d).q(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().q(i);
        } else {
            nd0.G(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i);
        } else {
            nd0.J(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().s(i, f);
        } else if (i2 >= 34) {
            t3.h(this, i, f);
        } else {
            nd0.L(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(yu0 yu0Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        nd0.n(this);
        throw null;
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
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        bc bcVar;
        if (Build.VERSION.SDK_INT >= 28 || (bcVar = this.e) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            bcVar.e = textClassifier;
        }
    }

    public void setTextFuture(Future<yu0> future) {
        this.i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(xu0 xu0Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = xu0Var.b;
        TextPaint textPaint = xu0Var.a;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        if (Build.VERSION.SDK_INT >= 23) {
            getPaint().set(textPaint);
            nd0.D(this, xu0Var.c);
            nd0.H(this, xu0Var.d);
        } else {
            float textScaleX = textPaint.getTextScaleX();
            getPaint().set(textPaint);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.g) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            ds dsVar = fc1.a;
            if (context == null) {
                id.q("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.g = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.g = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        nd0.L(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        wc wcVar = this.d;
        if (wcVar != null) {
            wcVar.b();
        }
    }

    public ad(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
