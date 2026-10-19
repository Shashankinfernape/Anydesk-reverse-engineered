package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anydesk.anydeskandroid.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class c40 implements ComponentCallbacks, View.OnCreateContextMenuListener, gf0, cf1, q70, g01 {
    public static final Object Y = new Object();
    public String A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean F;
    public ViewGroup G;
    public View H;
    public boolean I;
    public a40 K;
    public boolean L;
    public LayoutInflater M;
    public boolean N;
    public String O;
    public af0 P;
    public if0 Q;
    public m50 R;
    public final vm0 S;
    public h01 T;
    public ui0 U;
    public final AtomicInteger V;
    public final ArrayList W;
    public final x30 X;
    public Bundle d;
    public SparseArray e;
    public Bundle f;
    public Bundle h;
    public c40 i;
    public int k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public t40 u;
    public e40 v;
    public c40 x;
    public int y;
    public int z;
    public int c = -1;
    public String g = UUID.randomUUID().toString();
    public String j = null;
    public Boolean l = null;
    public t40 w = new t40();
    public final boolean E = true;
    public boolean J = true;

    public c40() {
        new c(25, this);
        this.P = af0.g;
        this.S = new vm0();
        this.V = new AtomicInteger();
        this.W = new ArrayList();
        this.X = new x30(this);
        i0();
    }

    public void A0() {
        this.F = true;
    }

    public void B0() {
        this.F = true;
    }

    public void D0(Bundle bundle) {
        this.F = true;
    }

    public void E0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.w.O();
        this.s = true;
        this.R = new m50(this, K(), new l(11, this));
        View viewR0 = r0(layoutInflater, viewGroup);
        this.H = viewR0;
        m50 m50Var = this.R;
        if (viewR0 == null) {
            if (m50Var.f == null) {
                this.R = null;
                return;
            } else {
                nh0.j("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        m50Var.c();
        if (t40.H(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.H + " for Fragment " + this);
        }
        View view = this.H;
        m50 m50Var2 = this.R;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, m50Var2);
        View view2 = this.H;
        m50 m50Var3 = this.R;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, m50Var3);
        View view3 = this.H;
        m50 m50Var4 = this.R;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, m50Var4);
        this.S.l(this.R);
    }

    public final k6 F0(j6 j6Var, hq hqVar) {
        ev evVar = new ev(9, this);
        if (this.c > 1) {
            nh0.j(q51.l("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        z30 z30Var = new z30(this, evVar, atomicReference, hqVar, j6Var);
        if (this.c >= 0) {
            z30Var.a();
        } else {
            this.W.add(z30Var);
        }
        return new w30(atomicReference);
    }

    public final qa G0() {
        qa qaVarY = Y();
        if (qaVarY != null) {
            return qaVarY;
        }
        nh0.j(q51.l("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle H0() {
        Bundle bundle = this.h;
        if (bundle != null) {
            return bundle;
        }
        nh0.j(q51.l("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final Context I0() {
        Context contextA0 = a0();
        if (contextA0 != null) {
            return contextA0;
        }
        nh0.j(q51.l("Fragment ", this, " not attached to a context."));
        return null;
    }

    public final c40 J0() {
        c40 c40Var = this.x;
        if (c40Var != null) {
            return c40Var;
        }
        if (a0() == null) {
            nh0.j(q51.l("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        Context contextA0 = a0();
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(contextA0);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.cf1
    public final bf1 K() {
        if (this.u == null) {
            nh0.j("Can't access ViewModels from detached fragment");
            return null;
        }
        if (d0() == 1) {
            nh0.j("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.u.M.d;
        bf1 bf1Var = (bf1) map.get(this.g);
        if (bf1Var != null) {
            return bf1Var;
        }
        bf1 bf1Var2 = new bf1();
        map.put(this.g, bf1Var2);
        return bf1Var2;
    }

    public final View K0() {
        View view = this.H;
        if (view != null) {
            return view;
        }
        nh0.j(q51.l("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public final void L0() {
        Bundle bundle;
        Bundle bundle2 = this.d;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.w.U(bundle);
        t40 t40Var = this.w;
        t40Var.F = false;
        t40Var.G = false;
        t40Var.M.g = false;
        t40Var.t(1);
    }

    public final void M0(int i, int i2, int i3, int i4) {
        if (this.K == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        X().b = i;
        X().c = i2;
        X().d = i3;
        X().e = i4;
    }

    public final void N0(Bundle bundle) {
        t40 t40Var = this.u;
        if (t40Var != null) {
            if (t40Var == null ? false : t40Var.M()) {
                nh0.j("Fragment already added and state has been saved");
                return;
            }
        }
        this.h = bundle;
    }

    @Override // defpackage.gf0
    public final if0 R() {
        return this.Q;
    }

    public hq W() {
        return new y30(this);
    }

    public final a40 X() {
        if (this.K == null) {
            a40 a40Var = new a40();
            Object obj = Y;
            a40Var.g = obj;
            a40Var.h = obj;
            a40Var.i = obj;
            a40Var.j = 1.0f;
            a40Var.k = null;
            this.K = a40Var;
        }
        return this.K;
    }

    public final qa Y() {
        e40 e40Var = this.v;
        if (e40Var == null) {
            return null;
        }
        return e40Var.s;
    }

    public final t40 Z() {
        if (this.v != null) {
            return this.w;
        }
        nh0.j(q51.l("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public final Context a0() {
        e40 e40Var = this.v;
        if (e40Var == null) {
            return null;
        }
        return e40Var.t;
    }

    @Override // defpackage.g01
    public final ui0 b() {
        return (ui0) this.U.d;
    }

    public final ze1 b0() {
        Application application = null;
        if (this.u == null) {
            nh0.j("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.T == null) {
            for (Context applicationContext = I0().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            if (application == null && t40.H(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + I0().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.T = new h01(application, this, this.h);
        }
        return this.T;
    }

    public final LayoutInflater c0() {
        LayoutInflater layoutInflater = this.M;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterV0 = v0(null);
        this.M = layoutInflaterV0;
        return layoutInflaterV0;
    }

    public final int d0() {
        af0 af0Var = this.P;
        return (af0Var == af0.d || this.x == null) ? af0Var.ordinal() : Math.min(af0Var.ordinal(), this.x.d0());
    }

    public final t40 e0() {
        t40 t40Var = this.u;
        if (t40Var != null) {
            return t40Var;
        }
        nh0.j(q51.l("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final Resources f0() {
        return I0().getResources();
    }

    public final String g0(int i) {
        return f0().getString(i);
    }

    public final m50 h0() {
        m50 m50Var = this.R;
        if (m50Var != null) {
            return m50Var;
        }
        nh0.j(q51.l("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    public final void i0() {
        this.Q = new if0(this);
        this.U = new ui0(new f01(this, new y(8, this)), 8);
        this.T = null;
        ArrayList arrayList = this.W;
        x30 x30Var = this.X;
        if (arrayList.contains(x30Var)) {
            return;
        }
        if (this.c >= 0) {
            x30Var.a();
        } else {
            arrayList.add(x30Var);
        }
    }

    public final void j0() {
        i0();
        this.O = this.g;
        this.g = UUID.randomUUID().toString();
        this.m = false;
        this.n = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.t = 0;
        this.u = null;
        this.w = new t40();
        this.v = null;
        this.y = 0;
        this.z = 0;
        this.A = null;
        this.B = false;
        this.C = false;
    }

    public final boolean k0() {
        return this.v != null && this.m;
    }

    public final boolean l0() {
        if (this.B) {
            return true;
        }
        t40 t40Var = this.u;
        if (t40Var != null) {
            c40 c40Var = this.x;
            t40Var.getClass();
            if (c40Var == null ? false : c40Var.l0()) {
                return true;
            }
        }
        return false;
    }

    public final boolean m0() {
        return this.t > 0;
    }

    public void n0() {
        this.F = true;
    }

    public void o0(int i, int i2, Intent intent) {
        if (t40.H(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.F = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        G0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.F = true;
    }

    public void p0(Context context) {
        this.F = true;
        e40 e40Var = this.v;
        if ((e40Var == null ? null : e40Var.s) != null) {
            this.F = true;
        }
    }

    public void q0(Bundle bundle) {
        this.F = true;
        L0();
        t40 t40Var = this.w;
        if (t40Var.t >= 1) {
            return;
        }
        t40Var.F = false;
        t40Var.G = false;
        t40Var.M.g = false;
        t40Var.t(1);
    }

    public View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void s0() {
        this.F = true;
    }

    @Override // defpackage.q70
    public final um0 t() {
        Application application;
        Context applicationContext = I0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && t40.H(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + I0().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        um0 um0Var = new um0(0);
        LinkedHashMap linkedHashMap = um0Var.a;
        if (application != null) {
            linkedHashMap.put(ye1.e, application);
        }
        linkedHashMap.put(lk0.h, this);
        linkedHashMap.put(lk0.i, this);
        Bundle bundle = this.h;
        if (bundle != null) {
            linkedHashMap.put(lk0.j, bundle);
        }
        return um0Var;
    }

    public void t0() {
        this.F = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.g);
        if (this.y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.y));
        }
        if (this.A != null) {
            sb.append(" tag=");
            sb.append(this.A);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u0() {
        this.F = true;
    }

    public LayoutInflater v0(Bundle bundle) {
        e40 e40Var = this.v;
        if (e40Var == null) {
            nh0.j("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        qa qaVar = e40Var.w;
        LayoutInflater layoutInflaterCloneInContext = qaVar.getLayoutInflater().cloneInContext(qaVar);
        layoutInflaterCloneInContext.setFactory2(this.w.f);
        return layoutInflaterCloneInContext;
    }

    public void w0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.F = true;
        e40 e40Var = this.v;
        if ((e40Var == null ? null : e40Var.s) != null) {
            this.F = true;
        }
    }

    public void x0() {
        this.F = true;
    }

    public void y0() {
        this.F = true;
    }

    public void z0(Bundle bundle) {
    }

    public void C0(View view, Bundle bundle) {
    }
}
