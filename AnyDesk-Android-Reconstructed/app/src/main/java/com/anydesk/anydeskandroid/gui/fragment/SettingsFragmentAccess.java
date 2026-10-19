package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.a31;
import defpackage.a41;
import defpackage.bc;
import defpackage.c31;
import defpackage.c40;
import defpackage.d3;
import defpackage.hq;
import defpackage.i4;
import defpackage.io;
import defpackage.nd0;
import defpackage.q51;
import defpackage.r3;
import defpackage.s21;
import defpackage.t70;
import defpackage.w30;
import defpackage.xt0;
import defpackage.y31;
import defpackage.y90;
import defpackage.z21;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class SettingsFragmentAccess extends c40 implements s21, y31 {
    public TextView A0;
    public TextView B0;
    public CheckBox C0;
    public View D0;
    public TextView E0;
    public TextView F0;
    public TextView G0;
    public CheckBox H0;
    public TextView I0;
    public CheckBox J0;
    public TextView K0;
    public CheckBox L0;
    public View M0;
    public TextView N0;
    public TextView O0;
    public View P0;
    public TextView Q0;
    public CheckBox R0;
    public TextView S0;
    public CheckBox T0;
    public final w30 W0;
    public final w30 X0;
    public bc a0;
    public View b0;
    public View c0;
    public View d0;
    public View e0;
    public View f0;
    public TextView g0;
    public RadioButton h0;
    public TextView i0;
    public RadioButton j0;
    public TextView k0;
    public RadioButton l0;
    public TextView m0;
    public TextView n0;
    public CheckBox o0;
    public TextView p0;
    public View q0;
    public TextView r0;
    public CheckBox s0;
    public TextView t0;
    public CheckBox u0;
    public TextView v0;
    public CheckBox w0;
    public View x0;
    public View y0;
    public View z0;
    public final Logging Z = new Logging("SettingsFragmentAccess");
    public final xt0 U0 = new xt0(this);
    public boolean V0 = false;

    public SettingsFragmentAccess() {
        int i = 1;
        this.W0 = (w30) F0(new c31(this, 0), new i4(i));
        this.X0 = (w30) F0(new c31(this, 2), new i4(i));
    }

    public static void O0(SettingsFragmentAccess settingsFragmentAccess) {
        int i = 1;
        if (MainApplication.v().A()) {
            MainApplication.v().R(settingsFragmentAccess, new c31(settingsFragmentAccess, i));
            return;
        }
        JniAdExt.y4(io.KEY_SETTINGS_PROTECTION, 2);
        bc bcVar = settingsFragmentAccess.a0;
        if (bcVar != null) {
            bcVar.q0(0, JniAdExt.n1("ad.cfg.sec.misc.settings_protection.unavail.title"), JniAdExt.n1("ad.cfg.sec.misc.settings_protection.unavail.msg"), null, true, JniAdExt.n1("ad.dlg.ok"), null);
        }
        boolean z = settingsFragmentAccess.V0;
        settingsFragmentAccess.V0 = true;
        CheckBox checkBox = settingsFragmentAccess.T0;
        if (checkBox != null) {
            checkBox.setChecked(true);
        }
        settingsFragmentAccess.V0 = z;
    }

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        int i = 1;
        this.V0 = true;
        this.a0 = new bc(Z(), 19);
        this.b0 = view.findViewById(R.id.settings_group_access_interactive);
        this.c0 = view.findViewById(R.id.settings_group_access_unattended);
        this.d0 = view.findViewById(R.id.settings_group_access_acl);
        this.e0 = view.findViewById(R.id.settings_group_access_discovery);
        this.f0 = view.findViewById(R.id.settings_group_access_auto_disconnect);
        TextView textView = (TextView) view.findViewById(R.id.settings_access_title_interactive);
        this.g0 = (TextView) view.findViewById(R.id.settings_access_interactive_allow_always_description);
        this.h0 = (RadioButton) view.findViewById(R.id.settings_access_interactive_allow_always_radiobutton);
        this.i0 = (TextView) view.findViewById(R.id.settings_access_interactive_allow_running_description);
        this.j0 = (RadioButton) view.findViewById(R.id.settings_access_interactive_allow_running_radiobutton);
        this.k0 = (TextView) view.findViewById(R.id.settings_access_interactive_allow_never_description);
        this.l0 = (RadioButton) view.findViewById(R.id.settings_access_interactive_allow_never_radiobutton);
        r3.r(view.findViewById(R.id.settings_access_interactive_allow_always_layout), this.h0);
        r3.r(view.findViewById(R.id.settings_access_interactive_allow_running_layout), this.j0);
        r3.r(view.findViewById(R.id.settings_access_interactive_allow_never_layout), this.l0);
        textView.setText(JniAdExt.n1("ad.cfg.sec.access_mode"));
        this.g0.setText(JniAdExt.n1("ad.cfg.sec.access_mode.allow_always"));
        this.i0.setText(JniAdExt.n1("ad.cfg.sec.access_mode.allow_running"));
        this.k0.setText(JniAdExt.n1("ad.cfg.sec.access_mode.allow_never"));
        this.h0.setOnCheckedChangeListener(new z21(this, 7));
        this.j0.setOnCheckedChangeListener(new z21(this, 8));
        this.l0.setOnCheckedChangeListener(new z21(this, 9));
        TextView textView2 = (TextView) view.findViewById(R.id.settings_access_title_unattended);
        this.m0 = (TextView) view.findViewById(R.id.settings_access_unattended_alert_override_passwd);
        this.n0 = (TextView) view.findViewById(R.id.settings_access_unattended_allow_token_description);
        this.o0 = (CheckBox) view.findViewById(R.id.settings_access_unattended_allow_token_checkbox);
        this.p0 = (TextView) view.findViewById(R.id.settings_access_unattended_clear_token);
        this.q0 = view.findViewById(R.id.settings_access_unattended_clear_token_layout);
        this.r0 = (TextView) view.findViewById(R.id.settings_access_unattended_two_factor_auth_description);
        this.s0 = (CheckBox) view.findViewById(R.id.settings_access_unattended_two_factor_auth_checkbox);
        this.t0 = (TextView) view.findViewById(R.id.settings_access_unattended_two_factor_auth_saved_login_description);
        this.u0 = (CheckBox) view.findViewById(R.id.settings_access_unattended_two_factor_auth_saved_login_checkbox);
        this.v0 = (TextView) view.findViewById(R.id.settings_access_unattended_two_factor_auth_short_term_description);
        this.w0 = (CheckBox) view.findViewById(R.id.settings_access_unattended_two_factor_auth_short_term_checkbox);
        this.x0 = view.findViewById(R.id.settings_access_unattended_two_factor_auth_layout);
        this.y0 = view.findViewById(R.id.settings_access_unattended_two_factor_auth_saved_login_layout);
        this.z0 = view.findViewById(R.id.settings_access_unattended_two_factor_auth_short_term_layout);
        r3.r(view.findViewById(R.id.settings_access_unattended_allow_token_layout), this.o0);
        r3.r(view.findViewById(R.id.settings_access_unattended_two_factor_auth_layout), this.s0);
        r3.r(view.findViewById(R.id.settings_access_unattended_two_factor_auth_saved_login_layout), this.u0);
        r3.r(view.findViewById(R.id.settings_access_unattended_two_factor_auth_short_term_layout), this.w0);
        textView2.setText(JniAdExt.n1("ad.cfg.sec.access"));
        this.m0.setText(JniAdExt.n1("ad.connect.share.password_preset"));
        this.n0.setText(JniAdExt.n1("ad.cfg.sec.auto_logon.allow_token"));
        this.p0.setText(JniAdExt.n1("ad.cfg.sec.auto_logon.clear_token"));
        this.r0.setText(JniAdExt.n1("ad.cfg.sec.two_factor_auth.enable"));
        this.t0.setText(JniAdExt.n1("ad.cfg.sec.two_factor_auth.permanent_token"));
        this.v0.setText(JniAdExt.n1("ad.cfg.sec.two_factor_auth.volatile_token"));
        this.o0.setOnCheckedChangeListener(new z21(this, 10));
        int i2 = 2;
        this.q0.setOnClickListener(new a31(this, i2));
        this.s0.setOnCheckedChangeListener(new z21(this, 11));
        this.u0.setOnCheckedChangeListener(new z21(this, 12));
        int i3 = 0;
        this.w0.setOnCheckedChangeListener(new z21(this, i3));
        TextView textView3 = (TextView) view.findViewById(R.id.settings_access_title_acl);
        this.A0 = (TextView) view.findViewById(R.id.settings_access_hint_acl);
        this.B0 = (TextView) view.findViewById(R.id.settings_access_acl_enabled_description);
        this.C0 = (CheckBox) view.findViewById(R.id.settings_access_acl_enabled_checkbox);
        this.D0 = view.findViewById(R.id.settings_access_acl_list_layout);
        this.E0 = (TextView) view.findViewById(R.id.settings_access_acl_list_description);
        this.F0 = (TextView) view.findViewById(R.id.settings_access_acl_list_value);
        r3.r(view.findViewById(R.id.settings_access_acl_enabled_layout), this.C0);
        textView3.setText(JniAdExt.n1("ad.cfg.sec.acl"));
        this.A0.setText(JniAdExt.n1("ad.cfg.sec.acl.hint"));
        this.B0.setText(JniAdExt.n1("ad.cfg.sec.acl.restrict_access"));
        this.E0.setText(JniAdExt.n1("ad.cfg.sec.acl"));
        this.C0.setOnCheckedChangeListener(new z21(this, i));
        this.D0.setOnClickListener(new a31(this, i3));
        TextView textView4 = (TextView) view.findViewById(R.id.settings_access_title_discovery);
        this.G0 = (TextView) view.findViewById(R.id.settings_access_discovery_enabled_description);
        this.H0 = (CheckBox) view.findViewById(R.id.settings_access_discovery_enabled_checkbox);
        this.I0 = (TextView) view.findViewById(R.id.settings_access_discovery_hidden_description);
        this.J0 = (CheckBox) view.findViewById(R.id.settings_access_discovery_hidden_checkbox);
        r3.r(view.findViewById(R.id.settings_access_discovery_enabled_layout), this.H0);
        r3.r(view.findViewById(R.id.settings_access_discovery_hidden_layout), this.J0);
        textView4.setText(JniAdExt.n1("ad.cfg.sec.discovery.title"));
        this.G0.setText(JniAdExt.n1("ad.cfg.sec.discovery.enabled"));
        this.I0.setText(JniAdExt.n1("ad.cfg.sec.discovery.hidden"));
        this.H0.setOnCheckedChangeListener(new z21(this, i2));
        this.J0.setOnCheckedChangeListener(new z21(this, 3));
        TextView textView5 = (TextView) view.findViewById(R.id.settings_access_title_auto_disconnect);
        this.K0 = (TextView) view.findViewById(R.id.settings_access_auto_disconnect_enabled_description);
        this.L0 = (CheckBox) view.findViewById(R.id.settings_access_auto_disconnect_enabled_checkbox);
        this.M0 = view.findViewById(R.id.settings_access_auto_disconnect_timeout_layout);
        this.N0 = (TextView) view.findViewById(R.id.settings_access_auto_disconnect_timeout_description);
        this.O0 = (TextView) view.findViewById(R.id.settings_access_auto_disconnect_timeout_value);
        r3.r(view.findViewById(R.id.settings_access_auto_disconnect_enabled_layout), this.L0);
        textView5.setText(JniAdExt.n1("ad.cfg.sec.auto_disconnect.title"));
        this.K0.setText(JniAdExt.n1("ad.cfg.sec.auto_disconnect.enable"));
        this.N0.setText(JniAdExt.n1("ad.cfg.sec.auto_disconnect.timeout"));
        this.L0.setOnCheckedChangeListener(new z21(this, 4));
        this.M0.setOnClickListener(new a31(this, i));
        TextView textView6 = (TextView) view.findViewById(R.id.settings_access_title_misc);
        this.P0 = view.findViewById(R.id.settings_access_misc_kickout_layout);
        this.Q0 = (TextView) view.findViewById(R.id.settings_access_misc_kickout_description);
        this.R0 = (CheckBox) view.findViewById(R.id.settings_access_misc_kickout_checkbox);
        this.S0 = (TextView) view.findViewById(R.id.settings_access_misc_settings_protection_description);
        this.T0 = (CheckBox) view.findViewById(R.id.settings_access_misc_settings_protection_checkbox);
        r3.r(this.P0, this.R0);
        r3.r(view.findViewById(R.id.settings_access_misc_setttings_protection_layout), this.T0);
        textView6.setText(JniAdExt.n1("ad.cfg.misc"));
        this.Q0.setText(JniAdExt.n1("ad.cfg.sec.misc.kickout"));
        this.S0.setText(JniAdExt.n1("ad.cfg.sec.misc.settings_protection"));
        this.R0.setOnCheckedChangeListener(new z21(this, 5));
        this.T0.setOnCheckedChangeListener(new z21(this, 6));
        R0();
    }

    @Override // defpackage.c40
    public final void D0(Bundle bundle) {
        this.F = true;
        this.V0 = false;
    }

    @Override // defpackage.s21
    public final void N(String str, String str2) {
        Logging logging = this.Z;
        if (str2 == null) {
            return;
        }
        try {
            int i = Integer.parseInt(str2);
            if ("ad.security.auto_disconnect.timeout".equals(str)) {
                if (i <= 0) {
                    logging.a("invalid timeout in settings: ".concat(str2));
                    return;
                }
                io ioVar = io.KEY_AUTO_DISCONNECT_TIMEOUT;
                if (i != JniAdExt.h2(ioVar)) {
                    JniAdExt.y4(ioVar, i * 60);
                    t70.Y(new d3(this, 28, str2));
                }
            }
        } catch (NumberFormatException unused) {
            logging.a("invalid number in settings: ".concat(str2));
        }
    }

    public final void P0() {
        TextView textView = this.F0;
        if (textView == null) {
            return;
        }
        String[] strArrJ2 = JniAdExt.j2();
        Arrays.sort(strArrJ2);
        StringBuilder sb = new StringBuilder();
        for (String str : strArrJ2) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        textView.setText(sb.toString());
    }

    public final void Q0() {
        io ioVar = io.KEY_DISCOVERY_ENABLED;
        boolean zG2 = JniAdExt.g2(ioVar);
        r3.B(this.H0, zG2);
        CheckBox checkBox = this.J0;
        io ioVar2 = io.KEY_DISCOVERY_HIDDEN;
        r3.B(checkBox, JniAdExt.g2(ioVar2));
        boolean z = !JniAdExt.p3(ioVar);
        boolean zP3 = JniAdExt.p3(ioVar2);
        r3.C(this.G0, z);
        r3.C(this.H0, z);
        r3.C(this.I0, !zP3 && zG2);
        r3.C(this.J0, !zP3 && zG2);
    }

    public final void R0() {
        int i;
        int i2;
        boolean zG2 = JniAdExt.g2(io.KEY_LOGIN_ENABLED);
        io ioVar = io.KEY_INTERACTIVE_ACCESS;
        int iP = hq.p(JniAdExt.h2(ioVar));
        r3.B(this.h0, iP == 1 && zG2);
        r3.B(this.j0, iP == 2 && zG2);
        r3.B(this.l0, iP == 3 || !zG2);
        boolean z = !JniAdExt.p3(ioVar);
        r3.C(this.g0, z);
        r3.C(this.h0, z);
        r3.C(this.i0, z);
        r3.C(this.j0, z);
        r3.C(this.k0, z);
        r3.C(this.l0, z);
        S0();
        CheckBox checkBox = this.C0;
        io ioVar2 = io.KEY_ACL_ENABLED;
        r3.B(checkBox, JniAdExt.g2(ioVar2));
        P0();
        boolean z2 = !JniAdExt.p3(ioVar2);
        boolean z3 = !JniAdExt.p3(io.KEY_ACL_LIST);
        r3.C(this.B0, z2);
        r3.C(this.C0, z2);
        r3.C(this.E0, z3);
        r3.C(this.F0, z3);
        r3.C(this.D0, z3);
        Q0();
        CheckBox checkBox2 = this.L0;
        io ioVar3 = io.KEY_AUTO_DISCONNECT_MODE;
        int iH2 = JniAdExt.h2(ioVar3);
        int[] iArrS = q51.s(2);
        int length = iArrS.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i = 1;
                break;
            }
            i = iArrS[i3];
            if (q51.r(i) == iH2) {
                break;
            } else {
                i3++;
            }
        }
        r3.B(checkBox2, i == 2);
        TextView textView = this.O0;
        StringBuilder sb = new StringBuilder("");
        io ioVar4 = io.KEY_AUTO_DISCONNECT_TIMEOUT;
        sb.append(JniAdExt.h2(ioVar4) / 60);
        r3.F(textView, sb.toString());
        boolean z4 = JniAdExt.s2(28) == 0;
        boolean z5 = z4 && !JniAdExt.p3(ioVar3);
        boolean z6 = z4 && !JniAdExt.p3(ioVar4);
        r3.C(this.K0, z5);
        r3.C(this.L0, z5);
        r3.C(this.N0, z6);
        r3.C(this.M0, z6);
        r3.C(this.O0, z6);
        CheckBox checkBox3 = this.R0;
        io ioVar5 = io.KEY_KICKOUT;
        int iH3 = JniAdExt.h2(ioVar5);
        int[] iArrS2 = q51.s(2);
        int length2 = iArrS2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                i2 = 1;
                break;
            }
            i2 = iArrS2[i4];
            if (q51.r(i2) == iH3) {
                break;
            } else {
                i4++;
            }
        }
        r3.B(checkBox3, i2 == 2);
        CheckBox checkBox4 = this.T0;
        io ioVar6 = io.KEY_SETTINGS_PROTECTION;
        r3.B(checkBox4, y90.s(JniAdExt.h2(ioVar6)) != 1);
        boolean z7 = !JniAdExt.p3(ioVar5);
        boolean z8 = !JniAdExt.p3(ioVar6);
        r3.C(this.Q0, z7);
        r3.C(this.R0, z7);
        r3.C(this.S0, z8);
        r3.C(this.T0, z8);
        int i5 = JniAdExt.g2(io.KEY_FEATURE_ACCEPT) ? 0 : 8;
        r3.I(this.b0, i5);
        r3.I(this.c0, i5);
        r3.I(this.d0, i5);
        r3.I(this.f0, i5);
        r3.I(this.P0, i5);
        r3.I(this.e0, JniAdExt.g2(io.KEY_FEATURE_DISCOVERY) ? 0 : 8);
    }

    public final void S0() {
        boolean zL3 = JniAdExt.l3();
        int iH2 = JniAdExt.h2(io.KEY_TWO_FACTOR_AUTH_FLAGS);
        boolean zG2 = JniAdExt.g2(io.KEY_FEATURE_TWO_FACTOR_AUTH);
        CheckBox checkBox = this.o0;
        io ioVar = io.KEY_ALLOW_TOKEN;
        r3.B(checkBox, JniAdExt.g2(ioVar));
        r3.B(this.s0, zL3);
        r3.B(this.u0, (iH2 & 1) == 1);
        r3.B(this.w0, (iH2 & 2) == 2);
        int i = zG2 ? 0 : 8;
        r3.I(this.x0, i);
        r3.I(this.y0, i);
        r3.I(this.z0, i);
        boolean zG3 = JniAdExt.g2(io.KEY_FEATURE_UNATTENDED);
        boolean z = zG3 && !JniAdExt.p3(ioVar);
        boolean z2 = zG3 && zG2;
        boolean z3 = zG3 && zL3;
        r3.C(this.n0, z);
        r3.C(this.o0, z);
        r3.C(this.p0, z);
        r3.C(this.q0, z);
        r3.C(this.r0, z2);
        r3.C(this.s0, z2);
        r3.C(this.t0, z3);
        r3.C(this.u0, z3);
        r3.C(this.v0, z3);
        r3.C(this.w0, z3);
        r3.I(this.m0, zG3 && !JniAdExt.j3() ? 8 : 0);
        if (z2) {
            CheckBox checkBox2 = this.s0;
            int i2 = z ? R.id.settings_access_unattended_clear_token_layout : R.id.settings_access_unattended_allow_token_layout;
            if (checkBox2 != null) {
                checkBox2.setNextFocusUpId(i2);
            }
        }
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_settings_access, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        this.a0.e = null;
        this.a0 = null;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.j0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.q0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = null;
        this.x0 = null;
        this.y0 = null;
        this.z0 = null;
        this.A0 = null;
        this.B0 = null;
        this.C0 = null;
        this.D0 = null;
        this.E0 = null;
        this.F0 = null;
        this.K0 = null;
        this.L0 = null;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = null;
        this.P0 = null;
        this.Q0 = null;
        this.R0 = null;
        this.S0 = null;
        this.T0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
    }

    @Override // defpackage.y31
    public final void u(a41 a41Var, int i) {
        String[] strArr = nd0.e;
        if (t70.K() && a41Var == a41.h) {
            if (i == 1) {
                r3.m(this, strArr, this.W0);
            } else {
                if (i != 2) {
                    return;
                }
                r3.m(this, strArr, this.X0);
            }
        }
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        R0();
    }

    @Override // defpackage.y31
    public final void i(a41 a41Var) {
    }
}
