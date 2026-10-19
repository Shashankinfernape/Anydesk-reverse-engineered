package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class cc1 extends yt {
    public AdEditText q0;
    public String r0;
    public final xt0 s0 = new xt0(21, this);

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        String strN1 = JniAdExt.n1("ad.dlg.two_factor_auth.title");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        r7Var.c = R.drawable.ic_dialog_key_red;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_2fa_code, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_2fa_code_title);
        AdEditText adEditText = (AdEditText) viewInflate.findViewById(R.id.dialog_2fa_code_input);
        this.q0 = adEditText;
        adEditText.l(this.r0, false);
        this.q0.setTextListener(this.s0);
        textView.setText(JniAdExt.n1("ad.dlg.two_factor_auth.code"));
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new bc1(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new bc1(this, 1));
        w7 w7VarA = v7Var.a();
        R0(w7VarA);
        w7VarA.setCanceledOnTouchOutside(false);
        return w7VarA;
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        JniAdExt.V1();
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        String string = bundle.getString("skey_two_factor_code");
        this.r0 = string;
        if (string == null) {
            this.r0 = "";
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.q0.b();
        this.q0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        String text = this.q0.getText();
        if (text == null) {
            text = "";
        }
        bundle.putString("skey_two_factor_code", text);
    }
}
