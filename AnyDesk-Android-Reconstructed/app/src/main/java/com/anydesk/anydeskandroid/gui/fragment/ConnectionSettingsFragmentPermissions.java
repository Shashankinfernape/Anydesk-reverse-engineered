package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.c3;
import defpackage.c40;
import defpackage.cd0;
import defpackage.cu0;
import defpackage.d3;
import defpackage.du0;
import defpackage.ep;
import defpackage.id0;
import defpackage.io;
import defpackage.r3;
import defpackage.t70;
import defpackage.uj;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionSettingsFragmentPermissions extends c40 implements cd0, id0 {
    public TextView Z;
    public CheckBox a0;
    public LinearLayout b0;
    public TextView c0;
    public CheckBox d0;
    public TextView e0;
    public CheckBox f0;

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        this.Z = (TextView) view.findViewById(R.id.connection_settings_permissions_synchronize_clipboard_description);
        this.a0 = (CheckBox) view.findViewById(R.id.connection_settings_permissions_synchronize_clipboard_checkbox);
        this.b0 = (LinearLayout) view.findViewById(R.id.connection_settings_permissions_synchronize_clipboard_files_layout);
        this.c0 = (TextView) view.findViewById(R.id.connection_settings_permissions_synchronize_clipboard_files_description);
        this.d0 = (CheckBox) view.findViewById(R.id.connection_settings_permissions_synchronize_clipboard_files_checkbox);
        this.e0 = (TextView) view.findViewById(R.id.connection_settings_permissions_lock_account_description);
        this.f0 = (CheckBox) view.findViewById(R.id.connection_settings_permissions_lock_account_checkbox);
        r3.r(view.findViewById(R.id.connection_settings_permissions_synchronize_clipboard_layout), this.a0);
        r3.r(this.b0, this.d0);
        r3.r(view.findViewById(R.id.connection_settings_permissions_lock_account_layout), this.f0);
        boolean zO3 = JniAdExt.o3();
        P0(zO3);
        Q0(zO3);
        O0();
        this.a0.setOnCheckedChangeListener(new c3(1, this));
        this.d0.setOnCheckedChangeListener(new ep(4));
        this.f0.setOnCheckedChangeListener(new ep(5));
        JniAdExt.s1(this);
        JniAdExt.A1(this);
    }

    @Override // defpackage.cd0
    public final void I(boolean z) {
        if (z) {
            uj.v(Y(), R.id.mainFragment);
        }
    }

    public final void O0() {
        cu0 cu0Var = new cu0(JniAdExt.T2(16));
        r3.s(this.e0, JniAdExt.n1("ad.menu.lock_account"), cu0Var.c(), cu0Var.c() && cu0Var.a());
        r3.B(this.f0, cu0Var.b());
    }

    public final void P0(boolean z) {
        cu0 cu0Var = new cu0(JniAdExt.T2(z ? 19 : 2));
        r3.s(this.Z, z ? JniAdExt.n1("ad.cfg.sec.perm.frontend_clipboard") : JniAdExt.n1("ad.menu.clipboard"), cu0Var.c(), cu0Var.c() && cu0Var.a());
        r3.B(this.a0, cu0Var.b());
        boolean z2 = !JniAdExt.p3(io.KEY_FRONTEND_CLIPBOARD);
        r3.C(this.Z, z2);
        r3.C(this.a0, z2);
    }

    public final void Q0(boolean z) {
        cu0 cu0Var = new cu0(JniAdExt.T2(z ? 19 : 2));
        cu0 cu0Var2 = new cu0(JniAdExt.T2(20));
        boolean z2 = false;
        boolean z3 = cu0Var.c() && cu0Var.a();
        boolean z4 = cu0Var2.c() && cu0Var2.a();
        TextView textView = this.c0;
        String strN1 = JniAdExt.n1("ad.cfg.sec.perm.frontend_clipboard_files");
        boolean z5 = cu0Var.c() && cu0Var2.c();
        if (z3 && z4) {
            z2 = true;
        }
        r3.s(textView, strN1, z5, z2);
        r3.B(this.d0, cu0Var2.b());
        R0(z, cu0Var.b());
    }

    public final void R0(boolean z, boolean z2) {
        if (!z) {
            r3.I(this.b0, 8);
            return;
        }
        boolean z3 = z2 && !JniAdExt.p3(io.KEY_FRONTEND_CLIPBOARD_FILES);
        r3.C(this.c0, z3);
        r3.C(this.d0, z3);
        r3.I(this.b0, 0);
    }

    @Override // defpackage.id0
    public final void q(du0 du0Var) {
        t70.Y(new d3(this, 11, du0Var));
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_connection_settings_permissions, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        JniAdExt.Y3(this);
        JniAdExt.U3(this);
        this.Z = null;
        this.a0 = null;
        this.b0 = null;
        this.c0 = null;
        this.d0 = null;
        this.e0 = null;
        this.f0 = null;
    }
}
