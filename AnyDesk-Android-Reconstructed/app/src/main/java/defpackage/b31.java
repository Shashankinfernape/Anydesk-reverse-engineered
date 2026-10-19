package defpackage;

import android.widget.CheckBox;
import com.anydesk.anydeskandroid.gui.fragment.SettingsFragmentAccess;
import com.anydesk.jni.JniAdExt;

/* JADX INFO: loaded from: classes.dex */
public final class b31 implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ SettingsFragmentAccess d;

    public /* synthetic */ b31(SettingsFragmentAccess settingsFragmentAccess, int i) {
        this.c = i;
        this.d = settingsFragmentAccess;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        SettingsFragmentAccess settingsFragmentAccess = this.d;
        switch (i) {
            case 0:
                settingsFragmentAccess.P0();
                break;
            default:
                boolean zL3 = JniAdExt.l3();
                CheckBox checkBox = settingsFragmentAccess.s0;
                if (checkBox != null) {
                    boolean z = settingsFragmentAccess.V0;
                    settingsFragmentAccess.V0 = true;
                    checkBox.setChecked(zL3);
                    settingsFragmentAccess.V0 = z;
                }
                settingsFragmentAccess.S0();
                if (zL3 && y90.s(JniAdExt.h2(io.KEY_SETTINGS_PROTECTION)) == 1) {
                    SettingsFragmentAccess.O0(settingsFragmentAccess);
                    break;
                }
                break;
        }
    }
}
