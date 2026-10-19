package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.anydesk.anydeskandroid.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class i50 {
    public final bc a;
    public final ah b;
    public final c40 c;
    public boolean d = false;
    public int e = -1;

    public i50(bc bcVar, ah ahVar, ClassLoader classLoader, n40 n40Var, Bundle bundle) {
        this.a = bcVar;
        this.b = ahVar;
        c40 c40VarA = ((h50) bundle.getParcelable("state")).a(n40Var);
        this.c = c40VarA;
        c40VarA.d = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        c40VarA.N0(bundle2);
        if (t40.H(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + c40VarA);
        }
    }

    public final void a() {
        boolean zH = t40.H(3);
        c40 c40Var = this.c;
        if (zH) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + c40Var);
        }
        Bundle bundle = c40Var.d;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        c40Var.w.O();
        c40Var.c = 3;
        c40Var.F = false;
        c40Var.n0();
        if (!c40Var.F) {
            throw new x71(q51.l("Fragment ", c40Var, " did not call through to super.onActivityCreated()"));
        }
        if (t40.H(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + c40Var);
        }
        if (c40Var.H != null) {
            Bundle bundle2 = c40Var.d;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = c40Var.e;
            if (sparseArray != null) {
                c40Var.H.restoreHierarchyState(sparseArray);
                c40Var.e = null;
            }
            c40Var.F = false;
            c40Var.D0(bundle3);
            if (!c40Var.F) {
                throw new x71(q51.l("Fragment ", c40Var, " did not call through to super.onViewStateRestored()"));
            }
            if (c40Var.H != null) {
                c40Var.R.a(ze0.ON_CREATE);
            }
        }
        c40Var.d = null;
        t40 t40Var = c40Var.w;
        t40Var.F = false;
        t40Var.G = false;
        t40Var.M.g = false;
        t40Var.t(4);
        this.a.H(false);
    }

    public final void b() {
        c40 c40Var;
        View view;
        View view2;
        c40 c40Var2 = this.c;
        View view3 = c40Var2.G;
        while (true) {
            c40Var = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            c40 c40Var3 = tag instanceof c40 ? (c40) tag : null;
            if (c40Var3 != null) {
                c40Var = c40Var3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        c40 c40Var4 = c40Var2.x;
        if (c40Var != null && c40Var != c40Var4) {
            int i = c40Var2.z;
            j50 j50Var = k50.a;
            k50.b(new g50(c40Var2, "Attempting to nest fragment " + c40Var2 + " within the view of parent fragment " + c40Var + " via container with ID " + i + " without using parent's childFragmentManager"));
            k50.a(c40Var2).getClass();
        }
        ArrayList arrayList = (ArrayList) this.b.a;
        ViewGroup viewGroup = c40Var2.G;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(c40Var2);
            for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
                c40 c40Var5 = (c40) arrayList.get(i2);
                if (c40Var5.G == viewGroup && (view2 = c40Var5.H) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                c40 c40Var6 = (c40) arrayList.get(iIndexOf);
                if (c40Var6.G == viewGroup && (view = c40Var6.H) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        c40Var2.G.addView(c40Var2.H, iIndexOfChild);
    }

    public final void c() {
        boolean zH = t40.H(3);
        c40 c40Var = this.c;
        if (zH) {
            Log.d("FragmentManager", "moveto ATTACHED: " + c40Var);
        }
        c40 c40Var2 = c40Var.i;
        i50 i50Var = null;
        ah ahVar = this.b;
        if (c40Var2 != null) {
            i50 i50Var2 = (i50) ((HashMap) ahVar.b).get(c40Var2.g);
            if (i50Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(c40Var);
                c40 c40Var3 = c40Var.i;
                sb.append(" declared target fragment ");
                sb.append(c40Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            c40Var.j = c40Var.i.g;
            c40Var.i = null;
            i50Var = i50Var2;
        } else {
            String str = c40Var.j;
            if (str != null && (i50Var = (i50) ((HashMap) ahVar.b).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(c40Var);
                sb2.append(" declared target fragment ");
                nh0.j(q51.m(sb2, c40Var.j, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (i50Var != null) {
            i50Var.k();
        }
        t40 t40Var = c40Var.u;
        c40Var.v = t40Var.u;
        c40Var.x = t40Var.w;
        bc bcVar = this.a;
        bcVar.P(false);
        ArrayList arrayList = c40Var.W;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((b40) obj).a();
        }
        arrayList.clear();
        c40Var.w.b(c40Var.v, c40Var.W(), c40Var);
        c40Var.c = 0;
        c40Var.F = false;
        c40Var.p0(c40Var.v.t);
        if (!c40Var.F) {
            throw new x71(q51.l("Fragment ", c40Var, " did not call through to super.onAttach()"));
        }
        t40 t40Var2 = c40Var.u;
        Iterator it = t40Var2.n.iterator();
        while (it.hasNext()) {
            ((f50) it.next()).d(t40Var2, c40Var);
        }
        t40 t40Var3 = c40Var.w;
        t40Var3.F = false;
        t40Var3.G = false;
        t40Var3.M.g = false;
        t40Var3.t(0);
        bcVar.I(false);
    }

    public final int d() {
        int i;
        Object obj;
        c40 c40Var = this.c;
        if (c40Var.u == null) {
            return c40Var.c;
        }
        int iMin = this.e;
        int iOrdinal = c40Var.P.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (c40Var.p) {
            boolean z = c40Var.q;
            int i2 = this.e;
            if (z) {
                iMin = Math.max(i2, 2);
                View view = c40Var.H;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i2 < 4 ? Math.min(iMin, c40Var.c) : Math.min(iMin, 1);
            }
        }
        if (!c40Var.m) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = c40Var.G;
        if (viewGroup != null) {
            ct ctVarF = ct.f(viewGroup, c40Var.e0());
            a61 a61VarD = ctVarF.d(c40Var);
            int i3 = a61VarD != null ? a61VarD.b : 0;
            ArrayList arrayList = ctVarF.c;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i4);
                i4++;
                a61 a61Var = (a61) obj;
                if (y90.e(a61Var.c, c40Var) && !a61Var.f) {
                    break;
                }
            }
            a61 a61Var2 = (a61) obj;
            i = a61Var2 != null ? a61Var2.b : 0;
            int i5 = i3 == 0 ? -1 : b61.a[q51.r(i3)];
            if (i5 != -1 && i5 != 1) {
                i = i3;
            }
        } else {
            i = 0;
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (c40Var.n) {
            iMin = c40Var.m0() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (c40Var.I && c40Var.c < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (t40.H(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + c40Var);
        }
        return iMin;
    }

    public final void e() {
        boolean zH = t40.H(3);
        c40 c40Var = this.c;
        if (zH) {
            Log.d("FragmentManager", "moveto CREATED: " + c40Var);
        }
        Bundle bundle = c40Var.d;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (c40Var.N) {
            c40Var.c = 1;
            c40Var.L0();
            return;
        }
        bc bcVar = this.a;
        bcVar.Q(false);
        c40Var.w.O();
        c40Var.c = 1;
        c40Var.F = false;
        c40Var.Q.a(new ew0(4, c40Var));
        c40Var.q0(bundle2);
        c40Var.N = true;
        if (!c40Var.F) {
            throw new x71(q51.l("Fragment ", c40Var, " did not call through to super.onCreate()"));
        }
        c40Var.Q.d(ze0.ON_CREATE);
        bcVar.K(false);
    }

    public final void f() {
        String resourceName;
        c40 c40Var = this.c;
        if (c40Var.p) {
            return;
        }
        if (t40.H(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + c40Var);
        }
        Bundle bundle = c40Var.d;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterV0 = c40Var.v0(bundle2);
        c40Var.M = layoutInflaterV0;
        ViewGroup viewGroup = c40Var.G;
        if (viewGroup == null) {
            int i = c40Var.z;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    id.q(q51.l("Cannot create fragment ", c40Var, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) c40Var.u.v.A(i);
                if (viewGroup == null) {
                    if (!c40Var.r) {
                        try {
                            resourceName = c40Var.f0().getResourceName(c40Var.z);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(c40Var.z) + " (" + resourceName + ") for fragment " + c40Var);
                    }
                } else if (!(viewGroup instanceof g40)) {
                    j50 j50Var = k50.a;
                    k50.b(new g50(c40Var, "Attempting to add fragment " + c40Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    k50.a(c40Var).getClass();
                }
            }
        }
        c40Var.G = viewGroup;
        c40Var.E0(layoutInflaterV0, viewGroup, bundle2);
        if (c40Var.H != null) {
            if (t40.H(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + c40Var);
            }
            c40Var.H.setSaveFromParentEnabled(false);
            c40Var.H.setTag(R.id.fragment_container_view_tag, c40Var);
            if (viewGroup != null) {
                b();
            }
            if (c40Var.B) {
                c40Var.H.setVisibility(8);
            }
            View view = c40Var.H;
            WeakHashMap weakHashMap = oe1.a;
            boolean zIsAttachedToWindow = view.isAttachedToWindow();
            View view2 = c40Var.H;
            if (zIsAttachedToWindow) {
                ee1.c(view2);
            } else {
                view2.addOnAttachStateChangeListener(new qj(2, view2));
            }
            Bundle bundle3 = c40Var.d;
            c40Var.C0(c40Var.H, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
            c40Var.w.t(2);
            this.a.V(false);
            int visibility = c40Var.H.getVisibility();
            c40Var.X().j = c40Var.H.getAlpha();
            if (c40Var.G != null && visibility == 0) {
                View viewFindFocus = c40Var.H.findFocus();
                if (viewFindFocus != null) {
                    c40Var.X().k = viewFindFocus;
                    if (t40.H(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + c40Var);
                    }
                }
                c40Var.H.setAlpha(0.0f);
            }
        }
        c40Var.c = 2;
    }

    public final void g() {
        c40 c40VarC;
        boolean zH = t40.H(3);
        c40 c40Var = this.c;
        if (zH) {
            Log.d("FragmentManager", "movefrom CREATED: " + c40Var);
        }
        boolean zIsChangingConfigurations = true;
        int i = 0;
        boolean z = c40Var.n && !c40Var.m0();
        ah ahVar = this.b;
        if (z && !c40Var.o) {
            ahVar.v(c40Var.g, null);
        }
        if (!z) {
            w40 w40Var = (w40) ahVar.d;
            if (!((w40Var.b.containsKey(c40Var.g) && w40Var.e) ? w40Var.f : true)) {
                String str = c40Var.j;
                if (str != null && (c40VarC = ahVar.c(str)) != null && c40VarC.D) {
                    c40Var.i = c40VarC;
                }
                c40Var.c = 0;
                return;
            }
        }
        e40 e40Var = c40Var.v;
        if (e40Var != null) {
            zIsChangingConfigurations = ((w40) ahVar.d).f;
        } else {
            qa qaVar = e40Var.t;
            if (q51.p(qaVar)) {
                zIsChangingConfigurations = true ^ qaVar.isChangingConfigurations();
            }
        }
        if ((z && !c40Var.o) || zIsChangingConfigurations) {
            ((w40) ahVar.d).e(c40Var, false);
        }
        c40Var.w.k();
        c40Var.Q.d(ze0.ON_DESTROY);
        c40Var.c = 0;
        c40Var.F = false;
        c40Var.N = false;
        c40Var.s0();
        if (!c40Var.F) {
            throw new x71(q51.l("Fragment ", c40Var, " did not call through to super.onDestroy()"));
        }
        this.a.L(false);
        ArrayList arrayListF = ahVar.f();
        int size = arrayListF.size();
        while (i < size) {
            Object obj = arrayListF.get(i);
            i++;
            i50 i50Var = (i50) obj;
            if (i50Var != null) {
                c40 c40Var2 = i50Var.c;
                if (c40Var.g.equals(c40Var2.j)) {
                    c40Var2.i = c40Var;
                    c40Var2.j = null;
                }
            }
        }
        String str2 = c40Var.j;
        if (str2 != null) {
            c40Var.i = ahVar.c(str2);
        }
        ahVar.o(this);
    }

    public final void h() {
        View view;
        boolean zH = t40.H(3);
        c40 c40Var = this.c;
        if (zH) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + c40Var);
        }
        ViewGroup viewGroup = c40Var.G;
        if (viewGroup != null && (view = c40Var.H) != null) {
            viewGroup.removeView(view);
        }
        c40Var.w.t(1);
        if (c40Var.H != null) {
            m50 m50Var = c40Var.R;
            m50Var.c();
            if (m50Var.f.d.compareTo(af0.e) >= 0) {
                c40Var.R.a(ze0.ON_DESTROY);
            }
        }
        c40Var.c = 1;
        c40Var.F = false;
        c40Var.t0();
        if (!c40Var.F) {
            throw new x71(q51.l("Fragment ", c40Var, " did not call through to super.onDestroyView()"));
        }
        bf1 bf1VarK = c40Var.K();
        bf1VarK.getClass();
        pr prVar = pr.b;
        prVar.getClass();
        ah ahVar = new ah(bf1VarK, yg0.c, prVar);
        fm fmVarA = nx0.a(yg0.class);
        String strU = y90.u(fmVarA);
        if (strU == null) {
            id.q("Local and anonymous classes can not be ViewModels");
            return;
        }
        x51 x51Var = ((yg0) ahVar.i(fmVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strU))).b;
        if (x51Var.f() > 0) {
            x51Var.g(0).getClass();
            id.c();
            return;
        }
        c40Var.s = false;
        this.a.W(false);
        c40Var.G = null;
        c40Var.H = null;
        c40Var.R = null;
        c40Var.S.l(null);
        c40Var.q = false;
    }

    public final void i() {
        boolean zH = t40.H(3);
        c40 c40Var = this.c;
        if (zH) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + c40Var);
        }
        c40Var.c = -1;
        c40Var.F = false;
        c40Var.u0();
        c40Var.M = null;
        if (!c40Var.F) {
            throw new x71(q51.l("Fragment ", c40Var, " did not call through to super.onDetach()"));
        }
        t40 t40Var = c40Var.w;
        if (!t40Var.H) {
            t40Var.k();
            c40Var.w = new t40();
        }
        this.a.N(false);
        c40Var.c = -1;
        c40Var.v = null;
        c40Var.x = null;
        c40Var.u = null;
        if (!c40Var.n || c40Var.m0()) {
            w40 w40Var = (w40) this.b.d;
            if (!((w40Var.b.containsKey(c40Var.g) && w40Var.e) ? w40Var.f : true)) {
                return;
            }
        }
        if (t40.H(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + c40Var);
        }
        c40Var.j0();
    }

    public final void j() {
        c40 c40Var = this.c;
        if (c40Var.p && c40Var.q && !c40Var.s) {
            if (t40.H(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + c40Var);
            }
            Bundle bundle = c40Var.d;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterV0 = c40Var.v0(bundle2);
            c40Var.M = layoutInflaterV0;
            c40Var.E0(layoutInflaterV0, null, bundle2);
            View view = c40Var.H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                c40Var.H.setTag(R.id.fragment_container_view_tag, c40Var);
                if (c40Var.B) {
                    c40Var.H.setVisibility(8);
                }
                Bundle bundle3 = c40Var.d;
                c40Var.C0(c40Var.H, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                c40Var.w.t(2);
                this.a.V(false);
                c40Var.c = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        c40 c40Var = this.c;
        if (z) {
            if (t40.H(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + c40Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iD = d();
                int i = c40Var.c;
                int i2 = 3;
                ah ahVar = this.b;
                if (iD == i) {
                    if (!z2 && i == -1 && c40Var.n && !c40Var.m0() && !c40Var.o) {
                        if (t40.H(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + c40Var);
                        }
                        ((w40) ahVar.d).e(c40Var, true);
                        ahVar.o(this);
                        if (t40.H(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + c40Var);
                        }
                        c40Var.j0();
                    }
                    if (c40Var.L) {
                        if (c40Var.H != null && (viewGroup = c40Var.G) != null) {
                            ct ctVarF = ct.f(viewGroup, c40Var.e0());
                            if (c40Var.B) {
                                if (t40.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c40Var);
                                }
                                ctVarF.a(3, 1, this);
                            } else {
                                if (t40.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c40Var);
                                }
                                ctVarF.a(2, 1, this);
                            }
                        }
                        t40 t40Var = c40Var.u;
                        if (t40Var != null && c40Var.m && t40.I(c40Var)) {
                            t40Var.E = true;
                        }
                        c40Var.L = false;
                        c40Var.w.n();
                    }
                    this.d = false;
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (c40Var.o) {
                                if (((Bundle) ((HashMap) ahVar.c).get(c40Var.g)) == null) {
                                    ahVar.v(c40Var.g, o());
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            c40Var.c = 1;
                            break;
                        case 2:
                            c40Var.q = false;
                            c40Var.c = 2;
                            break;
                        case 3:
                            if (t40.H(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + c40Var);
                            }
                            if (c40Var.o) {
                                ahVar.v(c40Var.g, o());
                            } else if (c40Var.H != null && c40Var.e == null) {
                                p();
                            }
                            if (c40Var.H != null && (viewGroup2 = c40Var.G) != null) {
                                ct ctVarF2 = ct.f(viewGroup2, c40Var.e0());
                                if (t40.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c40Var);
                                }
                                ctVarF2.a(1, 3, this);
                            }
                            c40Var.c = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            c40Var.c = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (c40Var.H != null && (viewGroup3 = c40Var.G) != null) {
                                ct ctVarF3 = ct.f(viewGroup3, c40Var.e0());
                                int visibility = c40Var.H.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                if (t40.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c40Var);
                                }
                                ctVarF3.a(i2, 2, this);
                            }
                            c40Var.c = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            c40Var.c = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean zH = t40.H(3);
        c40 c40Var = this.c;
        if (zH) {
            Log.d("FragmentManager", "movefrom RESUMED: " + c40Var);
        }
        c40Var.w.t(5);
        if (c40Var.H != null) {
            c40Var.R.a(ze0.ON_PAUSE);
        }
        c40Var.Q.d(ze0.ON_PAUSE);
        c40Var.c = 6;
        c40Var.F = false;
        c40Var.x0();
        if (!c40Var.F) {
            throw new x71(q51.l("Fragment ", c40Var, " did not call through to super.onPause()"));
        }
        this.a.O(false);
    }

    public final void m(ClassLoader classLoader) {
        c40 c40Var = this.c;
        Bundle bundle = c40Var.d;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (c40Var.d.getBundle("savedInstanceState") == null) {
            c40Var.d.putBundle("savedInstanceState", new Bundle());
        }
        c40Var.e = c40Var.d.getSparseParcelableArray("viewState");
        c40Var.f = c40Var.d.getBundle("viewRegistryState");
        h50 h50Var = (h50) c40Var.d.getParcelable("state");
        if (h50Var != null) {
            c40Var.j = h50Var.n;
            c40Var.k = h50Var.o;
            c40Var.J = h50Var.p;
        }
        if (c40Var.J) {
            return;
        }
        c40Var.I = true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public final void n() {
        boolean zRequestFocus;
        String str;
        boolean zH = t40.H(3);
        c40 c40Var = this.c;
        if (zH) {
            Log.d("FragmentManager", "moveto RESUMED: " + c40Var);
        }
        a40 a40Var = c40Var.K;
        View view = a40Var == null ? null : a40Var.k;
        if (view != null) {
            if (view == c40Var.H) {
                zRequestFocus = view.requestFocus();
                if (t40.H(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(c40Var);
                    sb.append(" resulting in focused view ");
                    sb.append(c40Var.H.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == c40Var.H) {
                            zRequestFocus = view.requestFocus();
                            if (t40.H(2)) {
                                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                                sb2.append(view);
                                sb2.append(" ");
                                if (zRequestFocus) {
                                    str = "succeeded";
                                } else {
                                    str = "failed";
                                }
                                sb2.append(str);
                                sb2.append(" on Fragment ");
                                sb2.append(c40Var);
                                sb2.append(" resulting in focused view ");
                                sb2.append(c40Var.H.findFocus());
                                Log.v("FragmentManager", sb2.toString());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        c40Var.X().k = null;
        c40Var.w.O();
        c40Var.w.x(true);
        c40Var.c = 7;
        c40Var.F = false;
        c40Var.y0();
        if (!c40Var.F) {
            throw new x71(q51.l("Fragment ", c40Var, " did not call through to super.onResume()"));
        }
        if0 if0Var = c40Var.Q;
        ze0 ze0Var = ze0.ON_RESUME;
        if0Var.d(ze0Var);
        if (c40Var.H != null) {
            c40Var.R.f.d(ze0Var);
        }
        t40 t40Var = c40Var.w;
        t40Var.F = false;
        t40Var.G = false;
        t40Var.M.g = false;
        t40Var.t(7);
        this.a.R(false);
        this.b.v(c40Var.g, null);
        c40Var.d = null;
        c40Var.e = null;
        c40Var.f = null;
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        c40 c40Var = this.c;
        if (c40Var.c == -1 && (bundle = c40Var.d) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new h50(c40Var));
        if (c40Var.c > -1) {
            Bundle bundle3 = new Bundle();
            c40Var.z0(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.S(false);
            Bundle bundle4 = new Bundle();
            c40Var.U.q(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleV = c40Var.w.V();
            if (!bundleV.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleV);
            }
            if (c40Var.H != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = c40Var.e;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = c40Var.f;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = c40Var.h;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        c40 c40Var = this.c;
        if (c40Var.H == null) {
            return;
        }
        if (t40.H(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + c40Var + " with view " + c40Var.H);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        c40Var.H.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            c40Var.e = sparseArray;
        }
        Bundle bundle = new Bundle();
        c40Var.R.g.q(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        c40Var.f = bundle;
    }

    public final void q() {
        boolean zH = t40.H(3);
        c40 c40Var = this.c;
        if (zH) {
            Log.d("FragmentManager", "moveto STARTED: " + c40Var);
        }
        c40Var.w.O();
        c40Var.w.x(true);
        c40Var.c = 5;
        c40Var.F = false;
        c40Var.A0();
        if (!c40Var.F) {
            throw new x71(q51.l("Fragment ", c40Var, " did not call through to super.onStart()"));
        }
        if0 if0Var = c40Var.Q;
        ze0 ze0Var = ze0.ON_START;
        if0Var.d(ze0Var);
        if (c40Var.H != null) {
            c40Var.R.f.d(ze0Var);
        }
        t40 t40Var = c40Var.w;
        t40Var.F = false;
        t40Var.G = false;
        t40Var.M.g = false;
        t40Var.t(5);
        this.a.T(false);
    }

    public final void r() {
        boolean zH = t40.H(3);
        c40 c40Var = this.c;
        if (zH) {
            Log.d("FragmentManager", "movefrom STARTED: " + c40Var);
        }
        t40 t40Var = c40Var.w;
        t40Var.G = true;
        t40Var.M.g = true;
        t40Var.t(4);
        if (c40Var.H != null) {
            c40Var.R.a(ze0.ON_STOP);
        }
        c40Var.Q.d(ze0.ON_STOP);
        c40Var.c = 4;
        c40Var.F = false;
        c40Var.B0();
        if (!c40Var.F) {
            throw new x71(q51.l("Fragment ", c40Var, " did not call through to super.onStop()"));
        }
        this.a.U(false);
    }

    public i50(bc bcVar, ah ahVar, c40 c40Var) {
        this.a = bcVar;
        this.b = ahVar;
        this.c = c40Var;
    }

    public i50(bc bcVar, ah ahVar, c40 c40Var, Bundle bundle) {
        this.a = bcVar;
        this.b = ahVar;
        this.c = c40Var;
        c40Var.e = null;
        c40Var.f = null;
        c40Var.t = 0;
        c40Var.q = false;
        c40Var.m = false;
        c40 c40Var2 = c40Var.i;
        c40Var.j = c40Var2 != null ? c40Var2.g : null;
        c40Var.i = null;
        c40Var.d = bundle;
        c40Var.h = bundle.getBundle("arguments");
    }
}
