package defpackage;

import android.view.View;
import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class p7 implements AbsListView.OnScrollListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;

    public p7(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        u7.b(absListView, this.a, this.b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
