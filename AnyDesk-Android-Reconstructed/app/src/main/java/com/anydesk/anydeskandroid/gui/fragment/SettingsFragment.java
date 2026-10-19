package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import defpackage.d3;
import defpackage.io;
import defpackage.qa;
import defpackage.t70;
import defpackage.uj;
import defpackage.v11;
import defpackage.z6;

/* JADX INFO: loaded from: classes.dex */
public class SettingsFragment extends z6 {
    @Override // defpackage.z6, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        super.C0(view, bundle);
        qa qaVarG0 = G0();
        qaVarG0.setTitle(JniAdExt.n1("ad.menu.settings"));
        if (!JniAdExt.g2(io.KEY_CFG_ENABLED)) {
            t70.g0(a0(), JniAdExt.n1("ad.dlg.availability.title"), 0);
            uj.x(qaVarG0);
        } else if (bundle == null) {
            Bundle bundle2 = this.h;
            SettingsCategoryFragment settingsCategoryFragment = (SettingsCategoryFragment) Z().A(R.id.settingsCategories);
            if (bundle2 == null || settingsCategoryFragment == null) {
                return;
            }
            t70.V(new d3(settingsCategoryFragment, 27, (v11) t70.A(bundle2, "skey_req_direct_nav", v11.class)));
        }
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
        return layoutInflater.inflate(R.layout.fragment_settings, viewGroup, false);
    }
}
