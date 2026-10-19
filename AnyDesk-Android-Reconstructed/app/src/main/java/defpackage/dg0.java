package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: classes.dex */
public final class dg0 implements il0, AdapterView.OnItemClickListener {
    public Context c;
    public LayoutInflater d;
    public rk0 e;
    public ExpandedMenuView f;
    public hl0 g;
    public cg0 h;

    public dg0(ContextWrapper contextWrapper) {
        this.c = contextWrapper;
        this.d = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.il0
    public final void a(rk0 rk0Var, boolean z) {
        hl0 hl0Var = this.g;
        if (hl0Var != null) {
            hl0Var.a(rk0Var, z);
        }
    }

    @Override // defpackage.il0
    public final boolean c(vk0 vk0Var) {
        return false;
    }

    @Override // defpackage.il0
    public final void e(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f.restoreHierarchyState(sparseParcelableArray);
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
        return 0;
    }

    @Override // defpackage.il0
    public final void h() {
        cg0 cg0Var = this.h;
        if (cg0Var != null) {
            cg0Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.il0
    public final void j(Context context, rk0 rk0Var) {
        if (this.c != null) {
            this.c = context;
            if (this.d == null) {
                this.d = LayoutInflater.from(context);
            }
        }
        this.e = rk0Var;
        cg0 cg0Var = this.h;
        if (cg0Var != null) {
            cg0Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.il0
    public final boolean k(q71 q71Var) {
        boolean zHasVisibleItems = q71Var.hasVisibleItems();
        Context context = q71Var.a;
        if (!zHasVisibleItems) {
            return false;
        }
        sk0 sk0Var = new sk0();
        sk0Var.c = q71Var;
        v7 v7Var = new v7(context);
        r7 r7Var = (r7) v7Var.d;
        dg0 dg0Var = new dg0(r7Var.a);
        sk0Var.e = dg0Var;
        dg0Var.g = sk0Var;
        q71Var.b(dg0Var, context);
        dg0 dg0Var2 = sk0Var.e;
        if (dg0Var2.h == null) {
            dg0Var2.h = new cg0(dg0Var2);
        }
        r7Var.o = dg0Var2.h;
        r7Var.p = sk0Var;
        View view = q71Var.o;
        if (view != null) {
            r7Var.f = view;
        } else {
            r7Var.d = q71Var.n;
            r7Var.e = q71Var.m;
        }
        r7Var.n = sk0Var;
        w7 w7VarA = v7Var.a();
        sk0Var.d = w7VarA;
        w7VarA.setOnDismissListener(sk0Var);
        WindowManager.LayoutParams attributes = sk0Var.d.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        sk0Var.d.show();
        hl0 hl0Var = this.g;
        if (hl0Var == null) {
            return true;
        }
        hl0Var.v(q71Var);
        return true;
    }

    @Override // defpackage.il0
    public final boolean l() {
        return false;
    }

    @Override // defpackage.il0
    public final Parcelable m() {
        if (this.f == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.e.q(this.h.getItem(i), this, 0);
    }
}
