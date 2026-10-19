package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.bg0;
import defpackage.fg;
import defpackage.io;
import defpackage.qa;
import defpackage.u11;
import defpackage.uj;
import defpackage.w11;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SettingsCategoryFragment extends bg0 {
    public View j0;
    public u11 o0;
    public final Logging i0 = new Logging("SettingsCategoryFragment");
    public int k0 = 0;
    public int l0 = 0;
    public int m0 = 0;
    public String n0 = "";

    @Override // defpackage.bg0, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        O0();
        qa qaVarY = Y();
        if (qaVarY == null) {
            return;
        }
        this.o0 = new u11(qaVarY);
        U0();
        Q0(this.o0);
        O0();
        this.d0.setChoiceMode(1);
        O0();
        this.d0.setDivider(null);
        if (bundle != null) {
            this.k0 = bundle.getInt("skey_selection", 0);
            this.n0 = bundle.getString("skey_selection_contentdesc", "");
        }
    }

    @Override // defpackage.c40
    public final void D0(Bundle bundle) {
        this.F = true;
        qa qaVarY = Y();
        if (qaVarY == null) {
            return;
        }
        this.j0 = qaVarY.findViewById(R.id.settingsDetails);
        O0();
        T0(this.d0, this.k0, false);
    }

    @Override // defpackage.bg0
    public final void P0(ListView listView, int i) {
        T0(listView, i, true);
    }

    public final void S0(ArrayList arrayList, w11 w11Var) {
        arrayList.add(w11Var);
        if (w11Var.a.equals(this.n0)) {
            this.k0 = arrayList.size() - 1;
        }
    }

    public final void T0(ListView listView, int i, boolean z) {
        uj.C(this, listView, i, this.j0, z, this.i0);
        int checkedItemPosition = listView.getCheckedItemPosition();
        if (checkedItemPosition != -1) {
            this.k0 = checkedItemPosition;
            this.n0 = ((fg) listView.getItemAtPosition(checkedItemPosition)).a;
        }
    }

    public final void U0() {
        if (this.o0 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean zG2 = JniAdExt.g2(io.KEY_FEATURE_ACCEPT);
        boolean z = zG2 && JniAdExt.g2(io.KEY_LOGIN_ENABLED);
        boolean zG3 = JniAdExt.g2(io.KEY_FEATURE_CONNECT);
        boolean z2 = zG2 || zG3;
        boolean z3 = z || zG3;
        boolean zG4 = JniAdExt.g2(io.KEY_CFG_ENABLE_INTERFACE);
        boolean zG5 = JniAdExt.g2(io.KEY_CFG_ENABLE_CONNECTION);
        boolean zG6 = JniAdExt.g2(io.KEY_CFG_ENABLE_ACCESS);
        boolean z4 = z2 && JniAdExt.g2(io.KEY_CFG_ENABLE_PERMISSION_PROFILES);
        boolean z5 = zG3 && JniAdExt.g2(io.KEY_CFG_ENABLE_INPUT);
        boolean zG7 = JniAdExt.g2(io.KEY_CFG_ENABLE_VIDEO);
        boolean z6 = z3 && JniAdExt.g2(io.KEY_CFG_ENABLE_AUDIO);
        boolean z7 = zG3 && JniAdExt.g2(io.KEY_FEATURE_VPN) && JniAdExt.g2(io.KEY_CFG_ENABLE_VPN);
        boolean z8 = z3 && JniAdExt.g2(io.KEY_CFG_ENABLE_RECORDING) && JniAdExt.g2(io.KEY_FEATURE_SESSION_RECORDING);
        boolean zG8 = JniAdExt.g2(io.KEY_CFG_ENABLE_IDENTITY);
        if (zG4 || zG5) {
            arrayList.add(new fg("s_application", JniAdExt.n1("ad.cfg.subtitle.application")));
            if (zG4) {
                S0(arrayList, new w11(R.drawable.ic_nav_settings_general, R.id.settingsFragmentGeneralWrapper, SettingsFragmentGeneral.class, "s_general", JniAdExt.n1("ad.cfg.connection.general")));
                this.l0 = arrayList.size() - 1;
            }
            if (zG5) {
                S0(arrayList, new w11(R.drawable.ic_nav_settings_connection, R.id.settingsFragmentConnectionWrapper, SettingsFragmentConnection.class, "s_conn", JniAdExt.n1("ad.cfg.connection.title")));
            }
        }
        if (JniAdExt.g2(io.KEY_CFG_ENABLE_SECURITY) && (zG6 || z4)) {
            arrayList.add(new fg("s_security", JniAdExt.n1("ad.cfg.subtitle.security")));
            if (zG6) {
                S0(arrayList, new w11(R.drawable.ic_nav_settings_access, R.id.settingsFragmentAccessWrapper, SettingsFragmentAccess.class, "s_access", JniAdExt.n1("ad.cfg.access.title")));
            }
            if (z4) {
                S0(arrayList, new w11(R.drawable.ic_nav_settings_permissions, R.id.settingsFragmentPermissionsWrapper, SettingsFragmentPermissions.class, "s_perm", JniAdExt.n1("ad.cfg.sec.perm.permissions")));
                this.m0 = arrayList.size() - 1;
            }
        }
        if (z5 || zG7 || z6 || z7 || z8) {
            arrayList.add(new fg("s_session", JniAdExt.n1("ad.cfg.subtitle.session")));
            if (z5) {
                S0(arrayList, new w11(R.drawable.ic_nav_settings_input, R.id.settingsFragmentInputWrapper, SettingsFragmentInput.class, "s_input", JniAdExt.n1("ad.cfg.input.title")));
            }
            if (zG7) {
                S0(arrayList, new w11(R.drawable.ic_nav_settings_monitor, R.id.settingsFragmentVideoWrapper, SettingsFragmentVideo.class, "s_video", JniAdExt.n1("ad.cfg.video.title")));
            }
            if (z6) {
                S0(arrayList, new w11(R.drawable.ic_nav_settings_audio, R.id.settingsFragmentAudioWrapper, SettingsFragmentAudio.class, "s_audio", JniAdExt.n1("ad.cfg.audio.title")));
            }
            if (z7) {
                S0(arrayList, new w11(R.drawable.ic_nav_settings_vpn, R.id.settingsFragmentVpnWrapper, SettingsFragmentVpn.class, "s_vpn", JniAdExt.n1("ad.cfg.vpn.title")));
            }
            if (z8) {
                S0(arrayList, new w11(R.drawable.ic_nav_settings_recording, R.id.settingsFragmentRecordingWrapper, SettingsFragmentRecording.class, "s_rec", JniAdExt.n1("ad.cfg.recording.title")));
            }
        }
        if (zG8) {
            arrayList.add(new fg("s_account", JniAdExt.n1("ad.cfg.subtitle.account")));
            S0(arrayList, new w11(R.drawable.ic_nav_settings_identity, R.id.settingsFragmentIdentityWrapper, SettingsFragmentIdentity.class, "s_identity", JniAdExt.n1("ad.cfg.iden.title")));
        }
        u11 u11Var = this.o0;
        u11Var.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u11Var.add((fg) obj);
        }
        if (this.k0 >= arrayList.size()) {
            this.k0 = 0;
            return;
        }
        fg fgVar = (fg) arrayList.get(this.k0);
        if ((fgVar instanceof w11) && fgVar.a.equals(this.n0)) {
            return;
        }
        this.k0 = 0;
    }

    @Override // defpackage.bg0, defpackage.c40
    public final void t0() {
        super.t0();
        this.o0 = null;
        this.j0 = null;
    }

    @Override // defpackage.c40
    public final void x0() {
        this.F = true;
        JniAdExt.z = null;
    }

    @Override // defpackage.c40
    public final void y0() {
        this.F = true;
        JniAdExt.z = this;
        U0();
        O0();
        T0(this.d0, this.k0, false);
    }

    @Override // defpackage.c40
    public final void z0(Bundle bundle) {
        bundle.putInt("skey_selection", this.k0);
        bundle.putString("skey_selection_contentdesc", this.n0);
    }
}
