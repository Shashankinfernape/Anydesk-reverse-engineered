package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.anydesk.anydeskandroid.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cg0 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ dg0 b;

    public cg0(dg0 dg0Var) {
        this.b = dg0Var;
        a();
    }

    public final void a() {
        rk0 rk0Var = this.b.e;
        vk0 vk0Var = rk0Var.v;
        if (vk0Var != null) {
            rk0Var.i();
            ArrayList arrayList = rk0Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((vk0) arrayList.get(i)) == vk0Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vk0 getItem(int i) {
        dg0 dg0Var = this.b;
        rk0 rk0Var = dg0Var.e;
        rk0Var.i();
        ArrayList arrayList = rk0Var.j;
        dg0Var.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (vk0) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        dg0 dg0Var = this.b;
        rk0 rk0Var = dg0Var.e;
        rk0Var.i();
        int size = rk0Var.j.size();
        dg0Var.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.d.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((kl0) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
