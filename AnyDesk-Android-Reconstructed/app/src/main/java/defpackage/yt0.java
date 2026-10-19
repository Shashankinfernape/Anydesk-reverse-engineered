package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class yt0 extends yt {
    public boolean q0;
    public gf r0;
    public boolean t0;
    public AdEditTextSecure u0;
    public CheckBox v0;
    public t01 s0 = t01.e;
    public final xt0 w0 = new xt0(0, this);

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        String strN1;
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        LayoutInflater layoutInflater = qaVarG0.getLayoutInflater();
        String strN2 = JniAdExt.n1("ad.dlg.passwd.title");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN2;
        r7Var.c = R.drawable.ic_dialog_connecting;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_password, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_password_title);
        this.u0 = (AdEditTextSecure) viewInflate.findViewById(R.id.dialog_password_passwd);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_password_checkbox_description);
        this.v0 = (CheckBox) viewInflate.findViewById(R.id.dialog_password_checkbox);
        this.u0.setTextListener(this.w0);
        this.u0.l(this.s0, false);
        this.v0.setChecked(this.t0);
        this.v0.setVisibility(this.q0 ? 0 : 8);
        textView2.setText(JniAdExt.n1("ad.dlg.passwd.remember"));
        textView2.setVisibility(this.q0 ? 0 : 8);
        int i = this.r0.c;
        boolean z = (i & 4) == 4;
        boolean z2 = (i & 1) == 1;
        boolean z3 = (i & 8) == 8;
        if (!z2 || (z && z3)) {
            strN1 = (z2 && z3 && z) ? JniAdExt.n1("ad.dlg.passwd.msg_pw_or_open") : JniAdExt.n1("ad.dlg.passwd.msg_no_interactive");
        } else {
            strN1 = JniAdExt.n1("ad.dlg.passwd.msg");
        }
        textView.setText(strN1);
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new wt0(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new wt0(this, 1));
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
        Bundle bundleH0 = bundle != null ? bundle : H0();
        this.q0 = bundleH0.getBoolean("skey_passwd_supports_token");
        this.r0 = (gf) t70.A(bundleH0, "skey_passwd_flags", gf.class);
        this.s0.b();
        t01 t01Var = (t01) t70.A(bundleH0, "skey_passwd_passwd", t01.class);
        this.s0 = t01Var;
        if (t01Var == null) {
            this.s0 = t01.e;
        }
        if (bundle != null) {
            bundle.remove("skey_passwd_passwd");
        }
        this.t0 = bundleH0.getBoolean("skey_passwd_auto_login");
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.s0.b();
        this.u0.b();
        this.u0 = null;
        this.v0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        bundle.putBoolean("skey_passwd_supports_token", this.q0);
        bundle.putSerializable("skey_passwd_flags", this.r0);
        bundle.putSerializable("skey_passwd_passwd", this.u0.getText());
        bundle.putBoolean("skey_passwd_auto_login", this.v0.isChecked());
    }
}
