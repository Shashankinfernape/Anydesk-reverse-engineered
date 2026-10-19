package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentVpn;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class s31 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ SettingsFragmentVpn d;

    public /* synthetic */ s31(SettingsFragmentVpn settingsFragmentVpn, int i) {
        this.c = i;
        this.d = settingsFragmentVpn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        SettingsFragmentVpn settingsFragmentVpn = this.d;
        switch (i) {
            case 0:
                bc bcVar = settingsFragmentVpn.h0;
                if (bcVar != null) {
                    bcVar.x0(1, JniAdExt.n1("ad.cfg.vpn.start_ip"), "ad.vpn.start_ip", JniAdExt.i2(io.KEY_VPN_START_IP), "");
                }
                break;
            default:
                bc bcVar2 = settingsFragmentVpn.h0;
                if (bcVar2 != null) {
                    bcVar2.x0(1, JniAdExt.n1("ad.cfg.vpn.default_subnet"), "ad.vpn.default_netmask", JniAdExt.i2(io.KEY_VPN_DEFAULT_NETMASK), "");
                }
                break;
        }
    }
}
