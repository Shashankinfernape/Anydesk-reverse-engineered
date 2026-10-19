package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class nw0 {
    public hw0 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(hx0 hx0Var) {
        RecyclerView recyclerView;
        int i = hx0Var.j;
        if (hx0Var.g() || (i & 4) != 0 || (recyclerView = hx0Var.r) == null) {
            return;
        }
        recyclerView.J(hx0Var);
    }

    public abstract boolean a(hx0 hx0Var, hx0 hx0Var2, vl0 vl0Var, vl0 vl0Var2);

    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0076, please report this as an issue */
    public final void c(hx0 hx0Var) {
        hw0 hw0Var = this.a;
        if (hw0Var != null) {
            RecyclerView recyclerView = hw0Var.c;
            boolean z = true;
            hx0Var.o(true);
            View view = hx0Var.a;
            if (hx0Var.h != null && hx0Var.i == null) {
                hx0Var.h = null;
            }
            hx0Var.i = null;
            if ((hx0Var.j & 16) != 0) {
                return;
            }
            yw0 yw0Var = recyclerView.e;
            recyclerView.l0();
            ol olVar = recyclerView.h;
            aa aaVar = olVar.b;
            hw0 hw0Var2 = olVar.a;
            int i = olVar.d;
            if (i != 1) {
                if (i == 2) {
                    nh0.j("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                try {
                    olVar.d = 2;
                    int iIndexOfChild = hw0Var2.c.indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        olVar.j(view);
                    } else if (aaVar.e(iIndexOfChild)) {
                        aaVar.h(iIndexOfChild);
                        olVar.j(view);
                        hw0Var2.k(iIndexOfChild);
                    } else {
                        olVar.d = 0;
                    }
                    olVar.d = 0;
                    if (z) {
                        hx0 hx0VarM = RecyclerView.M(view);
                        yw0Var.r(hx0VarM);
                        yw0Var.n(hx0VarM);
                        if (RecyclerView.D0) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.n0(!z);
                    if (z && hx0Var.k()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th) {
                    olVar.d = 0;
                    throw th;
                }
            }
            if (olVar.e != view) {
                nh0.j("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return;
            }
            z = false;
            if (z) {
                hx0 hx0VarM2 = RecyclerView.M(view);
                yw0Var.r(hx0VarM2);
                yw0Var.n(hx0VarM2);
                if (RecyclerView.D0) {
                    Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                }
            }
            recyclerView.n0(!z);
            if (z) {
            }
        }
    }

    public abstract void d(hx0 hx0Var);

    public abstract void e();

    public abstract boolean f();
}
