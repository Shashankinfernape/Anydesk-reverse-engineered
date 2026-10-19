package defpackage;

import android.view.View;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentPermissions;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class o31 implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ SettingsFragmentPermissions d;

    public /* synthetic */ o31(SettingsFragmentPermissions settingsFragmentPermissions, int i) {
        this.c = i;
        this.d = settingsFragmentPermissions;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        SettingsFragmentPermissions settingsFragmentPermissions = this.d;
        switch (i) {
            case 0:
                if (JniAdExt.s2(1) == 0) {
                    settingsFragmentPermissions.r0.u(settingsFragmentPermissions.a0(), JniAdExt.n1("ad.account.license.feature_not_allowed.needs_review_by_legal.android"));
                    break;
                }
                break;
            case 1:
                JniAdExt.I0.post(new i7(15));
                settingsFragmentPermissions.r0.u(settingsFragmentPermissions.a0(), JniAdExt.n1("ad.cfg.sec.clear_prev_profiles.done"));
                break;
            case 2:
                if (JniAdExt.s2(1) == 0) {
                    settingsFragmentPermissions.r0.u(settingsFragmentPermissions.a0(), JniAdExt.n1("ad.account.license.feature_not_allowed.needs_review_by_legal.android"));
                    break;
                }
                break;
            default:
                bc bcVar = settingsFragmentPermissions.Z;
                if (bcVar != null) {
                    bcVar.p0(new j21(), "PermissionProfileSettingsDialog", false);
                }
                break;
        }
    }
}
