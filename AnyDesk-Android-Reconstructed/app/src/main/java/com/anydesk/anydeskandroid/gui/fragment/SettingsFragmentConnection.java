package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.a41;
import defpackage.bc;
import defpackage.c40;
import defpackage.e31;
import defpackage.f31;
import defpackage.i4;
import defpackage.io;
import defpackage.jp;
import defpackage.nd0;
import defpackage.r3;
import defpackage.s21;
import defpackage.t70;
import defpackage.w30;
import defpackage.xt0;
import defpackage.y31;

/* JADX INFO: loaded from: classes.dex */
public class SettingsFragmentConnection extends c40 implements s21, y31 {
    public View A0;
    public bc B0;
    public TextView a0;
    public TextView b0;
    public TextView c0;
    public View d0;
    public TextView e0;
    public CheckBox f0;
    public TextView g0;
    public TextView h0;
    public RadioButton i0;
    public TextView j0;
    public RadioButton k0;
    public TextView l0;
    public RadioButton m0;
    public TextView n0;
    public TextView o0;
    public View p0;
    public TextView q0;
    public TextView r0;
    public View s0;
    public TextView t0;
    public CheckBox u0;
    public TextView v0;
    public TextView w0;
    public View x0;
    public TextView y0;
    public TextView z0;
    public final Logging Z = new Logging("SettingsFragmentConnection");
    public boolean C0 = false;
    public final w30 D0 = (w30) F0(new xt0(12, this), new i4(1));

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        this.B0 = new bc(Z(), 19);
        this.a0 = (TextView) view.findViewById(R.id.settings_connection_title_misc);
        this.b0 = (TextView) view.findViewById(R.id.settings_connection_listen_port_description);
        this.c0 = (TextView) view.findViewById(R.id.settings_connection_listen_port_value);
        this.d0 = view.findViewById(R.id.settings_connection_listen_port);
        this.e0 = (TextView) view.findViewById(R.id.settings_connection_allow_direct_description);
        this.f0 = (CheckBox) view.findViewById(R.id.settings_connection_allow_direct_checkbox);
        this.g0 = (TextView) view.findViewById(R.id.settings_connection_title_proxy);
        this.h0 = (TextView) view.findViewById(R.id.settings_connection_proxy_mode_off_description);
        this.i0 = (RadioButton) view.findViewById(R.id.settings_connection_proxy_mode_off_radiobutton);
        this.j0 = (TextView) view.findViewById(R.id.settings_connection_proxy_mode_auto_description);
        this.k0 = (RadioButton) view.findViewById(R.id.settings_connection_proxy_mode_auto_radiobutton);
        this.l0 = (TextView) view.findViewById(R.id.settings_connection_proxy_mode_manual_description);
        this.m0 = (RadioButton) view.findViewById(R.id.settings_connection_proxy_mode_manual_radiobutton);
        this.n0 = (TextView) view.findViewById(R.id.settings_connection_proxy_server_description);
        this.o0 = (TextView) view.findViewById(R.id.settings_connection_proxy_server_value);
        this.p0 = view.findViewById(R.id.settings_connection_proxy_server);
        this.q0 = (TextView) view.findViewById(R.id.settings_connection_proxy_port_description);
        this.r0 = (TextView) view.findViewById(R.id.settings_connection_proxy_port_value);
        this.s0 = view.findViewById(R.id.settings_connection_proxy_port);
        this.t0 = (TextView) view.findViewById(R.id.settings_connection_proxy_auth_description);
        this.u0 = (CheckBox) view.findViewById(R.id.settings_connection_proxy_auth_checkbox);
        this.v0 = (TextView) view.findViewById(R.id.settings_connection_proxy_user_description);
        this.w0 = (TextView) view.findViewById(R.id.settings_connection_proxy_user_value);
        this.x0 = view.findViewById(R.id.settings_connection_proxy_user);
        this.y0 = (TextView) view.findViewById(R.id.settings_connection_proxy_password_description);
        this.z0 = (TextView) view.findViewById(R.id.settings_connection_proxy_password_value);
        this.A0 = view.findViewById(R.id.settings_connection_proxy_password);
        r3.r(view.findViewById(R.id.settings_connection_allow_direct_layout), this.f0);
        r3.r(view.findViewById(R.id.settings_connection_proxy_mode_off_layout), this.i0);
        r3.r(view.findViewById(R.id.settings_connection_proxy_mode_auto_layout), this.k0);
        r3.r(view.findViewById(R.id.settings_connection_proxy_mode_manual_layout), this.m0);
        r3.r(view.findViewById(R.id.settings_connection_proxy_auth_layout), this.u0);
        this.a0.setText(JniAdExt.n1("ad.cfg.connection.general"));
        this.e0.setText(JniAdExt.n1("ad.cfg.connection.direct"));
        this.g0.setText(JniAdExt.n1("ad.cfg.connection.proxy"));
        this.h0.setText(JniAdExt.n1("ad.cfg.connection.proxy.never_use"));
        this.j0.setText(JniAdExt.n1("ad.cfg.connection.proxy.try_detect"));
        this.l0.setText(JniAdExt.n1("ad.cfg.connection.proxy.specific_server"));
        this.n0.setText(JniAdExt.n1("ad.cfg.connection.proxy.server"));
        this.q0.setText(JniAdExt.n1("ad.cfg.connection.proxy.port"));
        this.t0.setText(JniAdExt.n1("ad.cfg.connection.proxy.auth.use"));
        this.v0.setText(JniAdExt.n1("ad.cfg.connection.proxy.auth.user"));
        this.y0.setText(JniAdExt.n1("ad.cfg.connection.proxy.auth.passwd"));
        int i = 2;
        this.d0.setOnClickListener(new e31(this, i));
        int i2 = 0;
        this.f0.setOnCheckedChangeListener(new f31(this, i2));
        int i3 = 1;
        this.i0.setOnCheckedChangeListener(new f31(this, i3));
        this.k0.setOnCheckedChangeListener(new f31(this, i));
        int i4 = 3;
        this.m0.setOnCheckedChangeListener(new f31(this, i4));
        this.p0.setOnClickListener(new e31(this, i4));
        int i5 = 4;
        this.s0.setOnClickListener(new e31(this, i5));
        this.u0.setOnCheckedChangeListener(new f31(this, i5));
        this.x0.setOnClickListener(new e31(this, i2));
        this.A0.setOnClickListener(new e31(this, i3));
        O0();
    }

    @Override // defpackage.s21
    public final void N(String str, String str2) {
        Logging logging = this.Z;
        if (str2 == null) {
            return;
        }
        if ("ad.anynet.proxy.addr".equals(str)) {
            t70.Y(new jp(this.o0, str2, 1));
            if (this.C0) {
                return;
            }
            JniAdExt.B4(io.KEY_PROXY_ADDR, str2);
            JniAdExt.Q3();
            return;
        }
        if ("ad.anynet.proxy.user".equals(str)) {
            t70.Y(new jp(this.w0, str2, 1));
            if (this.C0) {
                return;
            }
            JniAdExt.B4(io.KEY_PROXY_USER, str2);
            JniAdExt.Q3();
            return;
        }
        if ("ad.anynet.proxy.pass".equals(str)) {
            return;
        }
        try {
            int i = Integer.parseInt(str2);
            if ("ad.anynet.listen_port".equals(str)) {
                if (i < 0 || i > 65535) {
                    logging.a("invalid port number in settings: ".concat(str2));
                    return;
                }
                io ioVar = io.KEY_LISTEN_PORT;
                if (i != JniAdExt.h2(ioVar)) {
                    JniAdExt.y4(ioVar, i);
                    t70.Y(new jp(this.c0, str2, 1));
                    return;
                }
                return;
            }
            if ("ad.anynet.proxy.port".equals(str)) {
                if (i < 0 || i > 65535) {
                    logging.a("invalid port number in settings: ".concat(str2));
                    return;
                }
                io ioVar2 = io.KEY_PROXY_PORT;
                if (i != JniAdExt.h2(ioVar2)) {
                    t70.Y(new jp(this.r0, str2, 1));
                    if (this.C0 || JniAdExt.h2(ioVar2) == i) {
                        return;
                    }
                    JniAdExt.y4(ioVar2, i);
                    JniAdExt.Q3();
                }
            }
        } catch (NumberFormatException unused) {
            logging.a("invalid number in settings: ".concat(str2));
        }
    }

    public final void O0() {
        this.C0 = true;
        String str = "";
        r3.F(this.b0, JniAdExt.n1("ad.cfg.connection.general.local_port").concat(JniAdExt.g2(io.KEY_FEATURE_ACCEPT) ? " ".concat(JniAdExt.n1("ad.cfg.connection.general.local_port_hint")) : ""));
        io ioVar = io.KEY_LISTEN_PORT;
        int iH2 = JniAdExt.h2(ioVar);
        TextView textView = this.c0;
        StringBuilder sb = new StringBuilder("");
        if (iH2 == 0) {
            iH2 = JniAdExt.W2();
        }
        sb.append(iH2);
        r3.F(textView, sb.toString());
        CheckBox checkBox = this.f0;
        io ioVar2 = io.KEY_ALLOW_DIRECT;
        r3.B(checkBox, JniAdExt.g2(ioVar2));
        io ioVar3 = io.KEY_PROXY_MODE;
        int iH3 = JniAdExt.h2(ioVar3);
        r3.B(this.i0, iH3 == 0);
        r3.B(this.k0, iH3 == 1);
        r3.B(this.m0, iH3 == 2);
        TextView textView2 = this.o0;
        io ioVar4 = io.KEY_PROXY_ADDR;
        r3.F(textView2, JniAdExt.k2(ioVar4));
        TextView textView3 = this.r0;
        StringBuilder sb2 = new StringBuilder("");
        io ioVar5 = io.KEY_PROXY_PORT;
        sb2.append(JniAdExt.h2(ioVar5));
        r3.F(textView3, sb2.toString());
        CheckBox checkBox2 = this.u0;
        io ioVar6 = io.KEY_PROXY_AUTH;
        r3.B(checkBox2, JniAdExt.g2(ioVar6));
        TextView textView4 = this.w0;
        io ioVar7 = io.KEY_PROXY_USER;
        r3.F(textView4, JniAdExt.k2(ioVar7));
        TextView textView5 = this.z0;
        io ioVar8 = io.KEY_PROXY_PASS;
        String strK2 = JniAdExt.k2(ioVar8);
        if (strK2 != null && !strK2.isEmpty()) {
            str = "***";
        }
        r3.F(textView5, str);
        boolean z = !JniAdExt.p3(ioVar);
        boolean z2 = !JniAdExt.p3(ioVar2);
        boolean z3 = !JniAdExt.p3(ioVar3);
        boolean z4 = !JniAdExt.p3(ioVar4);
        boolean z5 = !JniAdExt.p3(ioVar5);
        boolean z6 = !JniAdExt.p3(ioVar6);
        boolean z7 = !JniAdExt.p3(ioVar7);
        boolean zP3 = true ^ JniAdExt.p3(ioVar8);
        r3.C(this.b0, z);
        r3.C(this.c0, z);
        r3.C(this.d0, z);
        r3.C(this.e0, z2);
        r3.C(this.f0, z2);
        r3.C(this.h0, z3);
        r3.C(this.i0, z3);
        r3.C(this.j0, z3);
        r3.C(this.k0, z3);
        r3.C(this.l0, z3);
        r3.C(this.m0, z3);
        r3.C(this.n0, z4);
        r3.C(this.o0, z4);
        r3.C(this.p0, z4);
        r3.C(this.q0, z5);
        r3.C(this.r0, z5);
        r3.C(this.s0, z5);
        r3.C(this.t0, z6);
        r3.C(this.u0, z6);
        r3.C(this.v0, z7);
        r3.C(this.w0, z7);
        r3.C(this.x0, z7);
        r3.C(this.y0, zP3);
        r3.C(this.z0, zP3);
        r3.C(this.A0, zP3);
        this.C0 = false;
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_settings_connection, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        this.B0.e = null;
        this.B0 = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
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
    }

    @Override // defpackage.y31
    public final void u(a41 a41Var, int i) {
        if (t70.K() && a41Var == a41.h && i == 1) {
            r3.m(this, nd0.e, this.D0);
        }
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        O0();
    }

    @Override // defpackage.y31
    public final void i(a41 a41Var) {
    }
}
