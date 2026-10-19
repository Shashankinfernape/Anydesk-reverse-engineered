package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAccess;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class z11 extends yt implements s21 {
    public SettingsFragmentAccess q0;
    public bc r0;
    public AdEditText s0;
    public View t0;
    public s u0;
    public ArrayList v0;
    public final y6 w0 = new y6(this, new f(15, this));
    public final x11 x0 = new x11(this);
    public final x11 y0 = new x11(this);
    public final y11 z0 = new y11(0, this);

    public static void S0(z11 z11Var) {
        String text;
        ArrayList arrayList;
        AdEditText adEditText = z11Var.s0;
        if (adEditText == null || (text = adEditText.getText()) == null || text.isEmpty() || (arrayList = z11Var.v0) == null) {
            return;
        }
        adEditText.l("", false);
        if (arrayList.contains(text)) {
            return;
        }
        arrayList.add(text);
        z11Var.z0.d();
    }

    @Override // defpackage.s21
    public final void N(String str, String str2) {
        int i;
        try {
            ArrayList arrayList = this.v0;
            if (arrayList != null && (i = Integer.parseInt(str)) >= 0 && i < arrayList.size()) {
                arrayList.set(i, str2);
                this.z0.d();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        String strN1 = JniAdExt.n1("ad.cfg.sec.acl");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_dialog_acl_list, (ViewGroup) null);
        this.s0 = (AdEditText) viewInflate.findViewById(R.id.dialog_acl_list_search_layout);
        this.t0 = viewInflate.findViewById(R.id.dialog_acl_list_new_item_btn);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.dialog_acl_list_items_view);
        s sVar = new s(1, this.z0.c);
        this.u0 = sVar;
        sVar.f = this.x0;
        recyclerView.setAdapter(sVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(a0()));
        this.s0.setFilter("[\r\n\t,;:]");
        this.s0.setTextListener(this.y0);
        this.w0.g();
        bu0.D(this.t0, JniAdExt.n1("ad.cfg.sec.acl.hint"));
        this.t0.setOnClickListener(new b(21, this));
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new a(this, 10));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.q0 = (SettingsFragmentAccess) J0();
        this.r0 = new bc(Z(), 19);
        if (bundle == null) {
            bundle = H0();
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("skey_list");
        this.v0 = stringArrayList;
        if (stringArrayList == null) {
            this.v0 = new ArrayList();
        }
        this.z0.d();
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        AdEditText adEditText = this.s0;
        if (adEditText != null) {
            adEditText.b();
        }
        bc bcVar = this.r0;
        if (bcVar != null) {
            bcVar.e = null;
        }
        this.r0 = null;
        this.q0 = null;
        this.s0 = null;
        this.v0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        ArrayList<String> arrayList = this.v0;
        if (arrayList != null) {
            bundle.putStringArrayList("skey_list", arrayList);
        }
    }
}
