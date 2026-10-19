package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.anydesk.anydeskandroid.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w5 implements il0 {
    public int A;
    public final Context c;
    public Context d;
    public rk0 e;
    public final LayoutInflater f;
    public hl0 g;
    public ll0 j;
    public int k;
    public t5 l;
    public Drawable m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public boolean t;
    public r5 v;
    public r5 w;
    public d3 x;
    public s5 y;
    public final int h = R.layout.abc_action_menu_layout;
    public final int i = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray u = new SparseBooleanArray();
    public final af1 z = new af1(13, this);

    public w5(Context context) {
        this.c = context;
        this.f = LayoutInflater.from(context);
    }

    @Override // defpackage.il0
    public final void a(rk0 rk0Var, boolean z) {
        d();
        r5 r5Var = this.w;
        if (r5Var != null && r5Var.b()) {
            r5Var.i.dismiss();
        }
        hl0 hl0Var = this.g;
        if (hl0Var != null) {
            hl0Var.a(rk0Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b(vk0 vk0Var, View view, ViewGroup viewGroup) {
        View actionView = vk0Var.getActionView();
        if (actionView == null || vk0Var.e()) {
            kl0 kl0Var = view instanceof kl0 ? (kl0) view : (kl0) this.f.inflate(this.i, viewGroup, false);
            kl0Var.c(vk0Var);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) kl0Var;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.j);
            if (this.y == null) {
                this.y = new s5(this);
            }
            actionMenuItemView.setPopupCallback(this.y);
            actionView = (View) kl0Var;
        }
        actionView.setVisibility(vk0Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof y5)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.il0
    public final boolean c(vk0 vk0Var) {
        return false;
    }

    public final boolean d() {
        Object obj;
        d3 d3Var = this.x;
        if (d3Var != null && (obj = this.j) != null) {
            ((View) obj).removeCallbacks(d3Var);
            this.x = null;
            return true;
        }
        r5 r5Var = this.v;
        if (r5Var == null) {
            return false;
        }
        if (r5Var.b()) {
            r5Var.i.dismiss();
        }
        return true;
    }

    @Override // defpackage.il0
    public final void e(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof v5) && (i = ((v5) parcelable).c) > 0 && (menuItemFindItem = this.e.findItem(i)) != null) {
            k((q71) menuItemFindItem.getSubMenu());
        }
    }

    @Override // defpackage.il0
    public final void f(hl0 hl0Var) {
        throw null;
    }

    @Override // defpackage.il0
    public final boolean g(vk0 vk0Var) {
        return false;
    }

    @Override // defpackage.il0
    public final int getId() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.il0
    public final void h() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.j;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            rk0 rk0Var = this.e;
            if (rk0Var != null) {
                rk0Var.i();
                ArrayList arrayListL = this.e.l();
                int size = arrayListL.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    vk0 vk0Var = (vk0) arrayListL.get(i2);
                    if ((vk0Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        vk0 itemData = childAt instanceof kl0 ? ((kl0) childAt).getItemData() : null;
                        View viewB = b(vk0Var, childAt, viewGroup);
                        if (vk0Var != itemData) {
                            viewB.setPressed(false);
                            viewB.jumpDrawablesToCurrentState();
                        }
                        if (viewB != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewB.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewB);
                            }
                            ((ViewGroup) this.j).addView(viewB, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.l) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.j).requestLayout();
        rk0 rk0Var2 = this.e;
        if (rk0Var2 != null) {
            rk0Var2.i();
            ArrayList arrayList2 = rk0Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                wk0 wk0Var = ((vk0) arrayList2.get(i3)).A;
            }
        }
        rk0 rk0Var3 = this.e;
        if (rk0Var3 != null) {
            rk0Var3.i();
            arrayList = rk0Var3.j;
        }
        if (this.o && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((vk0) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        t5 t5Var = this.l;
        if (z) {
            if (t5Var == null) {
                this.l = new t5(this, this.c);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.l.getParent();
            if (viewGroup3 != this.j) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.j;
                t5 t5Var2 = this.l;
                actionMenuView.getClass();
                y5 y5VarJ = ActionMenuView.j();
                y5VarJ.a = true;
                actionMenuView.addView(t5Var2, y5VarJ);
            }
        } else if (t5Var != null) {
            Object parent = t5Var.getParent();
            Object obj = this.j;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.l);
            }
        }
        ((ActionMenuView) this.j).setOverflowReserved(this.o);
    }

    public final boolean i() {
        r5 r5Var = this.v;
        return r5Var != null && r5Var.b();
    }

    @Override // defpackage.il0
    public final void j(Context context, rk0 rk0Var) {
        this.d = context;
        LayoutInflater.from(context);
        this.e = rk0Var;
        Resources resources = context.getResources();
        if (!this.p) {
            this.o = true;
        }
        int i = 2;
        this.q = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.s = i;
        int measuredWidth = this.q;
        if (this.o) {
            if (this.l == null) {
                t5 t5Var = new t5(this, this.c);
                this.l = t5Var;
                if (this.n) {
                    t5Var.setImageDrawable(this.m);
                    this.m = null;
                    this.n = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.l.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.l.getMeasuredWidth();
        } else {
            this.l = null;
        }
        this.r = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.il0
    public final boolean k(q71 q71Var) {
        boolean z;
        if (q71Var.hasVisibleItems()) {
            q71 q71Var2 = q71Var;
            while (true) {
                rk0 rk0Var = q71Var2.z;
                if (rk0Var == this.e) {
                    break;
                }
                q71Var2 = (q71) rk0Var;
            }
            vk0 vk0Var = q71Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.j;
            View view = null;
            view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof kl0) && ((kl0) childAt).getItemData() == vk0Var) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                this.A = q71Var.A.a;
                int size = q71Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = q71Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                r5 r5Var = new r5(this, this.d, q71Var, view);
                this.w = r5Var;
                r5Var.g = z;
                al0 al0Var = r5Var.i;
                if (al0Var != null) {
                    al0Var.q(z);
                }
                r5 r5Var2 = this.w;
                if (!r5Var2.b()) {
                    if (r5Var2.e == null) {
                        nh0.j("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    r5Var2.d(0, 0, false, false);
                }
                hl0 hl0Var = this.g;
                if (hl0Var != null) {
                    hl0Var.v(q71Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.il0
    public final boolean l() {
        ArrayList arrayListL;
        int size;
        int i;
        boolean z;
        w5 w5Var = this;
        rk0 rk0Var = w5Var.e;
        if (rk0Var != null) {
            arrayListL = rk0Var.l();
            size = arrayListL.size();
        } else {
            arrayListL = null;
            size = 0;
        }
        int i2 = w5Var.s;
        int i3 = w5Var.r;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) w5Var.j;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            vk0 vk0Var = (vk0) arrayListL.get(i4);
            int i7 = vk0Var.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (w5Var.t && vk0Var.C) {
                i2 = 0;
            }
            i4++;
        }
        if (w5Var.o && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = w5Var.u;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            vk0 vk0Var2 = (vk0) arrayListL.get(i9);
            int i11 = vk0Var2.y;
            boolean z3 = (i11 & 2) == i;
            int i12 = vk0Var2.b;
            if (z3) {
                View viewB = w5Var.b(vk0Var2, null, viewGroup);
                viewB.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewB.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                vk0Var2.g(z);
            } else {
                if ((i11 & 1) == z) {
                    boolean z4 = sparseBooleanArray.get(i12);
                    boolean z5 = (i8 > 0 || z4) && i3 > 0;
                    if (z5) {
                        View viewB2 = w5Var.b(vk0Var2, null, viewGroup);
                        viewB2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewB2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z5 &= i3 + i10 > 0;
                    }
                    if (z5 && i12 != 0) {
                        sparseBooleanArray.put(i12, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i12, false);
                        for (int i13 = 0; i13 < i9; i13++) {
                            vk0 vk0Var3 = (vk0) arrayListL.get(i13);
                            if (vk0Var3.b == i12) {
                                if ((vk0Var3.x & 32) == 32) {
                                    i8++;
                                }
                                vk0Var3.g(false);
                            }
                        }
                    }
                    if (z5) {
                        i8--;
                    }
                    vk0Var2.g(z5);
                } else {
                    vk0Var2.g(false);
                }
                i9++;
                i = 2;
                w5Var = this;
                z = true;
            }
            i9++;
            i = 2;
            w5Var = this;
            z = true;
        }
        return true;
    }

    @Override // defpackage.il0
    public final Parcelable m() {
        v5 v5Var = new v5();
        v5Var.c = this.A;
        return v5Var;
    }

    public final boolean n() {
        rk0 rk0Var;
        if (!this.o || i() || (rk0Var = this.e) == null || this.j == null || this.x != null) {
            return false;
        }
        rk0Var.i();
        if (rk0Var.j.isEmpty()) {
            return false;
        }
        d3 d3Var = new d3(this, 2, new r5(this, this.d, this.e, this.l));
        this.x = d3Var;
        ((View) this.j).post(d3Var);
        return true;
    }
}
