package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class x70 extends ow0 {
    public final int a;
    public final int b;

    public x70(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ow0
    public final void c(Rect rect, View view, RecyclerView recyclerView) {
        RecyclerView recyclerView2;
        iw0 adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        hx0 hx0VarM = RecyclerView.M(view);
        int iJ = -1;
        if (hx0VarM != null && (recyclerView2 = hx0VarM.r) != null) {
            iJ = recyclerView2.J(hx0VarM);
        }
        int iA = adapter.a();
        int i = this.a;
        rect.left = i;
        rect.right = i;
        int layoutDirection = recyclerView.getResources().getConfiguration().getLayoutDirection();
        int i2 = this.b;
        if (layoutDirection == 1) {
            if (iJ == 0) {
                rect.left = i2;
            }
            if (iJ == iA - 1) {
                rect.right = 0;
                return;
            }
            return;
        }
        if (iJ == 0) {
            rect.left = 0;
        }
        if (iJ == iA - 1) {
            rect.right = i2;
        }
    }
}
