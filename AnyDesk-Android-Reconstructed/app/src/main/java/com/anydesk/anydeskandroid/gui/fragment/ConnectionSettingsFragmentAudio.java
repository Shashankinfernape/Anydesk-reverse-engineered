package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.c40;
import defpackage.cd0;
import defpackage.cu0;
import defpackage.d3;
import defpackage.du0;
import defpackage.ep;
import defpackage.id0;
import defpackage.r3;
import defpackage.t70;
import defpackage.uj;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionSettingsFragmentAudio extends c40 implements cd0, id0 {
    public TextView Z;
    public CheckBox a0;

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        this.Z = (TextView) view.findViewById(R.id.connection_settings_audio_transmission_description);
        this.a0 = (CheckBox) view.findViewById(R.id.connection_settings_audio_transmission_checkbox);
        r3.r(view.findViewById(R.id.connection_settings_audio_transmission_layout), this.a0);
        O0();
        this.a0.setOnCheckedChangeListener(new ep(0));
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
        cu0 cu0Var = new cu0(JniAdExt.T2(4));
        r3.s(this.Z, JniAdExt.n1("ad.menu.sound"), cu0Var.c(), cu0Var.c() && cu0Var.a());
        r3.B(this.a0, cu0Var.b());
    }

    @Override // defpackage.id0
    public final void q(du0 du0Var) {
        t70.Y(new d3(this, 9, du0Var));
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_connection_settings_audio, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        JniAdExt.Y3(this);
        JniAdExt.U3(this);
        this.Z = null;
        this.a0 = null;
    }
}
