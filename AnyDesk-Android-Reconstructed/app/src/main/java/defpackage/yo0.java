package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.anydesk.anydeskandroid.R;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yo0 implements il0 {
    public int A;
    public int B;
    public int C;
    public NavigationMenuView c;
    public LinearLayout d;
    public rk0 e;
    public int f;
    public qo0 g;
    public LayoutInflater h;
    public ColorStateList j;
    public ColorStateList m;
    public ColorStateList n;
    public Drawable o;
    public RippleDrawable p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public int i = 0;
    public int k = 0;
    public boolean l = true;
    public boolean z = true;
    public int D = -1;
    public final b E = new b(19, this);

    @Override // defpackage.il0
    public final boolean c(vk0 vk0Var) {
        return false;
    }

    @Override // defpackage.il0
    public final void e(Parcelable parcelable) {
        vk0 vk0Var;
        View actionView;
        vt0 vt0Var;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.c.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                qo0 qo0Var = this.g;
                ArrayList arrayList = qo0Var.d;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    qo0Var.f = true;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        so0 so0Var = (so0) arrayList.get(i2);
                        if (so0Var instanceof uo0) {
                            vk0 vk0Var2 = ((uo0) so0Var).a;
                            if (vk0Var2.a == i) {
                                qo0Var.j(vk0Var2);
                                break;
                            }
                        }
                    }
                    qo0Var.f = false;
                    qo0Var.i();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        so0 so0Var2 = (so0) arrayList.get(i3);
                        if ((so0Var2 instanceof uo0) && (actionView = (vk0Var = ((uo0) so0Var2).a).getActionView()) != null && (vt0Var = (vt0) sparseParcelableArray2.get(vk0Var.a)) != null) {
                            actionView.restoreHierarchyState(vt0Var);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.d.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // defpackage.il0
    public final boolean g(vk0 vk0Var) {
        return false;
    }

    @Override // defpackage.il0
    public final int getId() {
        return this.f;
    }

    @Override // defpackage.il0
    public final void h() {
        qo0 qo0Var = this.g;
        if (qo0Var != null) {
            qo0Var.i();
            qo0Var.d();
        }
    }

    @Override // defpackage.il0
    public final void j(Context context, rk0 rk0Var) {
        this.h = LayoutInflater.from(context);
        this.e = rk0Var;
        this.C = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // defpackage.il0
    public final boolean k(q71 q71Var) {
        return false;
    }

    @Override // defpackage.il0
    public final boolean l() {
        return false;
    }

    @Override // defpackage.il0
    public final Parcelable m() {
        vk0 vk0Var;
        View actionView;
        Bundle bundle = new Bundle();
        if (this.c != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.c.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        qo0 qo0Var = this.g;
        if (qo0Var != null) {
            ArrayList arrayList = qo0Var.d;
            Bundle bundle2 = new Bundle();
            vk0 vk0Var2 = qo0Var.e;
            if (vk0Var2 != null) {
                bundle2.putInt("android:menu:checked", vk0Var2.a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                so0 so0Var = (so0) arrayList.get(i);
                if ((so0Var instanceof uo0) && (actionView = (vk0Var = ((uo0) so0Var).a).getActionView()) != null) {
                    vt0 vt0Var = new vt0();
                    actionView.saveHierarchyState(vt0Var);
                    sparseArray2.put(vk0Var.a, vt0Var);
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.d != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.d.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // defpackage.il0
    public final void a(rk0 rk0Var, boolean z) {
    }
}
