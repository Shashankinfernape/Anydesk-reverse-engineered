package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.MainApplication;
import com.anydesk.anydeskandroid.gui.activity.MainActivity;
import com.anydesk.anydeskandroid.gui.fragment.ConnectionSettingsFragmentVpn;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class ip implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ ConnectionSettingsFragmentVpn d;

    public /* synthetic */ ip(ConnectionSettingsFragmentVpn connectionSettingsFragmentVpn, int i) {
        this.c = i;
        this.d = connectionSettingsFragmentVpn;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        ConnectionSettingsFragmentVpn connectionSettingsFragmentVpn = this.d;
        switch (i) {
            case 0:
                bc bcVar = connectionSettingsFragmentVpn.p0;
                if (bcVar != null) {
                    bcVar.x0(1, JniAdExt.n1("ad.cfg.vpn.start_ip"), "11", JniAdExt.U2(11), "");
                }
                break;
            case 1:
                bc bcVar2 = connectionSettingsFragmentVpn.p0;
                if (bcVar2 != null) {
                    bcVar2.x0(1, JniAdExt.n1("ad.cfg.vpn.default_subnet"), "14", JniAdExt.U2(14), "");
                }
                break;
            case 2:
                bc bcVar3 = connectionSettingsFragmentVpn.p0;
                if (bcVar3 != null) {
                    bcVar3.x0(1, JniAdExt.n1("ad.vpn.client_ip"), "12", JniAdExt.U2(12), "");
                }
                break;
            case 3:
                bc bcVar4 = connectionSettingsFragmentVpn.p0;
                if (bcVar4 != null) {
                    bcVar4.x0(1, JniAdExt.n1("ad.vpn.server_ip"), "13", JniAdExt.U2(13), "");
                }
                break;
            case 4:
                bc bcVar5 = connectionSettingsFragmentVpn.p0;
                if (bcVar5 != null) {
                    bcVar5.x0(1, JniAdExt.n1("ad.cfg.vpn.default_subnet"), "14", JniAdExt.U2(14), "");
                }
                break;
            case 5:
                m80 m80Var = connectionSettingsFragmentVpn.q0;
                if (m80Var != null) {
                    MainActivity mainActivity = (MainActivity) m80Var;
                    if (JniAdExt.g2(io.KEY_FEATURE_VPN)) {
                        mainActivity.r0("start");
                        break;
                    }
                }
                break;
            default:
                if (connectionSettingsFragmentVpn.q0 != null) {
                    JniAdExt.I0.post(new tb0(23));
                    if (MainApplication.v().o0 == 1) {
                        MainApplication.v().X();
                    }
                }
                break;
        }
    }
}
