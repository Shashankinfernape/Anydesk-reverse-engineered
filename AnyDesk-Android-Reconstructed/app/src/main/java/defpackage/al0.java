package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class al0 implements b51, il0, AdapterView.OnItemClickListener {
    public Rect c;

    public static int o(ListAdapter listAdapter, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // defpackage.il0
    public final boolean c(vk0 vk0Var) {
        return false;
    }

    @Override // defpackage.il0
    public final boolean g(vk0 vk0Var) {
        return false;
    }

    @Override // defpackage.il0
    public final int getId() {
        return 0;
    }

    public abstract void n(rk0 rk0Var);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (ok0) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (ok0) listAdapter).a.q((MenuItem) listAdapter.getItem(i), this, !(this instanceof sj) ? 0 : 4);
    }

    public abstract void p(View view);

    public abstract void q(boolean z);

    public abstract void r(int i);

    public abstract void s(int i);

    public abstract void t(PopupWindow.OnDismissListener onDismissListener);

    public abstract void u(boolean z);

    public abstract void v(int i);

    @Override // defpackage.il0
    public final void j(Context context, rk0 rk0Var) {
    }
}
