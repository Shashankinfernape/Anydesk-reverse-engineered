package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ol {
    public final hw0 a;
    public View e;
    public int d = 0;
    public final aa b = new aa(1);
    public final ArrayList c = new ArrayList();

    public ol(hw0 hw0Var) {
        this.a = hw0Var;
    }

    public final void a(View view, int i, boolean z) {
        RecyclerView recyclerView = this.a.c;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.g(childCount, z);
        if (z) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.M(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = this.a.c;
        int childCount = i < 0 ? recyclerView.getChildCount() : f(i);
        this.b.g(childCount, z);
        if (z) {
            i(view);
        }
        hx0 hx0VarM = RecyclerView.M(view);
        if (hx0VarM != null) {
            if (!hx0VarM.k() && !hx0VarM.p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(hx0VarM);
                nh0.n(sb, recyclerView.B());
                return;
            } else {
                if (RecyclerView.D0) {
                    Log.d("RecyclerView", "reAttach " + hx0VarM);
                }
                hx0VarM.j &= -257;
            }
        } else if (RecyclerView.C0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strB = recyclerView.B();
            sb2.append(", index: ");
            sb2.append(childCount);
            sb2.append(strB);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i) {
        int iF = f(i);
        this.b.h(iF);
        RecyclerView recyclerView = this.a.c;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            hx0 hx0VarM = RecyclerView.M(childAt);
            if (hx0VarM != null) {
                if (hx0VarM.k() && !hx0VarM.p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(hx0VarM);
                    nh0.n(sb, recyclerView.B());
                    return;
                } else {
                    if (RecyclerView.D0) {
                        Log.d("RecyclerView", "tmpDetach " + hx0VarM);
                    }
                    hx0VarM.a(256);
                }
            }
        } else if (RecyclerView.C0) {
            throw new IllegalArgumentException("No view at offset " + iF + recyclerView.B());
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i) {
        return this.a.c.getChildAt(f(i));
    }

    public final int e() {
        return this.a.c.getChildCount() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.a.c.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            aa aaVar = this.b;
            int iC = i - (i2 - aaVar.c(i2));
            if (iC == 0) {
                while (aaVar.e(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iC;
        }
        return -1;
    }

    public final View g(int i) {
        return this.a.c.getChildAt(i);
    }

    public final int h() {
        return this.a.c.getChildCount();
    }

    public final void i(View view) {
        this.c.add(view);
        hx0 hx0VarM = RecyclerView.M(view);
        if (hx0VarM != null) {
            View view2 = hx0VarM.a;
            RecyclerView recyclerView = this.a.c;
            int i = hx0VarM.q;
            if (i != -1) {
                hx0VarM.p = i;
            } else {
                hx0VarM.p = view2.getImportantForAccessibility();
            }
            if (!recyclerView.P()) {
                view2.setImportantForAccessibility(4);
            } else {
                hx0VarM.q = 4;
                recyclerView.u0.add(hx0VarM);
            }
        }
    }

    public final void j(View view) {
        hx0 hx0VarM;
        if (!this.c.remove(view) || (hx0VarM = RecyclerView.M(view)) == null) {
            return;
        }
        RecyclerView recyclerView = this.a.c;
        int i = hx0VarM.p;
        if (recyclerView.P()) {
            hx0VarM.q = i;
            recyclerView.u0.add(hx0VarM);
        } else {
            hx0VarM.a.setImportantForAccessibility(i);
        }
        hx0VarM.p = 0;
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
