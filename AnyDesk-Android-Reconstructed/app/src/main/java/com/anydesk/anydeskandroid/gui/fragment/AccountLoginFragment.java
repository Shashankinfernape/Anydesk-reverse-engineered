package com.anydesk.anydeskandroid.gui.fragment;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.anydeskandroid.gui.element.AdEditTextSecure;
import com.anydesk.jni.JniAdExt;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import defpackage.af1;
import defpackage.bc;
import defpackage.h4;
import defpackage.h5;
import defpackage.i4;
import defpackage.i7;
import defpackage.j4;
import defpackage.lg;
import defpackage.n80;
import defpackage.q51;
import defpackage.qa;
import defpackage.r3;
import defpackage.t01;
import defpackage.t70;
import defpackage.tc0;
import defpackage.ua0;
import defpackage.uj;
import defpackage.v;
import defpackage.w30;
import defpackage.xc0;
import defpackage.z6;

/* JADX INFO: loaded from: classes.dex */
public class AccountLoginFragment extends z6 implements n80, xc0 {
    public boolean b0;
    public h5 c0;
    public bc d0;
    public CircularProgressIndicator e0;
    public CardView f0;
    public TextView g0;
    public LinearLayout h0;
    public AdEditTextSecure i0;
    public AdEditTextSecure j0;
    public TextView k0;
    public Button l0;
    public LinearLayout m0;
    public Button n0;
    public Button o0;
    public final w30 p0 = (w30) F0(new v(), new i4(0));
    public final af1 q0 = new af1(9, this);

    public static void R0(AccountLoginFragment accountLoginFragment) {
        boolean zJ;
        boolean z;
        r3.C(accountLoginFragment.l0, false);
        h5 h5Var = accountLoginFragment.c0;
        if (h5Var != null) {
            h5Var.N(true);
            accountLoginFragment.Z0(false);
        }
        AdEditTextSecure adEditTextSecure = accountLoginFragment.i0;
        AdEditTextSecure adEditTextSecure2 = accountLoginFragment.j0;
        if (adEditTextSecure == null || adEditTextSecure2 == null) {
            return;
        }
        t01 text = adEditTextSecure.getText();
        t01 text2 = adEditTextSecure2.getText();
        h5 h5Var2 = accountLoginFragment.c0;
        if (text.isEmpty() || text2.isEmpty()) {
            zJ = false;
        } else {
            t01 t01VarC = text.c();
            zJ = t70.J(t01VarC.c, true);
            t01VarC.b();
        }
        if (!zJ || h5Var2 == null) {
            text.b();
            text2.b();
            return;
        }
        h5Var2.J(null);
        h5Var2.M(false);
        accountLoginFragment.a1();
        accountLoginFragment.W0();
        h5Var2.K(false);
        String strO = h5Var2.o();
        t01 t01VarC2 = text.c();
        text.b();
        synchronized (h5Var2) {
            z = h5Var2.f;
        }
        JniAdExt.I0.post(new tc0(t01VarC2, text2, true, (!z || strO == null) ? "" : strO, ""));
    }

    @Override // defpackage.z6, defpackage.c40
    public final void A0() {
        super.A0();
        JniAdExt.r1(this);
        S0(true);
        T0();
    }

    @Override // defpackage.z6, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.T3(this);
        a1();
    }

    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        super.C0(view, bundle);
        this.d0 = new bc(Z(), 19);
        this.e0 = (CircularProgressIndicator) view.findViewById(R.id.account_login_progressindicator);
        this.f0 = (CardView) view.findViewById(R.id.account_login_error_card);
        this.g0 = (TextView) view.findViewById(R.id.account_login_error_text);
        this.h0 = (LinearLayout) view.findViewById(R.id.account_login_main_layout);
        TextView textView = (TextView) view.findViewById(R.id.account_login_email_title);
        this.i0 = (AdEditTextSecure) view.findViewById(R.id.account_login_email_input);
        TextView textView2 = (TextView) view.findViewById(R.id.account_login_password_title);
        this.j0 = (AdEditTextSecure) view.findViewById(R.id.account_login_password_input);
        this.k0 = (TextView) view.findViewById(R.id.account_login_forgot_password_hint);
        this.l0 = (Button) view.findViewById(R.id.account_login_btn);
        this.m0 = (LinearLayout) view.findViewById(R.id.account_login_options_layout);
        TextView textView3 = (TextView) view.findViewById(R.id.account_login_not_user_yet_text);
        Button button = (Button) view.findViewById(R.id.account_login_register_btn);
        this.n0 = (Button) view.findViewById(R.id.account_login_sso_btn);
        this.o0 = (Button) view.findViewById(R.id.account_login_private_btn);
        textView.setText(JniAdExt.n1("ad.account.email"));
        textView2.setText(JniAdExt.n1("ad.account.login.passwd"));
        this.k0.setText(t70.F("<u>" + lg.c().e(JniAdExt.n1("ad.account.login.forgot_passwd")) + "</u>"));
        this.l0.setText(JniAdExt.n1("ad.account.login.login"));
        textView3.setText(lg.c().e(JniAdExt.n1("ad.account.not_a_user_yet")));
        button.setText(JniAdExt.n1("ad.account.register.register"));
        this.n0.setText(JniAdExt.n1("ad.account.login.sso"));
        this.o0.setText(JniAdExt.n1("ad.account.login.pass"));
        this.k0.setOnClickListener(new j4(this, 0));
        this.l0.setOnClickListener(new j4(this, 1));
        button.setOnClickListener(new j4(this, 2));
        this.n0.setOnClickListener(new j4(this, 3));
        this.o0.setOnClickListener(new j4(this, 4));
        this.i0.setFilter("[\r\n\t   ]");
        AdEditTextSecure adEditTextSecure = this.i0;
        af1 af1Var = this.q0;
        adEditTextSecure.setTextListener(af1Var);
        this.j0.setFilter("[\r\n\t   ]");
        this.j0.setTextListener(af1Var);
        S0(true);
        T0();
    }

    @Override // defpackage.xc0
    public final void J() {
        t70.Y(new h4(this, 0));
    }

    @Override // defpackage.xc0
    public final void L() {
        t70.Y(new h4(this, 2));
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    public final void S0(boolean z) {
        h5 h5Var = this.c0;
        if (h5Var == null) {
            return;
        }
        if (h5Var.C()) {
            h5Var.M(false);
            X0();
            synchronized (this) {
                if (!b1()) {
                    uj.x(Y());
                    uj.v(Y(), R.id.accountLoggedInFragment);
                }
            }
            return;
        }
        Y0(z);
        AdEditTextSecure adEditTextSecure = this.i0;
        if (adEditTextSecure != null) {
            t01 text = adEditTextSecure.getText();
            boolean zIsEmpty = text.isEmpty();
            text.b();
            if (zIsEmpty) {
                adEditTextSecure.i(false);
                return;
            }
        }
        AdEditTextSecure adEditTextSecure2 = this.j0;
        if (adEditTextSecure2 != null) {
            adEditTextSecure2.i(false);
        }
    }

    public final void T0() {
        int i;
        h5 h5Var = this.c0;
        if (h5Var == null) {
            return;
        }
        synchronized (h5Var) {
            i = h5Var.D;
        }
        h5Var.h();
        int iR = q51.r(i);
        if (iR == 1) {
            V0();
        } else {
            if (iR != 2) {
                return;
            }
            Bitmap bitmap = JniAdExt.a;
            t70.V(new i7(5));
        }
    }

    public final void U0(boolean z) {
        h5 h5Var = this.c0;
        if (h5Var != null) {
            synchronized (h5Var) {
                h5Var.f = z;
            }
            h5Var.L(t01.e);
            h5Var.J(null);
        }
        Y0(false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0044  */
    public final void V0() {
        String str;
        h5 h5Var = this.c0;
        if (h5Var == null) {
            return;
        }
        synchronized (h5Var) {
            str = h5Var.h;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qa qaVarG0 = G0();
        if (str != null && t70.o(qaVarG0) != null) {
            try {
                this.p0.a(str);
            } catch (Throwable unused) {
                t70.g0(qaVarG0, String.format(JniAdExt.n1("ad.menu.help.android.open_failed"), str), 1);
                if (t70.Q(a0(), str, false)) {
                    t70.U(a0(), str);
                }
                String strN = h5Var.n();
                Bitmap bitmap = JniAdExt.a;
                t70.V(new ua0(strN, 1));
            }
            h5Var.K(true);
        } else if (t70.Q(a0(), str, false)) {
            t70.U(a0(), str);
        } else {
            h5Var.K(true);
        }
        String strN2 = h5Var.n();
        Bitmap bitmap2 = JniAdExt.a;
        t70.V(new ua0(strN2, 1));
    }

    public final void W0() {
        String str;
        h5 h5Var = this.c0;
        if (h5Var == null) {
            return;
        }
        synchronized (h5Var) {
            str = h5Var.c;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        r3.F(this.g0, zIsEmpty ? "" : lg.c().e(str));
        r3.I(this.f0, zIsEmpty ? 8 : 0);
    }

    public final void X0() {
        t01 t01Var;
        h5 h5Var = this.c0;
        if (h5Var == null) {
            return;
        }
        AdEditTextSecure adEditTextSecure = this.i0;
        if (adEditTextSecure != null) {
            synchronized (h5Var) {
                t01Var = h5Var.a;
            }
            adEditTextSecure.l(t01Var, false);
        }
        AdEditTextSecure adEditTextSecure2 = this.j0;
        if (adEditTextSecure2 != null) {
            adEditTextSecure2.l(h5Var.m(), false);
        }
    }

    public final void Y0(boolean z) {
        boolean z2;
        X0();
        Z0(z);
        W0();
        c1();
        h5 h5Var = this.c0;
        if (h5Var == null) {
            return;
        }
        LinearLayout linearLayout = this.m0;
        synchronized (h5Var) {
            z2 = h5Var.f;
        }
        r3.I(linearLayout, z2 ? 8 : 0);
        r3.I(this.o0, h5Var.B() ? 0 : 8);
    }

    public final void Z0(boolean z) {
        boolean z2;
        h5 h5Var = this.c0;
        if (h5Var == null) {
            return;
        }
        synchronized (h5Var) {
            z2 = h5Var.d;
        }
        boolean z3 = !z2;
        r3.C(this.i0, z3);
        r3.C(this.j0, z3);
        r3.C(this.k0, z3);
        r3.C(this.n0, z3);
        r3.C(this.o0, z3);
        r3.I(this.e0, z2 ? 0 : 8);
        r3.A(this.h0, z2 ? 0.5f : 1.0f);
        if (z && z2) {
            r3.C(this.l0, false);
        }
    }

    public final void a1() {
        h5 h5Var = this.c0;
        if (h5Var == null) {
            return;
        }
        AdEditTextSecure adEditTextSecure = this.i0;
        if (adEditTextSecure != null) {
            t01 text = adEditTextSecure.getText();
            t01 t01VarC = text.c();
            text.b();
            h5Var.I(t01VarC);
        }
        AdEditTextSecure adEditTextSecure2 = this.j0;
        if (adEditTextSecure2 != null) {
            h5Var.L(adEditTextSecure2.getText());
        }
    }

    public final synchronized boolean b1() {
        boolean z;
        z = this.b0;
        this.b0 = true;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    public final void c1() {
        boolean z;
        StringBuilder sb = new StringBuilder();
        h5 h5Var = this.c0;
        if (h5Var != null) {
            synchronized (h5Var) {
                z = h5Var.f;
            }
            if (z) {
                String strO = h5Var.o();
                if (TextUtils.isEmpty(strO)) {
                    sb.append(JniAdExt.n1("ad.account.login.title"));
                } else {
                    sb.append(JniAdExt.n1("ad.account.sso.title"));
                    sb.append(" ");
                    sb.append(strO);
                }
            } else {
                sb.append(JniAdExt.n1("ad.account.login.title"));
            }
        } else {
            sb.append(JniAdExt.n1("ad.account.login.title"));
        }
        G0().setTitle(sb.toString());
    }

    @Override // defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.c0 = MainApplication.v().w;
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.b0 = false;
        c1();
        return layoutInflater.inflate(R.layout.fragment_account_login, viewGroup, false);
    }

    @Override // defpackage.xc0
    public final void s() {
        t70.Y(new h4(this, 1));
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.c0 = null;
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        b1();
        bc bcVar = this.d0;
        if (bcVar != null) {
            bcVar.e = null;
            this.d0 = null;
        }
        this.i0.b();
        this.j0.b();
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
    }

    @Override // defpackage.n80
    public final boolean x() {
        AdEditTextSecure adEditTextSecure = this.j0;
        if (adEditTextSecure != null) {
            adEditTextSecure.l(t01.e, false);
        }
        h5 h5Var = this.c0;
        if (h5Var != null) {
            h5Var.L(t01.e);
            CardView cardView = this.f0;
            if (cardView != null && cardView.getVisibility() == 0) {
                h5Var.J(null);
            }
        }
        return false;
    }

    @Override // defpackage.z6, defpackage.c40
    public final void y0() {
        super.y0();
        AdEditTextSecure adEditTextSecure = this.i0;
        if (adEditTextSecure != null) {
            t01 text = adEditTextSecure.getText();
            boolean zIsEmpty = text.isEmpty();
            text.b();
            if (zIsEmpty) {
                adEditTextSecure.i(false);
                return;
            }
        }
        AdEditTextSecure adEditTextSecure2 = this.j0;
        if (adEditTextSecure2 != null) {
            adEditTextSecure2.i(false);
        }
    }
}
