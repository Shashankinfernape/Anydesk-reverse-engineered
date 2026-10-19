package defpackage;

import android.os.Bundle;
import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentConnection;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class e31 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ SettingsFragmentConnection d;

    public /* synthetic */ e31(SettingsFragmentConnection settingsFragmentConnection, int i) {
        this.c = i;
        this.d = settingsFragmentConnection;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        SettingsFragmentConnection settingsFragmentConnection = this.d;
        switch (i) {
            case 0:
                bc bcVar = settingsFragmentConnection.B0;
                if (bcVar != null) {
                    bcVar.x0(1, JniAdExt.n1("ad.cfg.connection.proxy.auth.user"), "ad.anynet.proxy.user", JniAdExt.k2(io.KEY_PROXY_USER), "");
                }
                break;
            case 1:
                bc bcVar2 = settingsFragmentConnection.B0;
                if (bcVar2 != null) {
                    String strN1 = JniAdExt.n1("ad.cfg.connection.proxy.auth.passwd");
                    String strK2 = JniAdExt.k2(io.KEY_PROXY_PASS);
                    t01 t01VarD = (strK2 == null || strK2.isEmpty()) ? t01.e : t01.d(new char[]{'*', '*', '*'});
                    w21 w21Var = new w21();
                    Bundle bundle = new Bundle();
                    bundle.putString("skey_title", strN1);
                    bundle.putSerializable("skey_text", t01VarD);
                    bundle.putString("skey_key", "ad.anynet.proxy.pass");
                    bundle.putInt("skey_input_type", 129);
                    bundle.putString("skey_regex_filter", "");
                    w21Var.N0(bundle);
                    bcVar2.p0(w21Var, "TextSettingsDialog", false);
                }
                break;
            case 2:
                bc bcVar3 = settingsFragmentConnection.B0;
                if (bcVar3 != null) {
                    int iH2 = JniAdExt.h2(io.KEY_LISTEN_PORT);
                    String strN2 = JniAdExt.n1("ad.cfg.connection.general.local_port");
                    StringBuilder sb = new StringBuilder("");
                    if (iH2 == 0) {
                        iH2 = JniAdExt.W2();
                    }
                    sb.append(iH2);
                    bcVar3.x0(2, strN2, "ad.anynet.listen_port", sb.toString(), "");
                }
                break;
            case 3:
                bc bcVar4 = settingsFragmentConnection.B0;
                if (bcVar4 != null) {
                    bcVar4.x0(1, JniAdExt.n1("ad.cfg.connection.proxy.server"), "ad.anynet.proxy.addr", JniAdExt.k2(io.KEY_PROXY_ADDR), "");
                }
                break;
            default:
                bc bcVar5 = settingsFragmentConnection.B0;
                if (bcVar5 != null) {
                    bcVar5.x0(2, JniAdExt.n1("ad.cfg.connection.proxy.port"), "ad.anynet.proxy.port", "" + JniAdExt.h2(io.KEY_PROXY_PORT), "");
                }
                break;
        }
    }
}
