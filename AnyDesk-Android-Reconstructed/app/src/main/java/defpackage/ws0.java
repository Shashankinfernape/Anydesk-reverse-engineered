package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ws0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ws0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void f() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        if (!recyclerView.v || !recyclerView.u) {
            recyclerView.C = true;
            recyclerView.requestLayout();
        } else {
            fw0 fw0Var = recyclerView.k;
            WeakHashMap weakHashMap = oe1.a;
            recyclerView.postOnAnimation(fw0Var);
        }
    }

    public final void a() {
    }

    public final void e() {
    }

    public final void c(int i, int i2) {
    }

    public final void d(int i, int i2) {
    }

    public final void b(Object obj, int i, int i2) {
    }
}
