package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.z6;

/* JADX INFO: loaded from: classes.dex */
public class SettingsFragmentInputWrapper extends z6 {
    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        super.C0(view, bundle);
        G0().setTitle(JniAdExt.n1("ad.cfg.input.title"));
    }

    @Override // defpackage.z6
    public final boolean P0() {
        return true;
    }

    @Override // defpackage.z6
    public final boolean Q0() {
        return true;
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_settings_input_wrapper, viewGroup, false);
    }
}
