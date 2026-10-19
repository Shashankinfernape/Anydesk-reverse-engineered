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
public class z0 extends yt {
    public y0 q0;
    public long r0;
    public String s0;
    public String t0;
    public AdEditText u0;
    public final y6 v0 = new y6(this, new f(4, this));
    public final af1 w0 = new af1(6, this);

    public static void S0(z0 z0Var) {
        y0 y0Var;
        AdEditText adEditText = z0Var.u0;
        if (adEditText == null) {
            return;
        }
        String text = adEditText.getText();
        if (text != null) {
            text = text.replaceAll("[;,\r\n]", "");
        }
        if (text == null || text.equals(z0Var.s0) || (y0Var = z0Var.q0) == null) {
            return;
        }
        y0Var.j(z0Var.s0, z0Var.r0, text);
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        String strN1 = JniAdExt.n1("ad.abook.item.menu.rename");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_text, (ViewGroup) null);
        AdEditText adEditText = (AdEditText) viewInflate.findViewById(R.id.settings_dialog_text_input);
        this.u0 = adEditText;
        adEditText.l(this.t0, true);
        this.u0.setFilter("[;,\r\n]");
        this.u0.setTextListener(this.w0);
        this.v0.g();
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new x0(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new x0(this, 1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.q0 = (y0) J0();
        if (bundle == null) {
            bundle = H0();
        }
        this.r0 = bundle.getLong("skey_rename_roster_id");
        String string = bundle.getString("skey_rename_tag");
        this.s0 = string;
        if (string == null) {
            this.s0 = "";
        }
        String string2 = bundle.getString("skey_rename_new_name");
        this.t0 = string2;
        if (string2 == null) {
            this.t0 = "";
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        AdEditText adEditText = this.u0;
        if (adEditText != null) {
            adEditText.b();
        }
        this.u0 = null;
        this.q0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putLong("skey_rename_roster_id", this.r0);
        bundle.putString("skey_rename_tag", this.s0);
        String text = this.u0.getText();
        if (text == null) {
            text = "";
        }
        bundle.putString("skey_rename_new_name", text);
    }
}
