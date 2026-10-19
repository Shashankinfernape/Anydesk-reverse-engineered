package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentPermissions;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class j21 extends yt implements md0 {
    public bc q0;
    public AdEditText r0;
    public View s0;
    public s t0;
    public ArrayList u0;
    public SettingsFragmentPermissions w0;
    public final y6 v0 = new y6(this, new f(17, this));
    public final i21 x0 = new i21(this);
    public final i21 y0 = new i21(this);
    public final h z0 = new h(3, this);

    public static void S0(j21 j21Var, PermissionProfile permissionProfile) {
        bc bcVar = j21Var.q0;
        if (bcVar == null) {
            return;
        }
        String str = permissionProfile.a;
        r21 r21Var = new r21();
        Bundle bundle = new Bundle();
        if (str == null) {
            str = "";
        }
        bundle.putString("skey_pp_name", str);
        r21Var.N0(bundle);
        bcVar.p0(r21Var, "PermissionProfileEditDialog", false);
    }

    public static void T0(j21 j21Var) {
        if (JniAdExt.g2(io.KEY_PERM_PROFILES_CAN_CREATE)) {
            if (!JniAdExt.I1()) {
                SettingsFragmentPermissions settingsFragmentPermissions = j21Var.w0;
                if (settingsFragmentPermissions != null) {
                    settingsFragmentPermissions.r0.u(settingsFragmentPermissions.a0(), JniAdExt.r2(8));
                    return;
                }
                return;
            }
            AdEditText adEditText = j21Var.r0;
            if (adEditText == null) {
                return;
            }
            String text = adEditText.getText();
            if (text == null) {
                text = "";
            }
            bc bcVar = j21Var.q0;
            if (bcVar == null) {
                return;
            }
            bcVar.u0(null, text);
        }
    }

    @Override // defpackage.md0
    public final void H() {
        t70.Y(new bc0(16, this));
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        String strN1 = JniAdExt.n1("ad.cfg.sec.perm.permission_profiles");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_dialog_permission_profile_list, (ViewGroup) null);
        this.r0 = (AdEditText) viewInflate.findViewById(R.id.dialog_permission_profile_input_container);
        this.s0 = viewInflate.findViewById(R.id.dialog_permission_profile_list_new_item_btn);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.dialog_permission_profile_list_items_view);
        int i = 4;
        s sVar = new s(4, this.z0.c);
        this.t0 = sVar;
        sVar.f = this.x0;
        recyclerView.setAdapter(sVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(a0()));
        this.r0.setFilter("[\r\n\t,;:]");
        this.r0.setTextListener(this.y0);
        this.v0.g();
        bu0.D(this.s0, JniAdExt.n1("ad.cfg.sec.perm.profile.add"));
        this.s0.setOnClickListener(new b(22, this));
        r3.I(this.s0, JniAdExt.g2(io.KEY_PERM_PROFILES_CAN_CREATE) ? 0 : 8);
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.cfg.close"), new k4(i));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.w0 = (SettingsFragmentPermissions) J0();
        this.q0 = new bc(Z(), 19);
        this.u0 = new ArrayList();
        PermissionProfile[] permissionProfileArrF2 = JniAdExt.F2();
        this.u0.clear();
        if (permissionProfileArrF2 != null) {
            Collections.addAll(this.u0, permissionProfileArrF2);
        }
        this.z0.d();
        JniAdExt.B1(this);
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        zd zdVar = JniAdExt.e0;
        synchronized (zdVar) {
            zdVar.remove(this);
        }
        AdEditText adEditText = this.r0;
        if (adEditText != null) {
            adEditText.b();
        }
        bc bcVar = this.q0;
        if (bcVar != null) {
            bcVar.e = null;
        }
        this.w0 = null;
        this.q0 = null;
        this.u0 = null;
        this.r0 = null;
        this.s0 = null;
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
    }
}
