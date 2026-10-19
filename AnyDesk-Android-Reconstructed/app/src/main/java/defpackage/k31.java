package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentIdentity;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class k31 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ SettingsFragmentIdentity d;

    public /* synthetic */ k31(SettingsFragmentIdentity settingsFragmentIdentity, int i) {
        this.c = i;
        this.d = settingsFragmentIdentity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        SettingsFragmentIdentity settingsFragmentIdentity = this.d;
        switch (i) {
            case 0:
                if (JniAdExt.s2(10) == 0) {
                    settingsFragmentIdentity.m0.u(settingsFragmentIdentity.a0(), JniAdExt.r2(3));
                    break;
                }
                break;
            default:
                bc bcVar = settingsFragmentIdentity.l0;
                if (bcVar != null) {
                    bcVar.p0(new e21(), "AliasSettingsDialog", false);
                }
                break;
        }
    }
}
