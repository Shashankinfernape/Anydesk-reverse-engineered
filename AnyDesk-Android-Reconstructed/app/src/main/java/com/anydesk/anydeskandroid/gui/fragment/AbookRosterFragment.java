package com.anydesk.anydeskandroid.gui.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.RosterItemFilter;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.a0;
import defpackage.ah;
import defpackage.an0;
import defpackage.b0;
import defpackage.bc;
import defpackage.bd0;
import defpackage.bf1;
import defpackage.bo0;
import defpackage.bu0;
import defpackage.c0;
import defpackage.c40;
import defpackage.cf;
import defpackage.d0;
import defpackage.e0;
import defpackage.e50;
import defpackage.ea0;
import defpackage.f;
import defpackage.f0;
import defpackage.fm;
import defpackage.fw;
import defpackage.fz0;
import defpackage.g0;
import defpackage.gi;
import defpackage.hp;
import defpackage.id;
import defpackage.j2;
import defpackage.jd0;
import defpackage.kx0;
import defpackage.l;
import defpackage.l2;
import defpackage.m0;
import defpackage.m50;
import defpackage.m70;
import defpackage.m80;
import defpackage.m81;
import defpackage.mq0;
import defpackage.nk0;
import defpackage.nx0;
import defpackage.q51;
import defpackage.r3;
import defpackage.sf;
import defpackage.t70;
import defpackage.th1;
import defpackage.ty;
import defpackage.u1;
import defpackage.um0;
import defpackage.v;
import defpackage.v0;
import defpackage.vm0;
import defpackage.w;
import defpackage.wc0;
import defpackage.x;
import defpackage.x70;
import defpackage.xe;
import defpackage.xt0;
import defpackage.xz0;
import defpackage.y;
import defpackage.y6;
import defpackage.y90;
import defpackage.yz0;
import defpackage.z;
import defpackage.zd;
import defpackage.ze1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AbookRosterFragment extends c40 implements bd0, wc0, jd0, v0 {
    public u1 a0;
    public m80 b0;
    public bc c0;
    public m0 d0;
    public RecyclerView e0;
    public LinearLayoutManager f0;
    public View g0;
    public View h0;
    public View i0;
    public AdEditText j0;
    public RecyclerView k0;
    public m81 l0;
    public final Logging Z = new Logging("AbookRosterFragment");
    public final y6 m0 = new y6(this, new f(2, this));
    public final xt0 n0 = new xt0(this);
    public final d0 o0 = new d0(this);

    @Override // defpackage.c40
    public final void A0() {
        this.F = true;
        JniAdExt.q1(this);
        JniAdExt.p1(this);
        zd zdVar = JniAdExt.b0;
        synchronized (zdVar) {
            zdVar.add(this);
        }
    }

    @Override // defpackage.wc0
    public final void B() {
        u1 u1Var = this.a0;
        Objects.requireNonNull(u1Var);
        t70.Y(new w(u1Var, 6));
    }

    @Override // defpackage.c40
    public final void B0() {
        this.F = true;
        zd zdVar = JniAdExt.b0;
        synchronized (zdVar) {
            zdVar.remove(this);
        }
        JniAdExt.R3(this);
        JniAdExt.S3(this);
    }

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        bo0 bo0VarO0;
        nk0 nk0Var;
        an0 an0Var;
        Object obj;
        xz0 xz0Var;
        bf1 bf1VarK = K();
        ze1 ze1VarB0 = b0();
        um0 um0VarT = t();
        ze1VarB0.getClass();
        ah ahVar = new ah(bf1VarK, ze1VarB0, um0VarT);
        fm fmVarA = nx0.a(u1.class);
        String strU = y90.u(fmVarA);
        if (strU == null) {
            id.q("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.a0 = (u1) ahVar.i(fmVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strU));
        m50 m50VarH0 = h0();
        final b0 b0Var = new b0(this, 3);
        try {
            bo0VarO0 = NavHostFragment.O0(this);
        } catch (IllegalStateException unused) {
            bo0VarO0 = null;
        }
        if (bo0VarO0 != null && (an0Var = (an0) bo0VarO0.b.f.d()) != null) {
            final yz0 yz0Var = (yz0) an0Var.k.getValue();
            yz0Var.getClass();
            gi giVar = yz0Var.b;
            LinkedHashMap linkedHashMap = (LinkedHashMap) giVar.d;
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) giVar.a;
            if (linkedHashMap.containsKey("RESULT_ITEM_UPDATED")) {
                id.q("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key 'RESULT_ITEM_UPDATED', but not both.");
                return;
            }
            LinkedHashMap linkedHashMap3 = yz0Var.a;
            Object obj2 = linkedHashMap3.get("RESULT_ITEM_UPDATED");
            if (obj2 == null) {
                if (linkedHashMap2.containsKey("RESULT_ITEM_UPDATED")) {
                    obj = obj2;
                    xz0 xz0Var2 = new xz0(linkedHashMap2.get("RESULT_ITEM_UPDATED"));
                    xz0Var2.l = "RESULT_ITEM_UPDATED";
                    xz0Var2.m = yz0Var;
                    xz0Var = xz0Var2;
                } else {
                    obj = obj2;
                    xz0 xz0Var3 = new xz0();
                    xz0Var3.l = "RESULT_ITEM_UPDATED";
                    xz0Var3.m = yz0Var;
                    xz0Var = xz0Var3;
                }
                linkedHashMap3.put("RESULT_ITEM_UPDATED", xz0Var);
                obj = xz0Var;
            }
            obj = obj2;
            ((xz0) obj).e(m50VarH0, new mq0() { // from class: ao0
                @Override // defpackage.mq0
                public final void b(Object obj3) {
                    b0Var.b(obj3);
                    yz0 yz0Var2 = yz0Var;
                    gi giVar2 = yz0Var2.b;
                    ((LinkedHashMap) giVar2.a).remove("RESULT_ITEM_UPDATED");
                    ((LinkedHashMap) giVar2.c).remove("RESULT_ITEM_UPDATED");
                    ((LinkedHashMap) giVar2.d).remove("RESULT_ITEM_UPDATED");
                    xz0 xz0Var4 = (xz0) yz0Var2.a.remove("RESULT_ITEM_UPDATED");
                    if (xz0Var4 != null) {
                        xz0Var4.m = null;
                    }
                }
            });
        }
        this.e0 = (RecyclerView) view.findViewById(R.id.abook_roster);
        this.g0 = view.findViewById(R.id.abook_roster_loading_overlay);
        this.h0 = view.findViewById(R.id.abook_roster_button_new_item);
        this.i0 = view.findViewById(R.id.abook_roster_button_overflow);
        this.j0 = (AdEditText) view.findViewById(R.id.abook_rosters_card_addr_layout);
        this.k0 = (RecyclerView) view.findViewById(R.id.abook_roaster_selected_tags_view);
        m81 m81Var = new m81();
        this.l0 = m81Var;
        int i = 2;
        m81Var.f = 2;
        this.k0.setAdapter(m81Var);
        this.k0.setItemAnimator(null);
        RecyclerView recyclerView = this.k0;
        int i2 = 0;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        this.k0.i(new x70(6, 0));
        this.c0 = new bc(Z(), 19);
        this.i0.setOnClickListener(new e0(this, i2));
        bu0.D(this.h0, JniAdExt.n1("ad.abook.menu.add_item"));
        int i3 = 1;
        this.h0.setOnClickListener(new e0(this, i3));
        this.j0.setFilter("[\r\n\t]");
        this.j0.setTextListener(this.o0);
        this.m0.g();
        TextView textView = (TextView) view.findViewById(R.id.abook_roster_main_sticky_index);
        Resources resourcesF0 = f0();
        Looper looper = t70.a;
        m0 m0Var = new m0(resourcesF0.getDimensionPixelSize(R.dimen.abook_roster_item_tag_spacing), f0().getDimensionPixelSize(R.dimen.abook_roster_item_tag_spacing_end));
        this.d0 = m0Var;
        RecyclerView recyclerView2 = this.e0;
        m0Var.h = textView;
        m0Var.i = recyclerView2;
        recyclerView2.j(m0Var.m);
        y yVar = m0Var.n;
        yVar.getClass();
        cf cfVar = m0Var.e;
        cfVar.getClass();
        xe xeVar = cfVar.g;
        xeVar.getClass();
        xeVar.f.add(yVar);
        m0 m0Var2 = this.d0;
        m0Var2.j = this;
        this.e0.setAdapter(m0Var2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(a0());
        this.f0 = linearLayoutManager;
        this.e0.setLayoutManager(linearLayoutManager);
        ty tyVarA = r3.a(this.e0);
        f0 f0Var = new f0(this);
        f0Var.g = false;
        f0Var.c = 0L;
        f0Var.d = 0L;
        this.e0.setItemAnimator(f0Var);
        this.e0.j(new g0(0, this));
        x xVar = new x(this);
        if (tyVarA.x == null) {
            tyVarA.x = new ArrayList();
        }
        tyVarA.x.add(xVar);
        m0 m0Var3 = this.d0;
        y yVar2 = new y(i2, this);
        m0Var3.getClass();
        cf cfVar2 = m0Var3.e;
        cfVar2.getClass();
        xe xeVar2 = cfVar2.g;
        xeVar2.getClass();
        xeVar2.f.add(yVar2);
        vm0 vm0Var = new vm0();
        this.d0.i(new z(0, vm0Var));
        nk0 nk0VarD = th1.D(vm0Var, new a0(0));
        kx0 kx0Var = new kx0();
        kx0Var.c = true;
        if (nk0VarD.e != vm0.k) {
            kx0Var.c = false;
            nk0Var = new nk0(nk0VarD.d());
        } else {
            nk0Var = new nk0();
        }
        nk0Var.m(nk0VarD, new e50(new m70(nk0Var, 4, kx0Var), 1));
        nk0Var.e(h0(), new b0(this, i2));
        this.a0.e.e(h0(), new b0(this, i3));
        this.a0.g.e(h0(), new b0(this, i));
    }

    @Override // defpackage.c40
    public final void D0(Bundle bundle) {
        View view;
        this.F = true;
        c40 c40Var = this.x;
        if (c40Var == null || (view = c40Var.H) == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.abookRosterItemDetails);
        Logging logging = this.Z;
        if (viewFindViewById != null) {
            try {
                sf sfVar = new sf(e0());
                sfVar.h(R.id.abookRosterItemDetails, new AbookRosterItemDetailsFragment(), null);
                sfVar.f = 4099;
                sfVar.d(false);
                return;
            } catch (Throwable th) {
                q51.o(th, new StringBuilder("cannot create abook details fragment: "), logging);
                return;
            }
        }
        try {
            c40 c40VarA = e0().A(R.id.abookRosterItemDetails);
            if (c40VarA != null) {
                sf sfVar2 = new sf(e0());
                sfVar2.g(c40VarA);
                sfVar2.d(false);
            }
        } catch (Throwable th2) {
            q51.o(th2, new StringBuilder("cannot remove abook details fragment: "), logging);
        }
    }

    @Override // defpackage.bd0
    public final void M(Map map) {
        t70.Y(new c0(this, 0, map));
    }

    @Override // defpackage.wc0
    public final void O() {
        u1 u1Var = this.a0;
        Objects.requireNonNull(u1Var);
        t70.Y(new w(u1Var, 2));
    }

    public final void O0() {
        LinearLayoutManager linearLayoutManager = this.f0;
        if (linearLayoutManager == null || this.d0 == null) {
            return;
        }
        int iM0 = linearLayoutManager.M0();
        int iN0 = this.f0.N0();
        if (iM0 == -1 || iN0 == -1) {
            return;
        }
        u1 u1Var = this.a0;
        ea0 ea0VarL = this.d0.l();
        u1Var.getClass();
        int iA = ea0VarL.a();
        int i = ((iM0 / 25) - 1) * 25;
        if (i < 0) {
            i = 0;
        }
        if (i > iA) {
            i = iA;
        }
        int i2 = ((iN0 / 25) + 2) * 25;
        if (i2 <= iA) {
            iA = i2;
        }
        if (iA > i) {
            fw fwVar = u1Var.b;
            l2 l2Var = new l2(ea0VarL, i, iA);
            ArrayList arrayList = new ArrayList();
            j2 j2Var = new j2(0, l2Var);
            while (j2Var.hasNext()) {
                fz0 fz0Var = (fz0) j2Var.next();
                Long lValueOf = fz0Var != null ? Long.valueOf(fz0Var.a.mCid) : null;
                if (lValueOf != null) {
                    arrayList.add(lValueOf);
                }
            }
            fwVar.getClass();
            JniAdExt.I0.post(new l(12, arrayList));
        }
    }

    @Override // defpackage.wc0
    public final void P() {
        u1 u1Var = this.a0;
        Objects.requireNonNull(u1Var);
        t70.Y(new w(u1Var, 5));
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void S(long j, RosterItemFilter rosterItemFilter, RosterItem[] rosterItemArr, int i, boolean z) {
    }

    @Override // defpackage.wc0
    public final void V() {
        u1 u1Var = this.a0;
        Objects.requireNonNull(u1Var);
        t70.Y(new w(u1Var, 4));
    }

    @Override // defpackage.jd0
    public final void c(boolean z) {
        u1 u1Var = this.a0;
        Objects.requireNonNull(u1Var);
        t70.Y(new w(u1Var, 3));
    }

    @Override // defpackage.wc0
    public final void f() {
    }

    @Override // defpackage.wc0
    public final void k() {
        u1 u1Var = this.a0;
        Objects.requireNonNull(u1Var);
        t70.Y(new w(u1Var, 0));
    }

    @Override // defpackage.v0
    public final void l(long j, String str, long j2, String str2, String str3, String str4) {
        JniAdExt.I0.post(new hp(JniAdExt.P2(), j, new RosterItem(0, 0, j2, j, str3, str2, str, "", str4, new String[0])));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c40
    public final void p0(Context context) {
        super.p0(context);
        if (context instanceof m80) {
            this.b0 = (m80) context;
        } else {
            v.e(context);
        }
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_abook_roster, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        bc bcVar = this.c0;
        if (bcVar != null) {
            bcVar.e = null;
            this.c0 = null;
        }
        m0 m0Var = this.d0;
        y yVar = m0Var.n;
        yVar.getClass();
        cf cfVar = m0Var.e;
        cfVar.getClass();
        xe xeVar = cfVar.g;
        xeVar.getClass();
        xeVar.f.remove(yVar);
        RecyclerView recyclerView = m0Var.i;
        m0Var.i = null;
        if (recyclerView != null) {
            g0 g0Var = m0Var.m;
            ArrayList arrayList = recyclerView.j0;
            if (arrayList != null) {
                arrayList.remove(g0Var);
            }
        }
        m0Var.h = null;
        m0Var.j = null;
        this.e0.setAdapter(null);
        this.e0.setLayoutManager(null);
        this.h0.setOnClickListener(null);
        this.i0.setOnClickListener(null);
        this.j0.b();
        this.d0 = null;
        this.e0 = null;
        this.g0 = null;
        this.f0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
    }

    @Override // defpackage.c40
    public final void u0() {
        this.F = true;
        this.b0 = null;
    }

    @Override // defpackage.wc0
    public final void w() {
        u1 u1Var = this.a0;
        Objects.requireNonNull(u1Var);
        t70.Y(new w(u1Var, 1));
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        AdEditText adEditText = this.j0;
        if (adEditText != null) {
            adEditText.i(false);
        }
    }
}
