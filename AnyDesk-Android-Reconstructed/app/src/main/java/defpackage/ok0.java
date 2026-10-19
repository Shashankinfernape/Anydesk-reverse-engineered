package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ok0 extends BaseAdapter {
    public final rk0 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public ok0(rk0 rk0Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = rk0Var;
        this.f = i;
        a();
    }

    public final void a() {
        rk0 rk0Var = this.a;
        vk0 vk0Var = rk0Var.v;
        if (vk0Var != null) {
            rk0Var.i();
            ArrayList arrayList = rk0Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((vk0) arrayList.get(i)) == vk0Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vk0 getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.d;
        rk0 rk0Var = this.a;
        if (z) {
            rk0Var.i();
            arrayListL = rk0Var.j;
        } else {
            arrayListL = rk0Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (vk0) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.d;
        rk0 rk0Var = this.a;
        if (z) {
            rk0Var.i();
            arrayListL = rk0Var.j;
        } else {
            arrayListL = rk0Var.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        kl0 kl0Var = (kl0) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        kl0Var.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
