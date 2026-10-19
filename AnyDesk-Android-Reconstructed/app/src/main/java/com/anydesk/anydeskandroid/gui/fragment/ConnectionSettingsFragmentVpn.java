package com.anydesk.anydeskandroid.gui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.bc;
import defpackage.c3;
import defpackage.c40;
import defpackage.cd0;
import defpackage.d3;
import defpackage.hp;
import defpackage.ip;
import defpackage.jp;
import defpackage.jr0;
import defpackage.kd0;
import defpackage.m80;
import defpackage.r3;
import defpackage.s21;
import defpackage.t70;
import defpackage.uj;
import defpackage.v;
import defpackage.wh;
import defpackage.zd;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionSettingsFragmentVpn extends c40 implements kd0, cd0, s21 {
    public TextView Z;
    public View a0;
    public TextView b0;
    public TextView c0;
    public TextView d0;
    public TextView e0;
    public View f0;
    public View g0;
    public TextView h0;
    public TextView i0;
    public View j0;
    public TextView k0;
    public TextView l0;
    public TextView m0;
    public Button n0;
    public Button o0;
    public bc p0;
    public m80 q0;

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        this.p0 = new bc(Z(), 19);
        this.Z = (TextView) view.findViewById(R.id.setup_vpn_status);
        this.a0 = view.findViewById(R.id.setup_vpn_info);
        this.b0 = (TextView) view.findViewById(R.id.setup_vpn_info_local_ip);
        this.c0 = (TextView) view.findViewById(R.id.setup_vpn_info_remote_ip);
        this.d0 = (TextView) view.findViewById(R.id.setup_vpn_info_bytes_rcvd);
        this.e0 = (TextView) view.findViewById(R.id.setup_vpn_info_bytes_sent);
        this.f0 = view.findViewById(R.id.setup_vpn_config_switch);
        this.g0 = view.findViewById(R.id.setup_vpn_config_auto);
        TextView textView = (TextView) view.findViewById(R.id.setup_vpn_auto_start_description);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.setup_vpn_auto_start_checkbox);
        TextView textView2 = (TextView) view.findViewById(R.id.setup_vpn_auto_start_ip_description);
        this.h0 = (TextView) view.findViewById(R.id.setup_vpn_auto_start_ip_value);
        View viewFindViewById = view.findViewById(R.id.setup_vpn_auto_start_ip);
        TextView textView3 = (TextView) view.findViewById(R.id.setup_vpn_auto_netmask_description);
        this.i0 = (TextView) view.findViewById(R.id.setup_vpn_auto_netmask_value);
        View viewFindViewById2 = view.findViewById(R.id.setup_vpn_auto_netmask);
        this.j0 = view.findViewById(R.id.setup_vpn_config_manual);
        TextView textView4 = (TextView) view.findViewById(R.id.setup_vpn_manual_local_ip_description);
        this.k0 = (TextView) view.findViewById(R.id.setup_vpn_manual_local_ip_value);
        View viewFindViewById3 = view.findViewById(R.id.setup_vpn_manual_local_ip);
        TextView textView5 = (TextView) view.findViewById(R.id.setup_vpn_manual_remote_ip_description);
        this.l0 = (TextView) view.findViewById(R.id.setup_vpn_manual_remote_ip_value);
        View viewFindViewById4 = view.findViewById(R.id.setup_vpn_manual_remote_ip);
        TextView textView6 = (TextView) view.findViewById(R.id.setup_vpn_manual_netmask_description);
        this.m0 = (TextView) view.findViewById(R.id.setup_vpn_manual_netmask_value);
        View viewFindViewById5 = view.findViewById(R.id.setup_vpn_manual_netmask);
        this.n0 = (Button) view.findViewById(R.id.setup_vpn_btn_start);
        this.o0 = (Button) view.findViewById(R.id.setup_vpn_btn_stop);
        r3.r(view.findViewById(R.id.setup_vpn_auto_start_layout), checkBox);
        textView.setText(JniAdExt.n1("ad.cfg.vpn.auto_start"));
        textView2.setText(JniAdExt.n1("ad.cfg.vpn.start_ip"));
        textView3.setText(JniAdExt.n1("ad.cfg.vpn.default_subnet"));
        textView4.setText(JniAdExt.n1("ad.vpn.client_ip"));
        textView5.setText(JniAdExt.n1("ad.vpn.server_ip"));
        textView6.setText(JniAdExt.n1("ad.vpn.subnet"));
        this.n0.setText(JniAdExt.n1("ad.vpn.start"));
        this.o0.setText(JniAdExt.n1("ad.vpn.stop"));
        boolean zS2 = JniAdExt.S2(10);
        checkBox.setChecked(zS2);
        this.h0.setText(JniAdExt.U2(11));
        this.i0.setText(JniAdExt.U2(14));
        this.k0.setText(JniAdExt.U2(12));
        this.l0.setText(JniAdExt.U2(13));
        this.m0.setText(JniAdExt.U2(14));
        checkBox.setOnCheckedChangeListener(new c3(2, this));
        viewFindViewById.setOnClickListener(new ip(this, 0));
        viewFindViewById2.setOnClickListener(new ip(this, 1));
        viewFindViewById3.setOnClickListener(new ip(this, 2));
        viewFindViewById4.setOnClickListener(new ip(this, 3));
        viewFindViewById5.setOnClickListener(new ip(this, 4));
        this.n0.setOnClickListener(new ip(this, 5));
        this.o0.setOnClickListener(new ip(this, 6));
        zd zdVar = JniAdExt.r;
        synchronized (zdVar) {
            zdVar.add(this);
        }
        JniAdExt.s1(this);
        jr0 jr0Var = JniAdExt.L0;
        O0(jr0Var.a, zS2);
        String strF3 = JniAdExt.f3(jr0Var.a, jr0Var.b, jr0Var.c);
        TextView textView7 = this.Z;
        if (textView7 != null) {
            textView7.setText(strF3);
        }
        Q0(jr0Var.d, jr0Var.e);
        P0(jr0Var.f, jr0Var.g);
    }

    @Override // defpackage.cd0
    public final void I(boolean z) {
        if (z) {
            uj.v(Y(), R.id.mainFragment);
        }
    }

    @Override // defpackage.s21
    public final void N(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if ("11".equals(str)) {
            if (JniAdExt.r3(str2)) {
                JniAdExt.L4(11, str2);
                t70.Y(new jp(this.h0, str2, 0));
                return;
            }
            return;
        }
        if ("12".equals(str)) {
            if (JniAdExt.r3(str2)) {
                JniAdExt.L4(12, str2);
                t70.Y(new jp(this.k0, str2, 0));
                return;
            }
            return;
        }
        if ("13".equals(str)) {
            if (JniAdExt.r3(str2)) {
                JniAdExt.L4(13, str2);
                t70.Y(new jp(this.l0, str2, 0));
                return;
            }
            return;
        }
        if ("14".equals(str) && JniAdExt.r3(str2)) {
            JniAdExt.L4(14, str2);
            t70.Y(new jp(this.i0, str2, 0));
            t70.Y(new jp(this.m0, str2, 0));
        }
    }

    public final void O0(int i, boolean z) {
        View view = this.a0;
        View view2 = this.f0;
        View view3 = this.g0;
        View view4 = this.j0;
        Button button = this.n0;
        Button button2 = this.o0;
        if (view == null || view2 == null || view3 == null || view4 == null || button == null || button2 == null) {
            return;
        }
        if (i == 3 || i == 0) {
            view.setVisibility(8);
            view2.setVisibility(0);
            view3.setVisibility(z ? 0 : 8);
            view4.setVisibility(z ? 8 : 0);
            button.setEnabled(JniAdExt.F3());
            button2.setEnabled(false);
            return;
        }
        view.setVisibility(0);
        view2.setVisibility(8);
        view3.setVisibility(8);
        view4.setVisibility(8);
        button.setEnabled(false);
        button2.setEnabled(true);
    }

    public final void P0(long j, long j2) {
        TextView textView = this.d0;
        TextView textView2 = this.e0;
        if (textView == null || textView2 == null) {
            return;
        }
        textView.setText(JniAdExt.n1("ad.vpn.rcvd") + " " + Formatter.formatFileSize(Y(), j2));
        textView2.setText(JniAdExt.n1("ad.vpn.sent") + " " + Formatter.formatFileSize(Y(), j));
    }

    public final void Q0(String str, String str2) {
        TextView textView = this.b0;
        TextView textView2 = this.c0;
        if (textView == null || textView2 == null) {
            return;
        }
        textView.setText(JniAdExt.n1("ad.vpn.client_ip") + " " + str2);
        textView2.setText(JniAdExt.n1("ad.vpn.server_ip") + " " + str);
    }

    @Override // defpackage.kd0
    public final void e(int i, int i2, boolean z) {
        t70.Y(new d3(this, 13, JniAdExt.f3(i, i2, z)));
    }

    @Override // defpackage.kd0
    public final void m(String str, String str2) {
        t70.Y(new wh(this, str, str2, 2));
    }

    @Override // defpackage.kd0
    public final void n(long j, long j2) {
        t70.Y(new hp(this, j, j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c40
    public final void p0(Context context) {
        super.p0(context);
        if (context instanceof m80) {
            this.q0 = (m80) context;
        } else {
            v.e(context);
        }
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_connection_settings_vpn, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        JniAdExt.U3(this);
        zd zdVar = JniAdExt.r;
        synchronized (zdVar) {
            zdVar.remove(this);
        }
        this.p0.e = null;
        this.p0 = null;
        this.Z = null;
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
    }

    @Override // defpackage.c40
    public final void u0() {
        this.F = true;
        this.q0 = null;
    }
}
