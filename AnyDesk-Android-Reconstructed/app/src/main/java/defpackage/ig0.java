package defpackage;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes.dex */
public final class ig0 implements AbsListView.OnScrollListener {
    public final /* synthetic */ kg0 a;

    public ig0(kg0 kg0Var) {
        this.a = kg0Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        kg0 kg0Var = this.a;
        gg0 gg0Var = kg0Var.t;
        ac acVar = kg0Var.B;
        if (i != 1 || acVar.getInputMethodMode() == 2 || acVar.getContentView() == null) {
            return;
        }
        kg0Var.x.removeCallbacks(gg0Var);
        gg0Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
