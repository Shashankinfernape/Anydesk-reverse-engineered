package defpackage;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class a61 {
    public int a;
    public int b;
    public final c40 c;
    public final ArrayList d;
    public final LinkedHashSet e;
    public boolean f;
    public boolean g;
    public final i50 h;

    public a61(int i, int i2, i50 i50Var, aj ajVar) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        c40 c40Var = i50Var.c;
        c40Var.getClass();
        if (i == 0 || i2 == 0) {
            throw null;
        }
        c40Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = c40Var;
        this.d = new ArrayList();
        this.e = new LinkedHashSet();
        ajVar.b(new tk(this));
        this.h = i50Var;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        LinkedHashSet linkedHashSet = this.e;
        if (linkedHashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new LinkedHashSet(linkedHashSet).iterator();
        while (it.hasNext()) {
            ((aj) it.next()).a();
        }
    }

    public final void b() {
        if (!this.g) {
            if (t40.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.h.k();
    }

    public final void c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        int iR = q51.r(i2);
        c40 c40Var = this.c;
        if (iR == 0) {
            if (this.a != 1) {
                if (t40.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + c40Var + " mFinalState = " + gr0.i(this.a) + " -> " + gr0.i(i) + '.');
                }
                this.a = i;
                return;
            }
            return;
        }
        if (iR == 1) {
            if (this.a == 1) {
                if (t40.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + c40Var + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + gr0.h(this.b) + " to ADDING.");
                }
                this.a = 2;
                this.b = 2;
                return;
            }
            return;
        }
        if (iR != 2) {
            return;
        }
        if (t40.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + c40Var + " mFinalState = " + gr0.i(this.a) + " -> REMOVED. mLifecycleImpact  = " + gr0.h(this.b) + " to REMOVING.");
        }
        this.a = 1;
        this.b = 3;
    }

    public final void d() {
        int i = this.b;
        i50 i50Var = this.h;
        if (i != 2) {
            if (i == 3) {
                c40 c40Var = i50Var.c;
                c40Var.getClass();
                View viewK0 = c40Var.K0();
                if (t40.H(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewK0.findFocus() + " on view " + viewK0 + " for Fragment " + c40Var);
                }
                viewK0.clearFocus();
                return;
            }
            return;
        }
        c40 c40Var2 = i50Var.c;
        c40Var2.getClass();
        View viewFindFocus = c40Var2.H.findFocus();
        if (viewFindFocus != null) {
            c40Var2.X().k = viewFindFocus;
            if (t40.H(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + c40Var2);
            }
        }
        View viewK1 = this.c.K0();
        if (viewK1.getParent() == null) {
            i50Var.b();
            viewK1.setAlpha(0.0f);
        }
        if (viewK1.getAlpha() == 0.0f && viewK1.getVisibility() == 0) {
            viewK1.setVisibility(4);
        }
        a40 a40Var = c40Var2.K;
        viewK1.setAlpha(a40Var == null ? 1.0f : a40Var.j);
    }

    public final String toString() {
        StringBuilder sbN = q51.n("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbN.append(gr0.i(this.a));
        sbN.append(" lifecycleImpact = ");
        sbN.append(gr0.h(this.b));
        sbN.append(" fragment = ");
        sbN.append(this.c);
        sbN.append('}');
        return sbN.toString();
    }
}
