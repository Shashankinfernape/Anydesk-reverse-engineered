package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class ju0 extends yt {
    public j21 q0;
    public String r0;
    public String s0;
    public AdEditText t0;
    public TextView u0;
    public Button v0;
    public final y6 w0 = new y6(this, new f(13, this));
    public final xt0 x0 = new xt0(1, this);

    public static void S0(ju0 ju0Var) {
        AdEditText adEditText = ju0Var.t0;
        if (adEditText == null) {
            return;
        }
        String text = adEditText.getText();
        if (text != null) {
            text = text.replaceAll("[\r\n\t.,;:=]", "");
        }
        if (text == null || ju0Var.q0 == null) {
            return;
        }
        String str = ju0Var.r0;
        if (str == null) {
            JniAdExt.L3(text);
        } else {
            JniAdExt.b4(str, text);
        }
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        r7 r7Var = (r7) v7Var.d;
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        r7Var.e = this.r0 == null ? JniAdExt.n1("ad.cfg.sec.perm.profile.add") : JniAdExt.n1("ad.cfg.sec.perm.profile.rename");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_text, (ViewGroup) null);
        this.u0 = (TextView) viewInflate.findViewById(R.id.settings_dialog_text_input_state);
        AdEditText adEditText = (AdEditText) viewInflate.findViewById(R.id.settings_dialog_text_input);
        this.t0 = adEditText;
        adEditText.l(this.s0, true);
        this.t0.setFilter("[\r\n\t.,;:=]");
        this.t0.setTextListener(this.x0);
        this.w0.g();
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new iu0(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new iu0(this, 1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        w7VarA.setOnShowListener(new n4(this, 10));
        return w7VarA;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.q0 = (j21) J0();
        if (bundle == null) {
            bundle = H0();
        }
        this.r0 = bundle.getString("skey_pp_id");
        String string = bundle.getString("skey_pp_name");
        this.s0 = string;
        if (string == null) {
            this.s0 = "";
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.t0.b();
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.q0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putString("skey_pp_id", this.r0);
        String text = this.t0.getText();
        if (text == null) {
            text = "";
        }
        bundle.putString("skey_pp_name", text);
    }
}
