package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class pc extends Spinner {
    public static final int[] k = {R.attr.spinnerMode};
    public final m7 c;
    public final Context d;
    public final gc e;
    public SpinnerAdapter f;
    public final boolean g;
    public final oc h;
    public int i;
    public final Rect j;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public pc(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.anydesk.anydeskandroid.R.attr.spinnerStyle);
        this.j = new Rect();
        w91.a(getContext(), this);
        int[] iArr = yv0.v;
        y6 y6VarC = y6.C(context, attributeSet, iArr, com.anydesk.anydeskandroid.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) y6VarC.e;
        this.c = new m7(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.d = new qq(context, resourceId);
        } else {
            this.d = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k, com.anydesk.anydeskandroid.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i != 0) {
                        ic icVar = new ic(this);
                        this.h = icVar;
                        icVar.e = typedArray.getString(2);
                    } else if (i == 1) {
                        mc mcVar = new mc(this, this.d, attributeSet);
                        y6 y6VarC2 = y6.C(this.d, attributeSet, iArr, com.anydesk.anydeskandroid.R.attr.spinnerStyle);
                        this.i = ((TypedArray) y6VarC2.e).getLayoutDimension(3, -2);
                        mcVar.h(y6VarC2.t(1));
                        mcVar.F = typedArray.getString(2);
                        y6VarC2.F();
                        this.h = mcVar;
                        this.e = new gc(this, this, mcVar);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(com.anydesk.anydeskandroid.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    y6VarC.F();
                    this.g = true;
                    spinnerAdapter = this.f;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f = null;
                    }
                    this.c.k(attributeSet, com.anydesk.anydeskandroid.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            ic icVar2 = new ic(this);
            this.h = icVar2;
            icVar2.e = typedArray.getString(2);
        } else if (i == 1) {
            mc mcVar2 = new mc(this, this.d, attributeSet);
            y6 y6VarC3 = y6.C(this.d, attributeSet, iArr, com.anydesk.anydeskandroid.R.attr.spinnerStyle);
            this.i = ((TypedArray) y6VarC3.e).getLayoutDimension(3, -2);
            mcVar2.h(y6VarC3.t(1));
            mcVar2.F = typedArray.getString(2);
            y6VarC3.F();
            this.h = mcVar2;
            this.e = new gc(this, this, mcVar2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.anydesk.anydeskandroid.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        y6VarC.F();
        this.g = true;
        spinnerAdapter = this.f;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f = null;
        }
        this.c.k(attributeSet, com.anydesk.anydeskandroid.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.j;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        m7 m7Var = this.c;
        if (m7Var != null) {
            m7Var.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        oc ocVar = this.h;
        return ocVar != null ? ocVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        oc ocVar = this.h;
        return ocVar != null ? ocVar.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.h != null ? this.i : super.getDropDownWidth();
    }

    public final oc getInternalPopup() {
        return this.h;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        oc ocVar = this.h;
        return ocVar != null ? ocVar.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.d;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        oc ocVar = this.h;
        return ocVar != null ? ocVar.p() : super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        oc ocVar = this.h;
        if (ocVar == null || !ocVar.b()) {
            return;
        }
        ocVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.h == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        nc ncVar = (nc) parcelable;
        super.onRestoreInstanceState(ncVar.getSuperState());
        if (!ncVar.c || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b3(1, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        nc ncVar = new nc(super.onSaveInstanceState());
        oc ocVar = this.h;
        ncVar.c = ocVar != null && ocVar.b();
        return ncVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gc gcVar = this.e;
        if (gcVar == null || !gcVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        oc ocVar = this.h;
        if (ocVar == null) {
            return super.performClick();
        }
        if (ocVar.b()) {
            return true;
        }
        ocVar.n(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.g) {
            this.f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        oc ocVar = this.h;
        if (ocVar != null) {
            Context context = this.d;
            if (context == null) {
                context = getContext();
            }
            ocVar.q(new jc(spinnerAdapter, context.getTheme()));
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

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        oc ocVar = this.h;
        if (ocVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            ocVar.l(i);
            ocVar.m(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        oc ocVar = this.h;
        if (ocVar != null) {
            ocVar.k(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.h != null) {
            this.i = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        oc ocVar = this.h;
        if (ocVar != null) {
            ocVar.h(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(ec1.r(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        oc ocVar = this.h;
        if (ocVar != null) {
            ocVar.f(charSequence);
        } else {
            super.setPrompt(charSequence);
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
}
