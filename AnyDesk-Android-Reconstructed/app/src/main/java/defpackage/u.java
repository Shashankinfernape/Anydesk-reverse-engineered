package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class u extends yt {
    public AdEditText q0;
    public i r0;
    public String s0;
    public final y6 t0 = new y6(this, new f(1, this));
    public final af1 u0 = new af1(1, this);

    public static void S0(u uVar) {
        String text;
        AdEditText adEditText = uVar.q0;
        if (adEditText == null || (text = adEditText.getText()) == null) {
            return;
        }
        String strReplaceAll = text.replaceAll("[;,\r\n]", "");
        if (uVar.r0 != null) {
            JniAdExt.I0.post(new ua0(strReplaceAll, 2));
        }
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        String strN1 = JniAdExt.n1("ad.abook.menu.add");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_roster_create, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.abook_roster_create_name_input_title);
        this.q0 = (AdEditText) viewInflate.findViewById(R.id.abook_roster_create_name_input);
        textView.setText(JniAdExt.n1("ad.abook.dlg.new_name"));
        this.q0.setFilter("[;,\r\n]");
        this.q0.setTextListener(this.u0);
        this.q0.l(this.s0, false);
        this.t0.g();
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new t(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new t(this, 1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.r0 = (i) J0();
        if (bundle == null) {
            bundle = H0();
        }
        String string = bundle.getString("skey_edit_roster_name");
        this.s0 = string;
        if (string == null) {
            this.s0 = "";
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.q0.b();
        this.q0 = null;
        this.r0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        String text = this.q0.getText();
        if (text == null) {
            text = "";
        }
        bundle.putString("skey_edit_roster_name", text);
    }
}
