package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class jx0 extends o3 {
    public final RecyclerView d;
    public final ix0 e;

    public jx0(RecyclerView recyclerView) {
        this.d = recyclerView;
        ix0 ix0Var = this.e;
        if (ix0Var != null) {
            this.e = ix0Var;
        } else {
            this.e = new ix0(this);
        }
    }

    @Override // defpackage.o3
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // defpackage.o3
    public void d(View view, w3 w3Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, w3Var.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        rw0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.V(recyclerView2.e, recyclerView2.h0, w3Var);
    }

    @Override // defpackage.o3
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().i0(i, bundle);
    }
}
