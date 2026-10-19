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
public class w0 extends yt {
    public v0 q0;
    public long r0;
    public String s0;
    public long t0;
    public String u0;
    public String v0;
    public String w0;
    public AdEditText x0;
    public final y6 y0 = new y6(this, new f(3, this));
    public final af1 z0 = new af1(5, this);

    public static void S0(w0 w0Var) {
        String text;
        AdEditText adEditText = w0Var.x0;
        if (adEditText == null || (text = adEditText.getText()) == null) {
            return;
        }
        String strReplaceAll = text.replaceAll("[;,\r\n]", "");
        v0 v0Var = w0Var.q0;
        if (v0Var != null) {
            v0Var.l(w0Var.r0, strReplaceAll, w0Var.t0, w0Var.u0, w0Var.v0, w0Var.w0);
        }
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        String strN1 = JniAdExt.n1("ad.connect.sd.tile.rename");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_roster_item_edit, (ViewGroup) null);
        AdEditText adEditText = (AdEditText) viewInflate.findViewById(R.id.abook_roster_item_edit_name_input);
        this.x0 = adEditText;
        adEditText.setFilter("[;,\r\n]");
        this.x0.setTextListener(this.z0);
        this.x0.l(this.s0, false);
        this.y0.g();
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new u0(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new u0(this, 1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.q0 = (v0) J0();
        if (bundle == null) {
            bundle = H0();
        }
        this.r0 = bundle.getLong("skey_edit_roster_item_id");
        String string = bundle.getString("skey_edit_roster_item_name");
        this.s0 = string;
        if (string == null) {
            this.s0 = "";
        }
        this.t0 = bundle.getLong("skey_edit_roster_item_cid");
        String string2 = bundle.getString("skey_edit_roster_item_alias");
        this.u0 = string2;
        if (string2 == null) {
            this.u0 = "";
        }
        String string3 = bundle.getString("skey_edit_roster_item_hostname");
        this.v0 = string3;
        if (string3 == null) {
            this.v0 = "";
        }
        String string4 = bundle.getString("skey_edit_roster_item_comment");
        this.w0 = string4;
        if (string4 == null) {
            this.w0 = "";
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.x0.b();
        this.x0 = null;
        this.q0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putLong("skey_edit_roster_item_id", this.r0);
        String text = this.x0.getText();
        if (text == null) {
            text = "";
        }
        bundle.putString("skey_edit_roster_item_name", text);
        bundle.putLong("skey_edit_roster_item_cid", this.t0);
        bundle.putString("skey_edit_roster_item_alias", this.u0);
        bundle.putString("skey_edit_roster_item_hostname", this.v0);
        bundle.putString("skey_edit_roster_item_comment", this.w0);
    }
}
