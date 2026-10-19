package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class dz0 extends yt {
    public cz0 q0;
    public long r0;
    public String s0;
    public AdEditText t0;
    public final y6 u0 = new y6(this, new f(14, this));
    public final xt0 v0 = new xt0(6, this);

    public static void S0(dz0 dz0Var) {
        cz0 cz0Var;
        AdEditText adEditText = dz0Var.t0;
        if (adEditText == null) {
            return;
        }
        String text = adEditText.getText();
        if (text != null) {
            text = text.replaceAll("[;,\r\n]", "");
        }
        if (text == null || (cz0Var = dz0Var.q0) == null) {
            return;
        }
        cz0Var.A(text, dz0Var.r0);
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        String strN1 = JniAdExt.n1("ad.connect.sd.tile.rename");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_text, (ViewGroup) null);
        AdEditText adEditText = (AdEditText) viewInflate.findViewById(R.id.settings_dialog_text_input);
        this.t0 = adEditText;
        adEditText.l(this.s0, true);
        this.t0.setFilter("[;,\r\n]");
        this.t0.setTextListener(this.v0);
        this.u0.g();
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new bz0(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new bz0(this, 1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.q0 = (cz0) J0();
        if (bundle == null) {
            bundle = H0();
        }
        this.r0 = bundle.getLong("skey_rename_roster_id");
        String string = bundle.getString("skey_rename_name");
        this.s0 = string;
        if (string == null) {
            this.s0 = "";
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        AdEditText adEditText = this.t0;
        if (adEditText != null) {
            adEditText.b();
        }
        this.t0 = null;
        this.q0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putLong("skey_rename_roster_id", this.r0);
        String text = this.t0.getText();
        if (text == null) {
            text = "";
        }
        bundle.putString("skey_rename_name", text);
    }
}
