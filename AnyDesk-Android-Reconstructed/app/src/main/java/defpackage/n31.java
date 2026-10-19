package defpackage;

import android.widget.CompoundButton;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentPermissions;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class n31 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsFragmentPermissions b;

    public /* synthetic */ n31(SettingsFragmentPermissions settingsFragmentPermissions, int i) {
        this.a = i;
        this.b = settingsFragmentPermissions;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.a;
        SettingsFragmentPermissions settingsFragmentPermissions = this.b;
        switch (i) {
            case 0:
                JniAdExt.y4(io.KEY_FRONTEND_CLIPBOARD, z ? 1 : 0);
                settingsFragmentPermissions.P0(z);
                break;
            case 1:
                if (!settingsFragmentPermissions.s0) {
                    JniAdExt.y4(io.KEY_LOCK_REMOTE_ACCOUNT, q51.r(z ? 2 : 1));
                    break;
                }
                break;
            default:
                if (!settingsFragmentPermissions.s0) {
                    JniAdExt.y4(io.KEY_PERM_PROFILES_ENABLE_PREVIOUS_SESSION, z ? 1 : 0);
                    break;
                }
                break;
        }
    }
}
