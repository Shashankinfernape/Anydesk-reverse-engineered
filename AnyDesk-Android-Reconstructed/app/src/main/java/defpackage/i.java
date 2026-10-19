package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.Roster;
import com.anydesk.anydeskandroid.RosterItem;
import com.anydesk.anydeskandroid.RosterItemFilter;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class i extends yt implements wc0, cz0 {
    public AdEditText q0;
    public View r0;
    public RecyclerView s0;
    public s t0;
    public ArrayList u0;
    public bc v0;
    public final y6 w0 = new y6(this, new f(0, this));
    public final g x0 = new g(this);
    public final g y0 = new g(this);
    public final h z0 = new h(0, this);

    public static void S0(i iVar) {
        AdEditText adEditText;
        bc bcVar = iVar.v0;
        if (bcVar == null || (adEditText = iVar.q0) == null) {
            return;
        }
        String text = adEditText.getText();
        if (text == null) {
            text = "";
        }
        u uVar = new u();
        Bundle bundle = new Bundle();
        bundle.putString("skey_edit_roster_name", text);
        uVar.N0(bundle);
        bcVar.p0(uVar, "AbookRosterCreateDialog", true);
    }

    @Override // defpackage.cz0
    public final void A(String str, long j) {
        if (str.isEmpty()) {
            return;
        }
        JniAdExt.I0.post(new wa0(j, str, 0));
    }

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        JniAdExt.q1(this);
        T0();
    }

    @Override // defpackage.xt, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.S3(this);
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void P() {
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        this.v0 = new bc(Z(), 19);
        String strN1 = JniAdExt.n1("ad.abook.management.title");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_abook_management, (ViewGroup) null);
        this.q0 = (AdEditText) viewInflate.findViewById(R.id.abook_management_search_layout);
        this.r0 = viewInflate.findViewById(R.id.abook_management_button_new_item);
        this.s0 = (RecyclerView) viewInflate.findViewById(R.id.abook_management_rosters);
        bu0.D(this.r0, JniAdExt.n1("ad.abook.menu.add"));
        this.r0.setOnClickListener(new b(1, this));
        this.u0 = new ArrayList();
        s sVar = new s(0, this.z0.c);
        this.t0 = sVar;
        sVar.f = this.y0;
        this.s0.setAdapter(sVar);
        this.s0.setLayoutManager(new LinearLayoutManager(a0()));
        this.q0.setFilter("[\r\n\t]");
        this.q0.setTextListener(this.x0);
        this.w0.g();
        r7Var.q = viewInflate;
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(true);
        return w7VarA;
    }

    @Override // defpackage.wc0
    public final /* synthetic */ void S(long j, RosterItemFilter rosterItemFilter, RosterItem[] rosterItemArr, int i, boolean z) {
    }

    public final void T0() {
        Roster[] rosterArrO2 = JniAdExt.O2();
        if (rosterArrO2 != null) {
            this.u0.clear();
            for (Roster roster : rosterArrO2) {
                this.u0.add(roster);
            }
        }
        this.z0.d();
    }

    @Override // defpackage.wc0
    public final void f() {
        t70.Y(new c(1, this));
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.v0.e = null;
        this.s0.setAdapter(null);
        this.s0.setLayoutManager(null);
        this.t0.f = null;
        this.q0.b();
        this.r0.setOnClickListener(null);
        this.v0 = null;
        this.s0 = null;
        this.t0 = null;
        this.q0 = null;
        this.r0 = null;
    }

    @Override // defpackage.wc0
    public final void w() {
        t70.Y(new c(1, this));
    }

    @Override // defpackage.wc0
    public final void B() {
    }

    @Override // defpackage.wc0
    public final void O() {
    }

    @Override // defpackage.wc0
    public final void V() {
    }

    @Override // defpackage.wc0
    public final void k() {
    }
}
