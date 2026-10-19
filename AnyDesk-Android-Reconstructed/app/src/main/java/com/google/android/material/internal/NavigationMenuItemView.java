package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.bu0;
import defpackage.il;
import defpackage.kl0;
import defpackage.my0;
import defpackage.nd0;
import defpackage.oe1;
import defpackage.pf0;
import defpackage.t30;
import defpackage.uj;
import defpackage.vk0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends t30 implements kl0 {
    public static final int[] I = {R.attr.state_checked};
    public boolean A;
    public final CheckedTextView B;
    public FrameLayout C;
    public vk0 D;
    public ColorStateList E;
    public boolean F;
    public Drawable G;
    public final il H;
    public int x;
    public boolean y;
    public boolean z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = true;
        il ilVar = new il(this, 2);
        this.H = ilVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.anydesk.anydeskandroid.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.anydesk.anydeskandroid.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.anydesk.anydeskandroid.R.id.design_menu_item_text);
        this.B = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        oe1.n(checkedTextView, ilVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.C == null) {
                this.C = (FrameLayout) ((ViewStub) findViewById(com.anydesk.anydeskandroid.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.C.removeAllViews();
            this.C.addView(view);
        }
    }

    @Override // defpackage.kl0
    public final void c(vk0 vk0Var) {
        StateListDrawable stateListDrawable;
        this.D = vk0Var;
        int i = vk0Var.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(vk0Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.anydesk.anydeskandroid.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(I, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = oe1.a;
            setBackground(stateListDrawable);
        }
        setCheckable(vk0Var.isCheckable());
        setChecked(vk0Var.isChecked());
        setEnabled(vk0Var.isEnabled());
        setTitle(vk0Var.e);
        setIcon(vk0Var.getIcon());
        setActionView(vk0Var.getActionView());
        setContentDescription(vk0Var.q);
        bu0.D(this, vk0Var.r);
        vk0 vk0Var2 = this.D;
        CharSequence charSequence = vk0Var2.e;
        CheckedTextView checkedTextView = this.B;
        if (charSequence == null && vk0Var2.getIcon() == null && this.D.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.C;
            if (frameLayout != null) {
                pf0 pf0Var = (pf0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) pf0Var).width = -1;
                this.C.setLayoutParams(pf0Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.C;
        if (frameLayout2 != null) {
            pf0 pf0Var2 = (pf0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) pf0Var2).width = -2;
            this.C.setLayoutParams(pf0Var2);
        }
    }

    @Override // defpackage.kl0
    public vk0 getItemData() {
        return this.D;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        vk0 vk0Var = this.D;
        if (vk0Var != null && vk0Var.isCheckable() && this.D.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, I);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.z != z) {
            this.z = z;
            this.H.h(this.B, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.B;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.A) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.F) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = uj.K(drawable).mutate();
                drawable.setTintList(this.E);
            }
            int i = this.x;
            drawable.setBounds(0, 0, i, i);
        } else if (this.y) {
            if (this.G == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = my0.a;
                Drawable drawable2 = resources.getDrawable(com.anydesk.anydeskandroid.R.drawable.navigation_empty_icon, theme);
                this.G = drawable2;
                if (drawable2 != null) {
                    int i2 = this.x;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.G;
        }
        this.B.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.B.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.x = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.E = colorStateList;
        this.F = colorStateList != null;
        vk0 vk0Var = this.D;
        if (vk0Var != null) {
            setIcon(vk0Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.B.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.y = z;
    }

    public void setTextAppearance(int i) {
        nd0.O(this.B, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.B.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }
}
