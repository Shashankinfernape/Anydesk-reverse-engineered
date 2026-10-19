package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.anydesk.anydeskandroid.AnynetAccountInfo;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import com.google.android.material.button.MaterialButton;
import defpackage.b;
import defpackage.c;
import defpackage.g9;
import defpackage.h5;
import defpackage.hd0;
import defpackage.p;
import defpackage.r3;
import defpackage.t70;
import defpackage.uj;
import defpackage.z1;
import defpackage.z6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class AccountLoggedInFragment extends z6 implements hd0 {
    public final Logging b0 = new Logging("AccountLoggedInFragment");
    public boolean c0;
    public h5 d0;
    public TextView e0;
    public HorizontalScrollView f0;
    public TextView g0;
    public TextView h0;
    public TextView i0;
    public TextView j0;
    public MaterialButton k0;

    @Override // defpackage.z6, defpackage.c40
    public final void A0() {
        super.A0();
        JniAdExt.z1(this);
        JniAdExt.Y = this;
        T0();
    }

    @Override // defpackage.z6, defpackage.c40
    public final void B0() {
        super.B0();
        JniAdExt.Y = null;
        JniAdExt.X3(this);
    }

    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        super.C0(view, bundle);
        this.e0 = (TextView) view.findViewById(R.id.account_logged_in_header_initials);
        this.f0 = (HorizontalScrollView) view.findViewById(R.id.account_logged_in_header_fullname_container);
        this.g0 = (TextView) view.findViewById(R.id.account_logged_in_header_fullname);
        this.h0 = (TextView) view.findViewById(R.id.account_logged_in_header_email);
        this.i0 = (TextView) view.findViewById(R.id.account_logged_in_organization);
        this.j0 = (TextView) view.findViewById(R.id.account_logged_in_license);
        this.k0 = (MaterialButton) view.findViewById(R.id.account_logged_in_myad_btn);
        Button button = (Button) view.findViewById(R.id.account_logged_in_logout_btn);
        Button button2 = (Button) view.findViewById(R.id.account_logged_in_delete_btn);
        this.k0.setText(JniAdExt.n1("ad.account.license.my_anydesk"));
        button.setText(JniAdExt.n1("ad.account.license.logout"));
        button2.setText(JniAdExt.n1("ad.account.license.delete"));
        button.setOnClickListener(new z1(1));
        button2.setOnClickListener(new b(4, this));
        T0();
    }

    @Override // defpackage.hd0
    public final void F() {
        t70.Y(new c(6, this));
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    public final synchronized void R0() {
        if (!S0()) {
            uj.x(Y());
            uj.v(Y(), R.id.accountLoginFragment);
        }
    }

    public final synchronized boolean S0() {
        boolean z;
        z = this.c0;
        this.c0 = true;
        return z;
    }

    public final void T0() {
        String string;
        boolean z;
        AnynetAccountInfo anynetAccountInfoD1 = JniAdExt.D1();
        if (anynetAccountInfoD1 == null) {
            return;
        }
        if (anynetAccountInfoD1.mStatus != g9.as_logged_in) {
            h5 h5Var = this.d0;
            if (h5Var != null) {
                synchronized (h5Var) {
                    z = h5Var.m;
                }
                if (z) {
                    t70.g0(Y(), JniAdExt.n1("ad.account.logout.msg.android"), 1);
                }
                h5Var.c();
                h5Var.K(false);
            }
            R0();
            return;
        }
        String str = anynetAccountInfoD1.mUsername;
        String str2 = anynetAccountInfoD1.mFirstName + " " + anynetAccountInfoD1.mSurname;
        if (str2.isEmpty()) {
            string = "";
        } else {
            Pattern patternCompile = Pattern.compile("\\S");
            Pattern patternCompile2 = Pattern.compile("\\s");
            Matcher matcher = patternCompile.matcher(str2);
            Matcher matcher2 = patternCompile2.matcher(str2);
            StringBuilder sb = new StringBuilder();
            if (matcher.find()) {
                sb.append(str2.charAt(matcher.end() - 1));
                if (matcher2.find(matcher.end()) && matcher.find(matcher2.end())) {
                    sb.append(str2.charAt(matcher.end() - 1));
                }
            }
            string = sb.toString();
        }
        if (string.isEmpty() && !str.isEmpty()) {
            string = str.substring(0, 1).toUpperCase();
        }
        String str3 = anynetAccountInfoD1.mOrganization;
        boolean z2 = (str3.isEmpty() || "myanydesk".equals(str3)) ? false : true;
        String str4 = anynetAccountInfoD1.mUrl;
        r3.F(this.e0, string);
        r3.F(this.g0, str2);
        r3.F(this.h0, str);
        r3.F(this.j0, String.format(JniAdExt.n1("ad.account.license.info"), anynetAccountInfoD1.mLicense));
        r3.F(this.i0, z2 ? String.format(JniAdExt.n1("ad.account.license.org_info"), str3) : "");
        r3.I(this.e0, TextUtils.isEmpty(string) ? 8 : 0);
        r3.I(this.f0, str2.trim().isEmpty() ? 8 : 0);
        r3.I(this.i0, z2 ? 0 : 8);
        r3.I(this.k0, str4.isEmpty() ? 8 : 0);
        r3.E(this.k0, new p(this, 3, anynetAccountInfoD1));
    }

    @Override // defpackage.c40
    public final void q0(Bundle bundle) {
        super.q0(bundle);
        this.d0 = MainApplication.v().w;
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.c0 = false;
        G0().setTitle(JniAdExt.n1("ad.account.title"));
        return layoutInflater.inflate(R.layout.fragment_account_logged_in, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void s0() {
        this.F = true;
        this.d0 = null;
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        S0();
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
    }
}
