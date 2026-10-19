package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class qj0 extends ra {
    public final kg0 g;
    public final AccessibilityManager h;
    public final Rect i;
    public final int j;
    public final float k;
    public ColorStateList l;
    public int m;
    public ColorStateList n;

    public qj0(Context context, AttributeSet attributeSet) {
        super(lk0.N(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.i = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayE = th1.E(context2, attributeSet, ov0.q, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayE.hasValue(0) && typedArrayE.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.j = typedArrayE.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.k = typedArrayE.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int i = 2;
        if (typedArrayE.hasValue(2)) {
            this.l = ColorStateList.valueOf(typedArrayE.getColor(2, 0));
        }
        this.m = typedArrayE.getColor(4, 0);
        this.n = ec1.n(context2, typedArrayE, 5);
        this.h = (AccessibilityManager) context2.getSystemService("accessibility");
        kg0 kg0Var = new kg0(context2, null, R.attr.listPopupWindowStyle, 0);
        this.g = kg0Var;
        kg0Var.A = true;
        ac acVar = kg0Var.B;
        acVar.setFocusable(true);
        kg0Var.q = this;
        acVar.setInputMethodMode(2);
        kg0Var.q(getAdapter());
        kg0Var.r = new kc(i, this);
        if (typedArrayE.hasValue(6)) {
            setSimpleItems(typedArrayE.getResourceId(6, 0));
        }
        typedArrayE.recycle();
    }

    public static void a(qj0 qj0Var, Object obj) {
        qj0Var.setText(qj0Var.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.h;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.g.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.l;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.G) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.k;
    }

    public int getSimpleItemSelectedColor() {
        return this.m;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.n;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.G && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                kg0 kg0Var = this.g;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !kg0Var.B.isShowing() ? -1 : kg0Var.e.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = kg0Var.B.getBackground();
                if (background != null) {
                    Rect rect = this.i;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.g.q(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        kg0 kg0Var = this.g;
        if (kg0Var != null) {
            kg0Var.h(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof hk0) {
            ((hk0) dropDownBackground).m(this.l);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.g.s = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.m = i;
        if (getAdapter() instanceof pj0) {
            ((pj0) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.n = colorStateList;
        if (getAdapter() instanceof pj0) {
            ((pj0) getAdapter()).a();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new pj0(this, getContext(), this.j, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.g.d();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
