package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.bc;
import defpackage.c40;
import defpackage.ep;
import defpackage.io;
import defpackage.jp;
import defpackage.r3;
import defpackage.s21;
import defpackage.s31;
import defpackage.t70;

/* JADX INFO: loaded from: classes.dex */
public class SettingsFragmentVpn extends c40 implements s21 {
    public TextView Z;
    public CheckBox a0;
    public TextView b0;
    public TextView c0;
    public View d0;
    public TextView e0;
    public TextView f0;
    public View g0;
    public bc h0;

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        this.h0 = new bc(Z(), 19);
        this.Z = (TextView) view.findViewById(R.id.settings_vpn_auto_start_description);
        this.a0 = (CheckBox) view.findViewById(R.id.settings_vpn_auto_start_checkbox);
        this.b0 = (TextView) view.findViewById(R.id.settings_vpn_start_ip_description);
        this.c0 = (TextView) view.findViewById(R.id.settings_vpn_start_ip_value);
        this.d0 = view.findViewById(R.id.settings_vpn_start_ip);
        this.e0 = (TextView) view.findViewById(R.id.settings_vpn_netmask_description);
        this.f0 = (TextView) view.findViewById(R.id.settings_vpn_netmask_value);
        this.g0 = view.findViewById(R.id.settings_vpn_netmask);
        r3.r(view.findViewById(R.id.settings_vpn_auto_start_layout), this.a0);
        this.Z.setText(JniAdExt.n1("ad.cfg.vpn.auto_start"));
        this.b0.setText(JniAdExt.n1("ad.cfg.vpn.start_ip"));
        this.e0.setText(JniAdExt.n1("ad.cfg.vpn.default_subnet"));
        this.a0.setOnCheckedChangeListener(new ep(23));
        this.d0.setOnClickListener(new s31(this, 0));
        this.g0.setOnClickListener(new s31(this, 1));
        O0();
    }

    @Override // defpackage.s21
    public final void N(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if ("ad.vpn.start_ip".equals(str)) {
            if (JniAdExt.r3(str2)) {
                JniAdExt.z4(io.KEY_VPN_START_IP, str2);
                t70.Y(new jp(this.c0, str2, 2));
                return;
            }
            return;
        }
        if ("ad.vpn.default_netmask".equals(str) && JniAdExt.r3(str2)) {
            JniAdExt.z4(io.KEY_VPN_DEFAULT_NETMASK, str2);
            t70.Y(new jp(this.f0, str2, 2));
        }
    }

    public final void O0() {
        CheckBox checkBox = this.a0;
        io ioVar = io.KEY_VPN_AUTO_CONFIG;
        r3.B(checkBox, JniAdExt.g2(ioVar));
        TextView textView = this.c0;
        io ioVar2 = io.KEY_VPN_START_IP;
        r3.F(textView, JniAdExt.i2(ioVar2));
        TextView textView2 = this.f0;
        io ioVar3 = io.KEY_VPN_DEFAULT_NETMASK;
        r3.F(textView2, JniAdExt.i2(ioVar3));
        boolean z = !JniAdExt.p3(ioVar);
        boolean z2 = !JniAdExt.p3(ioVar2);
        boolean z3 = !JniAdExt.p3(ioVar3);
        r3.C(this.Z, z);
        r3.C(this.a0, z);
        r3.C(this.b0, z2);
        r3.C(this.c0, z2);
        r3.C(this.e0, z3);
        r3.C(this.f0, z3);
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_settings_vpn, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        this.h0.e = null;
        this.h0 = null;
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        O0();
    }
}
