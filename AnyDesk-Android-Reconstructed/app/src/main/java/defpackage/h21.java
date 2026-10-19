package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import com.anydesk.anydeskandroid.gui.element.ListenerScrollView;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public class h21 extends yt implements ng0 {
    public t01 A0;
    public t01 B0;
    public String C0;
    public String D0;
    public String E0;
    public String F0;
    public String G0;
    public final xt0 H0;
    public final q4 I0;
    public g21 q0;
    public int r0;
    public ListenerScrollView s0;
    public View t0;
    public AdEditTextSecure u0;
    public AdEditTextSecure v0;
    public TextView w0;
    public View x0;
    public View y0;
    public Button z0;

    public h21() {
        t01 t01Var = t01.e;
        this.A0 = t01Var;
        this.B0 = t01Var;
        this.H0 = new xt0(7, this);
        this.I0 = new q4(this, 13);
    }

    public static void S0(h21 h21Var) {
        AdEditTextSecure adEditTextSecure = h21Var.u0;
        t01 text = adEditTextSecure == null ? t01.e : adEditTextSecure.getText();
        AdEditTextSecure adEditTextSecure2 = h21Var.v0;
        t01 text2 = adEditTextSecure2 == null ? t01.e : adEditTextSecure2.getText();
        t01 t01VarA = t01.a(text.c.length > text2.c.length ? text : text2);
        boolean zEquals = text.equals(text2);
        boolean z = (text.isEmpty() || text2.isEmpty()) ? false : true;
        text.b();
        text2.b();
        int iK3 = JniAdExt.K3(t01.a(t01VarA));
        boolean zV3 = JniAdExt.v3(t01.a(t01VarA));
        t01VarA.b();
        TextView textView = h21Var.w0;
        Button button = h21Var.z0;
        if (z && !zEquals) {
            if (textView != null) {
                textView.setText(h21Var.C0);
            }
            if (button != null) {
                button.setEnabled(false);
                return;
            }
            return;
        }
        if (zV3) {
            if (textView != null) {
                textView.setText(h21Var.D0);
            }
            if (button != null) {
                button.setEnabled(false);
                return;
            }
            return;
        }
        if (iK3 >= 2) {
            if (textView != null) {
                textView.setText(h21Var.F0);
            }
            if (button != null) {
                button.setEnabled(z);
                return;
            }
            return;
        }
        if (iK3 <= 0) {
            if (textView != null) {
                textView.setText(h21Var.G0);
            }
            if (button != null) {
                button.setEnabled(false);
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setText(h21Var.E0);
        }
        if (button != null) {
            button.setEnabled(z);
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void A0() {
        super.A0();
        AdEditTextSecure adEditTextSecure = this.u0;
        if (adEditTextSecure != null) {
            adEditTextSecure.l(this.A0, false);
        }
        AdEditTextSecure adEditTextSecure2 = this.v0;
        if (adEditTextSecure2 != null) {
            adEditTextSecure2.l(this.B0, false);
        }
    }

    @Override // defpackage.xt
    public final Dialog P0(Bundle bundle) {
        qa qaVarG0 = G0();
        v7 v7Var = new v7(qaVarG0);
        String strN1 = JniAdExt.n1("ad.connect.share.set_passwd");
        r7 r7Var = (r7) v7Var.d;
        r7Var.e = strN1;
        this.r0 = (int) q51.h(25.0f, 160.0f);
        View viewInflate = qaVarG0.getLayoutInflater().inflate(R.layout.fragment_dialog_passwd, (ViewGroup) null);
        this.s0 = (ListenerScrollView) viewInflate.findViewById(R.id.settings_dialog_passwd_scroll_view);
        this.t0 = viewInflate.findViewById(R.id.settings_dialog_passwd_layout);
        TextView textView = (TextView) viewInflate.findViewById(R.id.settings_dialog_passwd_input_title);
        this.u0 = (AdEditTextSecure) viewInflate.findViewById(R.id.settings_dialog_passwd_input);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.settings_dialog_passwd_input_confirm_title);
        this.v0 = (AdEditTextSecure) viewInflate.findViewById(R.id.settings_dialog_passwd_input_confirm);
        this.w0 = (TextView) viewInflate.findViewById(R.id.settings_dialog_passwd_state);
        this.x0 = viewInflate.findViewById(R.id.settings_dialog_passwd_scroll_hint_top);
        this.y0 = viewInflate.findViewById(R.id.settings_dialog_passwd_scroll_hint_bottom);
        this.C0 = JniAdExt.n1("ad.cfg.sec.access.not_matching");
        this.D0 = JniAdExt.n1("ad.cfg.sec.strength.already_in_use");
        this.E0 = JniAdExt.n1("ad.cfg.sec.strength.medium");
        this.F0 = JniAdExt.n1("ad.cfg.sec.strength.safe");
        this.G0 = JniAdExt.n1("ad.cfg.sec.strength.weak");
        textView.setText(JniAdExt.n1("ad.cfg.sec.access.passwd"));
        textView2.setText(JniAdExt.n1("ad.cfg.sec.access.conf_passwd"));
        AdEditTextSecure adEditTextSecure = this.u0;
        xt0 xt0Var = this.H0;
        adEditTextSecure.setTextListener(xt0Var);
        this.v0.setTextListener(xt0Var);
        this.s0.setListener(this);
        this.t0.addOnLayoutChangeListener(this.I0);
        r7Var.q = viewInflate;
        v7Var.d(JniAdExt.n1("ad.dlg.ok"), new f21(this, 0));
        v7Var.b(JniAdExt.n1("ad.dlg.cancel"), new f21(this, 1));
        w7 w7VarA = v7Var.a();
        w7VarA.setCanceledOnTouchOutside(false);
        w7VarA.setOnShowListener(new n4(this, 12));
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
        r3.I(this.x0, scrollY < this.r0 ? 4 : 0);
        r3.I(this.y0, bottom < this.r0 ? 4 : 0);
    }

    @Override // defpackage.ng0
    public final void a(ListenerScrollView listenerScrollView) {
        T0(listenerScrollView);
    }

    @Override // defpackage.xt, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        g21 g21Var = this.q0;
        if (g21Var != null) {
            r21 r21Var = (r21) g21Var;
            r21Var.T0();
            t70.Y(new n21(r21Var, 0));
        }
    }

    @Override // defpackage.xt, defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.q0 = (g21) J0();
        Bundle bundleH0 = bundle != null ? bundle : H0();
        this.A0.b();
        t01 t01Var = (t01) t70.A(bundleH0, "skey_settings_passwd", t01.class);
        this.A0 = t01Var;
        if (t01Var == null) {
            this.A0 = t01.e;
        }
        if (bundle != null) {
            bundle.remove("skey_settings_passwd");
        }
        this.B0.b();
        t01 t01Var2 = (t01) t70.A(bundleH0, "skey_settings_passwd_confirm", t01.class);
        this.B0 = t01Var2;
        if (t01Var2 == null) {
            this.B0 = t01.e;
        }
        if (bundle != null) {
            bundle.remove("skey_settings_passwd_confirm");
        }
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.A0.b();
        this.B0.b();
        this.s0.setListener(null);
        this.t0.removeOnLayoutChangeListener(this.I0);
        this.u0.b();
        this.v0.b();
        this.q0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.z0 = null;
        this.x0 = null;
        this.y0 = null;
    }

    @Override // defpackage.xt, defpackage.c40
    public final void z0(Bundle bundle) {
        super.z0(bundle);
        AdEditTextSecure adEditTextSecure = this.u0;
        bundle.putSerializable("skey_settings_passwd", adEditTextSecure == null ? t01.e : adEditTextSecure.getText());
        AdEditTextSecure adEditTextSecure2 = this.v0;
        bundle.putSerializable("skey_settings_passwd_confirm", adEditTextSecure2 == null ? t01.e : adEditTextSecure2.getText());
    }
}
