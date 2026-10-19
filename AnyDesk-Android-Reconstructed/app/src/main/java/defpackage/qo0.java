package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.internal.NavigationMenuItemView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qo0 extends iw0 {
    public final ArrayList d = new ArrayList();
    public vk0 e;
    public boolean f;
    public final /* synthetic */ yo0 g;

    public qo0(yo0 yo0Var) {
        this.g = yo0Var;
        i();
    }

    @Override // defpackage.iw0
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.iw0
    public final long b(int i) {
        return i;
    }

    @Override // defpackage.iw0
    public final int c(int i) {
        so0 so0Var = (so0) this.d.get(i);
        if (so0Var instanceof to0) {
            return 2;
        }
        if (so0Var instanceof ro0) {
            return 3;
        }
        if (so0Var instanceof uo0) {
            return ((uo0) so0Var).a.hasSubMenu() ? 1 : 0;
        }
        throw new RuntimeException("Unknown item type.");
    }

    @Override // defpackage.iw0
    public final void e(hx0 hx0Var, int i) {
        View view = ((xo0) hx0Var).a;
        int iC = c(i);
        ArrayList arrayList = this.d;
        yo0 yo0Var = this.g;
        if (iC != 0) {
            if (iC != 1) {
                if (iC != 2) {
                    return;
                }
                to0 to0Var = (to0) arrayList.get(i);
                view.setPadding(yo0Var.u, to0Var.a, yo0Var.v, to0Var.b);
                return;
            }
            TextView textView = (TextView) view;
            textView.setText(((uo0) arrayList.get(i)).a.e);
            nd0.O(textView, yo0Var.i);
            textView.setPadding(yo0Var.w, textView.getPaddingTop(), yo0Var.x, textView.getPaddingBottom());
            ColorStateList colorStateList = yo0Var.j;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            oe1.n(textView, new po0(this, i, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
        navigationMenuItemView.setIconTintList(yo0Var.n);
        navigationMenuItemView.setTextAppearance(yo0Var.k);
        ColorStateList colorStateList2 = yo0Var.m;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable = yo0Var.o;
        Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
        WeakHashMap weakHashMap = oe1.a;
        navigationMenuItemView.setBackground(drawableNewDrawable);
        RippleDrawable rippleDrawable = yo0Var.p;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        uo0 uo0Var = (uo0) arrayList.get(i);
        navigationMenuItemView.setNeedsEmptyIcon(uo0Var.b);
        int i2 = yo0Var.q;
        int i3 = yo0Var.r;
        navigationMenuItemView.setPadding(i2, i3, i2, i3);
        navigationMenuItemView.setIconPadding(yo0Var.s);
        if (yo0Var.y) {
            navigationMenuItemView.setIconSize(yo0Var.t);
        }
        navigationMenuItemView.setMaxLines(yo0Var.A);
        vk0 vk0Var = uo0Var.a;
        navigationMenuItemView.A = yo0Var.l;
        navigationMenuItemView.c(vk0Var);
        oe1.n(navigationMenuItemView, new po0(this, i, false));
    }

    @Override // defpackage.iw0
    public final hx0 f(ViewGroup viewGroup, int i) {
        yo0 yo0Var = this.g;
        if (i == 0) {
            LayoutInflater layoutInflater = yo0Var.h;
            b bVar = yo0Var.E;
            View viewInflate = layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false);
            wo0 wo0Var = new wo0(viewInflate);
            viewInflate.setOnClickListener(bVar);
            return wo0Var;
        }
        if (i == 1) {
            return new oo0(yo0Var.h.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
        if (i == 2) {
            return new oo0(yo0Var.h.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new oo0(yo0Var.d);
    }

    @Override // defpackage.iw0
    public final void g(hx0 hx0Var) {
        xo0 xo0Var = (xo0) hx0Var;
        if (xo0Var instanceof wo0) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) xo0Var.a;
            FrameLayout frameLayout = navigationMenuItemView.C;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            navigationMenuItemView.B.setCompoundDrawables(null, null, null, null);
        }
    }

    public final void i() {
        if (this.f) {
            return;
        }
        this.f = true;
        ArrayList arrayList = this.d;
        arrayList.clear();
        arrayList.add(new ro0());
        yo0 yo0Var = this.g;
        int size = yo0Var.e.l().size();
        boolean z = false;
        int i = -1;
        int i2 = 0;
        boolean z2 = false;
        int size2 = 0;
        while (i2 < size) {
            vk0 vk0Var = (vk0) yo0Var.e.l().get(i2);
            if (vk0Var.isChecked()) {
                j(vk0Var);
            }
            if (vk0Var.isCheckable()) {
                vk0Var.f(z);
            }
            if (vk0Var.hasSubMenu()) {
                q71 q71Var = vk0Var.o;
                if (q71Var.hasVisibleItems()) {
                    if (i2 != 0) {
                        arrayList.add(new to0(yo0Var.C, z ? 1 : 0));
                    }
                    arrayList.add(new uo0(vk0Var));
                    int size3 = q71Var.f.size();
                    int i3 = 0;
                    boolean z3 = false;
                    while (i3 < size3) {
                        vk0 vk0Var2 = (vk0) q71Var.getItem(i3);
                        if (vk0Var2.isVisible()) {
                            if (!z3 && vk0Var2.getIcon() != null) {
                                z3 = true;
                            }
                            if (vk0Var2.isCheckable()) {
                                vk0Var2.f(z);
                            }
                            if (vk0Var.isChecked()) {
                                j(vk0Var);
                            }
                            arrayList.add(new uo0(vk0Var2));
                        }
                        i3++;
                        z = false;
                    }
                    if (z3) {
                        int size4 = arrayList.size();
                        for (int size5 = arrayList.size(); size5 < size4; size5++) {
                            ((uo0) arrayList.get(size5)).b = true;
                        }
                    }
                }
            } else {
                int i4 = vk0Var.b;
                if (i4 != i) {
                    size2 = arrayList.size();
                    z2 = vk0Var.getIcon() != null;
                    if (i2 != 0) {
                        size2++;
                        int i5 = yo0Var.C;
                        arrayList.add(new to0(i5, i5));
                    }
                } else {
                    if (!z2 && vk0Var.getIcon() != null) {
                        int size6 = arrayList.size();
                        for (int i6 = size2; i6 < size6; i6++) {
                            ((uo0) arrayList.get(i6)).b = true;
                        }
                        z2 = true;
                    }
                    uo0 uo0Var = new uo0(vk0Var);
                    uo0Var.b = z2;
                    arrayList.add(uo0Var);
                    i = i4;
                }
                uo0 uo0Var2 = new uo0(vk0Var);
                uo0Var2.b = z2;
                arrayList.add(uo0Var2);
                i = i4;
            }
            i2++;
            z = false;
        }
        this.f = false;
    }

    public final void j(vk0 vk0Var) {
        if (this.e == vk0Var || !vk0Var.isCheckable()) {
            return;
        }
        vk0 vk0Var2 = this.e;
        if (vk0Var2 != null) {
            vk0Var2.setChecked(false);
        }
        this.e = vk0Var;
        vk0Var.setChecked(true);
    }
}
