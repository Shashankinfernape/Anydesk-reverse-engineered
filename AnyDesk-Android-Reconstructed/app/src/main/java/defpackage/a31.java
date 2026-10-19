package defpackage;

import android.os.Bundle;
import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAccess;
import com.anydesk.jni.JniAdExt;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a31 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ SettingsFragmentAccess d;

    public /* synthetic */ a31(SettingsFragmentAccess settingsFragmentAccess, int i) {
        this.c = i;
        this.d = settingsFragmentAccess;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        SettingsFragmentAccess settingsFragmentAccess = this.d;
        switch (i) {
            case 0:
                bc bcVar = settingsFragmentAccess.a0;
                if (bcVar != null) {
                    String[] strArrJ2 = JniAdExt.j2();
                    z11 z11Var = new z11();
                    Bundle bundle = new Bundle();
                    Arrays.sort(strArrJ2);
                    ArrayList<String> arrayList = new ArrayList<>();
                    for (String str : strArrJ2) {
                        arrayList.add(str);
                    }
                    bundle.putStringArrayList("skey_list", arrayList);
                    z11Var.N0(bundle);
                    bcVar.p0(z11Var, "AclListSettingsDialog", false);
                }
                break;
            case 1:
                bc bcVar2 = settingsFragmentAccess.a0;
                if (bcVar2 != null) {
                    bcVar2.x0(2, JniAdExt.n1("ad.cfg.sec.auto_disconnect.timeout"), "ad.security.auto_disconnect.timeout", gr0.e(JniAdExt.h2(io.KEY_AUTO_DISCONNECT_TIMEOUT) / 60, ""), "");
                }
                break;
            default:
                JniAdExt.l4();
                settingsFragmentAccess.U0.u(settingsFragmentAccess.a0(), JniAdExt.n1("ad.cfg.sec.auto_logon.clear_token.done"));
                break;
        }
    }
}
