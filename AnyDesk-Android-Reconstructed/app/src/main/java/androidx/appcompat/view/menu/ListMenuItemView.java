package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import defpackage.kl0;
import defpackage.rk0;
import defpackage.vk0;
import defpackage.y6;
import defpackage.yv0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements kl0, AbsListView.SelectionBoundsAdjuster {
    public vk0 c;
    public ImageView d;
    public RadioButton e;
    public TextView f;
    public CheckBox g;
    public TextView h;
    public ImageView i;
    public ImageView j;
    public LinearLayout k;
    public final Drawable l;
    public final int m;
    public final Context n;
    public boolean o;
    public final Drawable p;
    public final boolean q;
    public LayoutInflater r;
    public boolean s;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        y6 y6VarC = y6.C(getContext(), attributeSet, yv0.s, i);
        this.l = y6VarC.t(5);
        TypedArray typedArray = (TypedArray) y6VarC.e;
        this.m = typedArray.getResourceId(1, -1);
        this.o = typedArray.getBoolean(7, false);
        this.n = context;
        this.p = y6VarC.t(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, com.anydesk.anydeskandroid.R.attr.dropDownListViewStyle, 0);
        this.q = typedArrayObtainStyledAttributes.hasValue(0);
        y6VarC.F();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.r == null) {
            this.r = LayoutInflater.from(getContext());
        }
        return this.r;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.j;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.j.getLayoutParams();
        rect.top = this.j.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    @Override // defpackage.kl0
    public final void c(vk0 vk0Var) {
        boolean z;
        int i;
        String string;
        this.c = vk0Var;
        boolean zIsVisible = vk0Var.isVisible();
        rk0 rk0Var = vk0Var.n;
        setVisibility(zIsVisible ? 0 : 8);
        setTitle(vk0Var.e);
        setCheckable(vk0Var.isCheckable());
        if (rk0Var.o()) {
            if ((rk0Var.n() ? vk0Var.j : vk0Var.h) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        rk0Var.n();
        if (z) {
            vk0 vk0Var2 = this.c;
            rk0 rk0Var2 = vk0Var2.n;
            if (rk0Var2.o()) {
                i = (rk0Var2.n() ? vk0Var2.j : vk0Var2.h) == 0 ? 8 : 0;
            }
        }
        if (i == 0) {
            TextView textView = this.h;
            vk0 vk0Var3 = this.c;
            rk0 rk0Var3 = vk0Var3.n;
            Context context = rk0Var3.a;
            char c = rk0Var3.n() ? vk0Var3.j : vk0Var3.h;
            if (c == 0) {
                string = "";
            } else {
                Resources resources = context.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    sb.append(resources.getString(com.anydesk.anydeskandroid.R.string.abc_prepend_shortcut_label));
                }
                int i2 = rk0Var3.n() ? vk0Var3.k : vk0Var3.i;
                vk0.c(i2, 65536, resources.getString(com.anydesk.anydeskandroid.R.string.abc_menu_meta_shortcut_label), sb);
                vk0.c(i2, 4096, resources.getString(com.anydesk.anydeskandroid.R.string.abc_menu_ctrl_shortcut_label), sb);
                vk0.c(i2, 2, resources.getString(com.anydesk.anydeskandroid.R.string.abc_menu_alt_shortcut_label), sb);
                vk0.c(i2, 1, resources.getString(com.anydesk.anydeskandroid.R.string.abc_menu_shift_shortcut_label), sb);
                vk0.c(i2, 4, resources.getString(com.anydesk.anydeskandroid.R.string.abc_menu_sym_shortcut_label), sb);
                vk0.c(i2, 8, resources.getString(com.anydesk.anydeskandroid.R.string.abc_menu_function_shortcut_label), sb);
                if (c == '\b') {
                    sb.append(resources.getString(com.anydesk.anydeskandroid.R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(com.anydesk.anydeskandroid.R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(com.anydesk.anydeskandroid.R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.h.getVisibility() != i) {
            this.h.setVisibility(i);
        }
        setIcon(vk0Var.getIcon());
        setEnabled(vk0Var.isEnabled());
        setSubMenuArrowVisible(vk0Var.hasSubMenu());
        setContentDescription(vk0Var.q);
    }

    @Override // defpackage.kl0
    public vk0 getItemData() {
        return this.c;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.l);
        TextView textView = (TextView) findViewById(com.anydesk.anydeskandroid.R.id.title);
        this.f = textView;
        int i = this.m;
        if (i != -1) {
            textView.setTextAppearance(this.n, i);
        }
        this.h = (TextView) findViewById(com.anydesk.anydeskandroid.R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(com.anydesk.anydeskandroid.R.id.submenuarrow);
        this.i = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.p);
        }
        this.j = (ImageView) findViewById(com.anydesk.anydeskandroid.R.id.group_divider);
        this.k = (LinearLayout) findViewById(com.anydesk.anydeskandroid.R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.d != null && this.o) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.e == null && this.g == null) {
            return;
        }
        if ((this.c.x & 4) != 0) {
            if (this.e == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.anydesk.anydeskandroid.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.e = radioButton;
                LinearLayout linearLayout = this.k;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.e;
            view = this.g;
        } else {
            if (this.g == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.anydesk.anydeskandroid.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.g = checkBox;
                LinearLayout linearLayout2 = this.k;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.g;
            view = this.e;
        }
        if (z) {
            compoundButton.setChecked(this.c.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.g;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.e;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.c.x & 4) != 0) {
            if (this.e == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(com.anydesk.anydeskandroid.R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.e = radioButton;
                LinearLayout linearLayout = this.k;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.e;
        } else {
            if (this.g == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(com.anydesk.anydeskandroid.R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.g = checkBox;
                LinearLayout linearLayout2 = this.k;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.g;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.s = z;
        this.o = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setVisibility((this.q || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        rk0 rk0Var = this.c.n;
        boolean z = this.s;
        if (z || this.o) {
            ImageView imageView = this.d;
            if (imageView == null && drawable == null && !this.o) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(com.anydesk.anydeskandroid.R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.d = imageView2;
                LinearLayout linearLayout = this.k;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.o) {
                this.d.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.d;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f;
        if (charSequence == null) {
            if (textView.getVisibility() != 8) {
                this.f.setVisibility(8);
            }
        } else {
            textView.setText(charSequence);
            if (this.f.getVisibility() != 0) {
                this.f.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.anydesk.anydeskandroid.R.attr.listMenuViewStyle);
    }
}
