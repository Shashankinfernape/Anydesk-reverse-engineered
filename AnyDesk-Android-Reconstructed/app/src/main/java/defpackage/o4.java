package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* JADX INFO: loaded from: classes.dex */
public class o4 extends yt {
    public String q0;
    public boolean r0;
    public CircularProgressIndicator s0;
    public LinearLayout t0;
    public AdEditText u0;
    public Button v0;
    public Button w0;
    public final af1 x0 = new af1(10, this);

    public static void S0(o4 o4Var) {
        String text;
        AdEditText adEditText = o4Var.u0;
        if (adEditText == null || (text = adEditText.getText()) == null) {
            return;
        }
        o4Var.r0 = true;
        o4Var.T0();
        JniAdExt.I0.post(new ua0(text.trim(), 15));
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        v7 v7Var = new v7(G0());
        String strN1 = JniAdExt.n1("ad.account.otp.title");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        View viewInflate = G0().getLayoutInflater().inflate(R.layout.fragment_dialog_account_otp, (ViewGroup) null);
        int i = 0;
        if (viewInflate != null) {
            this.s0 = (CircularProgressIndicator) viewInflate.findViewById(R.id.dialog_account_otp_progressindicator);
            this.t0 = (LinearLayout) viewInflate.findViewById(R.id.dialog_account_otp_layout);
            TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_account_otp_message);
            this.u0 = (AdEditText) viewInflate.findViewById(R.id.dialog_account_otp_input);
            r3.F(textView, JniAdExt.n1("ad.account.otp.password"));
            this.u0.l(this.q0, false);
            this.u0.setTextListener(this.x0);
        }
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.account.login.login"), null);
        v7Var.b(JniAdExt.n1("ad.account.login.back"), null);
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        w7VarA.setOnShowListener(new n4(this, i));
        return w7VarA;
    }

    public final void T0() {
        r3.C(this.u0, !this.r0);
        r3.I(this.s0, this.r0 ? 0 : 8);
        r3.A(this.t0, this.r0 ? 0.5f : 1.0f);
        r3.C(this.w0, !this.r0);
        AdEditText adEditText = this.u0;
        if (adEditText != null) {
            String text = adEditText.getText();
            r3.C(this.v0, (this.r0 || text == null || text.trim().isEmpty()) ? false : true);
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        String string = bundle.getString("skey_num_otp");
        this.q0 = string;
        if (string == null) {
            this.q0 = "";
        }
        this.r0 = bundle.getBoolean("skey_is_in_wait_state");
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        AdEditText adEditText = this.u0;
        if (adEditText != null) {
            adEditText.b();
        }
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        String text = this.u0.getText();
        if (text == null) {
            text = "";
        }
        bundle.putString("skey_num_otp", text);
        bundle.putBoolean("skey_is_in_wait_state", this.r0);
    }
}
