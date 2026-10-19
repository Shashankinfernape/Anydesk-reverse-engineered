package com.anydesk.anydeskandroid.gui.fragment;

import android.app.ActivityManager;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.b;
import defpackage.c40;
import defpackage.ep;
import defpackage.io;
import defpackage.q51;
import defpackage.qa;
import defpackage.r3;
import defpackage.r31;
import defpackage.t70;
import defpackage.xt0;

/* JADX INFO: loaded from: classes.dex */
public class SettingsFragmentVideo extends c40 {
    public CheckBox A0;
    public final xt0 B0 = new xt0(this);
    public View Z;
    public TextView a0;
    public TextView b0;
    public RadioButton c0;
    public TextView d0;
    public RadioButton e0;
    public TextView f0;
    public RadioButton g0;
    public View h0;
    public TextView i0;
    public TextView j0;
    public CheckBox k0;
    public TextView l0;
    public RadioButton m0;
    public TextView n0;
    public RadioButton o0;
    public TextView p0;
    public RadioButton q0;
    public TextView r0;
    public CheckBox s0;
    public TextView t0;
    public CheckBox u0;
    public TextView v0;
    public CheckBox w0;
    public TextView x0;
    public View y0;
    public TextView z0;

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        this.Z = view.findViewById(R.id.settings_group_video_quality);
        this.a0 = (TextView) view.findViewById(R.id.settings_video_title_quality);
        this.b0 = (TextView) view.findViewById(R.id.settings_video_quality_best_description);
        this.c0 = (RadioButton) view.findViewById(R.id.settings_video_quality_best_radiobutton);
        this.d0 = (TextView) view.findViewById(R.id.settings_video_quality_balanced_description);
        this.e0 = (RadioButton) view.findViewById(R.id.settings_video_quality_balanced_radiobutton);
        this.f0 = (TextView) view.findViewById(R.id.settings_video_quality_fast_description);
        this.g0 = (RadioButton) view.findViewById(R.id.settings_video_quality_fast_radiobutton);
        this.h0 = view.findViewById(R.id.settings_group_video_helpers);
        this.i0 = (TextView) view.findViewById(R.id.settings_video_title_helpers);
        this.j0 = (TextView) view.findViewById(R.id.settings_video_quality_lossless_description);
        View viewFindViewById = view.findViewById(R.id.settings_video_quality_lossless_layout);
        this.k0 = (CheckBox) view.findViewById(R.id.settings_video_quality_lossless_checkbox);
        this.l0 = (TextView) view.findViewById(R.id.settings_video_remote_cursor_hide_description);
        this.m0 = (RadioButton) view.findViewById(R.id.settings_video_remote_cursor_hide_radiobutton);
        this.n0 = (TextView) view.findViewById(R.id.settings_video_remote_cursor_show_description);
        this.o0 = (RadioButton) view.findViewById(R.id.settings_video_remote_cursor_show_radiobutton);
        this.p0 = (TextView) view.findViewById(R.id.settings_video_remote_cursor_auto_description);
        this.q0 = (RadioButton) view.findViewById(R.id.settings_video_remote_cursor_auto_radiobutton);
        this.r0 = (TextView) view.findViewById(R.id.settings_video_follow_remote_cursor_description);
        this.s0 = (CheckBox) view.findViewById(R.id.settings_video_follow_remote_cursor_checkbox);
        this.t0 = (TextView) view.findViewById(R.id.settings_video_follow_remote_focus_description);
        this.u0 = (CheckBox) view.findViewById(R.id.settings_video_follow_remote_focus_checkbox);
        this.v0 = (TextView) view.findViewById(R.id.settings_video_auto_hide_pie_menu_description);
        this.w0 = (CheckBox) view.findViewById(R.id.settings_video_auto_hide_pie_menu_checkbox);
        this.x0 = (TextView) view.findViewById(R.id.settings_video_title_individual);
        this.y0 = view.findViewById(R.id.settings_video_remember_individual_toast_overlay);
        this.z0 = (TextView) view.findViewById(R.id.settings_video_remember_individual_description);
        this.A0 = (CheckBox) view.findViewById(R.id.settings_video_remember_individual_checkbox);
        qa qaVarG0 = G0();
        Looper looper = t70.a;
        ActivityManager activityManager = (ActivityManager) qaVarG0.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        viewFindViewById.setVisibility(memoryInfo.totalMem >= 3000000000L ? 0 : 8);
        r3.r(view.findViewById(R.id.settings_video_quality_best_layout), this.c0);
        r3.r(view.findViewById(R.id.settings_video_quality_balanced_layout), this.e0);
        r3.r(view.findViewById(R.id.settings_video_quality_fast_layout), this.g0);
        r3.r(view.findViewById(R.id.settings_video_quality_lossless_layout), this.k0);
        r3.r(view.findViewById(R.id.settings_video_remote_cursor_hide_layout), this.m0);
        r3.r(view.findViewById(R.id.settings_video_remote_cursor_show_layout), this.o0);
        r3.r(view.findViewById(R.id.settings_video_remote_cursor_auto_layout), this.q0);
        r3.r(view.findViewById(R.id.settings_video_follow_remote_cursor_layout), this.s0);
        r3.r(view.findViewById(R.id.settings_video_follow_remote_focus_layout), this.u0);
        r3.r(view.findViewById(R.id.settings_video_auto_hide_pie_menu_layout), this.w0);
        r3.r(view.findViewById(R.id.settings_video_remember_individual_layout), this.A0);
        this.a0.setText(JniAdExt.n1("ad.cfg.video.qual"));
        this.b0.setText(JniAdExt.n1("ad.cfg.video.qual.best"));
        this.d0.setText(JniAdExt.n1("ad.cfg.video.qual.balanced"));
        this.f0.setText(JniAdExt.n1("ad.cfg.video.qual.fast"));
        this.i0.setText(JniAdExt.n1("ad.cfg.video.gizmo"));
        this.j0.setText(JniAdExt.n1("ad.menu.display.imgqual.lossless"));
        this.l0.setText(JniAdExt.n1("ad.cfg.video.fx.show_remote_cursor.disabled"));
        this.n0.setText(JniAdExt.n1("ad.cfg.video.fx.show_remote_cursor.enabled"));
        this.p0.setText(JniAdExt.n1("ad.cfg.video.fx.show_remote_cursor.auto"));
        this.r0.setText(JniAdExt.n1("ad.cfg.video.fx.follow_remote_cursor"));
        this.t0.setText(JniAdExt.n1("ad.cfg.video.fx.follow_remote_focus"));
        this.v0.setText(JniAdExt.n1("ad.cfg.video.auto_hide_nubsi"));
        this.x0.setText(JniAdExt.n1("ad.cfg.remember"));
        this.z0.setText(JniAdExt.n1("ad.cfg.remember_session_settings"));
        this.y0.setOnClickListener(new b(24, this));
        this.c0.setOnCheckedChangeListener(new r31(this, 0));
        this.e0.setOnCheckedChangeListener(new r31(this, 1));
        this.g0.setOnCheckedChangeListener(new r31(this, 2));
        this.k0.setOnCheckedChangeListener(new ep(21));
        this.m0.setOnCheckedChangeListener(new r31(this, 3));
        this.o0.setOnCheckedChangeListener(new r31(this, 4));
        this.q0.setOnCheckedChangeListener(new r31(this, 5));
        this.s0.setOnCheckedChangeListener(new ep(22));
        this.u0.setOnCheckedChangeListener(new ep(18));
        this.w0.setOnCheckedChangeListener(new ep(19));
        this.A0.setOnCheckedChangeListener(new ep(20));
        O0();
    }

    public final void O0() {
        int i;
        io ioVar = io.KEY_QUALITY;
        int iH2 = JniAdExt.h2(ioVar);
        r3.B(this.c0, iH2 == 0);
        r3.B(this.e0, iH2 == 1);
        r3.B(this.g0, iH2 == 2);
        CheckBox checkBox = this.k0;
        io ioVar2 = io.KEY_QUALITY_LOSSLESS;
        r3.B(checkBox, JniAdExt.g2(ioVar2));
        RadioButton radioButton = this.m0;
        io ioVar3 = io.KEY_SHOW_REMOTE_CURSOR_OPTION;
        r3.B(radioButton, JniAdExt.h2(ioVar3) == 0);
        r3.B(this.o0, JniAdExt.h2(ioVar3) == 1);
        r3.B(this.q0, JniAdExt.h2(ioVar3) == 2);
        CheckBox checkBox2 = this.s0;
        io ioVar4 = io.KEY_FOLLOW_REMOTE_CURSOR;
        r3.B(checkBox2, JniAdExt.g2(ioVar4));
        CheckBox checkBox3 = this.u0;
        io ioVar5 = io.KEY_FOLLOW_REMOTE_FOCUS;
        int iH3 = JniAdExt.h2(ioVar5);
        int[] iArrS = q51.s(2);
        int length = iArrS.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = 1;
                break;
            }
            i = iArrS[i2];
            if (q51.r(i) == iH3) {
                break;
            } else {
                i2++;
            }
        }
        r3.B(checkBox3, i == 2);
        CheckBox checkBox4 = this.w0;
        io ioVar6 = io.KEY_AUTO_HIDE_NUBSI;
        r3.B(checkBox4, JniAdExt.g2(ioVar6));
        CheckBox checkBox5 = this.A0;
        io ioVar7 = io.KEY_REMEMBER_SETTINGS;
        r3.B(checkBox5, JniAdExt.g2(ioVar7));
        boolean z = !JniAdExt.p3(ioVar);
        r3.C(this.b0, z);
        r3.C(this.c0, z);
        r3.C(this.d0, z);
        r3.C(this.e0, z);
        r3.C(this.f0, z);
        r3.C(this.g0, z);
        boolean z2 = !JniAdExt.p3(ioVar2);
        r3.C(this.j0, z2);
        r3.C(this.k0, z2);
        boolean z3 = !JniAdExt.p3(ioVar3);
        r3.C(this.l0, z3);
        r3.C(this.m0, z3);
        r3.C(this.n0, z3);
        r3.C(this.o0, z3);
        r3.C(this.p0, z3);
        r3.C(this.q0, z3);
        boolean z4 = !JniAdExt.p3(ioVar4);
        r3.C(this.r0, z4);
        r3.C(this.s0, z4);
        boolean z5 = !JniAdExt.p3(ioVar5);
        r3.C(this.t0, z5);
        r3.C(this.u0, z5);
        boolean z6 = !JniAdExt.p3(ioVar6);
        r3.C(this.v0, z6);
        r3.C(this.w0, z6);
        boolean zP3 = JniAdExt.p3(ioVar7);
        boolean z7 = JniAdExt.s2(14) != 0;
        boolean z8 = !zP3 && z7;
        r3.C(this.z0, z8);
        r3.C(this.A0, z8);
        r3.I(this.y0, (zP3 || z7) ? 8 : 0);
        int i3 = JniAdExt.g2(io.KEY_FEATURE_CONNECT) ? 0 : 8;
        r3.I(this.Z, i3);
        r3.I(this.h0, i3);
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_settings_video, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
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

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        O0();
    }
}
