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
import defpackage.bc;
import defpackage.c40;
import defpackage.d21;
import defpackage.d3;
import defpackage.ep;
import defpackage.io;
import defpackage.k31;
import defpackage.l31;
import defpackage.r3;
import defpackage.t70;
import defpackage.xt0;

/* JADX INFO: loaded from: classes.dex */
public class SettingsFragmentIdentity extends c40 implements d21 {
    public View Z;
    public View a0;
    public TextView b0;
    public TextView c0;
    public View d0;
    public TextView e0;
    public CheckBox f0;
    public View g0;
    public TextView h0;
    public RadioButton i0;
    public TextView j0;
    public RadioButton k0;
    public bc l0;
    public final xt0 m0 = new xt0(this);

    @Override // defpackage.c40
    public final void C0(View view, Bundle bundle) {
        this.l0 = new bc(Z(), 19);
        this.Z = view.findViewById(R.id.settings_group_alias);
        TextView textView = (TextView) view.findViewById(R.id.settings_identity_title_alias);
        this.a0 = view.findViewById(R.id.settings_identity_alias_toast_overlay);
        this.b0 = (TextView) view.findViewById(R.id.settings_identity_alias_description);
        this.c0 = (TextView) view.findViewById(R.id.settings_identity_alias_value);
        this.d0 = view.findViewById(R.id.settings_identity_alias);
        this.e0 = (TextView) view.findViewById(R.id.settings_identity_show_id_description);
        this.f0 = (CheckBox) view.findViewById(R.id.settings_identity_show_id_checkbox);
        this.g0 = view.findViewById(R.id.settings_group_preview);
        TextView textView2 = (TextView) view.findViewById(R.id.settings_identity_title_desk_preview);
        this.h0 = (TextView) view.findViewById(R.id.settings_identity_preview_source_wallpaper_description);
        this.i0 = (RadioButton) view.findViewById(R.id.settings_identity_preview_source_wallpaper_radiobutton);
        this.j0 = (TextView) view.findViewById(R.id.settings_identity_preview_source_none_description);
        this.k0 = (RadioButton) view.findViewById(R.id.settings_identity_preview_source_none_radiobutton);
        r3.r(view.findViewById(R.id.settings_identity_show_id_layout), this.f0);
        r3.r(view.findViewById(R.id.settings_identity_preview_source_wallpaper_layout), this.i0);
        r3.r(view.findViewById(R.id.settings_identity_preview_source_none_layout), this.k0);
        textView.setText(JniAdExt.n1("ad.alias.alias_hint"));
        this.b0.setText(JniAdExt.n1("ad.alias.title"));
        this.e0.setText(JniAdExt.n1("ad.cfg.ui.id_or_alias"));
        textView2.setText(JniAdExt.n1("ad.cfg.priv.bkgnd"));
        this.h0.setText(JniAdExt.n1("ad.cfg.priv.bkgnd.acc"));
        this.j0.setText(JniAdExt.n1("ad.cfg.priv.bkgnd.none"));
        this.a0.setOnClickListener(new k31(this, 0));
        this.d0.setOnClickListener(new k31(this, 1));
        this.f0.setOnCheckedChangeListener(new ep(13));
        this.i0.setOnCheckedChangeListener(new l31(this, 0));
        this.k0.setOnCheckedChangeListener(new l31(this, 1));
        P0();
    }

    public final void O0(String str) {
        r3.F(this.c0, str == null ? "" : str);
        boolean zP3 = JniAdExt.p3(io.KEY_ALIAS);
        boolean z = JniAdExt.s2(10) != 0;
        boolean z2 = (str == null || str.isEmpty()) && !zP3 && z;
        r3.C(this.b0, z2);
        r3.C(this.c0, z2);
        r3.C(this.d0, z2);
        r3.I(this.a0, (zP3 || z) ? 8 : 0);
    }

    public final void P0() {
        O0(JniAdExt.k2(io.KEY_ALIAS));
        CheckBox checkBox = this.f0;
        io ioVar = io.KEY_SHOW_ID_INSTEAD_OF_ALIAS;
        r3.B(checkBox, JniAdExt.g2(ioVar));
        boolean zP3 = JniAdExt.p3(ioVar);
        boolean z = JniAdExt.s2(10) != 0;
        boolean z2 = !zP3 && z;
        r3.C(this.e0, z2);
        r3.C(this.f0, z2);
        r3.I(this.a0, (zP3 || z) ? 8 : 0);
        View view = this.Z;
        io ioVar2 = io.KEY_FEATURE_ACCEPT;
        r3.I(view, JniAdExt.g2(ioVar2) ? 0 : 8);
        io ioVar3 = io.KEY_BKGND_SHOW;
        int iH2 = JniAdExt.h2(ioVar3);
        r3.B(this.i0, iH2 == 1);
        r3.B(this.k0, iH2 == 2);
        boolean z3 = !JniAdExt.p3(ioVar3);
        r3.C(this.h0, z3);
        r3.C(this.i0, z3);
        r3.C(this.j0, z3);
        r3.C(this.k0, z3);
        r3.I(this.g0, JniAdExt.g2(ioVar2) ? 0 : 8);
    }

    @Override // defpackage.d21
    public final void g(String str) {
        JniAdExt.x4(io.KEY_SHOW_ID_INSTEAD_OF_ALIAS, false);
        t70.Y(new d3(this, 29, str));
    }

    @Override // defpackage.c40
    public final View r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.fragment_settings_identity, viewGroup, false);
    }

    @Override // defpackage.c40
    public final void t0() {
        this.F = true;
        this.l0.e = null;
        this.l0 = null;
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
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        P0();
    }
}
