package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public final class fl0 extends uv {
    public final int o;
    public final int p;
    public uk0 q;
    public vk0 r;

    public fl0(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.o = 21;
            this.p = 22;
        } else {
            this.o = 22;
            this.p = 21;
        }
    }

    @Override // defpackage.uv, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        ok0 ok0Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.q != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                ok0Var = (ok0) headerViewListAdapter.getWrappedAdapter();
            } else {
                ok0Var = (ok0) adapter;
                headersCount = 0;
            }
            vk0 vk0VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= ok0Var.getCount()) ? null : ok0Var.getItem(i);
            vk0 vk0Var = this.r;
            if (vk0Var != vk0VarB) {
                rk0 rk0Var = ok0Var.a;
                if (vk0Var != null) {
                    this.q.g(rk0Var, vk0Var);
                }
                this.r = vk0VarB;
                if (vk0VarB != null) {
                    this.q.j(rk0Var, vk0VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.o) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.p) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (ok0) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (ok0) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(uk0 uk0Var) {
        this.q = uk0Var;
    }

    @Override // defpackage.uv, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
