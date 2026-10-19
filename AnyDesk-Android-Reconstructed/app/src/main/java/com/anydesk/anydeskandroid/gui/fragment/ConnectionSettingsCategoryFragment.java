package com.anydesk.anydeskandroid.gui.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.anydesk.anydeskandroid.R;
import com.anydesk.jni.JniAdExt;
import com.anydesk.jnilib.Logging;
import defpackage.bg0;
import defpackage.cd0;
import defpackage.fg;
import defpackage.io;
import defpackage.u11;
import defpackage.uj;
import defpackage.w11;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionSettingsCategoryFragment extends bg0 implements cd0 {
    public View j0;
    public u11 l0;
    public final Logging i0 = new Logging("ConnectionSettingsCategoryFragment");
    public int k0 = 0;

    @Override // defpackage.bg0, defpackage.c40
    public final void C0(View view, Bundle bundle) {
        O0();
        JniAdExt.s1(this);
        this.l0 = new u11(Y());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new w11(R.drawable.ic_nav_settings_input, R.id.connectionSettingsFragmentInputWrapper, ConnectionSettingsFragmentInput.class, "ss_input", JniAdExt.n1("ad.cfg.input.title")));
        arrayList.add(new w11(R.drawable.ic_nav_settings_monitor, R.id.connectionSettingsFragmentVideoWrapper, ConnectionSettingsFragmentVideo.class, "ss_video", JniAdExt.n1("ad.cfg.video.title")));
        arrayList.add(new w11(R.drawable.ic_nav_settings_audio, R.id.connectionSettingsFragmentAudioWrapper, ConnectionSettingsFragmentAudio.class, "ss_audio", JniAdExt.n1("ad.cfg.audio.title")));
        arrayList.add(new w11(R.drawable.ic_nav_settings_permissions, R.id.connectionSettingsFragmentPermissionsWrapper, ConnectionSettingsFragmentPermissions.class, "ss_perm", JniAdExt.n1("ad.cfg.sec.perm.permissions")));
        if (JniAdExt.g2(io.KEY_FEATURE_VPN)) {
            arrayList.add(new w11(R.drawable.ic_nav_settings_vpn, R.id.connectionSettingsFragmentVpnWrapper, ConnectionSettingsFragmentVpn.class, "ss_vpn", JniAdExt.n1("ad.cfg.vpn.title")));
        }
        u11 u11Var = this.l0;
        u11Var.clear();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u11Var.add((fg) obj);
        }
        Q0(this.l0);
        O0();
        this.d0.setChoiceMode(1);
        O0();
        this.d0.setDivider(null);
        if (bundle != null) {
            this.k0 = bundle.getInt("skey_selection", 0);
        }
    }

    @Override // defpackage.c40
    public final void D0(Bundle bundle) {
        this.F = true;
        this.j0 = G0().findViewById(R.id.connectionSettingsDetails);
        O0();
        ListView listView = this.d0;
        uj.C(this, listView, this.k0, this.j0, false, this.i0);
        this.k0 = listView.getCheckedItemPosition();
    }

    @Override // defpackage.cd0
    public final void I(boolean z) {
        if (z) {
            uj.v(Y(), R.id.mainFragment);
        }
    }

    @Override // defpackage.bg0
    public final void P0(ListView listView, int i) {
        uj.C(this, listView, i, this.j0, true, this.i0);
        this.k0 = listView.getCheckedItemPosition();
    }

    @Override // defpackage.bg0, defpackage.c40
    public final void t0() {
        super.t0();
        JniAdExt.U3(this);
        this.l0 = null;
        this.j0 = null;
    }

    @Override // defpackage.c40
    public final void z0(Bundle bundle) {
        bundle.putInt("skey_selection", this.k0);
    }
}
