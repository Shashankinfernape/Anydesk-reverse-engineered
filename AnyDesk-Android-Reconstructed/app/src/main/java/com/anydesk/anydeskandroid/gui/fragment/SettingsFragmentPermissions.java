package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.anydesk.anydeskandroid.PermissionProfile;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.bc;
import defpackage.bc0;
import defpackage.c40;
import defpackage.ep;
import defpackage.io;
import defpackage.md0;
import defpackage.n31;
import defpackage.o31;
import defpackage.r3;
import defpackage.t70;
import defpackage.xt0;
import defpackage.zd;

/* JADX INFO: loaded from: classes.dex */
public class SettingsFragmentPermissions extends c40 implements md0 {
    public bc Z;
    public View a0;
    public TextView b0;
    public CheckBox c0;
    public TextView d0;
    public CheckBox e0;
    public TextView f0;
    public CheckBox g0;
    public View h0;
    public TextView i0;
    public CheckBox j0;
    public View k0;
    public TextView l0;
    public View m0;
    public View n0;
    public View o0;
    public TextView p0;
    public TextView q0;
    public final xt0 r0 = new xt0(this);
    public boolean s0 = false;

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        this.s0 = true;
        this.Z = new bc(Z(), 19);
        this.a0 = view.findViewById(R.id.settings_group_permissions_global);
        TextView textView = (TextView) view.findViewById(R.id.settings_permissions_title_global);
        TextView textView2 = (TextView) view.findViewById(R.id.settings_permissions_hint_global);
        this.b0 = (TextView) view.findViewById(R.id.settings_permissions_global_lock_account_description);
        this.c0 = (CheckBox) view.findViewById(R.id.settings_permissions_global_lock_account_checkbox);
        this.d0 = (TextView) view.findViewById(R.id.settings_permissions_global_sync_text_clipboard_description);
        this.e0 = (CheckBox) view.findViewById(R.id.settings_permissions_global_sync_text_clipboard_checkbox);
        this.f0 = (TextView) view.findViewById(R.id.settings_permissions_global_sync_file_clipboard_description);
        this.g0 = (CheckBox) view.findViewById(R.id.settings_permissions_global_sync_file_clipboard_checkbox);
        this.h0 = view.findViewById(R.id.settings_group_permissions_profiles);
        TextView textView3 = (TextView) view.findViewById(R.id.settings_permissions_title_profiles);
        this.i0 = (TextView) view.findViewById(R.id.settings_permission_profiles_enable_previous_session_profiles_description);
        this.j0 = (CheckBox) view.findViewById(R.id.settings_permission_profiles_enable_previous_session_profiles_checkbox);
        this.k0 = view.findViewById(R.id.settings_permission_profiles_enable_previous_session_profiles_toast_overlay);
        this.l0 = (TextView) view.findViewById(R.id.settings_permission_profiles_clear_previous_session_profiles);
        this.m0 = view.findViewById(R.id.settings_permission_profiles_clear_previous_session_profiles_layout);
        this.n0 = view.findViewById(R.id.settings_permission_profiles_clear_previous_session_profiles_toast_overlay);
        this.o0 = view.findViewById(R.id.settings_permission_profiles_layout);
        this.p0 = (TextView) view.findViewById(R.id.settings_permission_profiles_description);
        this.q0 = (TextView) view.findViewById(R.id.settings_permission_profiles_value);
        r3.r(view.findViewById(R.id.settings_permissions_global_sync_text_clipboard_layout), this.e0);
        r3.r(view.findViewById(R.id.settings_permissions_global_sync_file_clipboard_layout), this.g0);
        r3.r(view.findViewById(R.id.settings_permissions_global_lock_account_layout), this.c0);
        r3.r(view.findViewById(R.id.settings_permission_profiles_enable_previous_session_profiles_layout), this.j0);
        textView.setText(JniAdExt.n1("ad.cfg.sec.global_permissions"));
        textView2.setText(JniAdExt.n1("ad.cfg.sec.perm.profile.hint_when_I_Connect"));
        this.d0.setText(JniAdExt.n1("ad.cfg.sec.perm.frontend_clipboard"));
        this.f0.setText(JniAdExt.n1("ad.cfg.sec.perm.frontend_clipboard_files"));
        this.b0.setText(JniAdExt.n1("ad.cfg.sec.sess.lock_remote_account"));
        textView3.setText(JniAdExt.n1("ad.cfg.permission_profiles.title"));
        this.i0.setText(JniAdExt.n1("ad.cfg.sec.enable_prev_profiles"));
        this.l0.setText(JniAdExt.n1("ad.cfg.sec.clear_prev_profiles"));
        this.p0.setText(JniAdExt.n1("ad.cfg.sec.perm.permission_profiles"));
        this.e0.setOnCheckedChangeListener(new n31(this, 0));
        this.g0.setOnCheckedChangeListener(new ep(17));
        this.c0.setOnCheckedChangeListener(new n31(this, 1));
        this.j0.setOnCheckedChangeListener(new n31(this, 2));
        this.k0.setOnClickListener(new o31(this, 0));
        this.m0.setOnClickListener(new o31(this, 1));
        this.n0.setOnClickListener(new o31(this, 2));
        this.o0.setOnClickListener(new o31(this, 3));
        Q0();
    }

    @Override // defpackage.c40
    public final void D0(Bundle bundle) {
        this.F = true;
        this.s0 = false;
    }

    @Override // defpackage.md0
    public final void H() {
        t70.Y(new bc0(17, this));
    }

    public final void O0() {
        TextView textView = this.q0;
        if (textView == null) {
            return;
        }
        PermissionProfile[] permissionProfileArrF2 = JniAdExt.F2();
        StringBuilder sb = new StringBuilder();
        for (PermissionProfile permissionProfile : permissionProfileArrF2) {
            if (permissionProfile.g) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(permissionProfile.b);
            }
        }
        textView.setText(sb.toString());
    }

    public final void P0(boolean z) {
        boolean zP3 = JniAdExt.p3(io.KEY_FRONTEND_CLIPBOARD_FILES);
        boolean z2 = false;
        r3.C(this.f0, z && !zP3);
        CheckBox checkBox = this.g0;
        if (z && !zP3) {
            z2 = true;
        }
        r3.C(checkBox, z2);
    }

    public final void Q0() {
        io ioVar = io.KEY_FRONTEND_CLIPBOARD;
        boolean z = JniAdExt.h2(ioVar) != 0;
        r3.B(this.e0, z);
        r3.B(this.g0, JniAdExt.h2(io.KEY_FRONTEND_CLIPBOARD_FILES) != 0);
        CheckBox checkBox = this.c0;
        io ioVar2 = io.KEY_LOCK_REMOTE_ACCOUNT;
        r3.B(checkBox, JniAdExt.h2(ioVar2) == 1);
        boolean z2 = !JniAdExt.p3(ioVar);
        boolean z3 = !JniAdExt.p3(ioVar2);
        r3.C(this.d0, z2);
        r3.C(this.e0, z2);
        P0(z);
        r3.C(this.b0, z3);
        r3.C(this.c0, z3);
        r3.I(this.a0, JniAdExt.g2(io.KEY_FEATURE_CONNECT) ? 0 : 8);
        boolean z4 = JniAdExt.s2(1) != 0;
        io ioVar3 = io.KEY_PERM_PROFILES_ENABLE_PREVIOUS_SESSION;
        boolean zP3 = JniAdExt.p3(ioVar3);
        r3.B(this.j0, z4 && JniAdExt.h2(ioVar3) != 0);
        O0();
        boolean z5 = z4 && !zP3;
        r3.C(this.i0, z5);
        r3.C(this.j0, z5);
        r3.C(this.l0, z4);
        r3.C(this.m0, z4);
        r3.I(this.k0, (z4 || zP3) ? 8 : 0);
        r3.I(this.n0, z4 ? 8 : 0);
        r3.I(this.h0, JniAdExt.g2(io.KEY_FEATURE_ACCEPT) ? 0 : 8);
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_settings_permissions, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        this.Z.e = null;
        this.Z = null;
        this.a0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.b0 = null;
        this.c0 = null;
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
    }

    @Override // defpackage.c40
    public final void x0() {
        this.F = true;
        zd zdVar = JniAdExt.e0;
        synchronized (zdVar) {
            zdVar.remove(this);
        }
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        JniAdExt.B1(this);
        Q0();
    }
}
