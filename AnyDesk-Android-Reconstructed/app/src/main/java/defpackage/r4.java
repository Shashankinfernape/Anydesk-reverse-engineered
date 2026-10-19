package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.BidiFormatter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditText;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class r4 extends yt implements ng0 {
    public Button A0;
    public final af1 B0 = new af1(11, this);
    public final q4 C0 = new q4(this, 0);
    public String q0;
    public boolean r0;
    public int s0;
    public ListenerScrollView t0;
    public View u0;
    public TextView v0;
    public AdEditText w0;
    public View x0;
    public View y0;
    public Button z0;

    public static void S0(r4 r4Var) {
        String text;
        AdEditText adEditText = r4Var.w0;
        if (adEditText == null || (text = adEditText.getText()) == null) {
            return;
        }
        String strTrim = text.trim();
        r4Var.r0 = true;
        r4Var.U0(strTrim);
        JniAdExt.I0.post(new ua0(strTrim, 0));
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        v7 v7Var = new v7(G0());
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = this.r0 ? JniAdExt.n1("ad.account.password_reset.email_sent.title") : JniAdExt.n1("ad.account.password_reset.title");
        this.s0 = (int) q51.h(25.0f, 160.0f);
        View viewInflate = G0().getLayoutInflater().inflate(R.layout.fragment_dialog_account_password_reset, (ViewGroup) null);
        if (viewInflate != null) {
            this.t0 = (ListenerScrollView) viewInflate.findViewById(R.id.dialog_account_password_reset_scroll_view);
            this.u0 = viewInflate.findViewById(R.id.dialog_account_password_reset_layout);
            this.v0 = (TextView) viewInflate.findViewById(R.id.dialog_account_password_reset_message);
            this.w0 = (AdEditText) viewInflate.findViewById(R.id.dialog_account_password_reset_email_input);
            this.x0 = viewInflate.findViewById(R.id.dialog_account_password_reset_scroll_hint_top);
            this.y0 = viewInflate.findViewById(R.id.dialog_account_password_reset_scroll_hint_bottom);
            this.w0.l(this.q0, false);
            if (this.r0) {
                U0(this.q0);
            } else {
                r3.F(this.v0, BidiFormatter.getInstance().unicodeWrap(JniAdExt.n1("ad.account.password_reset.text")));
                this.w0.setFilter("[\r\n\t]");
                this.w0.setTextListener(this.B0);
            }
            this.t0.setListener(this);
            this.u0.addOnLayoutChangeListener(this.C0);
        }
        r7Var.q = viewInflate;
        v7Var.d(this.r0 ? JniAdExt.n1("ad.account.register.login") : JniAdExt.n1("ad.account.password_reset.resetpassword"), null);
        if (!this.r0) {
            v7Var.b(JniAdExt.n1("ad.dlg.cancel"), null);
        }
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        w7VarA.setOnShowListener(new n4(this, 1));
        return w7VarA;
    }

    public final void T0(ListenerScrollView listenerScrollView) {
        if (listenerScrollView == null) {
            return;
        }
        int scrollY = listenerScrollView.getScrollY();
        View childAt = listenerScrollView.getChildAt(listenerScrollView.getChildCount() - 1);
        if (childAt == null) {
            return;
        }
        int bottom = childAt.getBottom() - (listenerScrollView.getHeight() + scrollY);
        r3.I(this.x0, scrollY < this.s0 ? 4 : 0);
        r3.I(this.y0, bottom < this.s0 ? 4 : 0);
    }

    public final void U0(String str) {
        Dialog dialog = this.k0;
        if (dialog != null) {
            dialog.setTitle(JniAdExt.n1("ad.account.password_reset.email_sent.title"));
        }
        r3.F(this.v0, t70.F(BidiFormatter.getInstance().unicodeWrap(JniAdExt.n1("ad.account.password_reset.email_sent.1")) + "<br><b>" + str + "</b><br><br>" + BidiFormatter.getInstance().unicodeWrap(JniAdExt.n1("ad.account.password_reset.email_sent.2"))));
        r3.C(this.w0, false);
        r3.I(this.w0, 8);
        r3.F(this.z0, JniAdExt.n1("ad.account.register.login"));
        r3.I(this.A0, 8);
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        T0(listenerScrollView);
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        if (bundle == null) {
            bundle = H0();
        }
        String string = bundle.getString("skey_email");
        this.q0 = string;
        if (string == null) {
            this.q0 = "";
        }
        this.r0 = bundle.getBoolean("skey_is_email_sent");
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.t0.setListener(null);
        this.u0.removeOnLayoutChangeListener(this.C0);
        AdEditText adEditText = this.w0;
        if (adEditText != null) {
            adEditText.b();
            this.w0 = null;
        }
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        String text = this.w0.getText();
        if (text == null) {
            text = "";
        }
        bundle.putString("skey_email", text);
        bundle.putBoolean("skey_is_email_sent", this.r0);
    }
}
