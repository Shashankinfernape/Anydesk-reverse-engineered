package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.cd0;
import defpackage.uj;
import defpackage.z6;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionSettingsFragmentPermissionsWrapper extends z6 implements cd0 {
    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        super.C0(view, bundle);
        G0().setTitle(JniAdExt.n1("ad.cfg.sec.title"));
        JniAdExt.s1(this);
    }

    @Override // defpackage.cd0
    public final void I(boolean z) {
        if (z) {
            uj.v(Y(), R.id.mainFragment);
        }
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    @Override // defpackage.z6
    public final boolean Q0() {
        return !(JniAdExt.s2(19) != 0);
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_connection_settings_permissions_wrapper, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        JniAdExt.U3(this);
    }
}
